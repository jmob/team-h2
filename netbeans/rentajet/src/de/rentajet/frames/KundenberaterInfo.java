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
	
	public KundenberaterInfo() {
		pnlKundenberater = new pnlKundenberater();
	}
	
	public void show( JPanel pnlMain ) {
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
