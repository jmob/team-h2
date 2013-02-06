/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.  XXXX
 */
package de.rentajet.frames;

import de.rentajet.base.H2InternalFrame;
import de.rentajet.base.MainInfo;
import de.rentajet.uti.Util;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import de.rentajet.entity.Anrede;  

/**
 *
 * @author Petersen
 */
public class AnredeInfo {
	private pnlAnrede pnlAnrede;
	private int iID;
	private int iNummer;
	private String sBezeichnung;
	private MainInfo main;

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

	public String getsBezeichnung() {
		return sBezeichnung;
	}

	public void setsBezeichnung( String sBezeichnung ) {
		this.sBezeichnung = sBezeichnung;
	}
	
	public AnredeInfo() {

	}
	
	public void show( JPanel pnlMain ) {
		main = new MainInfo();
		main.setFrame( "Anrede" );
		pnlAnrede = new pnlAnrede();
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
	
	private void setzeAnzeige() {
		pnlAnrede.setNummer( iNummer );
		pnlAnrede.setBezeichnung( sBezeichnung );
	}
	
	private void leseausAnzeige() {
		iNummer = Util.statischStringNachInt( pnlAnrede.getNummer() );
		sBezeichnung = pnlAnrede.getBezeichnung();
	}
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
		sBezeichnung = "";
		setzeAnzeige();
	}
	
	public void ersterDatensatz() {
		main.setFrame( "Anrede" );
		JOptionPane.showMessageDialog(
			null, "Erster Datensatz", "Yippi", 
			JOptionPane.OK_OPTION
		);	
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
