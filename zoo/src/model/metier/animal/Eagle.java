package model.metier.animal;

import library.Fonctions;
import library.Validator;

public class Eagle extends Other implements Aerial{

	
	public static double MAX_WEIGHT = 25;
	public static double MIN_WEIGHT = 0.3;
	
	public static double MAX_HEIGHT = 0.7;
	public static double MIN_HEIGHT = 0.2;
	public static int number = 0;
	
	public Eagle() {
		super();
		
	}

	public Eagle(int number) {
		super(number);
		this.height = Validator.converteDouble(Fonctions.giveValueAleatoire(MIN_HEIGHT, MAX_HEIGHT)) ;
		this.weight = Validator.converteDouble(Fonctions.giveValueAleatoire(MIN_WEIGHT, MAX_HEIGHT));
	}

	@Override
	public void yell() {
		System.out.println("Je glatit");

	}
	
	@Override
	public void fly() {
		System.out.println("Je vole en mode Aigle");
		
	}
	
	@Override
	public void eat() {
		if(this.hunger == true && !this.sleep) {
			this.setHunger(false);
			System.out.println("Je mange de la viande");
		}else{
			System.out.println("Je n'ai pas faim");
		}

	}

}
