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
	
	public MitarbkundeInfo() {
		pnlMitarbkunde = new pnlMitarbkunde();
	}
	
	public void show( JPanel pnlMain ) {
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
