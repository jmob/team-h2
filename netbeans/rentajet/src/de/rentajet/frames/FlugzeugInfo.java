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
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Petersen
 */
public class FlugzeugInfo {
	private pnlFlugzeug pnlFlugzeug;
	private int iID;
	private int iNummer;
	private int iFlugzeugtypID;
	private int iFlugzeugtyp;
	private String sBezeichnung;
	private String sFoto;
	private final Connection conn;
	PreparedStatement pst=null;
	
		public FlugzeugInfo() {
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

	public String getsBezeichnung() {
		return sBezeichnung;
	}

	public void setsBezeichnung( String sBezeichnung ) {
		this.sBezeichnung = sBezeichnung;
	}

	public String getsFoto() {
		return sFoto;
	}

	public void setsFoto( String sFoto ) {
		this.sFoto = sFoto;
	}

	public int getiFlugzeugtyp() {
		return iFlugzeugtyp;
	}

	public void setiFlugzeugtyp( int iFlugzeugtyp ) {
		this.iFlugzeugtyp = iFlugzeugtyp;
	}

	public String sucheBild() {
		JFileChooser chooser = new JFileChooser();
    int rueckgabeWert = chooser.showOpenDialog(null);
        
    if(rueckgabeWert == JFileChooser.APPROVE_OPTION)
    {
			return chooser.getSelectedFile().toString();
    }
		return "";
	}
	
	public void show( JPanel pnlMain ) {
		pnlFlugzeug = new pnlFlugzeug();
		H2InternalFrame frmFlugzeug = new H2InternalFrame( "Flugzeug" );
		frmFlugzeug.add( pnlFlugzeug, BorderLayout.CENTER );
		frmFlugzeug.setVisible( true );
		pnlMain.add( frmFlugzeug );
		try {
			frmFlugzeug.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	

	private void aktualisiereAnzeige() {
		iNummer = 0;
		sBezeichnung = "";
		iFlugzeugtyp = 0;
		sFoto = "";
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
			String sql = ("INSERT INTO flugzeug (ID, Nummer, Bezeichnung, FlugzeugtypID, Foto)"
																					+ "VALUES('"+iID+"','"+iNummer+"','"+sBezeichnung+"','"+iFlugzeugtypID+"','"+sFoto+"')"
																					+	" ON DUPLICATE KEY UPDATE "
																					+ "ID ='"+iID+"',Nummer='"+iNummer+"',Bezeichnung='"+sBezeichnung+"',FlugzeugtypID='"+iFlugzeugtypID+"',Foto='"+sFoto+"'");				
			pst=conn.prepareStatement( sql );
			pst.execute();
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog( null, e);
			}
		}
		else {
			try {
			String sql = ("INSERT INTO flugzeug (ID, Nummer, Bezeichnung, FlugzeugtypID, Foto)"
																					+ "VALUES('"+iID+"','"+iNummer+"','"+sBezeichnung+"','"+iFlugzeugtypID+"','"+sFoto+"')"
																					+	" ON DUPLICATE KEY UPDATE "
																					+ "ID ='"+iID+"',Nummer='"+iNummer+"',Bezeichnung='"+sBezeichnung+"',FlugzeugtypID='"+iFlugzeugtypID+"',Foto='"+sFoto+"'");				
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
      //PreparedStatement pst = conn.prepareStatement( "SELECT * from zahlungsbedingung WHERE ID=1;" );
      PreparedStatement pst = conn.prepareStatement( "SELECT t1.*,t2.* FROM flugzeug AS t1, flugzeugtyp AS t2 WHERE t1.ID=1 AND t1.FlugzeugtypID= t2.ID;" );
			ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iNummer  = rs.getInt("Nummer");
				iFlugzeugtypID  = rs.getInt("FlugzeugtypID");
				sBezeichnung  = rs.getString("Bezeichnung");
				sFoto  = rs.getString("Foto");
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
			PreparedStatement pst = conn.prepareStatement( "SELECT t1.*,t2.* FROM flugzeug AS t1, flugzeugtyp AS t2 WHERE t1.FlugzeugtypID= t2.ID ORDER BY t1.ID DESC LIMIT 1");
      ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iNummer  = rs.getInt("Nummer");
				iFlugzeugtypID  = rs.getInt("FlugzeugtypID");
				sBezeichnung  = rs.getString("Bezeichnung");
				sFoto  = rs.getString("Foto");
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
