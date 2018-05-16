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
	private final static int NUMERO_MASSIMO_RUOTE = 4;
	private final static int NUMERO_MASSIMO_PASSEGGERI = 2;
	
	public Motoveicolo(double cilindrata, Alimentazione alimentazione, int numeroPasseggeri,
			int numeroRuote, int numeroRapporti, double litriCarburante, String targa) throws NumeroRuoteTroppoBasso, NumeroPasseggeriTroppoBasso, NumeroRuoteTroppoAlto, NumeroPasseggeriTroppoAlto{
		super(cilindrata, alimentazione, numeroPasseggeri, numeroRuote, numeroRapporti, litriCarburante,
				targa);
		if(numeroRuote<NUMERO_MINIMO_RUOTE)
			throw new NumeroRuoteTroppoBasso(NUMERO_MINIMO_RUOTE);
		if(numeroRuote>NUMERO_MASSIMO_RUOTE)
			throw new NumeroRuoteTroppoAlto(NUMERO_MASSIMO_RUOTE);
		if(numeroPasseggeri<getNUMERO_MINIMO_PASSEGGERI())
			throw new NumeroPasseggeriTroppoBasso(getNUMERO_MINIMO_PASSEGGERI());
		if(numeroPasseggeri>NUMERO_MASSIMO_PASSEGGERI)
			throw new NumeroPasseggeriTroppoAlto(NUMERO_MASSIMO_PASSEGGERI);
			
	}

	

}
