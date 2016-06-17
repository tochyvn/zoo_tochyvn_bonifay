package metier.animal;

public class Eagle extends Other implements Aerial{

	@Override
	public void yell() {
		System.out.println("Je glatit");

	}
	
	@Override
	public void fly() {
		System.out.println("Je vole en mode Aigle");
		
	}

}
