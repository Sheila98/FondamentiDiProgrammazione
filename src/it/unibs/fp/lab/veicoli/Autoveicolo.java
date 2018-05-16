/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author root
 *
 */
abstract class Autoveicolo extends Veicolo {
	
	private final static int NUMERO_MINIMO_RUOTE = 4;
	
	
	
	public Autoveicolo(double cilindrata, Alimentazione alimentazione, int numeroPasseggeri,
			int numeroRuote, int numeroRapporti, double litriCarburante, String targa) throws NumeroDiRuoteNonValido {
		super(cilindrata, alimentazione, numeroPasseggeri, numeroRuote, numeroRapporti, litriCarburante,
				targa);
		if(numeroRuote < NUMERO_MINIMO_RUOTE)
			throw new NumeroDiRuoteNonValido();
	}
	protected int getNUMERO_MINIMO_RUOTE() {
		return NUMERO_MINIMO_RUOTE;
	}
	protected int getNUMERO_MASSIMO_PASSEGGERI() {
		return NUMERO_MASSIMO_PASSEGGERI;
	}
	
}
