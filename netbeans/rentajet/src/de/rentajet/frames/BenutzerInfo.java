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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Petersen
 */
public class BenutzerInfo {
	private pnlBenutzer pnlBenutzer;
	private int iID;
	private int iNummer;
	private int iBenutzergruppeID;
	private int iBenutzergruppe;
	private String sVorname;
	private String sNachname;
	private String sInitialen;
	private String sLogin;
	private String sPasswort;
	private boolean bGesperrt;
	private final Connection conn;
	PreparedStatement pst=null;
	boolean hasNext = false;
	
	public BenutzerInfo() {
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

	public int getiBenutzergruppeID() {
		return iBenutzergruppeID;
	}

	public void setiBenutzergruppeID( int iBenutzergruppeID ) {
		this.iBenutzergruppeID = iBenutzergruppeID;
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

	public String getsInitialen() {
		return sInitialen;
	}

	public void setsInitialen( String sInitialen ) {
		this.sInitialen = sInitialen;
	}

	public String getsLogin() {
		return sLogin;
	}

	public void setsLogin( String sLogin ) {
		this.sLogin = sLogin;
	}

	public String getsPasswort() {
		return sPasswort;
	}

	public void setsPasswort( String sPasswort ) {
		this.sPasswort = sPasswort;
	}

	public boolean isbGesperrt() {
		return bGesperrt;
	}

	public void setbGesperrt( boolean bGesperrt ) {
		this.bGesperrt = bGesperrt;
	}

	public int getiBenutzergruppe() {
		return iBenutzergruppe;
	}

	public void setiBenutzergruppe( int iBenutzergruppe ) {
		this.iBenutzergruppe = iBenutzergruppe;
	}
	
	public void show( JPanel pnlMain ) {
		pnlBenutzer = new pnlBenutzer();
		H2InternalFrame frmBenutzer = new H2InternalFrame( "Benutzer" );
		frmBenutzer.add( pnlBenutzer, BorderLayout.CENTER );
		frmBenutzer.setVisible( true );
		pnlMain.add( frmBenutzer );
		try {
			frmBenutzer.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	
	

	private void aktualisiereAnzeige() {
		iNummer = 0;
		sVorname = "";
		sNachname = "";
		sInitialen = "";
		sLogin = "";
		sPasswort = "";
		bGesperrt = false;
		iBenutzergruppe = 0;
		iBenutzergruppeID = 0;
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
				PreparedStatement pst = conn.prepareStatement( "INSERT INTO benutzer  (Nummer, Vorname, Nachname, Initialen, Login, Passwort, Gesperrt, BenutzergruppeID)"
																											+	"VALUES ('iNummer', 'sVorname', 'sNachname', 'sInitialen', 'sLogin', 'sPasswort', 'bGesperrt', 'iBenutzergruppe')" 
																											+	" ON DUPLICATE KEY UPDATE "
																											+ "Nummer = 'iNummer', Vorname = 'sVorname', Nachname = 'sNachname', Initialen ='sInitialen', Login= 'sLogin', Passwort= 'sPasswort', Gesperrt= 'bGesperrt',BenutzergruppeID= 'iBenutzergruppe'   " );
			
			pst.setInt( 1, iID);
			pst.setInt( 2, iNummer);
			pst.setString( 3, sVorname);
			pst.setString( 4, sNachname);
			pst.setString( 5, sInitialen);
			pst.setString( 6, sLogin);
			pst.setString( 7, sPasswort);
			pst.setBoolean( 8, bGesperrt);
			pst.setInt( 1, iBenutzergruppe);
			
			pst.execute(); 
			}
			catch (Exception e) {
				
			}
		}
		else {
			try {
			PreparedStatement pst = conn.prepareStatement( "INSERT INTO benutzer  (Nummer, Vorname, Nachname, Initialen, Login, Passwort, Gesperrt, BenutzergruppeID)"
																											+	"VALUES ('iNummer', 'sVorname', 'sNachname', 'sInitialen', 'sLogin', 'sPasswort', 'bGesperrt', 'iBenutzergruppe')" 
																											+	" ON DUPLICATE KEY UPDATE "
																											+ "Nummer = 'iNummer', Vorname = 'sVorname', Nachname = 'sNachname', Initialen ='sInitialen', Login= 'sLogin', Passwort= 'sPasswort', Gesperrt= 'bGesperrt',BenutzergruppeID= 'iBenutzergruppe'   " );
			
			pst.setInt( 1, iID);
			pst.setInt( 2, iNummer);
			pst.setString( 3, sVorname);
			pst.setString( 4, sNachname);
			pst.setString( 5, sInitialen);
			pst.setString( 6, sLogin);
			pst.setString( 7, sPasswort);
			pst.setBoolean( 8, bGesperrt);
			pst.setInt( 1, iBenutzergruppe);
			
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
      PreparedStatement pst = conn.prepareStatement( "SELECT * from benutzer WHERE ID=0;" );
      ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iNummer  = rs.getInt("Nummer");
				sVorname = rs.getString("Vorname");	
				sNachname = rs.getString("Nachname");
				sInitialen = rs.getString("Initialen");
				sLogin = rs.getString("Login");
				sPasswort = rs.getString("Passwort");
				bGesperrt = rs.getBoolean( "Gesperrt");
				iBenutzergruppe = rs.getInt("BenutzergruppeID");
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
      PreparedStatement pst = conn.prepareStatement( "SELECT * from benutzer ORDER BY ID DESC LIMIT 1;" );
      ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iNummer  = rs.getInt("Nummer");
				sVorname = rs.getString("Vorname");	
				sNachname = rs.getString("Nachname");
				sInitialen = rs.getString("Initialen");
				sLogin = rs.getString("Login");
				sPasswort = rs.getString("Passwort");
				bGesperrt = rs.getBoolean( "Gesperrt");
				iBenutzergruppe = rs.getInt("BenutzergruppeID");
      }
    }
    catch(Exception e)
    {
      JOptionPane.showMessageDialog(null, e);
    }	
	}
	

		
	public boolean istDatensatzVorhanden( int iNummer) {
		try {
			//Suche nach ID
			String sql = "select * from benutzer where ID = ?";
			PreparedStatement pst=conn.prepareStatement(sql);
			
			pst.setString( 1, Integer.toString(iNummer));
			ResultSet rs = pst.executeQuery();
			
			
			 boolean hasNext = rs.next();
			//if(rs.next()){
				/*String add1= rs.getString("Nachname");
				pnlBenutzer.jTextField4.setText( add1 );
					String add2= rsget.String("Login");
					txt_login.setText( add2 );
					String add3= rs.getString("Passwort");
					txt_pass.setText( add3);
					String add4= rs.getString("Vorname");
					txt_vorname.setText( add4 );
					* return true;
	*/		
		
	
		}
			
		
			
		catch( Exception e ) {
			JOptionPane.showMessageDialog( null, e);
		}	
		
	
		/*if( iNummer == 10 )
			return true;
		else
			return false;
			* 
			*/
	
		if( hasNext == true ) {
			return true;
		}
		else {
			return false;
		} 
		
	}
}
