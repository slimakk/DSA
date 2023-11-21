package cz.vutbr.feec.ga;

import java.io.IOException;

public class Priklad7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Population p = new Population(50);
		
		ShowChromozome.show(p.getChrome(), "Ch 1");
		
		int numberOfEvolutions = 50;
		for(int i = 0; i < numberOfEvolutions; i++) {
			p.mutateRandom(25);
			p.crossoverRandom(25);
			try {
				p = p.selectionTournament(50);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println();
		}
		ShowChromozome.show(p.getChrome(), "Ch 1");
	}

}
