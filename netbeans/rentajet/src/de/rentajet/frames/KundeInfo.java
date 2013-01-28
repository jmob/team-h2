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
	private int iKundenberater;

	public int getiID() {
		return iID;
	}

	public void setiID( int iID ) {
		this.iID = iID;
	}

	public int getiNummer() {
		return iNummer;
	}

	public void setiNummer( int iNummer ) {
		this.iNummer = iNummer;
	}

	public int getiAnredeID() {
		return iAnredeID;
	}

	public void setiAnredeID( int iAnredeID ) {
		this.iAnredeID = iAnredeID;
	}

	public int getiOrtID() {
		return iOrtID;
	}

	public void setiOrtID( int iOrtID ) {
		this.iOrtID = iOrtID;
	}

	public int getiKundenberaterID() {
		return iKundenberaterID;
	}

	public void setiKundenberaterID( int iKundenberaterID ) {
		this.iKundenberaterID = iKundenberaterID;
	}

	public String getsMatchcode() {
		return sMatchcode;
	}

	public void setsMatchcode( String sMatchcode ) {
		this.sMatchcode = sMatchcode;
	}

	public String getsName1() {
		return sName1;
	}

	public void setsName1( String sName1 ) {
		this.sName1 = sName1;
	}

	public String getsName2() {
		return sName2;
	}

	public void setsName2( String sName2 ) {
		this.sName2 = sName2;
	}

	public String getsName3() {
		return sName3;
	}

	public void setsName3( String sName3 ) {
		this.sName3 = sName3;
	}

	public String getsStrasse() {
		return sStrasse;
	}

	public void setsStrasse( String sStrasse ) {
		this.sStrasse = sStrasse;
	}

	public String getsTelefon() {
		return sTelefon;
	}

	public void setsTelefon( String sTelefon ) {
		this.sTelefon = sTelefon;
	}

	public String getsTelefax() {
		return sTelefax;
	}

	public void setsTelefax( String sTelefax ) {
		this.sTelefax = sTelefax;
	}

	public String getsMobil() {
		return sMobil;
	}

	public void setsMobil( String sMobil ) {
		this.sMobil = sMobil;
	}

	public String getsSteuernummer() {
		return sSteuernummer;
	}

	public void setsSteuernummer( String sSteuernummer ) {
		this.sSteuernummer = sSteuernummer;
	}

	public boolean isbGesperrt() {
		return bGesperrt;
	}

	public void setbGesperrt( boolean bGesperrt ) {
		this.bGesperrt = bGesperrt;
	}

	public double getdKreditlimit() {
		return dKreditlimit;
	}

	public void setdKreditlimit( double dKreditlimit ) {
		this.dKreditlimit = dKreditlimit;
	}

	public String getsPLZ() {
		return sPLZ;
	}

	public void setsPLZ( String sPLZ ) {
		this.sPLZ = sPLZ;
	}

	public String getsOrt() {
		return sOrt;
	}

	public void setsOrt( String sOrt ) {
		this.sOrt = sOrt;
	}

	public String getsAnrede() {
		return sAnrede;
	}

	public void setsAnrede( String sAnrede ) {
		this.sAnrede = sAnrede;
	}

	public int getiKundenberater() {
		return iKundenberater;
	}

	public void setiKundenberater( int iKundenberater ) {
		this.iKundenberater = iKundenberater;
	}

		
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
		pnlKunde.setKundenberater( iKundenberater );
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
		iKundenberater = Util.statischStringNachInt( pnlKunde.getKundenberater() );
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
		iKundenberater = 0;
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
	
	public boolean istDatensatzVorhanden( int iNummer ) {
		//ToDo Abfrage in DB ob Datensatz mit übergebener Nummer vorhanden ist und ggf. Variablen füllen
		if( iNummer == 10 )
			return true;
		else
			return false;
	}
}
