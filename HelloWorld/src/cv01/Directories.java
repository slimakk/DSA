package cv01;

public class Directories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var dict1 = new Directory("First");
		var dict2 = new Directory("Second");
		var dict3 = new Directory("Third");
		var dict4 = new Directory("Fourth");
		var dict5 = new Directory("Fifth");
		
		dict1.left = dict4;
		dict1.right = dict2;
		dict2.left = dict5;
		dict2.right = dict3;
		dict3.left = null;
		dict3.right = null;
		dict4.left = null;
		dict4.right = null;
		dict5.left = null;
		dict5.right = null;
	}

}
