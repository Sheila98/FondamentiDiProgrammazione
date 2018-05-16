/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author root
 *
 */
abstract class Veicolo {
	
	private double cilindrata;
	private double limiteCilindrata;
	private Alimentazione alimentazione;
	private int numeroMassimoPasseggeri;
	private int numeroRuote;
	private int numeroRapporti;
	private double litrtiCarburante;
	private String targa;
	
	public Veicolo(double cilindrata, double limiteCilindrata, Alimentazione alimentazione,int numeroMassimoPasseggeri, int numeroRuote, int numeroRapporti, double litriCarburante, String targa) {
		this.cilindrata = cilindrata;
		this.limiteCilindrata = limiteCilindrata;
		this.alimentazione = alimentazione;
		this.numeroMassimoPasseggeri = numeroMassimoPasseggeri;
		this.numeroRuote = numeroRuote;
		this.litrtiCarburante = litriCarburante;
		this.targa = targa;
	}
	

	/**
	 * @return the cilindrata
	 */
	public final double getCilindrata() {
		return cilindrata;
	}



	/**
	 * @return the limiteCilindrata
	 */
	public final double getLimiteCilindrata() {
		return limiteCilindrata;
	}

	
	public final Alimentazione getAlimentazione() {
		return alimentazione;
	}
	

	/**
	 * @return the numeroMassimoPasseggeri
	 */
	public final int getNumeroMassimoPasseggeri() {
		return numeroMassimoPasseggeri;
	}





	/**
	 * @return the numeroRuote
	 */
	public final int getNumeroRuote() {
		return numeroRuote;
	}




	/**
	 * @return the numeroRapporti
	 */
	public final int getNumeroRapporti() {
		return numeroRapporti;
	}



	/**
	 * @return the litrtiCarburante
	 */
	public final double getLitrtiCarburante() {
		return litrtiCarburante;
	}



	/**
	 * @return the targa
	 */
	public final String getTarga() {
		return targa;
	}


	/**
	 * @param targa the targa to set
	 */
	protected final void setTarga(String targa) {
		this.targa = targa;
	}

	
	public 

	
	
}
