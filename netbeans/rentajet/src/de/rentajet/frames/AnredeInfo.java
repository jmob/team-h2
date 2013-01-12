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
public class AnredeInfo {
	private pnlAnrede pnlAnrede;
	private int iID;
	private int iNummer;
	private String sBezeichnung;
	
	public AnredeInfo() {
		pnlAnrede = new pnlAnrede();
	}
	
	public void show( JPanel pnlMain ) {
		H2InternalFrame frmAnrede = new H2InternalFrame( "Anrede" );
		frmAnrede.add( pnlAnrede, BorderLayout.CENTER );
		frmAnrede.setVisible( true );
		pnlMain.add( frmAnrede );
		try {
			frmAnrede.setSelected(true);
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
