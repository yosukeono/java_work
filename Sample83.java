
public class Sample83 {

	String s = "0123";
	
	public void test() {
		StringBuilder sb = new StringBuilder(s);
		char c = 'a';
		
		System.out.println("s  :" + s);
		System.out.println("sb :" + sb);
		System.out.println("c  :" + c);
		
		test1(s, sb, c);
		
		System.out.println("s  :" + s);
		System.out.println("sb :" + sb);
		System.out.println("c  :" + c);
	}
	
	public void test1(String ps, StringBuilder psb, char pc) {
		System.out.println("------- test 1 start");
		System.out.println("ps  :" + ps);
		System.out.println("psb :" + psb);
		System.out.println("pc  :" + pc);
		
		ps = "5678";
		
		psb.append("4567");
		
		pc = 'b';
		System.out.println("ps  :" + ps);
		System.out.println("psb :" + psb);
		System.out.println("pc  :" + pc);
		System.out.println("------   test1 end");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample83 sample83 = new Sample83();
		sample83.test();
	}

}
