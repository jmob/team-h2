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
public class FirmaInfo {
	private pnlFirma pnlFirma;
	private int iID;
	private int iOrtID;
	private String sBezeichnung;
	private String sName1;
	private String sName2;
	private String sName3;
	private String sStrasse;
	private String sSteuernummer;
	private String sBetriebsnummer;
	private String sUSTIdentNummer;
	private String sTelefon;
	private String sTelefax;
	private String sLogo;
	
	public FirmaInfo() {
		pnlFirma = new pnlFirma();
	}
	
	public void show( JPanel pnlMain ) {
		H2InternalFrame frmFirma = new H2InternalFrame( "Firma" );
		frmFirma.add( pnlFirma, BorderLayout.CENTER );
		frmFirma.setVisible( true );
		pnlMain.add( frmFirma );
		try {
			frmFirma.setSelected(true);
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

