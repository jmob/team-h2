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
	
	private void setzeAnzeige() {
		pnlKundenberater.setNummer( iNummer );
		pnlKundenberater.setAnrede( sAnrede );
		pnlKundenberater.setVorname( sVorname );
		pnlKundenberater.setNachname( sNachname );
		pnlKundenberater.setStrasse( sStrasse );
		pnlKundenberater.setOrt( sOrt );
		pnlKundenberater.setPLZ( sPLZ );
		pnlKundenberater.setTelefon( sTelefon );
		pnlKundenberater.setTelefax( sTelefax );
		pnlKundenberater.setMobil( sMobil );
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
