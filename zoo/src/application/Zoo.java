package application;

import java.util.ArrayList;

import metier.animal.Animal;
import metier.animal.Fish;
import metier.animal.Tiger;
import metier.animal.Wolf;
import metier.employe.Employee;
import metier.enclos.AquariumEnclosure;
import metier.enclos.AriaryEnclosure;
import metier.enclos.Enclosure;

public class Zoo {

	private String nom;
	private Employee employe;
	private Enclosure  enclos[];
	private int numberEnclosureMax;

	public Zoo(String nom) {
		super();
		this.nom = nom;
		this.employe = new  Employee("Kamga",true, 26);
		this.enclos= new Enclosure[9];
		setNumberEnclosureMax(10);
		this.initialize();
	}
	public void initialize() {
		enclos[0] = new Enclosure("Standard", 125, 50);
		enclos[1] = new AquariumEnclosure("Whale", 200, 50);
		enclos[2] = new AquariumEnclosure("Fish", 200, 50);
		enclos[2] = new AriaryEnclosure("Eagle", 200, 50);
		enclos[3] = new Enclosure("Bear", 125, 50);
		enclos[4] = new Enclosure("Mammal", 125, 50);
		enclos[5] = new Enclosure("Penguin", 125, 50);
		enclos[6] = new Enclosure("Shark", 125, 50);
		enclos[7] = new Enclosure("Tiger", 125, 50);
		enclos[8] = new Enclosure("Wolf", 125, 50);

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

		//Creation de wolf
		for(int i=0; i<3; i++) {
			Animal fish = new Fish(Fish.number);
			enclos[8].addAnimal(fish);
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

	public void launch() {

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




}
