/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author sheila
 *
 */
class CilindrataNonValida extends Exception {
	
	private final double cilindrataMassima;
	
	private final static String ERR = "La cilindrata non e' valida: \nMassimo: %2.2f";
	
	public CilindrataNonValida(double cilindrataMassima) {
		this.cilindrataMassima = cilindrataMassima;
	}
	
	public String toString() {
		return String.format(ERR, cilindrataMassima);
	}
	
}
