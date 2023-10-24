package graph;

import java.util.HashMap;

public class Graph {
	private HashMap<String, Node> nodes = new HashMap<>();
	
	public void addNode(String node1, String node2, int weight)
	{
		Node n1 = createNewOrGetNode(node1);
		Node n2 = createNewOrGetNode(node2);
		n1.addNeighbour(n2, weight);
		n2.addNeighbour(n1, weight);
	}

	private Node createNewOrGetNode(String node) {
		// TODO Auto-generated method stub
		if(nodes.containsKey(node)){
			return nodes.get(node);
		}
		else {
			Node n = new Node(node);
			nodes.put(node, n);
			return n;
		}
	}

	public int getCostBetweenNodes(String firstNode, String node) {
		// TODO Auto-generated method stub
		if(nodes.containsKey(firstNode) && nodes.containsKey(node)) {
			Node n = nodes.get(firstNode);
			Node n1 = nodes.get(node);
			return n.getDirectCost(n1);
		}
		return 0;
	}
}
