package de.rentajet.frames;

import de.rentajet.base.H2InternalFrame;
import de.rentajet.base.javaconnect;
import de.rentajet.uti.*;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author H.Petersen
 */
public class KundeInfo {
	private pnlKunde pnlKunde;
	
	//DB Variablen
	private int iID;
	private int iNummer;
	private int iAnredeID;
	private int iOrtID;
	private int iKundenberaterID;
	private String sMatchcode;
	private String sName1;
	private String sName2;
	private String sName3;
	private String sStrasse;
	private String sTelefon;
	private String sTelefax;
	private String sMobil;
	private String sSteuernummer;
	private boolean bGesperrt;
	private double dKreditlimit;
	
	//Sonstige Variablen
	private String sPLZ;
	private String sOrt;
	private String sAnrede;
	private int iKundenberater;
	
	private final Connection conn;

	public KundeInfo() {
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

	public int getiOrtID() {
		return iOrtID;
	}

	public void setiOrtID( int iOrtID ) {
		this.iOrtID = iOrtID;
	}

	public int getiKundenberaterID() {
		return iKundenberaterID;
	}

	public void setiKundenberaterID( int iKundenberaterID ) {
		this.iKundenberaterID = iKundenberaterID;
	}

	public String getsMatchcode() {
		return sMatchcode;
	}

	public void setsMatchcode( String sMatchcode ) {
		this.sMatchcode = sMatchcode;
	}

	public String getsName1() {
		return sName1;
	}

	public void setsName1( String sName1 ) {
		this.sName1 = sName1;
	}

	public String getsName2() {
		return sName2;
	}

	public void setsName2( String sName2 ) {
		this.sName2 = sName2;
	}

	public String getsName3() {
		return sName3;
	}

	public void setsName3( String sName3 ) {
		this.sName3 = sName3;
	}

	public String getsStrasse() {
		return sStrasse;
	}

	public void setsStrasse( String sStrasse ) {
		this.sStrasse = sStrasse;
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

	public String getsSteuernummer() {
		return sSteuernummer;
	}

	public void setsSteuernummer( String sSteuernummer ) {
		this.sSteuernummer = sSteuernummer;
	}

	public boolean isbGesperrt() {
		return bGesperrt;
	}

	public void setbGesperrt( boolean bGesperrt ) {
		this.bGesperrt = bGesperrt;
	}

	public double getdKreditlimit() {
		return dKreditlimit;
	}

	public void setdKreditlimit( double dKreditlimit ) {
		this.dKreditlimit = dKreditlimit;
	}

	public String getsPLZ() {
		return sPLZ;
	}

	public void setsPLZ( String sPLZ ) {
		this.sPLZ = sPLZ;
	}

	public String getsOrt() {
		return sOrt;
	}

	public void setsOrt( String sOrt ) {
		this.sOrt = sOrt;
	}

	public String getsAnrede() {
		return sAnrede;
	}

	public void setsAnrede( String sAnrede ) {
		this.sAnrede = sAnrede;
	}

	public int getiKundenberater() {
		return iKundenberater;
	}

	public void setiKundenberater( int iKundenberater ) {
		this.iKundenberater = iKundenberater;
	}
	
	public void show( JPanel pnlMain ) {
		pnlKunde = new pnlKunde();
		H2InternalFrame frmKunde = new H2InternalFrame( "Kunde" );
		frmKunde.add( pnlKunde, BorderLayout.CENTER );
		frmKunde.setVisible( true );
		pnlMain.add( frmKunde );
		try {
			frmKunde.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
		sAnrede = "";
		sMatchcode = "";
		sName1 = "";
		sName2 = "";
		sName3 = "";
		sStrasse = "";
		sPLZ = "";
		sOrt = "";
		sTelefon = "";
		sTelefax = "";
		sMobil = "";
		iKundenberater = 0;
		dKreditlimit = 0;
		sSteuernummer = "";
		bGesperrt = false;
		iAnredeID = 0;
		iOrtID = 0;
		iKundenberaterID = 0;
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
      PreparedStatement pst = conn.prepareStatement( "SELECT t1.*,t2.*,t3.*,t4.* FROM kunde AS t1, anrede AS t2, ort AS t3, kundenberater AS t4  WHERE t1.ID=1 AND t1.AnredeID= t2.ID AND t1.OrtID= t3.ID AND t1.KundenberaterID= t4.ID ;" );
			ResultSet rs = pst.executeQuery();
      if(rs.next()){
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
       PreparedStatement pst = conn.prepareStatement( "SELECT t1.*,t2.*,t3.*,t4.* FROM kunde AS t1, anrede AS t2, ort AS t3, kundenberater AS t4  WHERE  t1.AnredeID= t2.ID AND t1.OrtID= t3.ID AND t1.KundenberaterID= t4.ID ORDER BY t1.ID DESC LIMIT 1");
			ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iNummer  = rs.getInt("Nummer");
				iAnredeID  = rs.getInt("AnredeID");
				iOrtID  = rs.getInt("OrtID");
				iKundenberaterID  = rs.getInt("KundenberaterID");
				sMatchcode = rs.getString("Matchcode");
				sName1 = rs.getString("Name1");
				sName2 = rs.getString("Name2");
				sName3 = rs.getString("Name3");		
				sStrasse = rs.getString("Strasse");
				sTelefon = rs.getString("Telefon");	
				sTelefax = rs.getString("Telefax");	
				sMobil  = rs.getString("Mobil");
				sSteuernummer  = rs.getString("Steuernummer");
				bGesperrt = rs.getBoolean("Gesperrt");
				dKreditlimit = rs.getInt("Kreditlimit");
      }
    }
    catch(Exception e)
    {
      JOptionPane.showMessageDialog(null, e);
    }		
	}
	
	public boolean istDatensatzVorhanden( int iNummer ) {
		try{
      PreparedStatement pst = conn.prepareStatement( 
				"SELECT t1.*,t2.*,t3.*,t4.* FROM kunde AS t1, anrede AS t2, ort AS t3, "
				+ "kundenberater AS t4  WHERE  t1.AnredeID= t2.ID AND t1.OrtID= t3.ID "
				+ "AND t1.KundenberaterID= t4.ID AND t1.ID = " + iNummer );
			ResultSet rs = pst.executeQuery();
      if( rs.next() ) {
				iID = rs.getInt("ID");
				iNummer  = rs.getInt("Nummer");
				iAnredeID  = rs.getInt("AnredeID");
				iOrtID  = rs.getInt("OrtID");
				iKundenberaterID  = rs.getInt("KundenberaterID");
				sMatchcode = rs.getString("Matchcode");
				sName1 = rs.getString("Name1");
				sName2 = rs.getString("Name2");
				sName3 = rs.getString("Name3");		
				sStrasse = rs.getString("Strasse");
				sTelefon = rs.getString("Telefon");	
				sTelefax = rs.getString("Telefax");	
				sMobil  = rs.getString("Mobil");
				sSteuernummer  = rs.getString("Steuernummer");
				bGesperrt = rs.getBoolean("Gesperrt");
				dKreditlimit = rs.getInt("Kreditlimit");
				return true;
      }
			else 
				aktualisiereAnzeige();
				return false;
    }
    catch(Exception e)
    {
      JOptionPane.showMessageDialog(null, e);
			return false;
    }
	}
}
