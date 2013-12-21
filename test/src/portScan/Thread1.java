package portScan;

public class Thread1 {

	public static void main(String[] args) {
		
		Thread2 t = new Thread2();
		Thread3 t1 = new Thread3();
		
		t.start();
		t1.start();
	}
}



class Thread2 extends Thread{

	@Override
	public void run() {

		for(int i=0; i<100; i++)
			System.out.println("test:" + i);
	}
}

class Thread3 extends Thread{

	@Override
	public void run() {

		for(int i=0; i<100; i++)
			System.out.println("11111:" + i);
	}
}
