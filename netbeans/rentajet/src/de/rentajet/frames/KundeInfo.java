package de.rentajet.frames;

import de.rentajet.base.H2InternalFrame;
import java.awt.BorderLayout;
import java.awt.Frame;
import javax.swing.JPanel;

/**
 *
 * @author H.Petersen
 */
public class KundeInfo {
	private pnlKunde pnlKunde;
	private int iID;
	private int iNummer;
	private int iAnredeID;
	private int iOrtID;
	private int KundenberaterID;
	private String sMatchcode;
	private String sName1;
	private String sName2;
	private String sName3;
	private String sStrasse;
	private String sTelefon;
	private String sTelefax;
	private String sMobil;
	private String sSteuernummer;
	private boolean bGesperrt;
	private double dKreditlimit;
		
	public KundeInfo() {
		pnlKunde = new pnlKunde();
	}
	
	public void show( JPanel pnlMain ) {
		H2InternalFrame frmKunde = new H2InternalFrame( "Kunde" );
		frmKunde.add( pnlKunde, BorderLayout.CENTER );
		frmKunde.setVisible( true );
		pnlMain.add( frmKunde );
		try {
			frmKunde.setSelected(true);
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
