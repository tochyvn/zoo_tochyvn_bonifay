package application;

import metier.employe.Employee;
import metier.enclos.AquariumEnclosure;
import metier.enclos.AriaryEnclosure;
import metier.enclos.Enclosure;

public class Zoo {
	
	private String nom;
	private Employee employe;
	private Enclosure  enclos[];
	
	public Zoo(String nom) {
		super();
		this.nom = nom;
		this.employe = new  Employee("Kamga",true, 26);
		this.enclos= new Enclosure[9];
		enclos();
	}
    public void enclos(){
      enclos[0] =new Enclosure("Standard", 125, 50);
      enclos[1] =new AquariumEnclosure("Whale", 200, 50);
      enclos[2] =new AquariumEnclosure("Fish", 200, 50);
      enclos[2] =new AriaryEnclosure("Eagle", 200, 50);
      enclos[3] =new Enclosure("Bear", 125, 50);
      enclos[4] =new Enclosure("Mammal", 125, 50);
      enclos[5] =new Enclosure("Penguin", 125, 50);
      enclos[6] =new Enclosure("Shark", 125, 50);
      enclos[7] =new Enclosure("Tiger", 125, 50);
      enclos[8] =new Enclosure("Wolf", 125, 50);
      
    }
    
    
	public Enclosure[] getEnclos() {
		return enclos;
	}
	public void setEnclos(Enclosure[] enclos) {
		this.enclos = enclos;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Employee getEmploye() {
		return employe;
	}

	public void setEmploye(Employee employe) {
		this.employe = employe;
	}
	
	
	

}
