/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.frames;

import de.rentajet.base.H2InternalFrame;
import de.rentajet.uti.Util;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Petersen
 */
public class ZahlungsbedingungInfo {
	private pnlZahlungsbedingung pnlZahlungsbedingung;
	private int iID;
	private int iNummer;
	private int iValuta;
	private int iSkontoValuta;
	private double dSkontosatz;
	private String sBezeichnung;
	private String sBelegtext;

	public int getiID() {
		return iID;
	}

	public void setiID( int iID ) {
		this.iID = iID;
	}

	public int getiNummer() {
		return iNummer;
	}

	public void setiNummer( int iNummer ) {
		this.iNummer = iNummer;
	}

	public int getiValuta() {
		return iValuta;
	}

	public void setiValuta( int iValuta ) {
		this.iValuta = iValuta;
	}

	public int getiSkontoValuta() {
		return iSkontoValuta;
	}

	public void setiSkontoValuta( int iSkontoValuta ) {
		this.iSkontoValuta = iSkontoValuta;
	}

	public double getdSkontosatz() {
		return dSkontosatz;
	}

	public void setdSkontosatz( double dSkontosatz ) {
		this.dSkontosatz = dSkontosatz;
	}

	public String getsBezeichnung() {
		return sBezeichnung;
	}

	public void setsBezeichnung( String sBezeichnung ) {
		this.sBezeichnung = sBezeichnung;
	}

	public String getsBelegtext() {
		return sBelegtext;
	}

	public void setsBelegtext( String sBelegtext ) {
		this.sBelegtext = sBelegtext;
	}

	public ZahlungsbedingungInfo() {
		
	}
	
	public void show( JPanel pnlMain ) {
		pnlZahlungsbedingung = new pnlZahlungsbedingung();
		H2InternalFrame frmZahlungsbedingung = new H2InternalFrame( "Zahlungsbedingung" );
		frmZahlungsbedingung.add( pnlZahlungsbedingung, BorderLayout.CENTER );
		frmZahlungsbedingung.setVisible( true );
		pnlMain.add( frmZahlungsbedingung );
		try {
			frmZahlungsbedingung.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	
	
	private void setzeAnzeige() {
		pnlZahlungsbedingung.setNummer( iNummer );
		pnlZahlungsbedingung.setBezeichnung( sBezeichnung );
		pnlZahlungsbedingung.setBelegtext( sBelegtext );
		pnlZahlungsbedingung.setValuta( iValuta );
		pnlZahlungsbedingung.setSkontoValuta( iSkontoValuta );
		pnlZahlungsbedingung.setSkontosatz( dSkontosatz );
		
	}
	
	private void leseausAnzeige() {
		iNummer = Util.statischStringNachInt( pnlZahlungsbedingung.getNummer() );
		sBezeichnung = pnlZahlungsbedingung.getBezeichnung();
		sBelegtext = pnlZahlungsbedingung.getBelegtext();
		iValuta = Util.statischStringNachInt( pnlZahlungsbedingung.getValuta() );
		iSkontoValuta = Util.statischStringNachInt( pnlZahlungsbedingung.getSkontoValuta() );
		dSkontosatz = Util.statischStringNachDouble( pnlZahlungsbedingung.getSkontosatz(), 1);
	}
	
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
		sBezeichnung = "";
		sBelegtext = "";
		iValuta = 0;
		iSkontoValuta = 0;
		dSkontosatz = 0.0;
		setzeAnzeige();
	}
	
	public void ersterDatensatz() {
		ersterDatensatzDB();
		setzeAnzeige();
	}
	
	public void vorherigerdatensatz() {
		vorherigerdatensatzDB();
		setzeAnzeige();
	}
	
	public void naechsterDatensatz() {
		naechsterDatensatzDB();
		setzeAnzeige();
	}
	
	public void letzterDatensatz() {
		letzterDatensatzDB();
		setzeAnzeige();
	}
	
	public void sucheDatensatz() {
		// ToDo: Erstellung eines Suchfensters
	}
	
	public void speichern() {
		speichereDB();
		aktualisiereAnzeige();
	}
	
	public void abbrechen() {
		aktualisiereAnzeige();
	}
	
	public void loeschen() {
		loescheDB();
		aktualisiereAnzeige();
	}
	
	public void aktualisieren() {
		setzeAnzeige();
	}
	
	public void drucken() {
		JOptionPane.showMessageDialog(
			null, "Es stehen keine Druckdaten zur Verfügung", "Drucken", 
			JOptionPane.OK_OPTION
		);	
	}
		
	public void zeigeArchiv() {
		JOptionPane.showMessageDialog(
			null, "Es stehen keine Archivdaten zur Verfügung", "Archiv", 
			JOptionPane.OK_OPTION
		);	
	}

	public void speichereDB() {
		
	}
	
	public void ladeDB(){
		
	}
	
	public void loescheDB(){
		
	}
	
	
	public void ersterDatensatzDB() {
		
	}
	
	public void vorherigerdatensatzDB() {
		
	}
	
	public void naechsterDatensatzDB() {
		
	}
	
	public void letzterDatensatzDB() {
		
	}
	
	public boolean istDatensatzVorhanden( int iNummer ) {
		//ToDo Abfrage in DB ob Datensatz mit übergebener Nummer vorhanden ist und ggf. Variablen füllen
		if( iNummer == 10 )
			return true;
		else
			return false;
	}
}
