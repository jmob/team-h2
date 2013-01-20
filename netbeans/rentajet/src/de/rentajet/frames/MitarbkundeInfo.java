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
