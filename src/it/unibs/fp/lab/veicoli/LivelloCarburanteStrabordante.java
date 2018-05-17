/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author sheila
 *
 */
class LivelloCarburanteStrabordante extends Exception {
	private static final String ERR = "Il livello del carburante e' troppo alto:\nMassimo: %2.2f.";
	private double massimoCarburante;
	
	public LivelloCarburanteStrabordante(double massimoCarburante) {
		this.massimoCarburante = massimoCarburante;
	}
	
	public String toString() {
		return String.format(ERR, massimoCarburante);
	}
}
