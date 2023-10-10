package cv04_2;

public class Executable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List myList = new List();
		myList.addFirst(5);
		myList.addFirst(8);
		myList.addFirst(10);
		
		System.out.println(myList.size());
		
		myList.printList(myList);
		
		myList.remove();
		
		myList.printList(myList);
		
		System.out.println(myList.contains(8));
		
		System.out.println(myList.size());
	}

}
