/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author root
 *
 */
final class Camper extends Autoveicolo {

	private final static int NUMERO_RUOTE = 4;
	private final static int NUMERO_MASSIMO_PASSEGGERI = 9;
	
	public Camper(double cilindrata, Alimentazione alimentazione, int numeroPasseggeri, int numeroRuote,
			int numeroRapporti, double litriCarburante, String targa)
			throws NumeroRuoteTroppoBasso, NumeroPasseggeriTroppoBasso, NumeroPasseggeriTroppoAlto {
		super(cilindrata, alimentazione, numeroPasseggeri, NUMERO_RUOTE, numeroRapporti, litriCarburante, targa);
		if(numeroPasseggeri>NUMERO_MASSIMO_PASSEGGERI)
			throw new NumeroPasseggeriTroppoAlto(NUMERO_MASSIMO_PASSEGGERI);
	}



}
