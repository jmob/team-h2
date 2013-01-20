/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.frames;

import de.rentajet.base.H2InternalFrame;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Petersen
 */
public class StaatInfo {
	private pnlStaat pnlStaat;
	private int iID;
	private int iNummer;
	private String sBezeichnung;
	private String sLaendercode;
	private String sPostKuerzel;
	private String sPostName;
	
	public StaatInfo() {
		
	}
	
	public void show( JPanel pnlMain ) {
		pnlStaat = new pnlStaat();
		H2InternalFrame frmStaat = new H2InternalFrame( "Staat" );
		frmStaat.add( pnlStaat, BorderLayout.CENTER );
		frmStaat.setVisible( true );
		pnlMain.add( frmStaat );
		try {
			frmStaat.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	
	
	private void setzeAnzeige() {
		pnlStaat.setNummer( iNummer );
		pnlStaat.setBezeichnung( sBezeichnung );
		pnlStaat.setLaendercode( sLaendercode );
		pnlStaat.setPostKuerzel( sPostKuerzel );
		pnlStaat.setPostName( sPostName );
	}
	
	private void leseausAnzeige() {
//		iNummer = pnlStaat.getNummer();
		sBezeichnung = pnlStaat.getBezeichnung();
		sLaendercode = pnlStaat.getLaendercode();
		sPostKuerzel = pnlStaat.getPostKuerzel();
		sPostName = pnlStaat.getPostName();
	}
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
		sBezeichnung = "";
		sLaendercode = "";
		sPostKuerzel = "";
		sPostName = "";	
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
