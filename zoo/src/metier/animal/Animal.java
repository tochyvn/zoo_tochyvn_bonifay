package metier.animal;

public abstract class Animal implements Reproducible{
	
	protected String name;
	protected boolean gender;
	protected float weight;
	protected float height;
	protected int age;
	protected boolean hunger;
	protected boolean sleep;
	protected boolean health;
	protected int duree;
	
	public Animal() {
		super();
	}

	public Animal(String name, boolean gender, float weight, float height, int age, boolean hunger, boolean sleep,
			boolean health, int duree) {
		super();
		this.name = name;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
		this.age = age;
		this.hunger = hunger;
		this.sleep = sleep;
		this.health = health;
		this.duree = duree;
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

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
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

	public abstract void eat();
	
	public abstract void yell();
	
	public abstract void treat();
	
	public abstract void sleep();
	
	
}
