package cz.vutbr.feec.cisla;

import java.util.Random;

public class P10BFS {
	public static void main(String[] args) {
		HraciPole h = new HraciPole();
		// TODO: vytvorit nahodne hraci pole (viz priklad P2Randomize)
		Random rnd = new Random();
		int moveCounter = 0;
		for (int i = 0; i < 100000; i++) {
			// nahodne cislo 0 - 3
			int nahodne = rnd.nextInt(4);
			if(h.pohni(1 + nahodne) == true){
				moveCounter++;
			}
		}
		System.out.println(h);
		BFS bfs = new BFS();
		bfs.vypisTahy(h);
		
	}
}
