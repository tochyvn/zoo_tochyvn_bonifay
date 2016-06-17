package metier.animal;

public class Tiger extends Mammal implements Earthly{

	@Override
	public void yell() {
		System.out.println("Je rugit");

	}

	@Override
	public void wander() {
		System.out.println("Je vagabonde en mode tigre");
		
	}
	
	@Override
	public void eat() {
		
	}

}
