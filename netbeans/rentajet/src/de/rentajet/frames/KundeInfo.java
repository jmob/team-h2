package de.rentajet.frames;

import de.rentajet.base.H2InternalFrame;
import de.rentajet.uti.*;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
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
	}
	
	public void show( JPanel pnlMain ) {
		pnlKunde = new pnlKunde();
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
	
	private void setzeAnzeige() {
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
	
	private void leseausAnzeige() {
		iNummer = Util.statischStringNachInt( pnlKunde.getNummer() );
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
		dKreditlimit = Util.statischStringNachDouble( pnlKunde.getKreditlimit(), 2 );
		sSteuernummer = pnlKunde.getSteuernummer();
		bGesperrt = pnlKunde.isGesperrt();		
	}
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
		sAnrede = "";
		sMatchcode = "";
		sName1 = "";
		sName2 = "";
		sName3 = "";
		sStrasse = "";
		sPLZ = "";
		sOrt = "";
		sTelefon = "";
		sTelefax = "";
		sMobil = "";
		sKundenberater = "";
		dKreditlimit = 0;
		sSteuernummer = "";
		bGesperrt = false;
		iAnredeID = 0;
		iOrtID = 0;
		iKundenberaterID = 0;
		setzeAnzeige();
	}
	
	public void ersterDatensatz() {
		ersterDatensatzDB();
		setzeAnzeige();
	}
	
	public void vorherigerdatensatz() {
		vorherigerdatensatzDB();
		setzeAnzeige();
	}
	
	public void naechsterDatensatz() {
		naechsterDatensatzDB();
		setzeAnzeige();
	}
	
	public void letzterDatensatz() {
		letzterDatensatzDB();
		setzeAnzeige();
	}
	
	public void sucheDatensatz() {
		// ToDo: Erstellung eines Suchfensters
	}
	
	public void speichern() {
		speichereDB();
		aktualisiereAnzeige();
	}
	
	public void abbrechen() {
		aktualisiereAnzeige();
	}
	
	public void loeschen() {
		loescheDB();
		aktualisiereAnzeige();
	}
	
	public void aktualisieren() {
		setzeAnzeige();
	}
	
	public void drucken() {
		JOptionPane.showMessageDialog(
			null, "Es stehen keine Druckdaten zur Verfügung", "Drucken", 
			JOptionPane.OK_OPTION
		);	
	}
		
	public void zeigeArchiv() {
		JOptionPane.showMessageDialog(
			null, "Es stehen keine Archivdaten zur Verfügung", "Archiv", 
			JOptionPane.OK_OPTION
		);	
	}

	public void speichereDB() {
		
	}
	
	public void ladeDB(){
		
	}
	
	public void loescheDB(){
		
	}
	
	
	public void ersterDatensatzDB() {
		
	}
	
	public void vorherigerdatensatzDB() {
		
	}
	
	public void naechsterDatensatzDB() {
		
	}
	
	public void letzterDatensatzDB() {
		
	}
}
