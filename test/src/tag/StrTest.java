package tag;

public class StrTest {

	public static void main(String[] args) {
		

		
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < 10 ; i++)
			for(int j = 0; j < 100; j++)
				for(int k = 0; k < 1000; k++)
					System.out.println("hello world");	
		long endTime = System.currentTimeMillis();
		
		long startTime4 = System.currentTimeMillis();
		StringBuffer sb11 = new StringBuffer();
		for(int i = 0; i < 10 ; i++)
			for(int j = 0; j < 100; j++)
				for(int k = 0; k < 1000; k++)
					sb11.append("hello world\n");
		System.out.print(sb11);
		long endTime4 = System.currentTimeMillis();
		
//		long startTime3 = System.currentTimeMillis();
//		StringBuffer sb1 = new StringBuffer();
//		StringBuffer sb2 = new StringBuffer();
//		StringBuffer sb3 = new StringBuffer();
//		for(int i = 0; i < 10 ; i++)
//			sb1.append("hello world\n");
//		for(int j = 0; j < 100; j++)
//			sb2.append(sb1);
//		for(int k = 0; k < 1000; k++)
//			sb3.append(sb2);
//		System.out.println(sb3);
//		long endTime3 = System.currentTimeMillis();
		
		
		
		System.out.println("优化前耗时："+ (endTime - startTime +"ms"));
		//System.out.println("优化后耗时："+ (endTime3 - startTime3 +"ms"));
		System.out.println("优化后耗时："+ (endTime4 - startTime4 +"ms"));
	}
}
