package controleur;

import application.Zoo;

public class Manager {

	public static Manager instance;
	private Zoo z;
	
	private  Manager() {
		z=new Zoo("---------Parc National-------------");
		
	}
	
	
	public static Manager getInstence() {
		if (instance == null) {
			instance = new Manager();
		}
		return instance;
	}

}
