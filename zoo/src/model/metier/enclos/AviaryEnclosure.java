package model.metier.enclos;


public class AviaryEnclosure extends Enclosure {
	
	private double height;

	public AviaryEnclosure() {
		super();
	}

	public AviaryEnclosure(String name, float surface, int nbMax) {
		super(name, surface, nbMax);
		this.setHeight(50);
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
