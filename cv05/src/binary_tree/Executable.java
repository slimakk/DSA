package binary_tree;

public class Executable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		tree.add(7);
		tree.add(5);
		tree.add(14);
		tree.add(1);
		tree.add(6);
		tree.add(16);
		tree.add(10);
		
		System.out.println("Contains 14?:");
		System.out.println(tree.contains(14));
		System.out.println("Contains 25?:");
		System.out.println(tree.contains(25));
		
		System.out.println("PreOrder:");
		tree.printTreePreOrder();
		
		System.out.println("InOrder:");
		tree.printTreeInOrder();
		
		System.out.println("PostOrder:");
		tree.printTreePostOrder();
		
		System.out.println("Leaves:");
		tree.printTreeLeaves();
	}

}
