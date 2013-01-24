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
public class PersonalkostenInfo {
	private pnlPersonalkosten pnlPersonalkosten;
	private int iID;
	private int iNummer;
	private String sBezeichnung;
	
	public PersonalkostenInfo() {
		
	}
	
	public void show( JPanel pnlMain ) {
		pnlPersonalkosten = new pnlPersonalkosten();
		H2InternalFrame frmPersonalkosten = new H2InternalFrame( "Personalkosten" );
		frmPersonalkosten.add( pnlPersonalkosten, BorderLayout.CENTER );
		frmPersonalkosten.setVisible( true );
		pnlMain.add( frmPersonalkosten );
		try {
			frmPersonalkosten.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	
	
	private void setzeAnzeige() {
		pnlPersonalkosten.setNummer( iNummer );
		pnlPersonalkosten.setBezeichnung( sBezeichnung );
	}
	
	private void leseausAnzeige() {
		iNummer = Util.statischStringNachInt( pnlPersonalkosten.getNummer() );
		sBezeichnung = pnlPersonalkosten.getBezeichnung();
	}
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
		sBezeichnung = "";
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
