/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author root
 *
 */
abstract class Motoveicolo extends Veicolo{
	
	private final static int NUMERO_MINIMO_RUOTE = 2;


	public Motoveicolo(double cilindrata, Alimentazione alimentazione, int numeroPasseggeri, int numeroRuote,
			int numeroRapporti, double litriCarburante, String targa) throws NumeroDiRuoteNonValido {
		super(cilindrata, alimentazione, numeroPasseggeri, numeroRuote, numeroRapporti, litriCarburante, targa);
		if(numeroRuote<NUMERO_MINIMO_RUOTE)
			throw new NumeroDiRuoteNonValido();
	}

}
