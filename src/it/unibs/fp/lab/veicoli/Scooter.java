/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author sheila
 *
 */
class Scooter extends Motoveicolo {
	
	private final static int NUMERO_RUOTE = 2;
	private final static int NUMERO_MASSIMO_PASSEGGERI = 2;


	public Scooter(double cilindrata, Alimentazione alimentazione, int numeroPasseggeri,/* int NUMERO_RUOTE,*/
			int numeroRapporti, double litriCarburante, String targa) throws CilindrataNonValida, NumeroPasseggeriTroppoAlto, NumeroRuoteTroppoBasso, NumeroPasseggeriTroppoBasso, NumeroRuoteTroppoAlto {
		super(cilindrata, alimentazione, numeroPasseggeri, NUMERO_RUOTE, numeroRapporti, litriCarburante, targa);
		if(numeroPasseggeri>NUMERO_MASSIMO_PASSEGGERI)
			throw new NumeroPasseggeriTroppoAlto(NUMERO_MASSIMO_PASSEGGERI);
	}
	


}
