package model.metier.animal;

import model.metier.evenement.Transmitter;

public abstract class Animal implements Reproducible, Transmitter{
	
	protected String name;
	protected boolean gender;
	protected double weight;
	protected double height;
	protected int age;
	protected boolean hunger;
	protected boolean sleep;
	protected boolean health;
	protected int duree;
	protected int number;
	
	public Animal() {
		super();
	}

	public Animal(int number) {
		this.name = this.getClass().getSimpleName()+"__"+number;
		this.age = 0;
		int sex = (int) Math.random();
		if(sex == 0) {
			gender = false;
		}else {
			gender = true;
		}
		this.hunger = false;
		this.sleep = false;
		this.health = true;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}
	
	public String getSex() {
		String sexe = "MALE";
		if (!gender) {
			sexe = "FEMALE";
		}
		
		return sexe;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHunger() {
		return hunger;
	}

	public void setHunger(boolean hunger) {
		this.hunger = hunger;
	}

	public boolean isSleep() {
		return sleep;
	}

	public void setSleep(boolean sleep) {
		this.sleep = sleep;
	}

	public boolean isHealth() {
		return health;
	}

	public void setHealth(boolean health) {
		this.health = health;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	
	@Override
	public String toString() {
		return "NOM : "+name+" -- SEXE : "+this.getSex()+" -- POIDS : "
				+ ""+weight+" -- TAILLE : "+height+" -- AGE : "+age+" -- FAIM : "+getHungerString()+" -- "
						+ "SOMMEIL : "+getSleepString()+" -- SANTE : "+getHealthString();
	}
	
	public String getHungerString() {
		String faim = null;
		if(hunger) {
			faim = "AFFAMER";
		}else {
			faim = "RASSASIER";
		}
		return faim;
	}
	
	public String getHealthString() {
		String faim = null;
		if(health) {
			faim = "MALADE";
		}else {
			faim = "PAS MALADE";
		}
		return faim;
	}
	
	public String getSleepString() {
		String faim = null;
		if(sleep) {
			faim = "ENDORMI";
		}else {
			faim = "REVEILLE";
		}
		return faim;
	}
	

	public abstract void eat();
	
	public abstract void yell();
	
	public abstract void treat();
	
	public abstract void sleep();
	
	
}
