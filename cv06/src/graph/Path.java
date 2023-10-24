package graph;

public class Path {
	private int cost = 0;
	private Graph graph;
	private String firstNode;
	
	public int getCost() {
		return cost;
	}

	public Path(Graph g, String firstNode) {
		// TODO Auto-generated constructor stub
		this.graph = g;
		this.firstNode = firstNode;
	}

	public void addNode(String node) {
		// TODO Auto-generated method stub
		this.cost = cost + graph.getCostBetweenNodes(firstNode, node);
		this.firstNode = node;
	}

	
	
	
}
