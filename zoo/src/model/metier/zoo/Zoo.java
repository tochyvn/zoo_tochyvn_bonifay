package model.metier.zoo;

import java.util.ArrayList;

import controleur.Manager;
import library.Fonctions;
import model.metier.animal.Animal;
import model.metier.animal.Fish;
import model.metier.animal.Tiger;
import model.metier.animal.Wolf;
import model.metier.employee.Employee;
import model.metier.enclos.AquariumEnclosure;
import model.metier.enclos.AviaryEnclosure;
import model.metier.enclos.CleanDegree;
import model.metier.enclos.Enclosure;
import model.metier.enclos.StandardEnclosure;
import model.metier.evenement.Evenement;
import model.metier.evenement.EvenementAnimal;
import model.metier.evenement.EvenementEnclosure;

public class Zoo {

	private String nom;
	private Employee employe;
	private Enclosure  enclos[];
	private int numberEnclosureMax;
	private ArrayList<Evenement> evenements;
	public static int NBRE_CYCLE = 5;

	public Zoo(String nom) {
		super();
		this.nom = nom;
		this.employe = new  Employee("Kamga",true, 26);
		this.enclos= new Enclosure[9];
		setNumberEnclosureMax(10);
		evenements = new ArrayList<Evenement>();
		this.initialize();
	}
	
	public void initialize() {
		enclos[0] = new AviaryEnclosure("Eagle_1", 125, 50);
		enclos[1] = new AquariumEnclosure("Whale_1", 200, 50);
		enclos[2] = new AquariumEnclosure("Fish_1", 200, 50);
		enclos[2] = new AviaryEnclosure("Eagle_2", 200, 50);
		enclos[3] = new StandardEnclosure("Bear_1", 125, 50);
		enclos[4] = new AquariumEnclosure("Whale_2", 125, 50);
		enclos[5] = new StandardEnclosure("Penguin_1", 125, 50);
		enclos[6] = new AquariumEnclosure("Shark_1", 125, 50);
		enclos[7] = new StandardEnclosure("Tiger_1", 125, 50);
		enclos[8] = new StandardEnclosure("Wolf_1", 125, 50);

		//Creation de tigre
		for(int i=0; i<3; i++) {
			Animal tigre = new Tiger(Tiger.number);
			enclos[7].addAnimal(tigre);
			Tiger.number++;
		}

		//Creation de wolf
		for(int i=0; i<3; i++) {
			Animal wolf = new Wolf(Wolf.number);
			enclos[8].addAnimal(wolf);
			Wolf.number++;
		}

		//Creation de fish
		for(int i=0; i<3; i++) {
			Animal fish = new Fish(Fish.number);
			enclos[2].addAnimal(fish);
			Fish.number++;
		}
	}

	/**
	 * Methode permettant d'afficher le nombre d'animaux dans le zoo
	 * @return represente le nombre d'animaux dans le zoo
	 */
	public int displayNbAnimal() {
		int number = 0;
		for (Enclosure enclosure : enclos) {
			number+=enclosure.countAnimal();
		}
		
		return number;
	}

	/**
	 * Methode permettant d'afficher les animaux dans le zoo 
	 * @return represente la collection des animaux du zoo
	 */
	public ArrayList<Animal> displayAnimal() {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		for (Enclosure enclosure : enclos) {
			animals.addAll(enclosure.getAnimals());
		}
		
		return animals;
	}

	public Enclosure[] getEnclos() {
		return enclos;
	}
	public void setEnclos(Enclosure[] enclos) {
		this.enclos = enclos;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Employee getEmploye() {
		return employe;
	}

	public void setEmploye(Employee employe) {
		this.employe = employe;
	}
	public int getNumberEnclosureMax() {
		return numberEnclosureMax;
	}
	public void setNumberEnclosureMax(int numberEnclosureMax) {
		this.numberEnclosureMax = numberEnclosureMax;
	}

	/**
	 * Lancement de la boucle évenementielle
	 */
	public void launch() {
		
		int x = 0;
		int count = 1;
		while(x == 0) {
			Manager.getInstance().viewDisplay("\n----- CYCLE N° "+count+" ------\n");
			
			Manager.getInstance().getMenu().listeAction();
			this.alter();
			this.toHandUser();
			count++;
		}
				
	}
	
	private void alter() {
		int nbre = 0;
		for (Enclosure enclosure : enclos) {
			nbre+=enclosure.getNbAnimalsPresent();
		}
		int random = Fonctions.giveEntireValueAleatoire(0, nbre - 1);
		
		for (int i = 0; i < random; i++) {
			this.alterAnimalState();
		}
		
		for (int i = 0; i < nbre; i++) {
			this.alterEnclosureState();
		}
	}
	
	private void toHandUser() {
		Manager.getInstance().getMenu().getMenu();
	}
	
	/**
	 * Permet de modifier l'état de certains animaux d'un enclos
	 */
	private void alterAnimalState() {
		Enclosure enclos = this.selectRandomEnclosure();
		Animal animal = this.selectRandomAnimal(enclos);
		if (animal != null) {
			this.setRandomState(animal);
			Evenement evenement = new EvenementAnimal(animal, employe);
			evenements.add(evenement);
		}
	}
	/**
	 * Modifier aléatoirement l'état d'un enclos
	 */
	private void alterEnclosureState() {
		Enclosure enclos = this.selectRandomEnclosure();
		int random = Fonctions.giveEntireValueAleatoire(0, 1);
		if (random == 0) {
			enclos.setCleanDegree(CleanDegree.BAD);
		}else {
			enclos.setCleanDegree(CleanDegree.AVERAGE);
		}
		Evenement evenement = new EvenementEnclosure(enclos, employe);
		evenements.add(evenement);
	}
	
	
	/**
	 * Selectionner aleatoirement un enclos parmis les enclos du zoo
	 * @return represente l'enclos selectionné
	 */
	private Enclosure selectRandomEnclosure() {
		int max = enclos.length - 1;
		Enclosure selectedEnclos = enclos[Fonctions.giveEntireValueAleatoire(0, max)];
		
		return selectedEnclos;
	}
	
	private Animal selectRandomAnimal(Enclosure enclos) {
		Animal selectedAnimal = null;
		if (enclos.getAnimals().size() > 1) {
			int max = enclos.getAnimals().size() - 1;
			selectedAnimal = enclos.getAnimals().get(Fonctions.giveEntireValueAleatoire(0, max));
		}
		
		return selectedAnimal;
	}
	
	private void setRandomState(Animal animal) {
		int random = Fonctions.giveEntireValueAleatoire(0, 2);
		if (random == 0) {
			animal.setHealth(false);
		}else if (random == 1) {
			animal.setHunger(true);
		}else {
			if (animal.isSleep()) {
				animal.setSleep(false);
			}else {
				animal.setSleep(true);
			}
		}
	}
	
	public void getEnclosureName() {
		for (Enclosure enclosure : enclos) {
			System.out.println(enclosure.getName());
		}
	}

}
