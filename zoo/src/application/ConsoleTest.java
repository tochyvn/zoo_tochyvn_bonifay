package application;

import controleur.Manager;
import metier.animal.Animal;

public class ConsoleTest { 
  
	public ConsoleTest() {
		displayString(Manager.getInstance().displayNbAnimal()+"\n\n");
		displayString("------------------ Liste des animaux du Zoo ----------------------\n\n");
		for (Animal animal : Manager.getInstance().displayAnimal()) {
			displayString(animal+"\n");
		}
	}


	public static void main(String[] args) {
		ConsoleTest console = new ConsoleTest();
	}
	
	/**
	 * Methode permettant d'afficher une chaîne dans la console
	 * @param string represente la chaine à ajouter
	 */
	public void displayString(Object string) {
		System.out.println(string);
	}
	

}
