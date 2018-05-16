/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author root
 *
 */
class Camion extends Autoveicolo {

	private final static int NUMERO_MASSIMO_RUOTE;
	
	public Camion(double cilindrata, Alimentazione alimentazione, int numeroPasseggeri, int numeroRuote,
			int numeroRapporti, double litriCarburante, String targa) throws NumeroDiRuoteNonValido {
		super(cilindrata, alimentazione, numeroPasseggeri, numeroRuote, numeroRapporti, litriCarburante, targa);
		
	}
	



}
