package cz.vutbr.feec.ga;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Population {
	private ArrayList<Chromozome> population;
	private HashMap<Integer, Chromozome> fitness;

	public Population(int number) {
		super();
		population = new ArrayList<Chromozome>();
		for (int i = 0; i < number; i++) {
			Chromozome n = new Chromozome();
			n.mutateAll();
			population.add(n);
		}
	}

	public Population() {
		super();
		population = new ArrayList<Chromozome>();
	}

	public Chromozome getChrome() throws IOException {
		Fitness fit = new Fitness("image/orloj.jpg");
		int bestFit = fit.getFitness(population.get(0));
		int bestIndex = -1;
		int i = 0;
		for (Chromozome ch : population) {
			int chFit = fit.getFitness(ch);
			if(chFit < bestFit)
			{
				bestIndex = i;
			}
			i++;
		}
		
		return population.get(bestIndex);
	}

	public void mutateRandom(int numberOfMutations) {
		Random rnd = new Random();
		for (int i = 0; i < numberOfMutations; i++) {
			int mutationIndex = rnd.nextInt(population.size() - 1);
			Chromozome mutated = population.get(mutationIndex).cloneChromozome();
			mutated.mutateAll();
			population.add(mutated);
		}
		System.out.println("Lenght after mutation: " + population.size());
	}

	public void crossoverRandom(int numberOfCross) {
		Random rnd = new Random();
		for (int i = 0; i < numberOfCross; i++) {
			int crossIndex1 = rnd.nextInt(population.size() - 1);
			int crossIndex2 = rnd.nextInt(population.size() - 1);

			Chromozome cross1 = population.get(crossIndex1).cloneChromozome();
			Chromozome cross2 = population.get(crossIndex2).cloneChromozome();

			cross1.crossOver(cross2);
			population.add(cross1);
		}
		System.out.println("Lenght after crossover: " + population.size());
	}

	public Population selectionTournament(int numberOfChromozomes) throws IOException {
		Random rnd = new Random();
		Fitness fit = new Fitness("image/orloj.jpg");
		Population pop1 = new Population();
//		for (Chromozome ch : population) {
//			int chFit = fit.getFitness(ch);
//			fitness.put(chFit, ch);
//		}
		for(int i = 0; i < numberOfChromozomes; i++) {
			int selectedIndex1 = rnd.nextInt(population.size() - 1);
			int selectedIndex2 = rnd.nextInt(population.size() - 1);
			
			int fit1 = fit.getFitness(population.get(selectedIndex1));
			int fit2 = fit.getFitness(population.get(selectedIndex2));
			
			if(fit1 < fit2) {
				pop1.population.add(population.get(selectedIndex1));
				System.out.println("Fitness: "+fit1);
				population.remove(selectedIndex1);
				population.remove(selectedIndex2);
			}
			else {
				pop1.population.add(population.get(selectedIndex2));
				System.out.println("Fitness: "+fit2);
				population.remove(selectedIndex1);
				population.remove(selectedIndex2);
			}
		}
		
		
		return pop1;
	}

}
