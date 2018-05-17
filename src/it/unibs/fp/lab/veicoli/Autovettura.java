/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author root
 *
 */
class Autovettura extends Autoveicolo{
	
	private final static int NUMERO_RUOTE = 4;
	private final static int NUMERO_MASSIMO_PASSEGGERI = 9;

	public Autovettura(double cilindrata, Alimentazione alimentazione, int numeroPasseggeri,
			int numeroRapporti, double litriCarburante, String targa) throws NumeroRuoteTroppoBasso, NumeroPasseggeriTroppoBasso, NumeroPasseggeriTroppoAlto {
		super(cilindrata, alimentazione, numeroPasseggeri, NUMERO_RUOTE, numeroRapporti, litriCarburante, targa);
		if(numeroPasseggeri>NUMERO_MASSIMO_PASSEGGERI)
			throw new NumeroPasseggeriTroppoAlto(NUMERO_MASSIMO_PASSEGGERI);
	}
	
	
}
