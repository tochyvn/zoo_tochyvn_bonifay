package model.metier.enclos.enclosGenerique;

import java.util.ArrayList;

import model.metier.animal.Animal;
import model.metier.animal.Fish;
import model.metier.enclos.CleanDegree;

public class Enclosure<T extends Animal> {

	protected String name;
	protected float surface;
	protected int nbMaxTs;
	protected CleanDegree cleanDegree;
	protected ArrayList<T> animals;
	
	public Enclosure() {
		super();
	}

	public Enclosure(String name, float surface, int nbMax) {
		this();
		this.name = name;
		this.surface = surface;
		this.nbMaxTs = nbMax;
		this.cleanDegree = CleanDegree.CORRECT;
		animals = new ArrayList<T>();
	}
	
	/**
	 * Methode permettant d'ajouter un animal dans un enclos
	 * @param animal représente l'animal à ajouter dans l'enclos
	 */
	public void addT(T animal) {
		this.animals.add(animal);
	}
	
	/**
	 * Methode permettant d'ajouter plusieurs Ts à la fois dans un enclos
	 * @param animals représente une collection contenant les Ts à ajouter
	 */
	public void addTs(ArrayList<T> animals) {
		for (T animal : animals) {
			this.animals.add(animal);
		}
	}
	
	/**
	 * 
	 * @param animal
	 * @return
	 */
	public boolean removeT(T animal) {
		return this.animals.remove(animal);
	}
	
	public void feedT(T animal) {
		animal.eat();
	}
	
	/**
	 * Methode permettant de nettoyer un enclos
	 */
	public boolean maintain() {
		boolean bool = false;
		if(this.getCleanDegree() != CleanDegree.GOOD || this.getCleanDegree() != CleanDegree.CORRECT) {
			this.setCleanDegree(CleanDegree.GOOD);
			bool = true;
		}
		return bool;
	}
	
	public int countT() {
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

	

	public int getNbMaxTs() {
		return nbMaxTs;
	}

	public void setNbMaxTs(int nbMaxTs) {
		this.nbMaxTs = nbMaxTs;
	}

	public int getNbTsPresent() {
		return animals.size();
	}


	public CleanDegree getCleanDegree() {
		return cleanDegree;
	}

	public void setCleanDegree(CleanDegree cleanDegree) {
		this.cleanDegree = cleanDegree;
	}
	

	public ArrayList<T> getTs() {
		return animals;
	}

	public void setTs(ArrayList<T> animals) {
		this.animals = animals;
	}
	
	public String getCaracteristic() {
		return "Enclos,  Nom : "+name+" SURFACE : "+surface+" CAPACITE : "+nbMaxTs+" PROPRETE : "
				+ ""+getDegreePropertyString()+" PRESENT : "+getNbTsPresent()+"\n"
				+ "Les Animaux présents : \n"+getTsCaracteristic();
	}
	
	public String getTsCaracteristic() {
		String string = "";
		for (T animal : animals) {
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
	
	public static void main(String[] args) {
		Enclosure<Animal> animal = new Enclosure<>();
		AquariumEnclosure<Fish> fish = new AquariumEnclosure<>();
		ArrayList<? extends Enclosure<Animal>> animals = new ArrayList<>();
		animals.add(fish);
		
	}


}
