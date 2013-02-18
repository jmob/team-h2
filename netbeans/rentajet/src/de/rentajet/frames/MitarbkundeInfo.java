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
public class MitarbkundeInfo {
	private pnlMitarbkunde pnlMitarbkunde;
	private int iID;
	private int iNummer;
	private int iAnredeID;
	private int iKundeID;
	private String sVorname;
	private String sNachname;
	private String sTelefon;
	private String sTelefax;
	private String sMobil;
	private String sInfo;
	
	private String sAnrede;
	private int iKundenummer;
	private String sKunde;
	private final Connection conn;
	
		public MitarbkundeInfo() {
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

	public int getiAnredeID() {
		return iAnredeID;
	}

	public void setiAnredeID( int iAnredeID ) {
		this.iAnredeID = iAnredeID;
	}

	public int getiKundeID() {
		return iKundeID;
	}

	public void setiKundeID( int iKundeID ) {
		this.iKundeID = iKundeID;
	}

	public String getsVorname() {
		return sVorname;
	}

	public void setsVorname( String sVorname ) {
		this.sVorname = sVorname;
	}

	public String getsNachname() {
		return sNachname;
	}

	public void setsNachname( String sNachname ) {
		this.sNachname = sNachname;
	}

	public String getsTelefon() {
		return sTelefon;
	}

	public void setsTelefon( String sTelefon ) {
		this.sTelefon = sTelefon;
	}

	public String getsTelefax() {
		return sTelefax;
	}

	public void setsTelefax( String sTelefax ) {
		this.sTelefax = sTelefax;
	}

	public String getsMobil() {
		return sMobil;
	}

	public void setsMobil( String sMobil ) {
		this.sMobil = sMobil;
	}

	public String getsInfo() {
		return sInfo;
	}

	public void setsInfo( String sInfo ) {
		this.sInfo = sInfo;
	}

	public String getsAnrede() {
		return sAnrede;
	}

	public void setsAnrede( String sAnrede ) {
		this.sAnrede = sAnrede;
	}

	public int getiKundenummer() {
		return iKundenummer;
	}

	public void setiKundenummer( int iKundenummer ) {
		this.iKundenummer = iKundenummer;
	}

	public String getsKunde() {
		return sKunde;
	}

	public void setsKunde( String sKunde ) {
		this.sKunde = sKunde;
	}
	
	public void show( JPanel pnlMain ) {
		pnlMitarbkunde = new pnlMitarbkunde();
		H2InternalFrame frmMitarbkunde = new H2InternalFrame( "Mitarbkunde" );
		frmMitarbkunde.add( pnlMitarbkunde, BorderLayout.CENTER );
		frmMitarbkunde.setVisible( true );
		pnlMain.add( frmMitarbkunde );
		try {
			frmMitarbkunde.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	

	private void aktualisiereAnzeige() {
		iNummer = 0;
		sAnrede = "";
		iKundenummer = 0;
		sVorname = "";
		sNachname = "";
		sInfo = "";
		sTelefon = "";
		sTelefax = "";
		sMobil = "";
		iAnredeID = 0;
		iKundeID = 0;
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
      PreparedStatement pst = conn.prepareStatement( "SELECT t1.*,t2.*,t3.* FROM mitarbkunde AS t1, kunde AS t2, anrede AS t3  WHERE t1.ID=0 AND t1.KundeID= t2.ID AND t1.AnredeID= t3.ID;" );
			ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iNummer  = rs.getInt("Nummer");
				iKundeID  = rs.getInt("KundeID");
				sVorname  = rs.getString("Vorname");
				sNachname  = rs.getString("Nachname");
				sTelefon = rs.getString("Telefon");
				sTelefax = rs.getString("Telefax");
				
				sMobil  = rs.getString("Mobil");
				sInfo  = rs.getString("Info");
				iAnredeID = rs.getInt("AnredeID");
				//iKundenummer = rs.getInt("Kundenummer");
				//sKunde = rs.getString("Kunde");
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
      //PreparedStatement pst = conn.prepareStatement( "SELECT * from zahlungsbedingung ORDER BY ID DESC LIMIT 1;" );
			PreparedStatement pst = conn.prepareStatement( "SELECT t1.*,t2.*,t3.* FROM mitarbkunde AS t1, kunde AS t2, anrede AS t3  WHERE  t1.KundeID= t2.ID AND t1.AnredeID= t3.ID ORDER BY t1.ID DESC LIMIT 1");
      ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iNummer  = rs.getInt("Nummer");
				iKundeID  = rs.getInt("KundeID");
				sVorname  = rs.getString("Vorname");
				sNachname  = rs.getString("Nachname");
				sTelefon = rs.getString("Telefon");
				sTelefax = rs.getString("Telefax");
				
				sMobil  = rs.getString("Mobil");
				sInfo  = rs.getString("Info");
				iAnredeID = rs.getInt("AnredeID");
				//iKundenummer = rs.getInt("Kundenummer");
				//sKunde = rs.getString("Kunde");
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
