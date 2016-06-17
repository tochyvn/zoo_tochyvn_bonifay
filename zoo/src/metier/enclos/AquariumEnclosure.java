package metier.enclos;

import java.util.ArrayList;

import metier.animal.Marine;

public class AquariumEnclosure extends Enclosure {
	
	private ArrayList<Marine> marines;

	public AquariumEnclosure() {
		super();
		marines = new ArrayList<Marine>();
	}

	public AquariumEnclosure(String name, float surface, int nbMax) {
		super(name, surface, nbMax);
		marines = new ArrayList<Marine>();
	}
	
	public void addAnimal(Marine marine) {
		this.marines.add(marine);
	}

	public void addAnimals(ArrayList<Marine> marines) {
		for (Marine marine : marines) {
			this.marines.add(marine);
		}
	}
	
}
