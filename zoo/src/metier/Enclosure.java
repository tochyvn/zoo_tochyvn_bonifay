package metier;

import java.util.ArrayList;

public class Enclosure {
	
	private String name;
	private float surface;
	private int nbMax;
	private int nbPresent;
	private ArrayList<Animal> animals;
	private CleanDegree cleanDegree;
	
	public Enclosure() {
		super();
	}

	public Enclosure(String name, float surface, int nbMax, int nbPresent) {
		this();
		this.name = name;
		this.surface = surface;
		this.nbMax = nbMax;
		this.nbPresent = nbPresent;
		this.animals = new ArrayList<Animal>();
		this.cleanDegree = CleanDegree.CLEAN;
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

	public int getNbPresent() {
		return nbPresent;
	}

	public void setNbPresent(int nbPresent) {
		this.nbPresent = nbPresent;
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

}
