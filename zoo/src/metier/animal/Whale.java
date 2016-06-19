package metier.animal;

import library.Fonctions;
import library.Validator;

public class Whale extends Mammal implements Marine{
	
	public static double MAX_WEIGHT = 200;
	public static double MIN_WEIGHT = 25;
	
	public static double MAX_HEIGHT = 3.0;
	public static double MIN_HEIGHT = 1.0;
	public static int number = 0;
	

	/**
	 * 
	 */
	public Whale() {
		super();
	}

	/**
	 * @param number
	 */
	public Whale(int number) {
		super(number);
		this.height = Validator.converteDouble(Fonctions.giveValueAleatoire(MIN_HEIGHT, MAX_HEIGHT)) ;
		this.weight = Validator.converteDouble(Fonctions.giveValueAleatoire(MIN_WEIGHT, MAX_HEIGHT));
	}

	@Override
	public void yell() {
		System.out.println("Je chante");
	}

	@Override
	public void eat() {
		if(this.hunger == true) {
			this.setHunger(false);
			System.out.println("Je mange du plancton");
		}else{
			System.out.println("Je n'ai pas faim");
		}

	}
	
	@Override
	public void swim() {
		System.out.println("Je nage en mode Baleine");
		
	}
}
