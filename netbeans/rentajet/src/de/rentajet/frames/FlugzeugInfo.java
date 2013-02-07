/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.frames;

import de.rentajet.base.H2InternalFrame;
import de.rentajet.uti.Util;
import java.awt.BorderLayout;
import javax.swing.JFileChooser;
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
	private int iFlugzeugtyp;
	private String sBezeichnung;
	private String sFoto;

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

	public int getiFlugzeugtypID() {
		return iFlugzeugtypID;
	}

	public void setiFlugzeugtypID( int iFlugzeugtypID ) {
		this.iFlugzeugtypID = iFlugzeugtypID;
	}

	public String getsBezeichnung() {
		return sBezeichnung;
	}

	public void setsBezeichnung( String sBezeichnung ) {
		this.sBezeichnung = sBezeichnung;
	}

	public String getsFoto() {
		return sFoto;
	}

	public void setsFoto( String sFoto ) {
		this.sFoto = sFoto;
	}

	public int getiFlugzeugtyp() {
		return iFlugzeugtyp;
	}

	public void setiFlugzeugtyp( int iFlugzeugtyp ) {
		this.iFlugzeugtyp = iFlugzeugtyp;
	}
	
	public FlugzeugInfo() {
		
	}
	
	public String sucheBild() {
		JFileChooser chooser = new JFileChooser();
    int rueckgabeWert = chooser.showOpenDialog(null);
        
    if(rueckgabeWert == JFileChooser.APPROVE_OPTION)
    {
			return chooser.getSelectedFile().toString();
    }
		return "";
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

	private void leseausAnzeige() {
		iNummer = Util.statischStringNachInt( pnlFlugzeug.getNummer() );
		sBezeichnung = pnlFlugzeug.getBezeichnung();
		iFlugzeugtyp = Util.statischStringNachInt( pnlFlugzeug.getBezeichnung() );
		sFoto = pnlFlugzeug.getFoto();
	}
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
		sBezeichnung = "";
		iFlugzeugtyp = 0;
		sFoto = "";
		iFlugzeugtypID = 0;
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
