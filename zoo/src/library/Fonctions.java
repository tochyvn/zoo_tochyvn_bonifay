package library;

public class Fonctions {

	public Fonctions() {
		
	}
	
	public static double giveValueAleatoire(double min, double max) {
		
		double random = (max-min)*Math.random()+min;
		return random;
	}

}
