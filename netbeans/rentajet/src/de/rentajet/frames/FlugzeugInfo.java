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
public class FlugzeugInfo {
	private pnlFlugzeug pnlFlugzeug;
	private int iID;
	private int iNummer;
	private int iFlugzeugtypID;
	private String sBezeichnung;
	private String sFoto;
	
	public FlugzeugInfo() {
		pnlFlugzeug = new pnlFlugzeug();
	}
	
	public void show( JPanel pnlMain ) {
		H2InternalFrame frmFlugzeug = new H2InternalFrame( "Flugzeug" );
		frmFlugzeug.add( pnlFlugzeug, BorderLayout.CENTER );
		frmFlugzeug.setVisible( true );
		pnlMain.add( frmFlugzeug );
		try {
			frmFlugzeug.setSelected(true);
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
