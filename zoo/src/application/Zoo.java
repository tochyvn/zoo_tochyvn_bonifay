package application;

import metier.employe.Employee;
import metier.enclos.AquariumEnclosure;
import metier.enclos.Enclosure;

public class Zoo {
	
	private String nom;
	private Employee employe;
	private Enclosure  enclos[];
	
	public Zoo(String nom) {
		super();
		this.nom = nom;
		this.employe = new  Employee("Kamga",true, 26);
		this.enclos= new Enclosure[3];
		enclos();
	}
    public void enclos(){
      enclos[0] =new Enclosure("Standard", 125, 50);
      enclos[1] =new AquariumEnclosure("Tigre", 200, 50);
      enclos[2] =new AquariumEnclosure("Fish", 200, 50);
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
