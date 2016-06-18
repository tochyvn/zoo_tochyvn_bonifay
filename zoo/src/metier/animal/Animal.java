package metier.animal;

public abstract class Animal implements Reproducible{
	
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

	public abstract void eat();
	
	public abstract void yell();
	
	public abstract void treat();
	
	public abstract void sleep();
	
	
}
