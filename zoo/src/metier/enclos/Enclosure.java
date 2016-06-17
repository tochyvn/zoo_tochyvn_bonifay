package metier.enclos;

import java.util.ArrayList;

import metier.CleanDegree;
import metier.animal.Animal;

public abstract class Enclosure {
	
	protected String name;
	protected float surface;
	protected int nbMax;
	protected ArrayList<Animal> animals;
	protected CleanDegree cleanDegree;
	
	public Enclosure() {
		super();
	}

	public Enclosure(String name, float surface, int nbMax) {
		this();
		this.name = name;
		this.surface = surface;
		this.nbMax = nbMax;
		this.animals = new ArrayList<Animal>();
		this.cleanDegree = CleanDegree.CORRECT;
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

	public ArrayList<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(ArrayList<Animal> animals) {
		this.animals = animals;
	}

	public CleanDegree getCleanDegree() {
		return cleanDegree;
	}

	public void setCleanDegree(CleanDegree cleanDegree) {
		this.cleanDegree = cleanDegree;
	}
	
	/**
	 * Methode permettant d'ajouter un animal dans un enclos
	 * @param animal représente l'animal à ajouter dans l'enclos
	 */
	public abstract void addAnimal(Animal animal);
	
	/**
	 * Methode permettant d'ajouter plusieurs animaux à la fois dans un enclos
	 * @param animals représente une collection contenant les animaux à ajouter
	 */
	public abstract void addAnimals(ArrayList<Animal> animals);

}
