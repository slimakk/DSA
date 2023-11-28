package Zoznam;

import java.util.HashSet;

public class Zoznam {
	private Node first;
	
	public void add(String name) {
		Node n = new Node(name);
		if(first == null) {
			first = n;
		}
		else {
			n.setNext(first);
			first = n;
		}
	}
	
	public void removePredposledny() {
		Node tmp = first;
		do {
			tmp = tmp.getNext();
		}while(tmp.getNext().getNext().getNext() != null);
		tmp.setNext(tmp.getNext().getNext());
	}
	
	public void removeDuplicates() {
		HashSet<String> nodes = new HashSet<>();
		Node tmp = first;
		while(tmp != null)
		{
			nodes.add(tmp.getData());
			tmp=tmp.getNext();
		}
		
		first = null;
		
		for(String s : nodes)
		{
			add(s);
		}
	}
}
