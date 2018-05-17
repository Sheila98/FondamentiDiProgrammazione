/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author root
 *
 */
class Motociclo extends Motoveicolo {

	private final static int NUMERO_RUOTE = 2;
	private final static int NUMERO_MASSIMO_PASSEGGERI = 2;

	public Motociclo(double cilindrata, Alimentazione alimentazione, int numeroPasseggeri,
			int numeroRapporti, double litriCarburante, String targa) throws NumeroPasseggeriTroppoAlto, NumeroRuoteTroppoBasso, NumeroPasseggeriTroppoBasso, NumeroRuoteTroppoAlto {
		super(cilindrata, alimentazione, numeroPasseggeri, NUMERO_RUOTE, numeroRapporti, litriCarburante, targa);
		if(numeroPasseggeri>NUMERO_MASSIMO_PASSEGGERI)
			throw new NumeroPasseggeriTroppoAlto(NUMERO_MASSIMO_PASSEGGERI);
	}
	
	
}
