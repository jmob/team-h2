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
public class PersonalkostenInfo {
	private pnlPersonalkosten pnlPersonalkosten;
	private int iPersonaltypID;
	private int iID;
	private int iNummer;
	private String sBezeichnung;
	private int iArbeitsstunden;
	private double dJahresgehalt;
	private double dStundenlohn;
	private double dStundensatz;
	
	private int iPersonaltypnummer;
	private String sPersonaltyp;

	public String getsPersonaltyp() {
		return sPersonaltyp;
	}

	public void setsPersonaltyp( String sPersonaltyp ) {
		this.sPersonaltyp = sPersonaltyp;
	}

	public int getiPersonaltypnummer() {
		return iPersonaltypnummer;
	}

	public void setiPersonaltypnummer( int iPersonaltypnummer ) {
		this.iPersonaltypnummer = iPersonaltypnummer;
	}

	public int getiArbeitsstunden() {
		return iArbeitsstunden;
	}

	public void setiArbeitsstunden( int iArbeitsstunden ) {
		this.iArbeitsstunden = iArbeitsstunden;
	}

	public double getdJahresgehalt() {
		return dJahresgehalt;
	}

	public void setdJahresgehalt( double dJahresgehalt ) {
		this.dJahresgehalt = dJahresgehalt;
	}

	public double getdStundenlohn() {
		return dStundenlohn;
	}

	public void setdStundenlohn( double dStundenlohn ) {
		this.dStundenlohn = dStundenlohn;
	}

	public double getdStundensatz() {
		return dStundensatz;
	}

	public void setdStundensatz( double dStundensatz ) {
		this.dStundensatz = dStundensatz;
	}
	
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
	
	public PersonalkostenInfo() {
		
	}
	
	public void show( JPanel pnlMain ) {
		pnlPersonalkosten = new pnlPersonalkosten();
		H2InternalFrame frmPersonalkosten = new H2InternalFrame( "Personalkosten" );
		frmPersonalkosten.add( pnlPersonalkosten, BorderLayout.CENTER );
		frmPersonalkosten.setVisible( true );
		pnlMain.add( frmPersonalkosten );
		try {
			frmPersonalkosten.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	

	private void leseausAnzeige() {
		iNummer = Util.statischStringNachInt( pnlPersonalkosten.getNummer() );
		sBezeichnung = pnlPersonalkosten.getBezeichnung();
		dJahresgehalt = Util.statischStringNachDouble( pnlPersonalkosten.getJahresgehalt(), 2 );
		iArbeitsstunden = Util.statischStringNachInt( pnlPersonalkosten.getArbeitsstunden() );
		dStundenlohn = Util.statischStringNachDouble( pnlPersonalkosten.getStundenlohn(), 2 );
		dStundensatz = Util.statischStringNachDouble( pnlPersonalkosten.getStundensatz(), 2 );
		iPersonaltypnummer = Util.statischStringNachInt( pnlPersonalkosten.getPersonaltypnummer() );
	}
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
		sBezeichnung = "";
		dJahresgehalt = 0;
		iArbeitsstunden = 0;
		dStundenlohn = 0;
		dStundensatz = 0;
		iPersonaltypnummer = 0;
	}
	
	public void ersterDatensatz() {
		ersterDatensatzDB();
	}
	
	public void vorherigerdatensatz() {
		vorherigerdatensatzDB();
	}
	
	public void naechsterDatensatz() {
		naechsterDatensatzDB();
	}
	
	public void letzterDatensatz() {
		letzterDatensatzDB();
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
	
	public void sucheUeberPersonaltyp( int iPersonaltyp ) {
		
	}
}
