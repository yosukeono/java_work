
public class Sample81 {

	String s = "0123";
	
	public void test() {
		String s0  = s.substring(0, 2);
		String s1 = s.substring(1, 2);
		String s2 = s.substring(2, 3);
		
		System.out.print(s0 + ":");
		System.out.println(s.startsWith(s0));
		System.out.print(s1 + ":");
		System.out.println(s.startsWith(s1));
		System.out.print(s2 + ":");
		System.out.println(s.startsWith(s2));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample81 sample81 = new Sample81();
		sample81.test();
	}

}
