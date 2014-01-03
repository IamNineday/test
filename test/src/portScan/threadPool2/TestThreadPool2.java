package portScan.threadPool2;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 通过线程池实现TCP扫描，可以通过控制线程池的线程数以达到控制扫描速度的效果
 * 
 */
class MyThread extends Thread{
	int port ;
	public MyThread(int port) {
		this.port = port;
	}
	@Override
	public void run() {
		try {
			InetAddress address = InetAddress.getByName("202.108.22.5");
			String hostname = address.getHostName();
			SocketAddress sa = new InetSocketAddress(hostname, port);
			Socket s = new Socket();
			s.connect(sa, 800);
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
  
    
    	 ExecutorService exe = Executors.newFixedThreadPool(2); 
    	 for (int nport = 70; nport <= 82; ++nport) {
			exe.execute(new MyThread(nport));
		
		}
    	 exe.shutdown();
    } 
}   