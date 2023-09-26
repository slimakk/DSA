package cv02;

import java.util.Vector;

public class Node {
	private Vector<Node> neighbours = new Vector<>();
	
	public void addNode(Node n)
	{
		neighbours.add(n);
	}
	
	public Node getNodes(int index) {
		return neighbours.get(index);
	}
	
	public void printNodes()
	{
		for(Node n : neighbours)
		{
			System.out.println(n);
		}
	}
}
