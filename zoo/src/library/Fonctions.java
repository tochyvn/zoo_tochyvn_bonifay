package library;

public class Fonctions {

	public Fonctions() {
		
	}
	
	public static double giveValueAleatoire(double min, double max) {
		
		double random = (max-min)*Math.random()+min;
		return random;
	}
	
	public static int giveEntireValueAleatoire(int min, int max) {
		int random = (int) ((max-min+1)*Math.random()+min);
		return random;
	}
	
	public static void main(String[] args) {
		System.out.println(Fonctions.giveEntireValueAleatoire(0, 10));
	}

}
