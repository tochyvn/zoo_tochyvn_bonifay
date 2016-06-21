package model.metier.evenement;

import model.metier.employee.Employee;

public abstract class Evenement {
	
	protected Transmitter transmitter;
	protected Employee employee;

	public Evenement(Transmitter transmitter, Employee employee) {
		this.transmitter = transmitter;
		this.employee = employee;
	}
	
	public abstract void setState();

}
