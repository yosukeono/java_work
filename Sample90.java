
public class Sample90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Sample90().execute();
	}

	public void execute() {
		java.util.ArrayList alist = new java.util.ArrayList();
		alist.add("A");
		alist.add("B");
		
		for (int i = 0; i < alist.size(); i++) {
			String s = (String)alist.get(i);
			System.out.print(s + " ");
		}
		
		System.out.println("");
		java.util.LinkedList list = new java.util.LinkedList();
		list.add("A");
		list.add("B");
		
		for (int i = 0; i < list.size(); i++) {
			String s = (String)list.get(i);
			System.out.print(s + " ");
		}
	}
	
}
