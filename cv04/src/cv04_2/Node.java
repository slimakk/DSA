package cv04_2;

public class Node {
	public int data;
	public Node nextNode;

	public Node (int payload)
	{
		this.data = payload;
		this.nextNode = null;
	}
	
	public Node(int payload, Node next)
	{
		this.data = payload;
		this.nextNode = next;
	}
	
}
