package metier;

public class Fish extends Other implements Marine{

	@Override
	public void yell() {
		System.out.println("Je bloublou");

	}
	
	@Override
	public void eat() {
		if(this.hunger == true) {
			this.setHunger(false);
			System.out.println("Je mange de la nourriture pour poisson");
		}else{
			System.out.println("Je n'ai pas faim");
		}

	}
	
	@Override
	public void swim() {
		System.out.println("Je nage en mode poisson");
		
	}

}
