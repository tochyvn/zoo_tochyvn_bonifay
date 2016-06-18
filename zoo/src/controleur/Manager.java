package controleur;

import application.Zoo;

public class Manager {

	public static Manager instence;
  
	private  Manager() {
		
		
	}
	
	
	public static Manager getInstence() {
		if (instence == null) {
			instence = new Manager();
		}
		return instence;
	}

}
