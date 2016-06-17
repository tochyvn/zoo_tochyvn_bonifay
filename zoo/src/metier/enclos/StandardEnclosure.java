package metier.enclos;

import java.util.ArrayList;

import metier.animal.Earthly;

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

	public void addAnimals(ArrayList<Earthly> earthlies) {
		for (Earthly earthly : earthlies) {
			this.earthlies.add(earthly);
		}
	}
	
	
	
	
}
