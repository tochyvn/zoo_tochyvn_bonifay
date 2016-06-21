package model.metier.enclos;


import java.util.ArrayList;

import model.metier.animal.Animal;
import model.metier.evenement.Transmitter;

public abstract class Enclosure implements Transmitter {
	
	protected String name;
	protected float surface;
	protected int nbMaxAnimals;
	protected CleanDegree cleanDegree;
	protected ArrayList<Animal> animals;
	
	public Enclosure() {
		super();
	}

	public Enclosure(String name, float surface, int nbMax) {
		this();
		this.name = name;
		this.surface = surface;
		this.nbMaxAnimals = nbMax;
		this.cleanDegree = CleanDegree.CORRECT;
		animals = new ArrayList<Animal>();
	}
	
	/**
	 * Methode permettant d'ajouter un animal dans un enclos
	 * @param animal représente l'animal à ajouter dans l'enclos
	 */
	public void addAnimal(Animal animal) {
		this.animals.add(animal);
	}
	
	/**
	 * Methode permettant d'ajouter plusieurs Animals à la fois dans un enclos
	 * @param animals représente une collection contenant les Animals à ajouter
	 */
	public void addAnimals(ArrayList<Animal> animals) {
		for (Animal animal : animals) {
			this.animals.add(animal);
		}
	}
	
	/**
	 * 
	 * @param animal
	 * @return
	 */
	public boolean removeAnimal(Animal animal) {
		return this.animals.remove(animal);
	}
	
	public void feedAnimal(Animal animal) {
		animal.eat();
	}
	
	/**
	 * Methode permettant de nettoyer un enclos
	 */
	public void maintain() {
		if(this.getCleanDegree() != CleanDegree.GOOD || this.getCleanDegree() != CleanDegree.CORRECT) {
			this.setCleanDegree(CleanDegree.GOOD);
		}
	}
	
	public int countAnimal() {
		return this.animals.size();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSurface() {
		return surface;
	}

	public void setSurface(float surface) {
		this.surface = surface;
	}

	

	public int getNbMaxAnimals() {
		return nbMaxAnimals;
	}

	public void setNbMaxAnimals(int nbMaxAnimals) {
		this.nbMaxAnimals = nbMaxAnimals;
	}

	public int getNbAnimalsPresent() {
		return animals.size();
	}


	public CleanDegree getCleanDegree() {
		return cleanDegree;
	}

	public void setCleanDegree(CleanDegree cleanDegree) {
		this.cleanDegree = cleanDegree;
	}
	

	public ArrayList<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(ArrayList<Animal> animals) {
		this.animals = animals;
	}
	
	public String getCaracteristic() {
		return "Enclos,  Nom : "+name+" SURFACE : "+surface+" CAPACITE : "+nbMaxAnimals+" PROPRETE : "
				+ ""+getDegreePropertyString()+" PRESENT : "+getNbAnimalsPresent()+"\n"
				+ "Les Animaux présents : \n"+getAnimalsCaracteristic();
	}
	
	private String getAnimalsCaracteristic() {
		String string = "";
		for (Animal animal : animals) {
			string+=animal+" \n";
		}
		
		return string;
	}
	
	private String getDegreePropertyString() {
		String degree = null;
		if (cleanDegree == CleanDegree.AVERAGE) {
			degree = "MOYEN";
		}else if (cleanDegree == CleanDegree.BAD) {
			degree = "MAUVAIS";
		}else if (cleanDegree == CleanDegree.CORRECT) {
			degree = "CORRECT";
		}else {
			degree = "NICKEL";
		}
		
		return degree;
	}


}
