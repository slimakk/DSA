package cv02;

public class Directories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var dict1 = new Directory();
		var dict2 = new Directory();
		var dict3 = new Directory();
		var dict4 = new Directory();
		var dict5 = new Directory();
		
		dict1.setLeftDirectory(dict4);
		dict1.setRightDirectory(dict2);
		dict2.setLeftDirectory(dict5);
		dict2.setRightDirectory(dict3);
	}

}
