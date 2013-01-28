/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.  XXXX
 */
package de.rentajet.frames;

import de.rentajet.base.H2InternalFrame;
import de.rentajet.uti.Util;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Petersen
 */
public class AuftragInfo {
	private pnlAuftrag pnlAuftrag;
	private int iID;
	private int iNummer;
	
	
	public AuftragInfo() {
		
	}
	
	public void show( JPanel pnlMain ) {
		pnlAuftrag = new pnlAuftrag();
		H2InternalFrame frmAuftrag = new H2InternalFrame( "Anrede" );
		frmAuftrag.add( pnlAuftrag, BorderLayout.CENTER );
		frmAuftrag.setVisible( true );
		pnlMain.add( frmAuftrag );
		try {
			frmAuftrag.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	
	
	private void setzeAnzeige() {
		pnlAuftrag.setNummer( iNummer );

	}
	
	private void leseausAnzeige() {
		iNummer = Util.statischStringNachInt( pnlAuftrag.getNummer() );

	}
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
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
	
	public String[] holeVerfügbareFlugzeuge() {
		// Verfügbarkeitsprüfung
		String[] sa = new String[3];
		sa[0] = "1. Flugzeug";
		sa[1] = "2. Flugzeug";
		sa[2] = "3. Flugzeug";	
		return sa;  
	}
	
	public boolean istDatensatzVorhanden( int iNummer ) {
		//ToDo Abfrage in DB ob Datensatz mit übergebener Nummer vorhanden ist und ggf. Variablen füllen
		if( iNummer == 10 )
			return true;
		else
			return false;
	}
}
