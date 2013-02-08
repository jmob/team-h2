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
public class PersonalInfo {
	private pnlPersonal pnlPersonal;
	private int iID;
	private int iNummer;
	private String sVorname;
	private String sNachname;
	private String sTelefon;
	private String sTelefax;
	private String sMobil;
	private String sInfo;
	private int iPersonaltypID;
	private final Connection conn;
	
		public PersonalInfo() {
		conn=javaconnect.ConnectDb();
	}

	public int getiPersonaltypID() {
		return iPersonaltypID;
	}

	public void setiPersonaltypID( int iPersonaltypID ) {
		this.iPersonaltypID = iPersonaltypID;
	}
	
	private String sAnrede;

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
	
	public void show( JPanel pnlMain ) {
		pnlPersonal = new pnlPersonal();
		H2InternalFrame frmMitarbkunde = new H2InternalFrame( "Personal" );
		frmMitarbkunde.add( pnlPersonal, BorderLayout.CENTER );
		frmMitarbkunde.setVisible( true );
		pnlMain.add( frmMitarbkunde );
		try {
			frmMitarbkunde.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	

	private void leseausAnzeige() {
		iNummer = Util.statischStringNachInt( pnlPersonal.getNummer() );
		sVorname = pnlPersonal.getVorname();
		sNachname = pnlPersonal.getNachname();
		sInfo = pnlPersonal.getInfo();
		sTelefon = pnlPersonal.getTelefon();
		sTelefax = pnlPersonal.getTelefax();
		sMobil = pnlPersonal.getMobil();
	}
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
		sAnrede = "";
		sVorname = "";
		sNachname = "";
		sInfo = "";
		sTelefon = "";
		sTelefax = "";
		sMobil = "";
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
      PreparedStatement pst = conn.prepareStatement( "SELECT t1.*,t2.* FROM personal AS t1, personaltyp AS t2 WHERE t1.ID=1 AND t1.PersonaltypID= t2.ID;" );
			ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iNummer  = rs.getInt("Nummer");
				sVorname  = rs.getString("Vorname");
				sNachname  = rs.getString("Nachname");
				sTelefon  = rs.getString("Telefon");
				sTelefax  = rs.getString("Telefax");
				sMobil  = rs.getString("Mobil");
				sInfo  = rs.getString("Info");
				iPersonaltypID  = rs.getInt("PersonaltypID");
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
			PreparedStatement pst = conn.prepareStatement( "SELECT t1.*,t2.* FROM personal AS t1, personaltyp AS t2 WHERE t1.PersonaltypID= t2.ID ORDER BY t1.ID DESC LIMIT 1");
      ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iNummer  = rs.getInt("Nummer");
				sVorname  = rs.getString("Vorname");
				sNachname  = rs.getString("Nachname");
				sTelefon  = rs.getString("Telefon");
				sTelefax  = rs.getString("Telefax");
				sMobil  = rs.getString("Mobil");
				sInfo  = rs.getString("Info");
				iPersonaltypID  = rs.getInt("PersonaltypID"); 	
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
