package metier.enclos;


import java.util.ArrayList;

import metier.CleanDegree;
import metier.animal.Animal;

public class Enclosure {
	
	protected String name;
	protected float surface;
	protected int nbMax;
	protected CleanDegree cleanDegree;
	protected ArrayList<Animal> animals;
	
	public Enclosure() {
		super();
	}

	public Enclosure(String name, float surface, int nbMax) {
		this();
		this.name = name;
		this.surface = surface;
		this.nbMax = nbMax;
		this.cleanDegree = CleanDegree.CORRECT;
	}
	
	/**
	 * Methode permettant d'ajouter un animal dans un enclos
	 * @param animal représente l'animal à ajouter dans l'enclos
	 */
	public void addAnimal(Animal animal) {
		this.animals.add(animal);
	}
	
	/**
	 * Methode permettant d'ajouter plusieurs animaux à la fois dans un enclos
	 * @param animals représente une collection contenant les animaux à ajouter
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
	public boolean remove(Animal animal) {
		return this.animals.remove(animal);
	}
	
	/**
	 * Methode permettant de nettoyer un enclos
	 */
	public void maintain() {
		if(this.getCleanDegree() != CleanDegree.GOOD) {
			this.setCleanDegree(CleanDegree.GOOD);
		}
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

	public int getNbMax() {
		return nbMax;
	}

	public void setNbMax(int nbMax) {
		this.nbMax = nbMax;
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


}
