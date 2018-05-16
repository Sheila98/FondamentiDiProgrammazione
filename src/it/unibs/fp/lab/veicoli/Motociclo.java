/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author root
 *
 */
class Motociclo extends Motoveicolo {

	private final static int NUMERO_RUOTE = 2;

	public Motociclo(double cilindrata, Alimentazione alimentazione, int numeroPasseggeri,
			int numeroRapporti, double litriCarburante, String targa) throws NumeroDiRuoteNonValido, NumeroPasseggeriNonValido {
		super(cilindrata, alimentazione, numeroPasseggeri, NUMERO_RUOTE, numeroRapporti, litriCarburante, targa);
	}
	
	
}
