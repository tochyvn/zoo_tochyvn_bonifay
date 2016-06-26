package model.technique;

import java.util.Scanner;

import controleur.Manager;
import model.metier.enclos.CleanDegree;
import model.metier.enclos.Enclosure;

public class Menu {

	private int nbreAction;

	public Menu() {
		this.setNbreAction(0);
	}

	public void listeAction() {
		Manager.getInstance().getVue().displayString("-------Liste des actions --------\n");
		Manager.getInstance().getVue().displayString("0) Sortir ");
		Manager.getInstance().getVue().displayString("1) Examiner l'enclos.");
		Manager.getInstance().getVue().displayString("2) Nettoyer l'enclos.");
		Manager.getInstance().getVue().displayString("3) Nourrir les animaux de enclos");
		Manager.getInstance().getVue().displayString("4) Transférer un animal d'un enclos à un autre.");
	}

	public void getMenu() {
		int action=-1;
		Scanner sc = new Scanner(System.in);
		while (action < 0) {
			while (nbreAction < 6) {
				System.out.println("choisir une action : ");
				String clavier = sc.next();
				try {
					action = Integer.parseInt(clavier);
				} catch (Exception ex) {
					Manager.getInstance().getVue().displayString(" Entrez un nombre entier Merci !!");
				}

				switch(action) {
				case 0 : 
					System.exit(0);
					Manager.getInstance().getVue().displayString("Au revoir et à bientôt");
					break;
					
				case 1 : 
					Manager.getInstance().displayEnclosureName();
					this.chooseEnclosure().getCaracteristic();
					break;
					
				case 2 : 
					Manager.getInstance().displayEnclosureName();
					Manager.getInstance().getZoo().getEmploye().cleanEnclosure(this.chooseEnclosure());

					break;
					
				case 3 : 
					Manager.getInstance().displayEnclosureName();
					Manager.getInstance().getZoo().getEmploye().giveFood(this.chooseEnclosure());
					break;
					
				case 4 :
					Manager.getInstance().displayEnclosureName();
					Manager.getInstance().viewDisplay("Quelle animal voulez vous transférer???");
					Manager.getInstance().displayAnimalName(this.chooseEnclosure());
					
					break;
				default :

					Manager.getInstance().getVue().displayString("Action non reconnue...");

				}

				nbreAction++;

			}

		}

	}

	private Enclosure chooseEnclosure() {
		
		Enclosure enclos = null;
		int longueur = Manager.getInstance().getZoo().getEnclos().length;
		int action = -1;
		
		
		while (action < 0 || action >= longueur) {
			Manager.getInstance().viewDisplay("\tVeuillez choisir nombre entier entre 0 et "+(longueur-1));
			try {
				Scanner sc = new Scanner(System.in);
				action = sc.nextInt();
			} catch (Exception e) {
				Manager.getInstance().viewDisplay("\t vous ne pouvez pas rentrer de lettres");
				action = longueur + 1;
			}
		}
		enclos = Manager.getInstance().getZoo().getEnclos()[action];
		
		return enclos;
	}

	public int getNbreAction() {
		return nbreAction;
	}

	public void setNbreAction(int nbreAction) {
		this.nbreAction = nbreAction;
	}

}
