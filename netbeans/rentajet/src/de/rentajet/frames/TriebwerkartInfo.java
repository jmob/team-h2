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
public class TriebwerkartInfo {
	private pnlTriebwerkart pnlTriebwerkart;
	private int iID;
	private int iNummer;
	private String sBezeichnung;
	
	public TriebwerkartInfo() {
		pnlTriebwerkart = new pnlTriebwerkart();
	}
	
	public void show( JPanel pnlMain ) {
		H2InternalFrame frmTriebwerkart = new H2InternalFrame( "Triebwerkart" );
		frmTriebwerkart.add( pnlTriebwerkart, BorderLayout.CENTER );
		frmTriebwerkart.setVisible( true );
		pnlMain.add( frmTriebwerkart );
		try {
			frmTriebwerkart.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	
	
	public void setzeAnzeige() {
		
	}
	
	public void leseausAnzeige() {
		
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
