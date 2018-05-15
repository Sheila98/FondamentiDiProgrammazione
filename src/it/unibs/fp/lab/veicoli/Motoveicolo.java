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

	public Motoveicolo(double cilindrata, double limiteCilindrata, Alimentazione alimentazione,
			int numeroMassimoPasseggeri, int numeroRuote, int numeroRapporti, double litriCarburante, String targa) throws NumeroDiRuoteNonValido {
		super(cilindrata, limiteCilindrata, alimentazione, numeroMassimoPasseggeri, numeroRuote, numeroRapporti,
				litriCarburante, targa);
		
		if(numeroRuote<NUMERO_MINIMO_RUOTE)
			throw new NumeroDiRuoteNonValido();
	}


}
