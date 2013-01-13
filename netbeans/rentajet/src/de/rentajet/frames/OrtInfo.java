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
public class OrtInfo {
	private pnlOrt pnlOrt;
	private int iID;
	private int iPLZ;
	private int iStaatID;
	private String sBezeichnung;
	
	public OrtInfo() {
		pnlOrt = new pnlOrt();
	}
	
	public void show( JPanel pnlMain ) {
		H2InternalFrame frmOrt = new H2InternalFrame( "Ort" );
		frmOrt.add( pnlOrt, BorderLayout.CENTER );
		frmOrt.setVisible( true );
		pnlMain.add( frmOrt );
		try {
			frmOrt.setSelected(true);
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
