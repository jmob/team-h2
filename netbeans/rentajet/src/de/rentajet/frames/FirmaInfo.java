/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.frames;

import de.rentajet.base.H2InternalFrame;
import de.rentajet.base.javaconnect;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Petersen
 */
public class FirmaInfo {
	private pnlFirma pnlFirma;
	private int iID;
	private int iOrtID;
	private String sBezeichnung;
	private String sName1;
	private String sName2;
	private String sName3;
	private String sStrasse;
	private String sSteuernummer;
	private String sBetriebsnummer;
	private String sUSTIdentNummer;
	private String sTelefon;
	private String sTelefax;
	private String sLogo;
	
	private String sOrt;
	private String sPLZ;
	private int iNummer;
	private final Connection conn;
	PreparedStatement pst=null;
	
		public FirmaInfo() {
		conn=javaconnect.ConnectDb();
	}


	public int getiID() {
		return iID;
	}
	
		public int getiNummer() {
		return iNummer;
	}

	public int getiOrtID() {
		return iOrtID;
	}

	public String getsBezeichnung() {
		return sBezeichnung;
	}

	public String getsName1() {
		return sName1;
	}

	public String getsName2() {
		return sName2;
	}

	public String getsName3() {
		return sName3;
	}

	public String getsStrasse() {
		return sStrasse;
	}

	public String getsSteuernummer() {
		return sSteuernummer;
	}

	public String getsBetriebsnummer() {
		return sBetriebsnummer;
	}

	public String getsUSTIdentNummer() {
		return sUSTIdentNummer;
	}

	public String getsTelefon() {
		return sTelefon;
	}

	public String getsTelefax() {
		return sTelefax;
	}

	public String getsLogo() {
		return sLogo;
	}

	public String getsOrt() {
		return sOrt;
	}

	public String getsPLZ() {
		return sPLZ;
	}

	public void setiID( int iID ) {
		this.iID = iID;
	}
	
	public void setiNummer( int iNummer ) {
		this.iNummer = iNummer;
	}

	public void setiOrtID( int iOrtID ) {
		this.iOrtID = iOrtID;
	}

	public void setsBezeichnung( String sBezeichnung ) {
		this.sBezeichnung = sBezeichnung;
	}

	public void setsName1( String sName1 ) {
		this.sName1 = sName1;
	}

	public void setsName2( String sName2 ) {
		this.sName2 = sName2;
	}

	public void setsName3( String sName3 ) {
		this.sName3 = sName3;
	}

	public void setsStrasse( String sStrasse ) {
		this.sStrasse = sStrasse;
	}

	public void setsSteuernummer( String sSteuernummer ) {
		this.sSteuernummer = sSteuernummer;
	}

	public void setsBetriebsnummer( String sBetriebsnummer ) {
		this.sBetriebsnummer = sBetriebsnummer;
	}

	public void setsUSTIdentNummer( String sUSTIdentNummer ) {
		this.sUSTIdentNummer = sUSTIdentNummer;
	}

	public void setsTelefon( String sTelefon ) {
		this.sTelefon = sTelefon;
	}

	public void setsTelefax( String sTelefax ) {
		this.sTelefax = sTelefax;
	}

	public void setsLogo( String sLogo ) {
		this.sLogo = sLogo;
	}

	public void setsOrt( String sOrt ) {
		this.sOrt = sOrt;
	}

	public void setsPLZ( String sPLZ ) {
		this.sPLZ = sPLZ;
	}

	public String sucheLogo() {
		JFileChooser chooser = new JFileChooser();
    int rueckgabeWert = chooser.showOpenDialog(null);
        
    if(rueckgabeWert == JFileChooser.APPROVE_OPTION)
    {
			return chooser.getSelectedFile().toString();
    }
		return "";
	}
	
	public void show( JPanel pnlMain ) {
		pnlFirma = new pnlFirma();
		H2InternalFrame frmFirma = new H2InternalFrame( "Firma" );
		frmFirma.add( pnlFirma, BorderLayout.CENTER );
		frmFirma.setVisible( true );
		pnlMain.add( frmFirma );
		try {
			frmFirma.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}
	
	private void aktualisiereAnzeige() {
		sBezeichnung = "";
		sName1 = "";
		sName2 = "";
		sName3 = "";
		sStrasse = "";
		sOrt = "";
		sPLZ = "";
		sSteuernummer = "";
		sBetriebsnummer = "";
		sUSTIdentNummer = "";
		sTelefon = "";
		sTelefax = "";
		sLogo = "";
		iOrtID = 0;
		iNummer = 0;
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
			String sql = ("INSERT INTO firma (ID, Nummer OrtID, Bezeichnung, Name1, Name2, Name3, Strasse, Steuernummer, Betriebsnummer, USTIdentNummer Telefon, Telefax, Logo)"
				+ "VALUES('"+iID+"','"+iNummer+"','"+iOrtID+"','"+sBezeichnung+"','"+sName1+"','"+sName2+"','"+sName3+"','"+sStrasse+"','"+sSteuernummer+"','"+sBetriebsnummer+"','"+sUSTIdentNummer+"','"+sTelefon+"','"+sTelefax+"','"+sLogo+"')"
				+	" ON DUPLICATE KEY UPDATE "
				+ "ID='"+iID+"',Nummer='"+iNummer+"',OrtID ='"+iOrtID+"',Bezeichnung = '"+sBezeichnung+"', Name1 ='"+sName1+"', Name2 ='"+sName2+"', Name3='"+sName3+"',Strasse='"+sStrasse+"',Steuernummer='"+sSteuernummer+"',Betriebsnummer='"+sBetriebsnummer+"',USTIdentNummer='"+sUSTIdentNummer+"', Telefon ='"+sTelefon+"', Telefax ='"+sTelefax+"',Logo ='"+sLogo+"'");				
			pst=conn.prepareStatement( sql );
			pst.execute();
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog( null, e);
			}		
		}
		else {
			try {
			String sql = ("INSERT INTO firma (ID, Nummer OrtID, Bezeichnung, Name1, Name2, Name3, Strasse, Steuernummer, Betriebsnummer, USTIdentNummer Telefon, Telefax, Logo)"
				+ "VALUES('"+iID+"','"+iNummer+"','"+iOrtID+"','"+sBezeichnung+"','"+sName1+"','"+sName2+"','"+sName3+"','"+sStrasse+"','"+sSteuernummer+"','"+sBetriebsnummer+"','"+sUSTIdentNummer+"','"+sTelefon+"','"+sTelefax+"','"+sLogo+"')"
				+	" ON DUPLICATE KEY UPDATE "
				+ "ID='"+iID+"',Nummer='"+iNummer+"',OrtID ='"+iOrtID+"',Bezeichnung = '"+sBezeichnung+"', Name1 ='"+sName1+"', Name2 ='"+sName2+"', Name3='"+sName3+"',Strasse='"+sStrasse+"',Steuernummer='"+sSteuernummer+"',Betriebsnummer='"+sBetriebsnummer+"',USTIdentNummer='"+sUSTIdentNummer+"', Telefon ='"+sTelefon+"', Telefax ='"+sTelefax+"',Logo ='"+sLogo+"'");				
			pst=conn.prepareStatement( sql );
			pst.execute();
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog( null, e);
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
      PreparedStatement pst = conn.prepareStatement( "SELECT t1.*,t2.* FROM firma AS t1, ort AS t2 WHERE t1.ID=1 AND t1.OrtID= t2.ID;" );
			ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iOrtID  = rs.getInt("OrtID");
				sBezeichnung  = rs.getString("Bezeichnung");
				sName1  = rs.getString("Name1");
				sName2  = rs.getString("Name2");
				sName3  = rs.getString("Name3");
				sStrasse  = rs.getString("Strasse");
				sSteuernummer  = rs.getString("Steuernummer");
				
				sBetriebsnummer  = rs.getString("Betriebsnummer");
				sUSTIdentNummer  = rs.getString("USTIdentNummer");
				sTelefon  = rs.getString("Telefon");
				sTelefax  = rs.getString("Telefax");
				sLogo  = rs.getString("Logo");
				//sOrt  = rs.getString("Ort");
				//sPLZ  = rs.getString("PLZ");
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
			PreparedStatement pst = conn.prepareStatement( "SELECT t1.*,t2.* FROM firma AS t1, ort AS t2 WHERE t1.OrtID= t2.ID ORDER BY t1.ID DESC LIMIT 1");
      ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iOrtID  = rs.getInt("OrtID");
				sBezeichnung  = rs.getString("Bezeichnung");
				sName1  = rs.getString("Name1");
				sName2  = rs.getString("Name2");
				sName3  = rs.getString("Name3");
				sStrasse  = rs.getString("Strasse");
				sSteuernummer  = rs.getString("Steuernummer");
				
				sBetriebsnummer  = rs.getString("Betriebsnummer");
				sUSTIdentNummer  = rs.getString("USTIdentNummer");
				sTelefon  = rs.getString("Telefon");
				sTelefax  = rs.getString("Telefax");
				sLogo  = rs.getString("Logo");
				//sOrt  = rs.getString("Ort");
				//sPLZ  = rs.getString("PLZ");
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
