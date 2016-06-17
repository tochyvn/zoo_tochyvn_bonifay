package metier.enclos;

import java.util.ArrayList;

import metier.animal.Animal;
import metier.animal.Fish;
import metier.animal.Penguin;

public class StandardEnclosure extends Enclosure {

	public StandardEnclosure() {
		super();
	}

	public StandardEnclosure(String name, float surface, int nbMax) {
		super(name, surface, nbMax);
	}

	@Override
	public void addAnimal(Animal animal) {
		if (animal instanceof Fish) {
			animal = (Fish) animal;
		}else if (animal instanceof Penguin) {
			animal = (Penguin) animal;
		}
		
		this.animals.add(animal);
	}

	@Override
	public void addAnimals(ArrayList<Animal> animals) {
		// TODO Auto-generated method stub
	}
	
	
	
	
}
