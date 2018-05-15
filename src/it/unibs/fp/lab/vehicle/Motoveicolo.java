/**
 * 
 */
package it.unibs.fp.lab.vehicle;

/**
 * @author root
 *
 */
abstract class Motoveicolo implements Veicolo {

	private static final int NUMERO_RUOTE_MOTO = 2;

	/**
	 * 
	 */
	public Motoveicolo() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see it.unibs.fp.lab.vehicle.Veicolo#getNumeroRapporti()
	 */
	@Override
	public int getNumeroRapporti() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see it.unibs.fp.lab.vehicle.Veicolo#getTarga()
	 */
	@Override
	public String getTarga() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see it.unibs.fp.lab.vehicle.Veicolo#setTarga(java.lang.String)
	 */
	@Override
	public void setTarga(String parametroTarga) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see it.unibs.fp.lab.vehicle.Veicolo#getNumeroRuote()
	 */
	@Override
	public int getNumeroRuote() {
		// TODO Auto-generated method stub
		return NUMERO_RUOTE_MOTO;
	}

	/* (non-Javadoc)
	 * @see it.unibs.fp.lab.vehicle.Veicolo#getAlimentazione()
	 */
	@Override
	public Alimentazione getAlimentazione() {
		// TODO Auto-generated method stub
		return null;
	}

}
