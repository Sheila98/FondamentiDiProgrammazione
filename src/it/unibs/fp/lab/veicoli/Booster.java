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

	public Booster(double cilindrata, Alimentazione alimentazione, int numeroRapporti, double litriCarburante, String targa) throws CilindrataNonValida, NumeroRuoteTroppoBasso, NumeroPasseggeriTroppoBasso, NumeroRuoteTroppoAlto, NumeroPasseggeriTroppoAlto 
	{
		super(cilindrata, alimentazione, NUMERO_PASSEGGERI, NUMERO_RUOTE, numeroRapporti,
				litriCarburante, targa);
		if(cilindrata>MASSIMA_CILINDRATA)
			throw new CilindrataNonValida(MASSIMA_CILINDRATA);
	}
	


}
