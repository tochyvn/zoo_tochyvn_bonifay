package metier;

public class Bear extends Mammal implements Earthly{

	@Override
	public void yell() {
		System.out.println("Je gronde");

	}

	@Override
	public void eat() {
		if(this.hunger == true) {
			this.setHunger(false);
			System.out.println("Je mange du poisson");
		}else{
			System.out.println("Je n'ai pas faim");
		}

	}
	
	@Override
	public void wander() {
		System.out.println("Je vagabonde en mode ours");
		
	}
}
