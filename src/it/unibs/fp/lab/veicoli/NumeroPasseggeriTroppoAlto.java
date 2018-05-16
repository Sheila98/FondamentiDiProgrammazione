/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author sheila
 *
 */
public class NumeroPasseggeriTroppoAlto extends Exception{
	private final int NUMERO_MASSIMO_PASSEGGERI;
	private final static String ERR = "Numero passeggeri non valido:\nMassimo: %d";
	public NumeroPasseggeriTroppoAlto(int numeroMassimoPasseggeri) {
		this.NUMERO_MASSIMO_PASSEGGERI = numeroMassimoPasseggeri;
	}
	public String toString() {
		return String.format(ERR, NUMERO_MASSIMO_PASSEGGERI);
	}
	
}
