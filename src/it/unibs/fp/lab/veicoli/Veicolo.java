/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author root
 *
 */
abstract class Veicolo {
	
	private final double CILINDRATA;
	private final Alimentazione ALIMENTAZIONE;
	private final int NUMERO_PASSEGGERI;
	private final int NUMERO_RUOTE;
	private final int NUMERO_RAPPORTI;
	private final double LITRI_CARBURANTE;
	private final String TARGA;
	
	private final static int NUMERO_MINIMO_PASSEGGERI = 1;
	
	public Veicolo(double cilindrata,  Alimentazione alimentazione,int numeroPasseggeri, int numeroRuote, int numeroRapporti, double litriCarburante, String targa) throws NumeroPasseggeriTroppoBasso {
		this.CILINDRATA = cilindrata;
		this.ALIMENTAZIONE = alimentazione;
		this.NUMERO_PASSEGGERI = numeroPasseggeri;
		this.NUMERO_RUOTE = numeroRuote;
		this.NUMERO_RAPPORTI = numeroRapporti;
		this.LITRI_CARBURANTE = litriCarburante;
		this.TARGA = targa;
		if(numeroPasseggeri<NUMERO_MINIMO_PASSEGGERI)
			throw new NumeroPasseggeriTroppoBasso(NUMERO_MINIMO_PASSEGGERI);
	}
	

	/**
	 * @return the cilindrata
	 */
	public final double getCILINDRATA() {
		return CILINDRATA;
	}

	
	public final Alimentazione getALIMENTAZIONE() {
		return ALIMENTAZIONE;
	}
	
	public final int getNUMERO_PASSEGGERI() {
		return NUMERO_PASSEGGERI;
	}
	
	/**
	 * @return the numeroRuote
	 */
	public final int getNUMERO_RUOTE() {
		return NUMERO_RUOTE;
	}

	


	/**
	 * @return the numeroRapporti
	 */
	public final int getNUMERO_RAPPORTI() {
		return NUMERO_RAPPORTI;
	}



	/**
	 * @return the litrtiCarburante
	 */
	public final double getLITRI_CARBURANTE() {
		return LITRI_CARBURANTE;
	}



	/**
	 * @return the targa
	 */
	public final String getTARGA() {
		return TARGA;
	}

	
	public int getNUMERO_MINIMO_PASSEGGERI() {
		return NUMERO_MINIMO_PASSEGGERI;
	}

}
