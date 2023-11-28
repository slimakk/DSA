package tree;

import java.util.ArrayList;

public class Strom {
	private Uzel root;

	public Strom(Uzel root) {
		super();
		this.root = root;
	}

	public boolean isLeaf(Uzel node) {
		if (node.getLavy() == null && node.getPravy() == null)
			return true;
		return false;
	}

	public float TreeAvg() {
		float sum = 0;
		float num = CountNodes();

		if (root.getLavy() == null && root.getPravy() == null) {
			sum = root.getData();
			num = 1;
		} else {
			sum = root.getData();
			sum += sumNodes(root);
		}
		return sum / num;
	}

	private static int sumNodes(Uzel root) {
		// TODO Auto-generated method stub
		int sum = 0;

		if (root.getLavy() != null) {
			sum += root.getLavy().getData() + sumNodes(root.getLavy());
		}
		if (root.getPravy() != null) {
			sum += root.getPravy().getData() + sumNodes(root.getPravy());
		}

		return sum;
	}

	private int CountNodes() {
		int num = 0;
		if (root.getLavy() == null && root.getPravy() == null) {
			num = 1;
		} else {
			num += numOfNodes(root);
		}
		return num;
	}

	private static int numOfNodes(Uzel root) {

		int num = 1;

		if (root.getLavy() != null) {
			num += numOfNodes(root.getLavy());
		}
		if (root.getPravy() != null) {
			num += numOfNodes(root.getPravy());
		}

		return num;
	}

	public float LeavesAvg() {
		float sum = sumLeafs(root);
		float num = numOfLeafs(root);

		return sum / num;
	}

	private static int sumLeafs(Uzel root) {
		int sum = 0;
		if (root.getLavy() == null && root.getPravy() == null) {
			sum = root.getData();
		} else {
			if (root.getLavy() != null) {
				sum += sumLeafs(root.getLavy());
			}
			if (root.getPravy() != null) {
				sum += sumLeafs(root.getPravy());
			}
		}
		return sum;

	}

	private static int numOfLeafs(Uzel root) {

		if (root == null) {
			return 0;
		}
		if (root.getLavy() == null && root.getPravy() == null) {
			return 1;
		} else {
			return numOfLeafs(root.getLavy()) + numOfLeafs(root.getPravy());
		}
	}

	public float InternalAvg() {
		float num = CountNodes() - numOfLeafs(root);
		float sum = (root.getData() + sumNodes(root)) - sumLeafs(root);

		return sum / num;
	}


	public void PrintAllPaths() {
		Uzel node = root;
		ArrayList<Integer> path = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();
		printPaths(node, path, paths);
		for (ArrayList<Integer> p : paths) {
			System.out.println(p);
		}
	}

	private ArrayList<ArrayList<Integer>> printPaths(Uzel node, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> paths) {
		if (node == null)
			return paths;

		path.add(node.getData());

		if (isLeaf(node)) {
			paths.add(new ArrayList<>(path));
		}

		printPaths(node.getLavy(), path, paths);
		printPaths(node.getPravy(), path, paths);

		path.remove(path.size() - 1);

		return paths;
	}
}
