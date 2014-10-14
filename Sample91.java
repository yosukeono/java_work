
public class Sample91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Sample91().execute();
		
	}
	
	public void execute() {
		list(new java.util.ArrayList());
		list(new java.util.LinkedList());
	}

	public void list (java.util.List list) {
		list.add("A");
		list.add("B");
		
		for (int i = 0; i < list.size(); i++) {
			String s = (String)list.get(i);
			System.out.print(s + " ");
		}
		System.out.println("");
	}
}
