package metier;

public class Whale extends Mammal implements Marine{

	@Override
	public void yell() {
		System.out.println("Je chante");

	}

	@Override
	public void eat() {
		if(this.hunger == true) {
			this.setHunger(false);
			System.out.println("Je mange du plancton");
		}else{
			System.out.println("Je n'ai pas faim");
		}

	}
	
	@Override
	public void swim() {
		System.out.println("Je nage en mode Baleine");
		
	}
}
