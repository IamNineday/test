package tag;

public class Test {

	public static void main(String[] args) {
		
		long startTime3 = System.currentTimeMillis();
		StringBuffer sb1 = new StringBuffer();
		
		sb1.append("abs");
		sb1.append(sb1);
		System.out.println(sb1);
		long endTime3 = System.currentTimeMillis();
	}
}
