package graph;

public class Executable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph();
		g.addNode("1", "7", 16);
		g.addNode("1", "6", 6);
		g.addNode("6", "5", 5);
		g.addNode("6", "7", 8);
		g.addNode("5", "8", 3);
		
		Path cesta = new Path(g, "1");
		cesta.addNode("6");
		cesta.addNode("5");
		cesta.addNode("8");
		int cost = cesta.getCost();
		System.out.println(cost);
	}

}
