package vue;

import controleur.Manager;

public class VueZoo {

	public VueZoo() {
		Manager.getInstance().setVue(this);
		Manager.getInstance().getVue().displayString(Manager.getInstance().getZooName());
		Manager.getInstance().launch();
		
	}

	public static void main(String[] args) {
		VueZoo vueZoo = new VueZoo();
	}

	/**
	 * Methode permettant d'afficher une chaîne dans la console
	 * @param string represente la chaine à ajouter
	 */
	public void displayString(Object string) {
		System.out.println(string);
	}


}
