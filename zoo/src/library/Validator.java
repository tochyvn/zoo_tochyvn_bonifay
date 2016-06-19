package library;

import java.text.DecimalFormat;

public class Validator {
	
	/**
	 * Methode permettant d'afficher un double avec une précision de 2 chiffres après la virgule
	 * @param value represente la valeur double à convertir
	 * @return
	 */
	public static double converteDouble(double value) {
		
		String pattern = "##.##";
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		String output = myFormatter.format(value);
		output = output.replace(',', '.');
		
		double converted = Double.valueOf(output);
		
		return converted;
	}
	
	public static void main(String[] args) {
		converteDouble(31.91881417641375);
	}

}
