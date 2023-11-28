package tree;

public class Executable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Uzel u1 = new Uzel(5);
		Uzel u2 = new Uzel(8);
		Uzel u3 = new Uzel(13);
		Uzel u4 = new Uzel(15);
		Uzel u5 = new Uzel(-1);
		
		Strom strom = new Strom(u1);
		
		u1.setLavy(u2);
		u1.setPravy(u3);
		u2.setLavy(u4);
		u2.setPravy(u5);
		
		float test = strom.TreeAvg();
		float test2 = strom.LeavesAvg();
		float test3 = strom.InternalAvg();
		
		strom.PrintAllPaths();
	}

}
