package metier.animal;

import library.Fonctions;

public class Shark extends Other implements Marine{

	public static double MAX_WEIGHT = 80;
	public static double MIN_WEIGHT = 15;
	
	public static double MAX_HEIGHT = 5;
	public static double MIN_HEIGHT = 0.5;
	
	public Shark() {
		super();
	}

	public Shark(int number) {
		super(number);
		this.height = Fonctions.giveValueAleatoire(MIN_HEIGHT, MAX_HEIGHT);
		this.weight = Fonctions.giveValueAleatoire(MIN_WEIGHT, MAX_HEIGHT);

	}

	@Override
	public void yell() {
		System.out.println("Je bloublou");

	}
	
	@Override
	public void swim() {
		System.out.println("Je nage en mode Requin");
		
	}

}
