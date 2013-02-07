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
public class KundenberaterInfo {
	private pnlKundenberater pnlKundenberater;
	private int iID;
	private int iNummer;
	private int iAnredeID;
	private int iOrtID;
	private String sVorname;
	private String sNachname;
	private String sStrasse;
	private String sTelefon;
	private String sTelefax;
	private String sMobil;
	
	private String sAnrede;
	private String sOrt;
	private String sPLZ;

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

	public int getiAnredeID() {
		return iAnredeID;
	}

	public void setiAnredeID( int iAnredeID ) {
		this.iAnredeID = iAnredeID;
	}

	public int getiOrtID() {
		return iOrtID;
	}

	public void setiOrtID( int iOrtID ) {
		this.iOrtID = iOrtID;
	}

	public String getsVorname() {
		return sVorname;
	}

	public void setsVorname( String sVorname ) {
		this.sVorname = sVorname;
	}

	public String getsNachname() {
		return sNachname;
	}

	public void setsNachname( String sNachname ) {
		this.sNachname = sNachname;
	}

	public String getsStrasse() {
		return sStrasse;
	}

	public void setsStrasse( String sStrasse ) {
		this.sStrasse = sStrasse;
	}

	public String getsTelefon() {
		return sTelefon;
	}

	public void setsTelefon( String sTelefon ) {
		this.sTelefon = sTelefon;
	}

	public String getsTelefax() {
		return sTelefax;
	}

	public void setsTelefax( String sTelefax ) {
		this.sTelefax = sTelefax;
	}

	public String getsMobil() {
		return sMobil;
	}

	public void setsMobil( String sMobil ) {
		this.sMobil = sMobil;
	}

	public String getsAnrede() {
		return sAnrede;
	}

	public void setsAnrede( String sAnrede ) {
		this.sAnrede = sAnrede;
	}

	public String getsOrt() {
		return sOrt;
	}

	public void setsOrt( String sOrt ) {
		this.sOrt = sOrt;
	}

	public String getsPLZ() {
		return sPLZ;
	}

	public void setsPLZ( String sPLZ ) {
		this.sPLZ = sPLZ;
	}
	
	public KundenberaterInfo() {
		
	}
	
	public void show( JPanel pnlMain ) {
		pnlKundenberater = new pnlKundenberater();
		H2InternalFrame frmKundenberater = new H2InternalFrame( "Kundenberater" );
		frmKundenberater.add( pnlKundenberater, BorderLayout.CENTER );
		frmKundenberater.setVisible( true );
		pnlMain.add( frmKundenberater );
		try {
			frmKundenberater.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	

	private void leseausAnzeige() {
		iNummer = Util.statischStringNachInt( pnlKundenberater.getNummer() );
		sAnrede = pnlKundenberater.getAnrede();
		sVorname = pnlKundenberater.getVorname();
		sNachname = pnlKundenberater.getNachname();
		sStrasse = pnlKundenberater.getStrasse();
		sPLZ = pnlKundenberater.getPLZ();
		sOrt = pnlKundenberater.getOrt();
		sTelefax = pnlKundenberater.getTelefax();
		sTelefon = pnlKundenberater.getTelefon();
		sMobil = pnlKundenberater.getMobil();
	}
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
		sAnrede = "";
		sVorname = "";
		sNachname = "";
		sStrasse = "";
		sPLZ = "";
		sOrt = "";
		sTelefax = "";
		sTelefon = "";
		sMobil = "";
		iAnredeID = 0;
		iOrtID = 0;
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
}
