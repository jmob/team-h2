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
public class FlugzeugkostenInfo {
	private pnlFlugzeugkosten pnlFlugzeugkosten;
	private int iID;
	private int iNummer;
	private int iFlugzeugtypID;
	private int iRentabilitaetStd;
	private String sBezeichnung;
	private double dFixkosten;
	private double dFixkostenStd;
	private double dStundensatz;
	
	private int iFlugzeugtypnummer;
	private String sFlugzeugtyp;

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

	public int getiFlugzeugtypID() {
		return iFlugzeugtypID;
	}

	public void setiFlugzeugtypID( int iFlugzeugtypID ) {
		this.iFlugzeugtypID = iFlugzeugtypID;
	}

	public int getiRentabilitaetStd() {
		return iRentabilitaetStd;
	}

	public void setiRentabilitaetStd( int iRentabilitaetStd ) {
		this.iRentabilitaetStd = iRentabilitaetStd;
	}

	public String getsBezeichnung() {
		return sBezeichnung;
	}

	public void setsBezeichnung( String sBezeichnung ) {
		this.sBezeichnung = sBezeichnung;
	}

	public double getdFixkosten() {
		return dFixkosten;
	}

	public void setdFixkosten( double dFixkosten ) {
		this.dFixkosten = dFixkosten;
	}

	public double getdFixkostenStd() {
		return dFixkostenStd;
	}

	public void setdFixkostenStd( double dFixkostenStd ) {
		this.dFixkostenStd = dFixkostenStd;
	}

	public double getdStundensatz() {
		return dStundensatz;
	}

	public void setdStundensatz( double dStundensatz ) {
		this.dStundensatz = dStundensatz;
	}

	public int getiFlugzeugtypnummer() {
		return iFlugzeugtypnummer;
	}

	public void setiFlugzeugtypnummer( int iFlugzeugtypnummer ) {
		this.iFlugzeugtypnummer = iFlugzeugtypnummer;
	}

	public String getsFlugzeugtyp() {
		return sFlugzeugtyp;
	}

	public void setsFlugzeugtyp( String sFlugzeugtyp ) {
		this.sFlugzeugtyp = sFlugzeugtyp;
	}
	
	public FlugzeugkostenInfo() {
		
	}
	
	public void show( JPanel pnlMain ) {
		pnlFlugzeugkosten = new pnlFlugzeugkosten();
		H2InternalFrame frmFlugzeugkosten = new H2InternalFrame( "Flugzeugkosten" );
		frmFlugzeugkosten.add( pnlFlugzeugkosten, BorderLayout.CENTER );
		frmFlugzeugkosten.setVisible( true );
		pnlMain.add( frmFlugzeugkosten );
		try {
			frmFlugzeugkosten.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}
	
	private void setzeAnzeige() {
		pnlFlugzeugkosten.setNummer( iNummer );
		pnlFlugzeugkosten.setBezeichnung( sBezeichnung );
		pnlFlugzeugkosten.setFixkosten( dFixkosten );
		pnlFlugzeugkosten.setRentabilitaetStd( iRentabilitaetStd );
		pnlFlugzeugkosten.setFixkostenStd( dFixkostenStd );
		pnlFlugzeugkosten.setStundensatz( dStundensatz );
		pnlFlugzeugkosten.setFlugzeugtypnummer( iFlugzeugtypnummer );
		pnlFlugzeugkosten.setFlugzeugtyp( sFlugzeugtyp );
	}
	
	private void leseausAnzeige() {
		iNummer = Util.statischStringNachInt( pnlFlugzeugkosten.getNummer() );
		sBezeichnung = pnlFlugzeugkosten.getBezeichnung();
		dFixkosten = Util.statischStringNachDouble( pnlFlugzeugkosten.getFixkosten(), 2 );
		iRentabilitaetStd = Util.statischStringNachInt( pnlFlugzeugkosten.getRentabilitaetStd() );
		dFixkostenStd = Util.statischStringNachDouble( pnlFlugzeugkosten.getFixkostenStd(), 2 );
		dStundensatz = Util.statischStringNachDouble( pnlFlugzeugkosten.getStundensatz(), 2 );
		iFlugzeugtypnummer = Util.statischStringNachInt( pnlFlugzeugkosten.getFlugzeugtypnummer() );
	}
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
		sBezeichnung = "";
		dFixkosten = 0.0;
		iRentabilitaetStd = 0;
		dFixkostenStd = 0.0;
		dStundensatz = 0.0;
		iFlugzeugtypnummer = 0;
		iFlugzeugtypID = 0;
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
