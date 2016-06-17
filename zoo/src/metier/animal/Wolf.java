package metier.animal;

public class Wolf extends Mammal implements Earthly{

	@Override
	public void yell() {
		System.out.println("Je hurle");

	}
	
	@Override
	public void wander() {
		System.out.println("Je vagabonde en mode loup");
		
	}

}
