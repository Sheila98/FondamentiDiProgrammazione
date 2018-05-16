/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author sheila
 *
 */
public class NumeroPasseggeriTroppoBasso extends Exception{
	public final int NUMERO_MINIMO_PASSEGGERI;
	public final static String ERR = "Numero passeggeri non valido:\nMinimo: %d.";
	
	public NumeroPasseggeriTroppoBasso(int numeroMinimoPasseggeri) {
		this.NUMERO_MINIMO_PASSEGGERI = numeroMinimoPasseggeri;
	}
	
	public String toString() {
		return String.format(ERR, NUMERO_MINIMO_PASSEGGERI);
	}
	
}
