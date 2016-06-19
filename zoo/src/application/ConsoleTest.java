package application;
import metier.employe.Employee;

public class ConsoleTest { 
  
	public ConsoleTest() {
		
	}


	public static void main(String[] args) {
	
		Zoo z=new Zoo("---------Parc National-------------");
		System.out.println(z.getNom());
		System.out.println("--------Responsable-------------");
		System.out.println("Nom : "+z.getEmploye().getNom());
		
		if(z.getEmploye().isSexe()==true){
		System.out.println("sexe: Homme");}
		else{System.out.println("sexe :Femme");}
		System.out.println("Age : "+z.getEmploye().getAge());

		
		for(int i=0 ;i<z.getEnclos().length;i++){
			System.out.println("--------Enclos "+ z.getEnclos()[i].getName()+"-------------");
			System.out.println("Surface :"+z.getEnclos()[i].getSurface());
			System.out.println("Nbre Max Animaux :"+z.getEnclos()[i].getNbMaxAnimaux());
		}
		
	}

}
