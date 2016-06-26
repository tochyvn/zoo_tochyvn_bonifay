package controleur;

import java.util.ArrayList;

import model.metier.animal.Animal;
import model.metier.enclos.Enclosure;
import model.metier.zoo.Zoo;
import model.technique.Menu;
import vue.VueZoo;

public class Manager {

	public static Manager instance;
	private Zoo zoo;
	private VueZoo vue;
	private Menu menu;
	
	private  Manager() {
		zoo = new Zoo("----------------------------- Parc National ---------------------------------\n\n");
		setMenu(new Menu());
	}
	
	/**
	 * 
	 * @param vue
	 */
	public void setVue(VueZoo vue) {
		this.vue = vue;
	}
	
	public VueZoo getVue() {
		return vue;
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

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	/*
	public String getAnimalsCaracteristic() {
		return zoo.getEnclos()[8].getCaracteristic();
	}
	*/
	public String getZooName() {
		return zoo.getNom();
	}
	
	public void viewDisplay(String string) {
		vue.displayString(string);
	}
	
	public void launch() {
		zoo.launch();
	}
	
	public void displayEnclosureName() {
		for (int i = 0; i < zoo.getEnclos().length; i++) {
			this.viewDisplay(i+") "+zoo.getEnclos()[i].getName());
		}
	}
	
	public void displayAnimalName(Enclosure enclos) {
		for (int i = 0; i < enclos.getAnimals().size(); i++) {
			this.viewDisplay(i+") "+enclos.getAnimals().get(i).getName()+"\n");
		}
	}
	
	public Zoo getZoo() {
		return zoo;
	}
	

}
