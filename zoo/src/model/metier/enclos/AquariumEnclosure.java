package model.metier.enclos;


public class AquariumEnclosure extends Enclosure {
	
	private double depth;
	private double salinity;

	public AquariumEnclosure() {
		super();
	}

	public AquariumEnclosure(String name, float surface, int nbMax) {
		super(name, surface, nbMax);
		this.depth = 50;
		this.salinity = 0.5;
	}
		
	@Override
	public boolean maintain() {
		//Ici on ajoutera plustard la spécificité de maintenance
		setSalinity(0.5);
		
		return super.maintain();
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getSalinity() {
		return salinity;
	}

	public void setSalinity(double salinity) {
		this.salinity = salinity;
	}
	
}
