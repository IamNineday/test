package servlet;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
		
		for(int i=0;i<50;i++)
			System.out.print(new Random().nextInt(33)+ " ");
	}
}
