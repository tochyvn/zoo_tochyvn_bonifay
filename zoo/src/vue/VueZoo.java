package vue;

import java.util.Scanner;

import controleur.Manager;
import model.metier.animal.Animal;

public class VueZoo {

	public void listeAction() {
		System.out.println("-------Liste des actions --------");
		System.out.println("0) Sortir ");
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

	public VueZoo() {
		listeAction();
		menu();

	}

	public static void main(String[] args) {
		VueZoo console = new VueZoo();
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

	public  void menu() {
		int action=-1;
		Scanner sc = new Scanner(System.in);
		while (action < 0) {
			System.out.println("choisir une action : ");
			// lecture du clavier
			String clavier = sc.next();
			// try me permet de gerer les erreurs au cas ou l'utilisateur fai
			// entre un autre carrectre qui n'est pas un entier
			try {
				action = Integer.parseInt(clavier);
			} catch (Exception ex) {
				System.out.println(" Entrez un nombre entier Merci !!");
			}

		}

		switch(action) {
		case 0 : 
			System.out.println("fermer l'application..........");
			break;
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
		case 3 : 
			System.out.println("To do..........");
			listeAction();
			menu();
			break;
		default :
			listeAction();
			System.out.println("action non reconue..........");
			menu();
		}

	}
	
	public void affiche(String string) {
		
	}

}