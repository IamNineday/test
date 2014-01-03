package portScan.UDPScan;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpPort {

	public UdpPort() {
		super();
	}

	public void TestUdpPort() {

		String ipAddress = "202.108.22.5";

		int port = 135;

		DatagramSocket connection = null;

		byte[] myByte = ipAddress.getBytes();
		String myStr = new String(myByte);

		try {
			connection = new DatagramSocket(port, InetAddress.getByName(ipAddress));//(ipAddress, port);
			connection = new DatagramSocket();// (ipAddress, port);
			//connection.setReceiveTimeout(20*1000);
			connection.setSoTimeout(120 * 1000);
			connection.connect(InetAddress.getByName(ipAddress), port);
			System.out.println("连结创建完成...");
			connection.send((new DatagramPacket(myByte, myByte.length)));
			System.out.println(" 数据发送完成...");
			while (true) {
				byte[] newByte = new byte[4096];
				DatagramPacket dp = new DatagramPacket(newByte, 4096);
				connection.receive(dp);
				if (dp != null && dp.getData() != null) {
					System.out.println(dp.getLength());
					System.out.println("#####");
					byte[] rslt = dp.getData();
					for (int i = 0; i < dp.getLength(); i++) {
						System.out.println(rslt[i]);
						// System.out.println();
					}
					System.out.println("#####");
				}
				// String myDump = buffer.getHexDump();

				break;
			}
			connection.close();
		} catch (Exception ex) {

			ex.printStackTrace();

		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UdpPort up = new UdpPort();
		up.TestUdpPort();

	}

}