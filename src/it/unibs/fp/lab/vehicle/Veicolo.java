/**
 * 
 */
package it.unibs.fp.lab.vehicle;

/**
 * @author root
 *
 */
interface Veicolo {
	public int getNumeroRapporti();
	public String getTarga();
	public void setTarga(String parametroTarga);
	public int getNumeroRuote();
	public Alimentazione getAlimentazione();

}
