/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author root
 *
 */
class Furgone extends Autoveicolo {
	
	private final static int NUMERO_RUOTE = 4;

	public Furgone(double cilindrata, Alimentazione alimentazione, int numeroPasseggeri,
			int numeroRapporti, double litriCarburante, String targa) throws NumeroDiRuoteNonValido {
		super(cilindrata, alimentazione, numeroPasseggeri, NUMERO_RUOTE, numeroRapporti, litriCarburante, targa);
		
	}
	
	
	
}
