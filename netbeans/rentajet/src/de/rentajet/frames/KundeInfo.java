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
	
	//DB Variablen
	private int iID;
	private int iNummer;
	private int iAnredeID;
	private int iOrtID;
	private int iKundenberaterID;
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
	
	//Sonstige Variablen
	private String sPLZ;
	private String sOrt;
	private String sAnrede;
	private String sKundenberater;
		
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
		pnlKunde.setNummer( iNummer );
		pnlKunde.setAnrede( sAnrede );
		pnlKunde.setMatchcode( sMatchcode );
		pnlKunde.setName1( sName1 );
		pnlKunde.setName2( sName2 );
		pnlKunde.setName3( sName3 );
		pnlKunde.setStrasse( sStrasse );
		pnlKunde.setPLZ( sPLZ );
		pnlKunde.setOrt( sOrt );
		pnlKunde.setTelefon( sTelefon );
		pnlKunde.setTelefax( sTelefax );
		pnlKunde.setMobil( sMobil );
		pnlKunde.setKundenberater( sKundenberater );
		pnlKunde.setKreditlimit( dKreditlimit );
		pnlKunde.setSteuernummer( sSteuernummer );
		pnlKunde.setGesperrt( bGesperrt );
	}
	
	public void leseausAnzeige() {
//		iNummer = pnlKunde.getNummer();
		sAnrede = pnlKunde.getAnrede();
		sMatchcode = pnlKunde.getMatchcode();
		sName1 = pnlKunde.getName1();
		sName2 = pnlKunde.getName2();
		sName3 = pnlKunde.getName3();
		sStrasse = pnlKunde.getStrasse();
		sPLZ = pnlKunde.getPLZ();
		sOrt = pnlKunde.getOrt();
		sTelefon = pnlKunde.getTelefon();
		sTelefax = pnlKunde.getTelefax();
		sMobil = pnlKunde.getMobil();
		sKundenberater = pnlKunde.getKundenberater();
//		dKreditlimit = pnlKunde.getKreditlimit();
		sSteuernummer = pnlKunde.getSteuernummer();
		bGesperrt = pnlKunde.isGesperrt();		
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
		leseausAnzeige();
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
