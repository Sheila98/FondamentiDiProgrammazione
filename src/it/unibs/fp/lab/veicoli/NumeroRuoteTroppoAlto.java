/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author sheila
 *
 */
public class NumeroRuoteTroppoAlto extends Exception{
	private final int NUMERO_MASSIMO_RUOTE;
	private final static String ERR = "Numero di ruote non valido:\nMassimo: %d";
	public NumeroRuoteTroppoAlto(int numeroMassimoRuote) {
		this.NUMERO_MASSIMO_RUOTE = numeroMassimoRuote;
	}
	public String toString() {
		return String.format(ERR, NUMERO_MASSIMO_RUOTE);
	}
}
