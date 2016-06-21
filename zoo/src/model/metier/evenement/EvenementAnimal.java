package model.metier.evenement;

import model.metier.animal.Animal;
import model.metier.employee.Employee;

public class EvenementAnimal extends Evenement {

	public EvenementAnimal(Transmitter transmitter, Employee employee) {
		super(transmitter, employee);
	}

	@Override
	public void setState() {
		Animal animal = ((Animal)this.transmitter);
		
		if(animal.isHunger()) {
			this.employee.giveFoodByAnimal(animal);
		}
	}
	
	

}
