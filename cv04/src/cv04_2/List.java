package cv04_2;

public class List {
	private Node head = new Node(0, null);
	
	public void addFirst(int data)
	{
		head.nextNode = new Node(data, head.nextNode);
	}
	
	public Boolean contains(int data)
	{
		Node actual = head.nextNode;
		
		while(actual != null)
		{
			if(actual.data == data)
				return true;
			else
				actual = actual.nextNode;
		}
		return false;
	}
	
	public void remove()
	{
		if(head.nextNode == null)
			return;
		head = head.nextNode;
		
	}
	
	public int size(){
		int size = 0;
		Node actual = head.nextNode;
		
		while(actual != null)
		{
			size++;
			actual = actual.nextNode;
		}
		
		return size;
	}
	
	public void printList(List list)
	{
		Node actual = head.nextNode;
		while(actual != null)
		{
			System.out.println(actual.data);
			actual = actual.nextNode;
		}
	}
}
