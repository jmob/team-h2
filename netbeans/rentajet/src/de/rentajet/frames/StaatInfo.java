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
public class StaatInfo {
	private pnlStaat pnlStaat;
	private int iID;
	private int iNummer;
	private String sBezeichnung;
	private String sLaendercode;
	private String sPostKuerzel;
	private String sPostName;
	private final Connection conn;
	PreparedStatement pst=null;
	
		public StaatInfo() {
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

	public String getsLaendercode() {
		return sLaendercode;
	}

	public void setsLaendercode( String sLaendercode ) {
		this.sLaendercode = sLaendercode;
	}

	public String getsPostKuerzel() {
		return sPostKuerzel;
	}

	public void setsPostKuerzel( String sPostKuerzel ) {
		this.sPostKuerzel = sPostKuerzel;
	}

	public String getsPostName() {
		return sPostName;
	}

	public void setsPostName( String sPostName ) {
		this.sPostName = sPostName;
	}
	
	public void show( JPanel pnlMain ) {
		pnlStaat = new pnlStaat();
		H2InternalFrame frmStaat = new H2InternalFrame( "Staat" );
		frmStaat.add( pnlStaat, BorderLayout.CENTER );
		frmStaat.setVisible( true );
		pnlMain.add( frmStaat );
		try {
			frmStaat.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	

	private void aktualisiereAnzeige() {
		iNummer = 0;
		sBezeichnung = "";
		sLaendercode = "";
		sPostKuerzel = "";
		sPostName = "";	
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
			String sql = ("INSERT INTO staat (ID, Nummer, Bezeichnung, Laendercode, PostKuerzel, PostName)"
										+ "VALUES('"+iID+"','"+iNummer+"','"+sBezeichnung+"','"+sLaendercode+"','"+sPostKuerzel+"','"+sPostName+"')"
										+	" ON DUPLICATE KEY UPDATE "
										+ "ID ='"+iID+"',Nummer='"+iNummer+"',Bezeichnung='"+sBezeichnung+"',Laendercode='"+sLaendercode+"',PostKuerzel='"+sPostKuerzel+"',PostName='"+sPostName+"'");				
			pst=conn.prepareStatement( sql );
			pst.execute();
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog( null, e);
			}	
		}
		else {
			try {
			String sql = ("INSERT INTO staat (ID, Nummer, Bezeichnung, Laendercode, PostKuerzel, PostName)"
										+ "VALUES('"+iID+"','"+iNummer+"','"+sBezeichnung+"','"+sLaendercode+"','"+sPostKuerzel+"','"+sPostName+"')"
										+	" ON DUPLICATE KEY UPDATE "
										+ "ID ='"+iID+"',Nummer='"+iNummer+"',Bezeichnung='"+sBezeichnung+"',Laendercode='"+sLaendercode+"',PostKuerzel='"+sPostKuerzel+"',PostName='"+sPostName+"'");				
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
      PreparedStatement pst = conn.prepareStatement( "SELECT * from staat WHERE ID=1;" );
      ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iNummer  = rs.getInt("Nummer");
				sBezeichnung = rs.getString("Bezeichnung");
				sLaendercode = rs.getString("Laendercode");
				sPostKuerzel = rs.getString("PostKuerzel");
				sPostName = rs.getString("PostName");
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
      PreparedStatement pst = conn.prepareStatement( "SELECT * from staat ORDER BY ID DESC LIMIT 1;" );
      ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iNummer  = rs.getInt("Nummer");
				sBezeichnung = rs.getString("Bezeichnung");
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
