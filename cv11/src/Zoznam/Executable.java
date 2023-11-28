package Zoznam;

public class Executable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoznam z = new Zoznam();
		z.add("E");
		z.add("D");
		z.add("C");
		z.add("B");
		z.add("A");
		z.add("A");
		z.add("A");
		
		z.removePredposledny();
		z.removeDuplicates();
	}

}
