package metier.enclos;


public class AriaryEnclosure extends Enclosure {
	
	private double height;

	public AriaryEnclosure() {
		super();
	}

	public AriaryEnclosure(String name, float surface, int nbMax, double height) {
		super(name, surface, nbMax);
		this.setHeight(height);
	}
	
	@Override
	public void maintain() {
		super.maintain();
		//Ici on ajoutera plustard la spécificité de maintenance
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}


}
