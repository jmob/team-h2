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
public class FlugzeugkostenInfo {
	private pnlFlugzeugkosten pnlFlugzeugkosten;
	private int iID;
	private int iNummer;
	private int iFlugzeugtypID;
	private int iRentabilitaetStd;
	private String sBezeichnung;
	private double dFixkosten;
	private double dFixkostenStd;
	private double dStundensatz;
	
	private int iFlugzeugtypnummer;
	private String sFlugzeugtyp;
	private final Connection conn;
	
		public FlugzeugkostenInfo() {
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

	public int getiFlugzeugtypID() {
		return iFlugzeugtypID;
	}

	public void setiFlugzeugtypID( int iFlugzeugtypID ) {
		this.iFlugzeugtypID = iFlugzeugtypID;
	}

	public int getiRentabilitaetStd() {
		return iRentabilitaetStd;
	}

	public void setiRentabilitaetStd( int iRentabilitaetStd ) {
		this.iRentabilitaetStd = iRentabilitaetStd;
	}

	public String getsBezeichnung() {
		return sBezeichnung;
	}

	public void setsBezeichnung( String sBezeichnung ) {
		this.sBezeichnung = sBezeichnung;
	}

	public double getdFixkosten() {
		return dFixkosten;
	}

	public void setdFixkosten( double dFixkosten ) {
		this.dFixkosten = dFixkosten;
	}

	public double getdFixkostenStd() {
		return dFixkostenStd;
	}

	public void setdFixkostenStd( double dFixkostenStd ) {
		this.dFixkostenStd = dFixkostenStd;
	}

	public double getdStundensatz() {
		return dStundensatz;
	}

	public void setdStundensatz( double dStundensatz ) {
		this.dStundensatz = dStundensatz;
	}

	public int getiFlugzeugtypnummer() {
		return iFlugzeugtypnummer;
	}

	public void setiFlugzeugtypnummer( int iFlugzeugtypnummer ) {
		this.iFlugzeugtypnummer = iFlugzeugtypnummer;
	}

	public String getsFlugzeugtyp() {
		return sFlugzeugtyp;
	}

	public void setsFlugzeugtyp( String sFlugzeugtyp ) {
		this.sFlugzeugtyp = sFlugzeugtyp;
	}
	
	public void show( JPanel pnlMain ) {
		pnlFlugzeugkosten = new pnlFlugzeugkosten();
		H2InternalFrame frmFlugzeugkosten = new H2InternalFrame( "Flugzeugkosten" );
		frmFlugzeugkosten.add( pnlFlugzeugkosten, BorderLayout.CENTER );
		frmFlugzeugkosten.setVisible( true );
		pnlMain.add( frmFlugzeugkosten );
		try {
			frmFlugzeugkosten.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}

	private void aktualisiereAnzeige() {
		iNummer = 0;
		sBezeichnung = "";
		dFixkosten = 0.0;
		iRentabilitaetStd = 0;
		dFixkostenStd = 0.0;
		dStundensatz = 0.0;
		iFlugzeugtypnummer = 0;
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
      //PreparedStatement pst = conn.prepareStatement( "SELECT * from zahlungsbedingung WHERE ID=1;" );
      PreparedStatement pst = conn.prepareStatement( "SELECT t1.*,t2.* FROM flugzeugkosten AS t1, flugzeugtyp AS t2 WHERE t1.ID=0 AND t1.FlugzeugtypID= t2.ID;" );
			ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iNummer  = rs.getInt("Nummer");
				iFlugzeugtypID  = rs.getInt("FlugzeugtypID");
				iRentabilitaetStd  = rs.getInt("RentabilitaetStd");
				sBezeichnung  = rs.getString("Bezeichnung");
				dFixkosten  = rs.getDouble("Fixkosten");
				dFixkostenStd  = rs.getDouble("FixkostenStd");
				dStundensatz = rs.getInt("Stundensatz");
				//private int iFlugzeugtypnummer;
				//private String sFlugzeugtyp;
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
			PreparedStatement pst = conn.prepareStatement( "SELECT t1.*,t2.* FROM flugzeugkosten AS t1, flugzeugtyp AS t2 WHERE t1.FlugzeugtypID= t2.ID ORDER BY t1.ID DESC LIMIT 1");
      ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iNummer  = rs.getInt("Nummer");
				iFlugzeugtypID  = rs.getInt("FlugzeugtypID");
				iRentabilitaetStd  = rs.getInt("RentabilitaetStd");
				sBezeichnung  = rs.getString("Bezeichnung");
				dFixkosten  = rs.getDouble("Fixkosten");
				dFixkostenStd  = rs.getDouble("FixkostenStd");
				dStundensatz = rs.getInt("Stundensatz");
				//private int iFlugzeugtypnummer;
				//private String sFlugzeugtyp;
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
	
	public void sucheUeberFlugzeugtyp( int iFlugzeugtypID ) {
		
	}
}
