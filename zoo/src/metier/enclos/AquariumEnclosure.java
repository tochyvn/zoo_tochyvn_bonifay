package metier.enclos;


public class AquariumEnclosure extends Enclosure {
	
	private double depth;
	private double salinity;

	public AquariumEnclosure() {
		super();
	}

	public AquariumEnclosure(String name, float surface, int nbMax, double depth, double salinity) {
		super(name, surface, nbMax);
		this.depth = depth;
		this.salinity = salinity;
	}
		
	@Override
	public void maintain() {
		super.maintain();
		//Ici on ajoutera plustard la spécificité de maintenance
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
