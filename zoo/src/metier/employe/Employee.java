package metier.employe;

import java.util.ArrayList;

import metier.CleanDegree;
import metier.animal.Animal;
import metier.enclos.Enclosure;

public class Employee {
	
	private String nom;
	private boolean sexe; 
	private int age;
	
	public Employee() {
		super();
	}

	public Employee(String nom, boolean sexe, int age) {
		super();
		this.nom = nom;
		this.sexe = sexe;
		this.age = age;
	}
	
	/**
	 * Methode permettant à l'employé de nettoyer un enclos
	 * @param enclos
	 */
	public void cleanEnclosure(Enclosure enclos) {
		enclos.maintain();
	}
	
	/**
	 * Methode permettant de nourrir les animaux d'un enclos
	 * @param enclos represente l'enclos dont on veux nourrir les animaux
	 */
	public void giveFood(Enclosure enclos) {
		ArrayList<Animal> animals = enclos.getAnimals();
		for (Animal animal : animals) {
			animal.eat();
		}
	}
	
	/**
	 * Methode permettant d'ajouter un ensemble d'animaux à dans un enclos
	 * @param animals represente la collection d'animaux à ajouter
	 * @param enclos represente enclos represente l'enclos dont on veux ajouer des animaux
	 */
	public void addAnimals(Animal animal, Enclosure enclos) {
		enclos.addAnimal(animal);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean isSexe() {
		return sexe;
	}

	public void setSexe(boolean sexe) {
		this.sexe = sexe;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
