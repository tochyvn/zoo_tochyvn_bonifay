package metier;

public class Shark extends Other implements Marine{

	@Override
	public void yell() {
		System.out.println("Je bloublou");

	}
	
	@Override
	public void swim() {
		System.out.println("Je nage en mode Requin");
		
	}

}
