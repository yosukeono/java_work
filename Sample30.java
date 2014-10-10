public class Sample30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if (true) System.out.println(true);
		// if (false) System.out.println(false);

		/*
		 * boolean b; b = true;
		 * 
		 * if (b) { System.out.println(0); System.out.println(1);
		 * System.out.println(2); }
		 */

		// boolean a = true;
		// boolean b = true;
		// boolean c = true;
		//
		// if ((a==b)==c) System.out.println(true);
		//
		// int ia = 0;
		// int ib = 0;
		// int ic = 0;
		//
		// if ((ia==ib)==ic) System.out.println(0);

		if (true)
			System.out.println(true);
		else
			System.out.println(false);

		int x;
		x = 1;

		if (x < 3)
			System.out.println(true);
		else
			System.out.println(false);

		if (x >= 3) {
			System.out.println(true);
		} else if (0 < x && x < 2) {
			System.out.println(false);
			System.out.println(true);
		} else {
			System.out.println(false);
			System.out.println(false);
		}

	}

}
