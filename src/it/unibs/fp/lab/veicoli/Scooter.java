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
	
	
	/**
	 * @param cilindrata
	 * @param limiteCilindrata
	 * @param alimentazione
	 * @param numeroMassimoPasseggeri
	 * @param numeroRuote
	 * @param numeroRapporti
	 * @param litriCarburante
	 * @param targa
	 * @throws NumeroDiRuoteNonValido
	 */
	public Scooter(double cilindrata, double limiteCilindrata, Alimentazione alimentazione, int numeroMassimoPasseggeri,
			int numeroRuote, int numeroRapporti, double litriCarburante, String targa) throws NumeroDiRuoteNonValido, CilindrataNonValida 
	{
		super(cilindrata, limiteCilindrata, alimentazione, numeroMassimoPasseggeri, numeroRuote, numeroRapporti,
				litriCarburante, targa);
		if(numeroRuote!=NUMERO_RUOTE)
			throw new NumeroDiRuoteNonValido();
	}

}
