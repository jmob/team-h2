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
public class FlugzeugInfo {
	private pnlFlugzeug pnlFlugzeug;
	private int iID;
	private int iNummer;
	private int iFlugzeugtypID;
	private String sBezeichnung;
	private String sFoto;
	
	private String sFlugzeugtyp;
	
	public FlugzeugInfo() {
		
	}
	
	public void show( JPanel pnlMain ) {
		pnlFlugzeug = new pnlFlugzeug();
		H2InternalFrame frmFlugzeug = new H2InternalFrame( "Flugzeug" );
		frmFlugzeug.add( pnlFlugzeug, BorderLayout.CENTER );
		frmFlugzeug.setVisible( true );
		pnlMain.add( frmFlugzeug );
		try {
			frmFlugzeug.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	
	
	private void setzeAnzeige() {
		pnlFlugzeug.setNummer( iNummer );
		pnlFlugzeug.setBezeichnung( sBezeichnung );
		pnlFlugzeug.setFlugzeugtyp( sFlugzeugtyp );
		pnlFlugzeug.setFoto( sFoto );
	}
	
	private void leseausAnzeige() {
//		iNummer = pnlFlugzeug.getNummer();
		sBezeichnung = pnlFlugzeug.getBezeichnung();
		sFlugzeugtyp = pnlFlugzeug.getBezeichnung();
		sFoto = pnlFlugzeug.getFoto();
	}
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
		sBezeichnung = "";
		sFlugzeugtyp = "";
		sFoto = "";
		iFlugzeugtypID = 0;
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
