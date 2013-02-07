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
public class OrtInfo {
	private pnlOrt pnlOrt;
	private int iID;
	private int iPLZ;
	private int iStaatID;
	private String sBezeichnung;
	
	private String sStaat;

	public int getiID() {
		return iID;
	}

	public void setiID( int iID ) {
		this.iID = iID;
	}

	public int getiPLZ() {
		return iPLZ;
	}

	public void setiPLZ( int iPLZ ) {
		this.iPLZ = iPLZ;
	}

	public int getiStaatID() {
		return iStaatID;
	}

	public void setiStaatID( int iStaatID ) {
		this.iStaatID = iStaatID;
	}

	public String getsBezeichnung() {
		return sBezeichnung;
	}

	public void setsBezeichnung( String sBezeichnung ) {
		this.sBezeichnung = sBezeichnung;
	}

	public String getsStaat() {
		return sStaat;
	}

	public void setsStaat( String sStaat ) {
		this.sStaat = sStaat;
	}
	
	public OrtInfo() {
		
	}
	
	public void show( JPanel pnlMain ) {
		pnlOrt = new pnlOrt();
		H2InternalFrame frmOrt = new H2InternalFrame( "Ort" );
		frmOrt.add( pnlOrt, BorderLayout.CENTER );
		frmOrt.setVisible( true );
		pnlMain.add( frmOrt );
		try {
			frmOrt.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	

	private void leseausAnzeige() {
		iPLZ = Util.statischStringNachInt( pnlOrt.getPLZ() );
		sBezeichnung = pnlOrt.getBezeichnung();
		sStaat = pnlOrt.getStaat();
	}
	
	private void aktualisiereAnzeige() {
		iPLZ = 0;
		sBezeichnung = "";
		sStaat = "";
		iStaatID = 0;
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
}
