/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.  XXXX
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
public class CateringInfo {
	private pnlCatering pnlCatering;
	private int iID;
	private int iNummer;
	private String sBezeichnung;
	private double dPreis;
	private String sBeschreibung;

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

	public String getsBezeichnung() {
		return sBezeichnung;
	}

	public void setsBezeichnung( String sBezeichnung ) {
		this.sBezeichnung = sBezeichnung;
	}

	public double getdPreis() {
		return dPreis;
	}

	public void setdPreis( double dPreis ) {
		this.dPreis = dPreis;
	}

	public String getsBeschreibung() {
		return sBeschreibung;
	}

	public void setsBeschreibung( String sBeschreibung ) {
		this.sBeschreibung = sBeschreibung;
	}
	
	public CateringInfo() {
		
	}
	
	public void show( JPanel pnlMain ) {
		pnlCatering = new pnlCatering();
		H2InternalFrame frmCatering = new H2InternalFrame( "Catering" );
		frmCatering.add( pnlCatering, BorderLayout.CENTER );
		frmCatering.setVisible( true );
		pnlMain.add( frmCatering );
		try {
			frmCatering.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	
	
	private void setzeAnzeige() {
		pnlCatering.setNummer( iNummer );
		pnlCatering.setBezeichnung( sBezeichnung );
		pnlCatering.setPreis( dPreis );
		pnlCatering.setBeschreibung( sBeschreibung );
	}
	
	private void leseausAnzeige() {
		iNummer = Util.statischStringNachInt( pnlCatering.getNummer() );
		sBezeichnung = pnlCatering.getBezeichnung();
		dPreis = Util.statischStringNachDouble( pnlCatering.getPreis(), 2);
		sBeschreibung = pnlCatering.getBeschreibung();
	}
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
		sBezeichnung = "";
		dPreis = 0.0;
		sBeschreibung = "";
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
