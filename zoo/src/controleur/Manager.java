package controleur;

import java.util.ArrayList;

import model.metier.animal.Animal;
import model.metier.zoo.Zoo;

public class Manager {

	public static Manager instance;
	private Zoo zoo;
	
	private  Manager() {
		zoo = new Zoo("---------Parc National-------------");
	}
	
	public static Manager getInstance() {
		if (instance == null) {
			instance = new Manager();
		}
		return instance;
	}
	
	public int displayNbAnimal() {
		return zoo.displayNbAnimal();
	}
	
	public ArrayList<Animal> displayAnimal() {
		return zoo.displayAnimal();
	}
	

}
