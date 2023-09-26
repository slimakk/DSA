package cv02;

public class Nodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var n1 = new Node();
		var n2 = new Node();
		var n3 = new Node();
		var n4 = new Node();
		var n5 = new Node();
		var n6 = new Node();
		
		n1.addNode(n2);
		n1.addNode(n4);
		n1.addNode(n5);
		n1.addNode(n6);
		
		n1.printNodes();
		
		n2.addNode(n1);
		n2.addNode(n3);
		n2.addNode(n5);
		
		n2.printNodes();
		
		n5.addNode(n4);
		
		n5.printNodes();
	}

}
