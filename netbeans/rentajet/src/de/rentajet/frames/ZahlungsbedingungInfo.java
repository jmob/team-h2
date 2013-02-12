/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
public class ZahlungsbedingungInfo {
	private pnlZahlungsbedingung pnlZahlungsbedingung;
	private int iID;
	private int iNummer;
	private int iValuta;
	private int iSkontoValuta;
	private double dSkontosatz;
	private String sBezeichnung;
	private String sBelegtext;
	private final Connection conn;

		public ZahlungsbedingungInfo() {
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

	public int getiValuta() {
		return iValuta;
	}

	public void setiValuta( int iValuta ) {
		this.iValuta = iValuta;
	}

	public int getiSkontoValuta() {
		return iSkontoValuta;
	}

	public void setiSkontoValuta( int iSkontoValuta ) {
		this.iSkontoValuta = iSkontoValuta;
	}

	public double getdSkontosatz() {
		return dSkontosatz;
	}

	public void setdSkontosatz( double dSkontosatz ) {
		this.dSkontosatz = dSkontosatz;
	}

	public String getsBezeichnung() {
		return sBezeichnung;
	}

	public void setsBezeichnung( String sBezeichnung ) {
		this.sBezeichnung = sBezeichnung;
	}

	public String getsBelegtext() {
		return sBelegtext;
	}

	public void setsBelegtext( String sBelegtext ) {
		this.sBelegtext = sBelegtext;
	}
	
	public void show( JPanel pnlMain ) {
		pnlZahlungsbedingung = new pnlZahlungsbedingung();
		H2InternalFrame frmZahlungsbedingung = new H2InternalFrame( "Zahlungsbedingung" );
		frmZahlungsbedingung.add( pnlZahlungsbedingung, BorderLayout.CENTER );
		frmZahlungsbedingung.setVisible( true );
		pnlMain.add( frmZahlungsbedingung );
		try {
			frmZahlungsbedingung.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
		sBezeichnung = "";
		sBelegtext = "";
		iValuta = 0;
		iSkontoValuta = 0;
		dSkontosatz = 0.0;
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
	
	
	public void speichern( int iNummer ) {
		speichereDB( iNummer );
		aktualisiereAnzeige();
	}
	
	public void abbrechen() {
		aktualisiereAnzeige();
	}
	
	public void loeschen( int iNummer ) {
		loescheDB( iNummer );
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

	public void speichereDB( int iNummer ) {
		if( istDatensatzVorhanden( iNummer ) ) {
			try {
//				PreparedStatement pst = conn.prepareStatement( "" );
			}
			catch (Exception e) {
				
			}
		}
		else {
			try {
//				PreparedStatement pst = conn.prepareStatement( "" );
			}
			catch (Exception e) {
				
			}		
		}
		
	}
	
	public void ladeDB( int iNummer ){
			try {
//				PreparedStatement pst = conn.prepareStatement( "" );
			}
			catch (Exception e) {
				
			}		
	}
	
	public void loescheDB( int iNummer ){
			try {
//				PreparedStatement pst = conn.prepareStatement( "" );
			}
			catch (Exception e) {
				
			}
	}
	
	public void ersterDatensatzDB() {
		try{
      PreparedStatement pst = conn.prepareStatement( "SELECT * from zahlungsbedingung WHERE ID=1;" );
      ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iNummer  = rs.getInt("Nummer");
				iValuta  = rs.getInt("Valuta");
				iSkontoValuta  = rs.getInt("SkontoValuta");
				dSkontosatz  = rs.getInt("Skontosatz");
				sBezeichnung = rs.getString("Bezeichnung");
				sBelegtext = rs.getString("Belegtext");
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
      PreparedStatement pst = conn.prepareStatement( "SELECT * from zahlungsbedingung ORDER BY ID DESC LIMIT 1;" );
      ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iNummer  = rs.getInt("Nummer");
				iValuta  = rs.getInt("Valuta");
				iSkontoValuta  = rs.getInt("SkontoValuta");
				dSkontosatz  = rs.getInt("Skontosatz");
				sBezeichnung = rs.getString("Bezeichnung");
				sBelegtext = rs.getString("Belegtext");
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
