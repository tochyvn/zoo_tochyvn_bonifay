package metier.animal;

import library.Fonctions;

public class Tiger extends Mammal implements Earthly{
	
	public static double MAX_WEIGHT = 150;
	public static double MIN_WEIGHT = 9;
	
	public static double MAX_HEIGHT = 1.5;
	public static double MIN_HEIGHT = 0.50;
	public static int number = 0;
	
	
	/**
	 * 
	 */
	public Tiger() {
		super();
	}

	/**
	 * @param number
	 */
	public Tiger(int number) {
		super(number);
		this.height = Fonctions.giveValueAleatoire(MIN_HEIGHT, MAX_HEIGHT);
		this.weight = Fonctions.giveValueAleatoire(MIN_WEIGHT, MAX_WEIGHT);
	}

	@Override
	public void yell() {
		System.out.println("Je rugit");

	}

	@Override
	public void wander() {
		System.out.println("Je vagabonde en mode tigre");
		
	}
	
	@Override
	public void eat() {
		
	}

}
