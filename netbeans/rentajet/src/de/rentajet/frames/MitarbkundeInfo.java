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
public class MitarbkundeInfo {
	private pnlMitarbkunde pnlMitarbkunde;
	private int iID;
	private int iNummer;
	private int iAnredeID;
	private int iKundeID;
	private String sVorname;
	private String sNachname;
	private String sTelefon;
	private String sTelefax;
	private String sMobil;
	private String sInfo;
	
	private String sAnrede;
	private int iKundenummer;
	private String sKunde;

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

	public int getiKundeID() {
		return iKundeID;
	}

	public void setiKundeID( int iKundeID ) {
		this.iKundeID = iKundeID;
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

	public String getsInfo() {
		return sInfo;
	}

	public void setsInfo( String sInfo ) {
		this.sInfo = sInfo;
	}

	public String getsAnrede() {
		return sAnrede;
	}

	public void setsAnrede( String sAnrede ) {
		this.sAnrede = sAnrede;
	}

	public int getiKundenummer() {
		return iKundenummer;
	}

	public void setiKundenummer( int iKundenummer ) {
		this.iKundenummer = iKundenummer;
	}

	public String getsKunde() {
		return sKunde;
	}

	public void setsKunde( String sKunde ) {
		this.sKunde = sKunde;
	}
	
	public MitarbkundeInfo() {
		
	}
	
	public void show( JPanel pnlMain ) {
		pnlMitarbkunde = new pnlMitarbkunde();
		H2InternalFrame frmMitarbkunde = new H2InternalFrame( "Mitarbkunde" );
		frmMitarbkunde.add( pnlMitarbkunde, BorderLayout.CENTER );
		frmMitarbkunde.setVisible( true );
		pnlMain.add( frmMitarbkunde );
		try {
			frmMitarbkunde.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	
	
	private void setzeAnzeige() {
		pnlMitarbkunde.setNummer( iNummer );
		pnlMitarbkunde.setAnrede( sAnrede );
		pnlMitarbkunde.setKundenummer( iKundenummer );
		pnlMitarbkunde.setKunde( sKunde );
		pnlMitarbkunde.setVorname( sVorname );
		pnlMitarbkunde.setNachname( sNachname );
		pnlMitarbkunde.setInfo( sInfo );
		pnlMitarbkunde.setTelefon( sTelefon );
		pnlMitarbkunde.setTelefax( sTelefax );
		pnlMitarbkunde.setMobil( sMobil );
	}
	
	private void leseausAnzeige() {
		iNummer = Util.statischStringNachInt( pnlMitarbkunde.getNummer() );
		sAnrede = pnlMitarbkunde.getAnrede();
		iKundenummer = Util.statischStringNachInt( pnlMitarbkunde.getKundenummer() );
		sVorname = pnlMitarbkunde.getVorname();
		sNachname = pnlMitarbkunde.getNachname();
		sInfo = pnlMitarbkunde.getInfo();
		sTelefon = pnlMitarbkunde.getTelefon();
		sTelefax = pnlMitarbkunde.getTelefax();
		sMobil = pnlMitarbkunde.getMobil();
	}
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
		sAnrede = "";
		iKundenummer = 0;
		sVorname = "";
		sNachname = "";
		sInfo = "";
		sTelefon = "";
		sTelefax = "";
		sMobil = "";
		iAnredeID = 0;
		iKundeID = 0;
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
}
