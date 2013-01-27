/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
	private int iTriebwerkart;
	private String sBezeichnung;
	private String sHersteller;

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

	public int getiFlightcrew() {
		return iFlightcrew;
	}

	public void setiFlightcrew( int iFlightcrew ) {
		this.iFlightcrew = iFlightcrew;
	}

	public int getiCabincrew() {
		return iCabincrew;
	}

	public void setiCabincrew( int iCabincrew ) {
		this.iCabincrew = iCabincrew;
	}

	public int getiRechweite() {
		return iRechweite;
	}

	public void setiRechweite( int iRechweite ) {
		this.iRechweite = iRechweite;
	}

	public int getiSitzplaetze() {
		return iSitzplaetze;
	}

	public void setiSitzplaetze( int iSitzplaetze ) {
		this.iSitzplaetze = iSitzplaetze;
	}

	public int getiReisegeschwindigkeit() {
		return iReisegeschwindigkeit;
	}

	public void setiReisegeschwindigkeit( int iReisegeschwindigkeit ) {
		this.iReisegeschwindigkeit = iReisegeschwindigkeit;
	}

	public int getiTriebwerke() {
		return iTriebwerke;
	}

	public void setiTriebwerke( int iTriebwerke ) {
		this.iTriebwerke = iTriebwerke;
	}

	public int getiTriebwerkartID() {
		return iTriebwerkartID;
	}

	public void setiTriebwerkartID( int iTriebwerkartID ) {
		this.iTriebwerkartID = iTriebwerkartID;
	}

	public String getsBezeichnung() {
		return sBezeichnung;
	}

	public void setsBezeichnung( String sBezeichnung ) {
		this.sBezeichnung = sBezeichnung;
	}

	public String getsHersteller() {
		return sHersteller;
	}

	public void setsHersteller( String sHersteller ) {
		this.sHersteller = sHersteller;
	}

	public int getiTriebwerkart() {
		return iTriebwerkart;
	}

	public void setiTriebwerkart( int iTriebwerkart ) {
		this.iTriebwerkart = iTriebwerkart;
	}

	
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
		pnlFlugzeugtyp.setTriebwerkart( iTriebwerkart );
	}
	
	private void leseausAnzeige() {
		iNummer = Util.statischStringNachInt( pnlFlugzeugtyp.getNummer() );
		sBezeichnung = pnlFlugzeugtyp.getBezeichnung();
		sHersteller = pnlFlugzeugtyp.getHersteller();
		iFlightcrew = Util.statischStringNachInt( pnlFlugzeugtyp.getFlightcrew() );
		iCabincrew = Util.statischStringNachInt( pnlFlugzeugtyp.getCabincrew() );
		iRechweite = Util.statischStringNachInt( pnlFlugzeugtyp.getReichweite() );
		iSitzplaetze = Util.statischStringNachInt( pnlFlugzeugtyp.getSitzplaetze() );
		iReisegeschwindigkeit = Util.statischStringNachInt( pnlFlugzeugtyp.getReisegeschwindigkeit() );
		iTriebwerke = Util.statischStringNachInt( pnlFlugzeugtyp.getTriebwerke() );
		iTriebwerkart = Util.statischStringNachInt( pnlFlugzeugtyp.getTriebwerkart() );
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
		iTriebwerkart = 0;
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
