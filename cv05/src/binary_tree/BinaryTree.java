package binary_tree;

public class BinaryTree {
	private Node root;
	
	private Node addNode(Node current, int data)
	{
		if(current == null){
			return new Node(data);
		}
		if(data < current.getData())
		{
			current.setLeft(addNode(current.getLeft(), data));
		}
		else if(data > current.getData()){
			current.setRight(addNode(current.getRight(), data));
		}
		return current;
	}
	
	public void add(int data)
	{
		this.root = addNode(root, data);
	}
	
	private boolean containsNode(Node current, int data)
	{
		if(current == null){
			return false;
		}
		if(data == current.getData()) {
			return true;
		}
		if(data < current.getData()) {
			return containsNode(current.getLeft(),data);
		}
		else if(data > current.getData()) {
			return containsNode(current.getRight(), data);
		}
		return false;
	}
	
	public boolean contains(int data) {
		return containsNode(root, data);
	}
	
	public void printTreePreOrder() {
		printPreOrder(root);
	}

	private void printPreOrder(Node current) {
		// TODO Auto-generated method stub
		if(current != null){
			System.out.println(current.getData()+" ");
			printPreOrder(current.getLeft());
			printPreOrder(current.getRight());
		}
	}
	
	public void printTreeInOrder() {
		printInOrder(root);
	}

	private void printInOrder(Node current) {
		// TODO Auto-generated method stub
		if(current != null){
			printInOrder(current.getLeft());
			System.out.println(current.getData()+" ");
			printInOrder(current.getRight());
		}
	}
	
	public void printTreePostOrder() {
		printPostOrder(root);
	}

	private void printPostOrder(Node current) {
		// TODO Auto-generated method stub
		if(current != null){
			printPostOrder(current.getLeft());
			printPostOrder(current.getRight());
			System.out.println(current.getData()+" ");
		}
	}
	
	public void printTreeLeaves() {
		printLeaves(root);
	}

	private void printLeaves(Node current) {
		// TODO Auto-generated method stub
		if(current != null) {
			if(current.getLeft() == null && current.getRight() == null) {
				System.out.println(current.getData()+" ");
			}
			printLeaves(current.getLeft());
			printLeaves(current.getRight());
		}
	}
}
