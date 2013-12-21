package portScan.threadPool2;

import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class MyThread extends Thread{
	int port ;
	public MyThread(int port) {
		this.port = port;
	}
	@Override
	public void run() {
		try {
			InetAddress address = InetAddress.getByName("192.168.0.4");
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

public class TestThreadPool2 {   
  
    public static void main(String[] args) {   
  
    
    	 ExecutorService exe = Executors.newFixedThreadPool(10); 
    	 for (int nport = 134; nport <= 140; ++nport) {
			exe.execute(new MyThread(nport));
		}
    	 exe.shutdown();
    } 
}   