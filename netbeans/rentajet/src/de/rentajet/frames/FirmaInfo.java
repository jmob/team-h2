/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.frames;

import de.rentajet.base.H2InternalFrame;
import java.awt.BorderLayout;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
	
	private String sOrt;
	private String sPLZ;


	public int getiID() {
		return iID;
	}

	public int getiOrtID() {
		return iOrtID;
	}

	public String getsBezeichnung() {
		return sBezeichnung;
	}

	public String getsName1() {
		return sName1;
	}

	public String getsName2() {
		return sName2;
	}

	public String getsName3() {
		return sName3;
	}

	public String getsStrasse() {
		return sStrasse;
	}

	public String getsSteuernummer() {
		return sSteuernummer;
	}

	public String getsBetriebsnummer() {
		return sBetriebsnummer;
	}

	public String getsUSTIdentNummer() {
		return sUSTIdentNummer;
	}

	public String getsTelefon() {
		return sTelefon;
	}

	public String getsTelefax() {
		return sTelefax;
	}

	public String getsLogo() {
		return sLogo;
	}

	public String getsOrt() {
		return sOrt;
	}

	public String getsPLZ() {
		return sPLZ;
	}

	public void setiID( int iID ) {
		this.iID = iID;
	}

	public void setiOrtID( int iOrtID ) {
		this.iOrtID = iOrtID;
	}

	public void setsBezeichnung( String sBezeichnung ) {
		this.sBezeichnung = sBezeichnung;
	}

	public void setsName1( String sName1 ) {
		this.sName1 = sName1;
	}

	public void setsName2( String sName2 ) {
		this.sName2 = sName2;
	}

	public void setsName3( String sName3 ) {
		this.sName3 = sName3;
	}

	public void setsStrasse( String sStrasse ) {
		this.sStrasse = sStrasse;
	}

	public void setsSteuernummer( String sSteuernummer ) {
		this.sSteuernummer = sSteuernummer;
	}

	public void setsBetriebsnummer( String sBetriebsnummer ) {
		this.sBetriebsnummer = sBetriebsnummer;
	}

	public void setsUSTIdentNummer( String sUSTIdentNummer ) {
		this.sUSTIdentNummer = sUSTIdentNummer;
	}

	public void setsTelefon( String sTelefon ) {
		this.sTelefon = sTelefon;
	}

	public void setsTelefax( String sTelefax ) {
		this.sTelefax = sTelefax;
	}

	public void setsLogo( String sLogo ) {
		this.sLogo = sLogo;
	}

	public void setsOrt( String sOrt ) {
		this.sOrt = sOrt;
	}

	public void setsPLZ( String sPLZ ) {
		this.sPLZ = sPLZ;
	}
	
	public FirmaInfo() {
		
	}
	
	public String sucheLogo() {
		JFileChooser chooser = new JFileChooser();
    int rueckgabeWert = chooser.showOpenDialog(null);
        
    if(rueckgabeWert == JFileChooser.APPROVE_OPTION)
    {
			return chooser.getSelectedFile().toString();
    }
		return "";
	}
	
	public void show( JPanel pnlMain ) {
		pnlFirma = new pnlFirma();
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
	
	private void leseausAnzeige() {
		sBezeichnung = pnlFirma.getBezeichnung();
		sName1 = pnlFirma.getName1();
		sName2 = pnlFirma.getName2();
		sName3 = pnlFirma.getName3();
		sStrasse = pnlFirma.getStrasse();
		sOrt = pnlFirma.getOrt();
		sPLZ = pnlFirma.getPLZ();
		sSteuernummer = pnlFirma.getSteuernummer();
		sBetriebsnummer = pnlFirma.getBetriebsnummer();
		sUSTIdentNummer = pnlFirma.getUSTIdentNummer();
		sTelefon = pnlFirma.getTelefon();
		sTelefax = pnlFirma.getTelefax();
		sLogo = pnlFirma.getLogo();
	}
	
	private void aktualisiereAnzeige() {
		sBezeichnung = "";
		sName1 = "";
		sName2 = "";
		sName3 = "";
		sStrasse = "";
		sOrt = "";
		sPLZ = "";
		sSteuernummer = "";
		sBetriebsnummer = "";
		sUSTIdentNummer = "";
		sTelefon = "";
		sTelefax = "";
		sLogo = "";
		iOrtID = 0;
	}
	
	public void ersterDatensatz() {
		ersterDatensatzDB();
	}
	
	public void vorherigerdatensatz() {
		vorherigerdatensatzDB();
	}
	
	public void naechsterDatensatz() {
		naechsterDatensatzDB();
	}
	
	public void letzterDatensatz() {
		letzterDatensatzDB();
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
