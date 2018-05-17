/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author root
 *
 */
class Camion extends Autoveicolo {

	private final static int NUMERO_RUOTE = 4;
	private final static int NUMERO_MASSIMO_PASSEGGERI = 9;
	
	public Camion(double cilindrata, Alimentazione alimentazione, int numeroPasseggeri,
			int numeroRapporti, double litriCarburante, String targa) throws NumeroPasseggeriTroppoAlto, NumeroRuoteTroppoBasso, NumeroPasseggeriTroppoBasso {
		super(cilindrata, alimentazione, numeroPasseggeri, NUMERO_RUOTE, numeroRapporti, litriCarburante, targa);
		if(numeroPasseggeri>NUMERO_MASSIMO_PASSEGGERI)
			throw new NumeroPasseggeriTroppoAlto(NUMERO_MASSIMO_PASSEGGERI);
	}
	



}
