package controleur;

import application.Zoo;

public class Manager {

	public static Manager instence;
	private Zoo z;
	private  Manager() {
		z=new Zoo("---------Parc National-------------");
		
	}
	
	
	public static Manager getInstence() {
		if (instence == null) {
			instence = new Manager();
		}
		return instence;
	}

}
