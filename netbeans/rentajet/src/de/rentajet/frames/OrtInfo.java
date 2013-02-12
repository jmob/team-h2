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
public class OrtInfo {
	private pnlOrt pnlOrt;
	private int iID;
	private int iPLZ;
	private int iStaatID;
	private String sBezeichnung;
	
	private String sStaat;
	private final Connection conn;
	
		public OrtInfo() {
		conn=javaconnect.ConnectDb();
	}

	public int getiID() {
		return iID;
	}

	public void setiID( int iID ) {
		this.iID = iID;
	}

	public int getiPLZ() {
		return iPLZ;
	}

	public void setiPLZ( int iPLZ ) {
		this.iPLZ = iPLZ;
	}

	public int getiStaatID() {
		return iStaatID;
	}

	public void setiStaatID( int iStaatID ) {
		this.iStaatID = iStaatID;
	}

	public String getsBezeichnung() {
		return sBezeichnung;
	}

	public void setsBezeichnung( String sBezeichnung ) {
		this.sBezeichnung = sBezeichnung;
	}

	public String getsStaat() {
		return sStaat;
	}

	public void setsStaat( String sStaat ) {
		this.sStaat = sStaat;
	}

	public void show( JPanel pnlMain ) {
		pnlOrt = new pnlOrt();
		H2InternalFrame frmOrt = new H2InternalFrame( "Ort" );
		frmOrt.add( pnlOrt, BorderLayout.CENTER );
		frmOrt.setVisible( true );
		pnlMain.add( frmOrt );
		try {
			frmOrt.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	

	private void aktualisiereAnzeige() {
		iPLZ = 0;
		sBezeichnung = "";
		sStaat = "";
		iStaatID = 0;
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
		try {
//				PreparedStatement pst = conn.prepareStatement( "" );
		}
		catch (Exception e) {

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
      PreparedStatement pst = conn.prepareStatement( "SELECT t1.*,t2.* FROM ort AS t1, staat AS t2 WHERE t1.ID=1 AND t1.StaatID= t2.ID;" );
			ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iPLZ  = rs.getInt("PLZ");
				iStaatID  = rs.getInt("StaatID");
				sBezeichnung  = rs.getString("Bezeichnung");
				sStaat  = rs.getString("Bezeichnung");
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
			PreparedStatement pst = conn.prepareStatement( "SELECT t1.*,t2.* FROM ort AS t1, staat AS t2 WHERE t1.StaatID= t2.ID ORDER BY t1.ID DESC LIMIT 1");
      ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iPLZ  = rs.getInt("PLZ");
				iStaatID  = rs.getInt("StaatID");
				sBezeichnung  = rs.getString("Bezeichnung");
				sStaat  = rs.getString("Bezeichnung");	
      }
    }
    catch(Exception e)
    {
      JOptionPane.showMessageDialog(null, e);
    }	
	}
}
