package metier.enclos;

import java.util.ArrayList;

import metier.animal.Aerial;

public class AriaryEnclosure extends Enclosure {
	
	private ArrayList<Aerial> aerials;

	public AriaryEnclosure() {
		super();
		aerials = new ArrayList<Aerial>();
	}

	public AriaryEnclosure(String name, float surface, int nbMax) {
		super(name, surface, nbMax);
		aerials = new ArrayList<Aerial>();
	}
	
	public void addAnimal(Aerial marine) {
		this.aerials.add(marine);
	}

	public void addAnimals(ArrayList<Aerial> aerials) {
		for (Aerial aerial : aerials) {
			this.aerials.add(aerial);
		}
	}
	
	public boolean removeAnimal(Aerial aerial) {
		return aerials.remove(aerial);
	}

}
