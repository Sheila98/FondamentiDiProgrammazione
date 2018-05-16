/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author root
 *
 */
class Booster extends Motoveicolo {
	
	private final static int NUMERO_RUOTE = 2;
	private final static double MASSIMA_CILINDRATA = 50;

	public Booster(double cilindrata, double limiteCilindrata, Alimentazione alimentazione, int numeroMassimoPasseggeri,
			int numeroRuote, int numeroRapporti, double litriCarburante, String targa) throws NumeroDiRuoteNonValido, CilindrataNonValida 
	{
		super(cilindrata, limiteCilindrata, alimentazione, numeroMassimoPasseggeri, numeroRuote, numeroRapporti,
				litriCarburante, targa);
		if(numeroRuote!=NUMERO_RUOTE)
			throw new NumeroDiRuoteNonValido();
		if(cilindrata>MASSIMA_CILINDRATA)
			throw new CilindrataNonValida(MASSIMA_CILINDRATA);
	}



}
