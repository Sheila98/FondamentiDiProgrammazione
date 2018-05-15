/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author root
 *
 */
class NumeroDiRuoteNonValido extends Exception {

	private final static String ERR = "Il numero di ruote non e' valido";
	
	public String toString() {
		return ERR;
	}
	
}
