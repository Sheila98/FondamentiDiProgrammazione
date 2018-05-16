/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author root
 *
 */
class Scooter extends Motoveicolo {
	
	private final static int NUMERO_RUOTE = 2;

	public Scooter(double cilindrata, double limiteCilindrata, Alimentazione alimentazione, int numeroMassimoPasseggeri,
			int numeroRuote, int numeroRapporti, double litriCarburante, String targa) throws NumeroDiRuoteNonValido 
	{
		super(cilindrata, limiteCilindrata, alimentazione, numeroMassimoPasseggeri, numeroRuote, numeroRapporti,
				litriCarburante, targa);
		if(numeroRuote!=NUMERO_RUOTE)
			throw new NumeroDiRuoteNonValido();
	}



}
