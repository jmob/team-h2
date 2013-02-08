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

	private void leseausAnzeige() {
		iNummer = Util.statischStringNachInt( pnlFlugzeugtyp.getNummer() );
		sBezeichnung = pnlFlugzeugtyp.getBezeichnung();
		sHersteller = pnlFlugzeugtyp.getHersteller();
		iFlightcrew = Util.statischStringNachInt( pnlFlugzeugtyp.getFlightcrew() );
		iCabincrew = Util.statischStringNachInt( pnlFlugzeugtyp.getCabincrew() );
		iReichweite = Util.statischStringNachInt( pnlFlugzeugtyp.getReichweite() );
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
      PreparedStatement pst = conn.prepareStatement( "SELECT t1.*,t2.* FROM flugzeugtyp AS t1, triebwerkartid AS t2 WHERE t1.ID=1 AND t1.TriebwerkartID= t2.ID;" );
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
