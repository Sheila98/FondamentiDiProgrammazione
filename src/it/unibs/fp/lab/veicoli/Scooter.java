/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author sheila
 *
 */
class Scooter extends Motoveicolo {
	
	private final static int NUMERO_RUOTE = 2;

	public Scooter(double cilindrata, Alimentazione alimentazione, int numeroPasseggeri,
			int numeroRapporti, double litriCarburante, String targa) throws NumeroDiRuoteNonValido {
		super(cilindrata, alimentazione, numeroPasseggeri, NUMERO_RUOTE, numeroRapporti, litriCarburante, targa);
	}
	


}
