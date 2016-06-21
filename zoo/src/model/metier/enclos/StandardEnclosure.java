package model.metier.enclos;

import java.util.ArrayList;

import model.metier.animal.Earthly;

public class StandardEnclosure extends Enclosure {
	
	private ArrayList<Earthly> earthlies;

	public StandardEnclosure() {
		super();
		
	}

	public StandardEnclosure(String name, float surface, int nbMax) {
		super(name, surface, nbMax);
		earthlies = new ArrayList<Earthly>();
	}
	
	public void addAnimal(Earthly earthly) {
		this.earthlies.add(earthly);
	}


}
