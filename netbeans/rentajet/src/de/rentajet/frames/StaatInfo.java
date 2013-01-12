/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.frames;

import de.rentajet.base.H2InternalFrame;
import java.awt.BorderLayout;
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
		pnlStaat = new pnlStaat();
	}
	
	public void show( JPanel pnlMain ) {
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
	
	public void setzeAnzeige() {
		
	}
	
	public void aktualisiereAnzeige() {
		
	}
	
	public void ersterDatensatz() {
		
	}
	
	public void vorherigerdatensatz() {
		
	}
	
	public void naechsterDatensatz() {
		
	}
	
	public void sucheDatensatz() {
		
	}
	
	public void speichern() {
		speichereDB();
	}
	
	public void abbrechen() {
		
	}
	
	public void loeschen() {
		
	}
	
	public void aktualisieren() {
		
	}
	
	public void drucken() {
		
	}
	
	public void speichereDB() {
		
	}
	
	public void zeigeArchiv() {
		
	}
	
	public void ladeDB(){
		
	}
	
	public void loescheDB(){
		
	}
}
