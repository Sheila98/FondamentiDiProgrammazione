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


	public Scooter(double cilindrata, Alimentazione alimentazione, int numeroPasseggeri,/* int NUMERO_RUOTE,*/
			int numeroRapporti, double litriCarburante, String targa) throws CilindrataNonValida, NumeroPasseggeriNonValido {
		super(cilindrata, alimentazione, numeroPasseggeri, NUMERO_RUOTE, numeroRapporti, litriCarburante, targa);
		
	}
	


}
