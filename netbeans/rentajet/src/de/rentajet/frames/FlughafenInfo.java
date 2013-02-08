/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.  XXXX
 */
package de.rentajet.frames;

import de.rentajet.base.H2InternalFrame;
import de.rentajet.base.javaconnect;
import de.rentajet.uti.Util;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Petersen
 */
public class FlughafenInfo {
	private pnlFlughafen pnlFlughafen;
	private int iID;
	private int iNummer;
	private String sBezeichnung;
	private String sKuerzel;
	private final Connection conn;

		public FlughafenInfo() {
		conn=javaconnect.ConnectDb();
	}

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

	public String getsKuerzel() {
		return sKuerzel;
	}

	public void setsKuerzel( String sKuerzel ) {
		this.sKuerzel = sKuerzel;
	}

	public void show( JPanel pnlMain ) {
		pnlFlughafen = new pnlFlughafen();
		H2InternalFrame frmFlughafen = new H2InternalFrame( "Flughafen" );
		frmFlughafen.add( pnlFlughafen, BorderLayout.CENTER );
		frmFlughafen.setVisible( true );
		pnlMain.add( frmFlughafen );
		try {
			frmFlughafen.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	

	private void leseausAnzeige() {
		iNummer = Util.statischStringNachInt( pnlFlughafen.getNummer() );
		sBezeichnung = pnlFlughafen.getBezeichnung();
		sKuerzel = pnlFlughafen.getKuerzel();
	}
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
		sBezeichnung = "";
		sKuerzel = "";
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
		try{
      PreparedStatement pst = conn.prepareStatement( "SELECT * from flughafen WHERE ID=1;" );
      ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iNummer  = rs.getInt("Nummer");
				sBezeichnung = rs.getString("Bezeichnung");
				sKuerzel = rs.getString("Kuerzel");
		  }
    }
    catch(Exception e)
    {
      JOptionPane.showMessageDialog(null, e);
    }
	}
	
	public void vorherigerdatensatzDB() {
		
	}
	
	public void naechsterDatensatzDB() {
		
	}
	
	public void letzterDatensatzDB() {
	try{
      PreparedStatement pst = conn.prepareStatement( "SELECT * from flughafen ORDER BY ID DESC LIMIT 1;" );
      ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iNummer  = rs.getInt("Nummer");
				sBezeichnung = rs.getString("Bezeichnung");
				sKuerzel = rs.getString("Kuerzel");
      }
    }
    catch(Exception e)
    {
      JOptionPane.showMessageDialog(null, e);
    }	
	}	
	
	
	public boolean istDatensatzVorhanden( int iNummer ) {
		//ToDo Abfrage in DB ob Datensatz mit übergebener Nummer vorhanden ist und ggf. Variablen füllen
		if( iNummer == 10 )
			return true;
		else
			return false;
	}
}
