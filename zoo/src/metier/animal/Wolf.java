package metier.animal;

import library.Fonctions;

public class Wolf extends Mammal implements Earthly{
	
	public static double MAX_WEIGHT = 100;
	public static double MIN_WEIGHT = 11;
	
	public static double MAX_HEIGHT = 1.2;
	public static double MIN_HEIGHT = 0.40;
	public static int number = 0;
	
	/**
	 * 
	 */
	public Wolf() {
		super();
	}

	/**
	 * @param number
	 */
	public Wolf(int number) {
		super(number);
		this.height = Fonctions.giveValueAleatoire(MIN_HEIGHT, MAX_HEIGHT);
		this.weight = Fonctions.giveValueAleatoire(MIN_WEIGHT, MAX_WEIGHT);
	}

	@Override
	public void yell() {
		System.out.println("Je hurle");

	}
	
	@Override
	public void wander() {
		System.out.println("Je vagabonde en mode loup");
		
	}

}
