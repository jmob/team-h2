/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.frames;

import de.rentajet.base.H2InternalFrame;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Petersen
 */
public class FlugzeugtypInfo {
	private pnlFlugzeugtyp pnlFlugzeugtyp;
	private int iID;
	private int iNummer;
	private int iFlightcrew;
	private int iCabincrew;
	private int iRechweite;
	private int iSitzplaetze;
	private int iReisegeschwindigkeit;
	private int iTriebwerke;
	private int iTriebwerkartID;
	private String sBezeichnung;
	private String sHersteller;
	
	private String sTriebwerkart;
	
	public FlugzeugtypInfo() {
		
	}
	
	public void show( JPanel pnlMain ) {
		pnlFlugzeugtyp = new pnlFlugzeugtyp();
		H2InternalFrame frmFlugzeugtyp = new H2InternalFrame( "Flugzeugtyp" );
		frmFlugzeugtyp.add( pnlFlugzeugtyp, BorderLayout.CENTER );
		frmFlugzeugtyp.setVisible( true );
		pnlMain.add( frmFlugzeugtyp );
		try {
			frmFlugzeugtyp.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	
	
	private void setzeAnzeige() {
		pnlFlugzeugtyp.setNummer( iNummer );
		pnlFlugzeugtyp.setBezeichnung( sBezeichnung );
		pnlFlugzeugtyp.setHersteller( sHersteller );
		pnlFlugzeugtyp.setFlightcrew( iFlightcrew );
		pnlFlugzeugtyp.setCabincrew( iCabincrew );
		pnlFlugzeugtyp.setReichweite( iRechweite );
		pnlFlugzeugtyp.setSitzplaetze( iSitzplaetze );
		pnlFlugzeugtyp.setReisegeschwindigkeit( iReisegeschwindigkeit );
		pnlFlugzeugtyp.setTriebwerke( iTriebwerke );
		pnlFlugzeugtyp.setTriebwerkart( sTriebwerkart );
	}
	
	private void leseausAnzeige() {
//		iNummer = pnlFlugzeugtyp.getNummer();
		sBezeichnung = pnlFlugzeugtyp.getBezeichnung();
		sHersteller = pnlFlugzeugtyp.getHersteller();
//		iFlightcrew = pnlFlugzeugtyp.getFlightcrew();
//		iCabincrew = pnlFlugzeugtyp.getCabincrew();
//		iRechweite = pnlFlugzeugtyp.getReichweite();
//		iSitzplaetze = pnlFlugzeugtyp.getSitzplaetze();
//		iReisegeschwindigkeit = pnlFlugzeugtyp.getReisegeschwindigkeit();
//		iTriebwerke = pnlFlugzeugtyp.getTriebwerke();
		sTriebwerkart = pnlFlugzeugtyp.getTriebwerkart();
	}
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
		sBezeichnung = "";
		sHersteller = "";
		iFlightcrew = 0;
		iCabincrew = 0;
		iRechweite = 0;
		iSitzplaetze = 0;
		iReisegeschwindigkeit = 0;
		iTriebwerke = 0;
		sTriebwerkart = "";
		iTriebwerkartID = 0;
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
