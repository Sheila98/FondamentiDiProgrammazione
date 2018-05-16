/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author sheila
 *
 */
class NumeroRuoteTroppoBasso extends Exception {
	private final int NUMERO_MINIMO_RUOTE;
	private final static String ERR = "Numero di ruote non valido:\nMinimo: %d";
	
	public NumeroRuoteTroppoBasso(int numeroMinimoRuote) {
		this.NUMERO_MINIMO_RUOTE = numeroMinimoRuote;
	}
	public String toString() {
		return String.format(ERR, NUMERO_MINIMO_RUOTE);
	}
}
