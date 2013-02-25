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
public class FlugzeugtypInfo {
	private pnlFlugzeugtyp pnlFlugzeugtyp;
	private int iID;
	private int iNummer;
	private int iFlightcrew;
	private int iCabincrew;
	private int iReichweite;
	private int iSitzplaetze;
	private int iReisegeschwindigkeit;
	private int iTriebwerke;
	private int iTriebwerkartID;
	private int iTriebwerkart;
	private String sBezeichnung;
	private String sHersteller;
	private final Connection conn;
	PreparedStatement pst=null;
	
		public FlugzeugtypInfo() {
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

	public int getiReichweite() {
		return iReichweite;
	}

	public void setiReichweite( int iReichweite ) {
		this.iReichweite = iReichweite;
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
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
		sBezeichnung = "";
		sHersteller = "";
		iFlightcrew = 0;
		iCabincrew = 0;
		iReichweite = 0;
		iSitzplaetze = 0;
		iReisegeschwindigkeit = 0;
		iTriebwerke = 0;
		iTriebwerkart = 0;
		iTriebwerkartID = 0;
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
			PreparedStatement pst = conn.prepareStatement( "INSERT INTO flugzeugtyp (ID, Nummer, Bezeichnung, Hersteller, Flightcrew, Cabincrew, Reichweite, Sitzplaetze, Reisegeschwindigkeit, Triebwerke, TriebwerkartID )"
						+	"VALUES (iID, iNummer, sBezeichnung, sHersteller, iFlightcrew, iCabincrew, iReichweite, iSitzplaetze, iReisegeschwindigkeit, iTriebwerke, iTriebwerkartID)"
						+	" ON DUPLICATE KEY UPDATE "
						+ "ID = 'iID', Nummer = 'iNummer', Bezeichnung = 'sBezeichnung', Hersteller = 'sHersteller', Flightcrew='iFlightcrew', Cabincrew='iCabincrew', Reichweite='iReichweite', Sitzplaetze='iSitzplaetze', Reisegeschwindigkeit='iReisegeschwindigkeit', Triebwerke='iTriebwerke', TriebwerkartID='iTriebwerkartID'" );
		
			pst.setInt( 1, iID);
			pst.setInt( 2, iNummer);
			pst.setString( 3, sBezeichnung);
			pst.setString( 4, sHersteller);
			pst.setInt( 5, iFlightcrew);
			pst.setInt( 6, iCabincrew);
			pst.setInt( 7, iReichweite);
			pst.setInt( 8, iSitzplaetze);
			pst.setInt( 9, iReisegeschwindigkeit);
			pst.setInt( 10, iTriebwerke);
			pst.setInt( 11, iTriebwerkartID);
			
			pst.execute();
			}
			catch (Exception e) {
				
			}
		}
		else {
			try {
			PreparedStatement pst = conn.prepareStatement( "INSERT INTO flugzeugtyp (ID, Nummer, Bezeichnung, Hersteller, Flightcrew, Cabincrew, Reichweite, Sitzplaetze, Reisegeschwindigkeit, Triebwerke, TriebwerkartID )"
						+	"VALUES (iID, iNummer, sBezeichnung, sHersteller, iFlightcrew, iCabincrew, iReichweite, iSitzplaetze, iReisegeschwindigkeit, iTriebwerke, iTriebwerkartID)"
						+	" ON DUPLICATE KEY UPDATE "
						+ "ID = 'iID', Nummer = 'iNummer', Bezeichnung = 'sBezeichnung', Hersteller = 'sHersteller', Flightcrew='iFlightcrew', Cabincrew='iCabincrew', Reichweite='iReichweite', Sitzplaetze='iSitzplaetze', Reisegeschwindigkeit='iReisegeschwindigkeit', Triebwerke='iTriebwerke', TriebwerkartID='iTriebwerkartID'" );
		
			pst.setInt( 1, iID);
			pst.setInt( 2, iNummer);
			pst.setString( 3, sBezeichnung);
			pst.setString( 4, sHersteller);
			pst.setInt( 5, iFlightcrew);
			pst.setInt( 6, iCabincrew);
			pst.setInt( 7, iReichweite);
			pst.setInt( 8, iSitzplaetze);
			pst.setInt( 9, iReisegeschwindigkeit);
			pst.setInt( 10, iTriebwerke);
			pst.setInt( 11, iTriebwerkartID);
			
			pst.execute();
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
      PreparedStatement pst = conn.prepareStatement( "SELECT t1.*,t2.* FROM flugzeugtyp AS t1, triebwerkartid AS t2 WHERE t1.ID=0 AND t1.TriebwerkartID= t2.ID;" );
			ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iNummer  = rs.getInt("Nummer");
				iTriebwerkartID  = rs.getInt("TriebwerkartID");
				iFlightcrew  = rs.getInt("Flightcrew");
				iCabincrew  = rs.getInt("Cabincrew");
				iReichweite  = rs.getInt("Reichweite");
				iSitzplaetze  = rs.getInt("Sitzplätze");
				iReisegeschwindigkeit  = rs.getInt("Reisegeschwindigkeit");
				iTriebwerke  = rs.getInt("Triebwerke");
				sBezeichnung  = rs.getString("Bezeichnung");
				sHersteller  = rs.getString("Hersteller");
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
			PreparedStatement pst = conn.prepareStatement( "SELECT t1.*,t2.* FROM flugzeugtyp AS t1, triebwerkartid AS t2 WHERE t1.TriebwerkartID= t2.ID ORDER BY t1.ID DESC LIMIT 1");
      ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iNummer  = rs.getInt("Nummer");
				iTriebwerkartID  = rs.getInt("TriebwerkartID");
				iFlightcrew  = rs.getInt("Flightcrew");
				iCabincrew  = rs.getInt("Cabincrew");
				iReichweite  = rs.getInt("Reichweite");
				iSitzplaetze  = rs.getInt("Sitzplätze");
				iReisegeschwindigkeit  = rs.getInt("Reisegeschwindigkeit");
				iTriebwerke  = rs.getInt("Triebwerke");
				sBezeichnung  = rs.getString("Bezeichnung");
				sHersteller  = rs.getString("Hersteller");
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
	
	public void ermittleFlugzeugtyp( int iID ) {
		
	}
}
