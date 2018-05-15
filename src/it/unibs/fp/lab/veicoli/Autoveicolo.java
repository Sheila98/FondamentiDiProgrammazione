/**
 * 
 */
package it.unibs.fp.lab.veicoli;

/**
 * @author root
 *
 */
abstract class Autoveicolo extends Veicolo {
	
	private final static int NUMERO_MINIMO_RUOTE = 4;

	public Autoveicolo(double cilindrata, double limiteCilindrata, Alimentazione alimentazione,
			int numeroMassimoPasseggeri, int numeroRuote, int numeroRapporti, double litriCarburante, String targa) throws NumeroDiRuoteNonValido {
		super(cilindrata, limiteCilindrata, alimentazione, numeroMassimoPasseggeri, numeroRuote, numeroRapporti,
				litriCarburante, targa);
		// TODO Auto-generated constructor stub
		
		if(numeroRuote < NUMERO_MINIMO_RUOTE)
			throw new NumeroDiRuoteNonValido();
		
			
	}



	
}
