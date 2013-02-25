/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.  XXXX
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
public class PersonalkostenInfo {
	private pnlPersonalkosten pnlPersonalkosten;
	private int iPersonaltypID;
	private int iID;
	private int iNummer;
	private String sBezeichnung;
	private int iArbeitsstunden;
	private double dJahresgehalt;
	private double dStundenlohn;
	private double dStundensatz;
	
	private int iPersonaltypnummer;
	private String sPersonaltyp;
	private final Connection conn;
	PreparedStatement pst=null;
	
		public PersonalkostenInfo() {
		conn=javaconnect.ConnectDb();
	}

	public String getsPersonaltyp() {
		return sPersonaltyp;
	}

	public void setsPersonaltyp( String sPersonaltyp ) {
		this.sPersonaltyp = sPersonaltyp;
	}

	public int getiPersonaltypnummer() {
		return iPersonaltypnummer;
	}

	public void setiPersonaltypnummer( int iPersonaltypnummer ) {
		this.iPersonaltypnummer = iPersonaltypnummer;
	}

	public int getiArbeitsstunden() {
		return iArbeitsstunden;
	}

	public void setiArbeitsstunden( int iArbeitsstunden ) {
		this.iArbeitsstunden = iArbeitsstunden;
	}

	public double getdJahresgehalt() {
		return dJahresgehalt;
	}

	public void setdJahresgehalt( double dJahresgehalt ) {
		this.dJahresgehalt = dJahresgehalt;
	}

	public double getdStundenlohn() {
		return dStundenlohn;
	}

	public void setdStundenlohn( double dStundenlohn ) {
		this.dStundenlohn = dStundenlohn;
	}

	public double getdStundensatz() {
		return dStundensatz;
	}

	public void setdStundensatz( double dStundensatz ) {
		this.dStundensatz = dStundensatz;
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

	public void show( JPanel pnlMain ) {
		pnlPersonalkosten = new pnlPersonalkosten();
		H2InternalFrame frmPersonalkosten = new H2InternalFrame( "Personalkosten" );
		frmPersonalkosten.add( pnlPersonalkosten, BorderLayout.CENTER );
		frmPersonalkosten.setVisible( true );
		pnlMain.add( frmPersonalkosten );
		try {
			frmPersonalkosten.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
		sBezeichnung = "";
		dJahresgehalt = 0;
		iArbeitsstunden = 0;
		dStundenlohn = 0;
		dStundensatz = 0;
		iPersonaltypnummer = 0;
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
			PreparedStatement pst = conn.prepareStatement( "INSERT INTO personalkosten (ID, Nummer, Arbeitsstunden, Jahresgehalt, Stundenlohn, Stundensatz, PersonaltypID, Bezeichnung)"
						+	"VALUES (iID, iNummer, iArbeitsstunden, dJahresgehalt, dStundenlohn, dStundensatz, iPersonaltypID, sBezeichnung)"
						+	" ON DUPLICATE KEY UPDATE "
						+ "ID = 'iID', Nummer = 'iNummer', Arbeitsstunden = 'iArbeitsstunden', Jahresgehalt = 'dJahresgehalt', Stundenlohn='dStundenlohn', Stundensatz='dStundensatz', PersonaltypID='iPersonaltypID', Bezeichnung='sBezeichnung'" );
			pst.setInt( 1, iID);
			pst.setInt( 2, iNummer);
			pst.setInt( 3, iArbeitsstunden);
			pst.setDouble( 4, dJahresgehalt);
			pst.setDouble( 5, dStundenlohn);
			pst.setDouble( 6, dStundensatz);
			pst.setInt( 7, iPersonaltypID);
			pst.setString( 8, sBezeichnung);
			pst.execute();
			}
			catch (Exception e) {
				
			}
		}
		else {
			try {
			PreparedStatement pst = conn.prepareStatement( "INSERT INTO personalkosten (ID, Nummer, Arbeitsstunden, Jahresgehalt, Stundenlohn, Stundensatz, PersonaltypID, Bezeichnung)"
						+	"VALUES (iID, iNummer, iArbeitsstunden, dJahresgehalt, dStundenlohn, dStundensatz, iPersonaltypID, sBezeichnung)"
						+	" ON DUPLICATE KEY UPDATE "
						+ "ID = 'iID', Nummer = 'iNummer', Arbeitsstunden = 'iArbeitsstunden', Jahresgehalt = 'dJahresgehalt', Stundenlohn='dStundenlohn', Stundensatz='dStundensatz', PersonaltypID='iPersonaltypID', Bezeichnung='sBezeichnung'" );
			pst.setInt( 1, iID);
			pst.setInt( 2, iNummer);
			pst.setInt( 3, iArbeitsstunden);
			pst.setDouble( 4, dJahresgehalt);
			pst.setDouble( 5, dStundenlohn);
			pst.setDouble( 6, dStundensatz);
			pst.setInt( 7, iPersonaltypID);
			pst.setString( 8, sBezeichnung);
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
      PreparedStatement pst = conn.prepareStatement( "SELECT t1.*,t2.* FROM personalkosten AS t1, personaltyp AS t2 WHERE t1.ID=0 AND t1.PersonaltypID= t2.ID;" );
			ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iNummer  = rs.getInt("Nummer");
				sBezeichnung  = rs.getString("Bezeichnung");
				iPersonaltypID  = rs.getInt("PersonaltypID");
				iArbeitsstunden  = rs.getInt("Arbeitsstunden");
				dJahresgehalt  = rs.getDouble("Jahresgehalt");
				dStundenlohn  = rs.getDouble("Stundenlohn");
				dStundensatz  = rs.getDouble("Stundensatz");	
	//private int iPersonaltypnummer;
	//private String sPersonaltyp;
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
			PreparedStatement pst = conn.prepareStatement( "SELECT t1.*,t2.* FROM personalkosten AS t1, personaltyp AS t2 WHERE t1.PersonaltypID= t2.ID ORDER BY t1.ID DESC LIMIT 1");
      ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iID = rs.getInt("ID");
				iNummer  = rs.getInt("Nummer");
				sBezeichnung  = rs.getString("Bezeichnung");
				iPersonaltypID  = rs.getInt("PersonaltypID");
				iArbeitsstunden  = rs.getInt("Arbeitsstunden");
				dJahresgehalt  = rs.getDouble("Jahresgehalt");
				dStundenlohn  = rs.getDouble("Stundenlohn");
				dStundensatz  = rs.getDouble("Stundensatz"); 	
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
	
	public void sucheUeberPersonaltyp( int iPersonaltyp ) {
		
	}
}
