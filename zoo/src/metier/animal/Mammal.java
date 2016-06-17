package metier.animal;

public abstract class Mammal extends Animal {

	@Override
	public void giveBirth() {
		if(this.gender == false){
			System.out.println("Je met bas");
		}else{
			System.out.println("Je ne peut pas mettre bas, je suis un male");
		}
	}
	
	@Override
	public void eat() {
		if(this.hunger == true) {
			this.setHunger(false);
			System.out.println("Je mange de la viande");
		}else{
			System.out.println("Je n'ai pas faim");
		}
	}
	
	@Override
	public void treat() {
		if(this.health == true){
			System.out.println("Je suis malade");
			this.setHealth(false);
		}else{
			System.out.println("Je vais bien");
		}

	}

	@Override
	public void sleep() {
		if(this.sleep == true){
			System.out.println("Je dors");
			this.setSleep(false);
		}else{
			System.out.println("Je suis r�veill�");
			this.setSleep(true);
		}
	}


}
