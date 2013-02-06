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
public class BenutzerInfo {
	private pnlBenutzer pnlBenutzer;
	private int iID;
	private int iNummer;
	private int iBenutzergruppeID;
	private int iBenutzergruppe;
	private String sVorname;
	private String sNachname;
	private String sInitialen;
	private String sLogin;
	private String sPasswort;
	private boolean bGesperrt;

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

	public int getiBenutzergruppeID() {
		return iBenutzergruppeID;
	}

	public void setiBenutzergruppeID( int iBenutzergruppeID ) {
		this.iBenutzergruppeID = iBenutzergruppeID;
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

	public String getsInitialen() {
		return sInitialen;
	}

	public void setsInitialen( String sInitialen ) {
		this.sInitialen = sInitialen;
	}

	public String getsLogin() {
		return sLogin;
	}

	public void setsLogin( String sLogin ) {
		this.sLogin = sLogin;
	}

	public String getsPasswort() {
		return sPasswort;
	}

	public void setsPasswort( String sPasswort ) {
		this.sPasswort = sPasswort;
	}

	public boolean isbGesperrt() {
		return bGesperrt;
	}

	public void setbGesperrt( boolean bGesperrt ) {
		this.bGesperrt = bGesperrt;
	}

	public int getiBenutzergruppe() {
		return iBenutzergruppe;
	}

	public void setiBenutzergruppe( int iBenutzergruppe ) {
		this.iBenutzergruppe = iBenutzergruppe;
	}
	
	public BenutzerInfo() {

	}
	
	public void show( JPanel pnlMain ) {
		pnlBenutzer = new pnlBenutzer();
		H2InternalFrame frmBenutzer = new H2InternalFrame( "Benutzer" );
		frmBenutzer.add( pnlBenutzer, BorderLayout.CENTER );
		frmBenutzer.setVisible( true );
		pnlMain.add( frmBenutzer );
		try {
			frmBenutzer.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	
	
	private void setzeAnzeige() {
		pnlBenutzer.setNummer( iNummer );
		pnlBenutzer.setVorname( sVorname );
		pnlBenutzer.setNachname( sNachname );
		pnlBenutzer.setInitialen( sInitialen );
		pnlBenutzer.setLogin( sLogin );
		pnlBenutzer.setPasswort( sPasswort );
		pnlBenutzer.setGesperrt( bGesperrt );
		pnlBenutzer.setBenutzergruppe( iBenutzergruppe );
	}
	
	private void leseausAnzeige() {
		iNummer = Util.statischStringNachInt( pnlBenutzer.getNummer() );
		sVorname = pnlBenutzer.getVorname();
		sNachname = pnlBenutzer.getNachname();
		sInitialen = pnlBenutzer.getInitialen();
		sLogin = pnlBenutzer.getLogin();
		sPasswort = pnlBenutzer.getPasswort();
		bGesperrt = pnlBenutzer.isGesperrt();
		iBenutzergruppe = Util.statischStringNachInt( pnlBenutzer.getBenutzergruppe() );
	}
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
		sVorname = "";
		sNachname = "";
		sInitialen = "";
		sLogin = "";
		sPasswort = "";
		bGesperrt = false;
		iBenutzergruppe = 0;
		iBenutzergruppeID = 0;
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
