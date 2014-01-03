package portScan;

import java.io.*;
import java.net.*;

public class ThreadScan {

	public static void main(String[] args) {

//		String ip = "202.108.22.5";
//		String hostname = new String();
//
//		try { // get the target ip address and hostname
//			InetAddress address = InetAddress.getByName(ip);
//			System.out.println(address);
//			hostname = address.getHostName();
//			System.out.println(hostname);
//		} catch (UnknownHostException e) {
//			System.out.println("Could not find " + ip);
//
//		}
//
//		
//			System.out.println("Information Of The Port On the " + hostname
//					+ "computer ");
//
			// do ports scan
			for (int nport = 1; nport <= 65534; ++nport) {

					new Thread6(nport).start();
			}
	}
}
class Thread6 extends Thread{
	int port ;
	public Thread6(int port) {
		this.port = port;
	}
	@Override
	public void run() {
		try {
			InetAddress address = InetAddress.getByName("202.108.22.5");
			String hostname = address.getHostName();
			Socket s = new Socket(hostname, port);
			System.out.println("The port " + port + " is open!");

			System.out.println("Connected to " + s.getInetAddress()
					+ " on port " + s.getPort() + " from port "
					+ s.getLocalPort() + " of " + s.getLocalAddress());
		} catch (Exception e) {
			System.out.println("The port " + port + " is closed!");
		}
	}
	
}
