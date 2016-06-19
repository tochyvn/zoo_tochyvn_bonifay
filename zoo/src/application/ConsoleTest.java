package application;

import java.util.Scanner;

import controleur.Manager;
import metier.animal.Animal;

public class ConsoleTest {

	public void listeAction() {
		System.out.println("-------Liste des actions --------");
		System.out.println("1) Afficher le nombre d'animaux pr�sents dans le zoo");
		System.out.println("1) Afficher le nombre d'animaux pr�sents dans le zoo");
		System.out.println("2) Afficher les animaux de tous les enclos.");
	}

	public void AnimalEnclosure() {
		displayString(Manager.getInstance().displayNbAnimal() + "\n\n");
		displayString("------------------ Liste des animaux du Zoo ----------------------\n\n");
		for (Animal animal : Manager.getInstance().displayAnimal()) {
			displayString(animal + "\n");
		}
	}

	public ConsoleTest() {
		listeAction();
		menu();

	}

	public static void main(String[] args) {
		ConsoleTest console = new ConsoleTest();
	}

	/**
	 * Methode permettant d'afficher une chaîne dans la console
	 * 
	 * @param string
	 *            represente la chaine à ajouter
	 */
	public void displayString(Object string) {
		System.out.println(string);
	}

	public  void menu(){
		int action=0;
			while (action <= 0) {
				System.out.println("choisir une action : ");
				// lecture du clavier
				String clavier = new Scanner(System.in).next();
				// try me permet de gerer les erreurs au cas ou l'utilisateur fai
				// entre un autre carrectre qui n'est pas un entier
				try {
					action = Integer.parseInt(clavier);
				} catch (Exception ex) {
					System.out.println(" Entrez un nombre entier Merci !!");
				}

			}
			
		switch(action){
		case 1 : 
			System.out.println( " Nbre d'animaux dans le zoo : "+Manager.getInstance().displayNbAnimal());
			listeAction();
			menu();
			break;
		case 2 : 
			AnimalEnclosure();
			listeAction();
			menu();
			break;

		default :
			listeAction();
			System.out.println("action non reconue..........");
			
			menu();
		}
		
	}

}
