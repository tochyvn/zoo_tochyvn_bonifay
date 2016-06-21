package model.metier.animal;

import library.Fonctions;
import library.Validator;

public class Fish extends Other implements Marine{
	
	
	public static double MAX_WEIGHT = 100;
	public static double MIN_WEIGHT = 0.5;
	
	public static double MAX_HEIGHT = 3;
	public static double MIN_HEIGHT = 0.5;
	public static int number = 0;
	
	public Fish() {
		super();
	
	}

	public Fish(int number) {
		super(number);
		this.height = Validator.converteDouble(Fonctions.giveValueAleatoire(MIN_HEIGHT, MAX_HEIGHT)) ;
		this.weight = Validator.converteDouble(Fonctions.giveValueAleatoire(MIN_WEIGHT, MAX_HEIGHT));

	}

	@Override
	public void yell() {
		System.out.println("Je bloublou");

	}
	
	@Override
	public void eat() {
		if(this.hunger == true) {
			this.setHunger(false);
			System.out.println("Je mange des plantons");
		}else{
			System.out.println("Je n'ai pas faim");
		}

	}
	
	@Override
	public void swim() {
		System.out.println("Je nage en mode poisson");
		
	}

}
