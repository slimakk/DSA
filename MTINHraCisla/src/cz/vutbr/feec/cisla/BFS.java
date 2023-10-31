package cz.vutbr.feec.cisla;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

public class BFS {
	public void vypisTahy(HraciPole zadani) {
		
		// TIP: Vyzkousejte s ruznyma strukturama
		 HashSet<HraciPole> closed = new HashSet<HraciPole>();
		// TreeSet<HraciPole> closed = new TreeSet<HraciPole>();
		// LinkedList<HraciPole> closed = new LinkedList<HraciPole>();
		
		boolean run = true;
		LinkedList<HraciPole> OPEN = new LinkedList<HraciPole>();
		OPEN.addLast(zadani);
		while(run)
		{
			if(OPEN.isEmpty()) {
				System.out.println("Neexistuje riesenie");
				run = false;
			}
			else {
				HraciPole tmp = OPEN.getFirst();
				OPEN.removeFirst();
				if(tmp.jeReseni()) {
					System.out.println("Najdene riesenie: ");
					System.out.println(tmp);
					run = false;
				}
				else {
					closed.add(tmp);
					System.out.println("Closed"+closed.size());
					System.out.println("Open"+OPEN.size());
					for (int i = 1; i <= 4; i++) {
						HraciPole g3 = tmp.klonujAPohni(i);
						if(g3 != null && !closed.contains(g3)) {
							OPEN.addLast(g3);
						}
					}
				}
			}
		}

	}
}
