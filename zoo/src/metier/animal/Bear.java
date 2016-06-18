package metier.animal;

import library.Fonctions;

public class Bear extends Mammal implements Earthly{
	
	public static double MAX_WEIGHT = 300;
	public static double MIN_WEIGHT = 10;
	
	public static double MAX_HEIGHT = 2.0;
	public static double MIN_HEIGHT = 0.70;
	

	/**
	 * 
	 */
	public Bear() {
		super();
	}

	/**
	 * @param number
	 */
	public Bear(int number) {
		super(number);
		this.height = Fonctions.giveValueAleatoire(MIN_HEIGHT, MAX_HEIGHT);
		this.weight = Fonctions.giveValueAleatoire(MIN_WEIGHT, MAX_HEIGHT);
	}

	@Override
	public void yell() {
		System.out.println("Je gronde");

	}

	@Override
	public void eat() {
		if(this.hunger == true) {
			this.setHunger(false);
			System.out.println("Je mange du poisson");
		}else{
			System.out.println("Je n'ai pas faim");
		}

	}
	
	@Override
	public void wander() {
		System.out.println("Je vagabonde en mode ours");
		
	}
}
