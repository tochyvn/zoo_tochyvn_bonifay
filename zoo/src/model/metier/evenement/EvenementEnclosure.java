package model.metier.evenement;

import model.metier.employee.Employee;
import model.metier.enclos.Enclosure;

public class EvenementEnclosure extends Evenement {

	public EvenementEnclosure(Transmitter transmitter, Employee employee) {
		super(transmitter, employee);
	}

	@Override
	public void setState() {
		Enclosure enclosure = ((Enclosure)this.transmitter);
		this.employee.cleanEnclosure(enclosure);
	}

}
