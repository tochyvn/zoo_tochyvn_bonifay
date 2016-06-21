package model.metier.animal;

public class Penguin extends Other implements Earthly, Marine, Aerial{

	@Override
	public void yell() {
		System.out.println("Je jabote");

	}
	
	@Override
	public void wander() {
		System.out.println("Je vagabonde en mode Pingouin");
		
	}
	
	@Override
	public void swim() {
		System.out.println("Je nage en mode Pingouin");
		
	}
	
	@Override
	public void fly() {
		System.out.println("Je vole en mode Pingouin");
		
	}

}
