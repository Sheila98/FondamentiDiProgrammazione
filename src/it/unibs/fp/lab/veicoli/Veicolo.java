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
	private final int NUMERO_MASSIMO_PASSEGGERI;
	private final int NUMERO_RUOTE;
	private final int NUMERO_RAPPORTI;
	private final double LITRI_CARBURANTE;
	private final String TARGA;
	
	public Veicolo(double cilindrata, Alimentazione alimentazione,int numeroPasseggeri, int numeroRuote, int numeroRapporti, double litriCarburante, String targa) {
		this.CILINDRATA = cilindrata;
		this.ALIMENTAZIONE = alimentazione;
		this.NUMERO_MASSIMO_PASSEGGERI = numeroPasseggeri;
		this.NUMERO_RUOTE = numeroRuote;
		this.NUMERO_RAPPORTI = numeroRapporti;
		this.LITRI_CARBURANTE = litriCarburante;
		this.TARGA = targa;
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
<<<<<<< HEAD


	/**
	 * @param targa the targa to set
	 */
	protected final void setTarga(String targa) {
		this.targa = targa;
	}


	
=======
>>>>>>> e773c6abecac3abcd2b5d63b61f587008f0d0f54
	
}
