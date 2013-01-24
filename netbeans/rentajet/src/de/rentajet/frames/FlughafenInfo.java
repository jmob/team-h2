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
public class FlughafenInfo {
	private pnlFlughafen pnlFlughafen;
	private int iID;
	private int iNummer;
	private String sBezeichnung;
	private String sKuerzel;
	
	public FlughafenInfo() {
		
	}
	
	public void show( JPanel pnlMain ) {
		pnlFlughafen = new pnlFlughafen();
		H2InternalFrame frmFlughafen = new H2InternalFrame( "Flughafen" );
		frmFlughafen.add( pnlFlughafen, BorderLayout.CENTER );
		frmFlughafen.setVisible( true );
		pnlMain.add( frmFlughafen );
		try {
			frmFlughafen.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	
	
	private void setzeAnzeige() {
		pnlFlughafen.setNummer( iNummer );
		pnlFlughafen.setBezeichnung( sBezeichnung );
		pnlFlughafen.setKuerzel( sKuerzel );
	}
	
	private void leseausAnzeige() {
		iNummer = Util.statischStringNachInt( pnlFlughafen.getNummer() );
		sBezeichnung = pnlFlughafen.getBezeichnung();
		sKuerzel = pnlFlughafen.getKuerzel();
	}
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
		sBezeichnung = "";
		sKuerzel = "";
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
