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
	private final static int NUMERO_PASSEGGERI = 1;

	public Booster(double cilindrata, Alimentazione alimentazione,
			int numeroRuote, int numeroRapporti, double litriCarburante, String targa) throws CilindrataNonValida 
	{
		super(cilindrata, alimentazione, NUMERO_PASSEGGERI, numeroRuote, numeroRapporti,
				litriCarburante, targa);
		if(cilindrata>MASSIMA_CILINDRATA)
			throw new CilindrataNonValida(MASSIMA_CILINDRATA);
	}



}
