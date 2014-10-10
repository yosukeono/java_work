public class Sample53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long[] bd = new long[6];

		bd[0] = 19700101;
		bd[1] = 19750101;
		bd[2] = 19800101;
		bd[3] = 19850101;
		bd[4] = 19900101;
		bd[5] = 0;

		for (long v : bd) {
			if (v != 0) {
				System.out.println(v);
			}
		}
	}

}
