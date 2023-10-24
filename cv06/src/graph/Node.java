package graph;

import java.util.HashMap;

public class Node {
	private int value;
	private String name;
	private HashMap<Node, Integer> neighbours = new HashMap<>();
	
	public Node(String node) {
		// TODO Auto-generated constructor stub
		this.name = node;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	
	public void addNeighbour(Node neighbourNew, int weight)
	{
		neighbours.put(neighbourNew, weight);
	}
	public int getDirectCost(Node n1) {
		// TODO Auto-generated method stub
		int cost = neighbours.get(n1);
		return cost;
	}
}
