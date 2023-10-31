package cz.vutbr.feec.cisla;

import java.util.LinkedList;

public class P07Fronta {
	public static void main(String[] args) {
		HraciPole h1 = new HraciPole();
		HraciPole h2 = new HraciPole();

		LinkedList<HraciPole> fronta = new LinkedList<HraciPole>();
		fronta.addLast(h1);
		fronta.addLast(h2);

		// TODO: v cyklu postupne odstranit prvky ze zacatku a vypsat je.
		for(int i = 0; i <= fronta.size(); i++) {
			System.out.println(fronta.getFirst());
			fronta.remove(0);
		}
		
	}
}
