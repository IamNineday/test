package portScan;

import java.io.*;
import java.net.*;

public class Scan2 {

	public static void main(String[] args) {

		String ip = "202.108.22.5";
		String hostname = new String();

		try { // get the target ip address and hostname
			InetAddress address = InetAddress.getByName(ip);
			System.out.println(address);
			hostname = address.getHostName();
			System.out.println(hostname);
		} catch (UnknownHostException e) {
			System.out.println("Could not find " + ip);

		}

		try { // creat the output file
			PrintWriter fout = new PrintWriter(new FileWriter("PortInf.txt"));
			fout.println("Information Of The Port On the " + hostname
					+ "computer ");
			System.out.println("Information Of The Port On the " + hostname
					+ "computer ");
			fout.println();

			// do ports scan
			for (int nport = 75; nport <= 85; ++nport) {
				try {

					Socket s = new Socket(hostname, nport);
					fout.println("The port " + nport + " is open!");
					System.out.println("The port " + nport + " is open!");

					fout.println("Connected to " + s.getInetAddress()
							+ " on port " + s.getPort() + " from port "
							+ s.getLocalPort() + " of " + s.getLocalAddress());
					System.out.println("Connected to " + s.getInetAddress()
							+ " on port " + s.getPort() + " from port "
							+ s.getLocalPort() + " of " + s.getLocalAddress());

				}

				catch (IOException e) {
					fout.println("The port " + nport + " is closed!");
					System.out.println("The port " + nport + " is closed!");

				}

			}
			fout.close();

		} catch (IOException e) {
		}

	}
}
