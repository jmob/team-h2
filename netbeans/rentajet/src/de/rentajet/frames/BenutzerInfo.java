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
	boolean hasNext = false;
	//ResultSet rs = null;
	//PreparedStatement pst=null;
	
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
	
	private void leseausAnzeige() {
		iNummer = Util.statischStringNachInt( pnlBenutzer.getNummer() );
		sVorname = pnlBenutzer.getVorname();
		sNachname = pnlBenutzer.getNachname();
		sInitialen = pnlBenutzer.getInitialen();
		sLogin = pnlBenutzer.getLogin();
		sPasswort = pnlBenutzer.getPasswort();
		bGesperrt = pnlBenutzer.isGesperrt();
		iBenutzergruppe = Util.statischStringNachInt( pnlBenutzer.getBenutzergruppe() );
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
	
	
	
	public ArrayList<String> holeerstendatensatz( String sPersonen, String sFlugdatum, String sFlugdatumEnde ) {
		
		System.out.println("holeerstendatensatz " + sPersonen + " " + sFlugdatum + " " + sFlugdatumEnde);
		ArrayList<String> result = new ArrayList<String>();
		try {
			PreparedStatement pst = conn.prepareStatement("SELECT * from benutzer WHERE ID=1");
			
			/*pst.setString( 1, sVorname);
			pst.setString( 2, sNachname);
			pst.setString( 3, sInitialen);
			*/
			
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				result.add(rs.getString( "Vorname" ) + rs.getString( "Nachname") );
			}
		}
		catch( SQLException ex ) {
			Logger.getLogger( BenutzerInfo.class.getName() ).log( Level.SEVERE, null, ex );
		}
		
		
		
		return result;
	}
	
	
	
	public void ersterDatensatzDB() {
		//String sql = "SELECT * from benutzer WHERE ID=1";
		try{
      PreparedStatement pst = conn.prepareStatement( "SELECT * from benutzer WHERE ID=1;" );
      //pst.setString( 1, tmp);
      ResultSet rs = pst.executeQuery();
      if(rs.next()){
				iNummer  = rs.getInt("Nummer");
					//pnlBenutzer.setNummer(iNummer);
				sVorname = rs.getString("Vorname");	
					//pnlBenutzer.setVorname(sVorname);
				sNachname = rs.getString("Nachname");
					//pnlBenutzer.setNachname(sNachname);
				sInitialen = rs.getString("Initialen");
					//pnlBenutzer.setInitialen(sInitialen);
				sLogin = rs.getString("Login");
					//pnlBenutzer.setLogin(sLogin);
				sPasswort = rs.getString("Passwort");
					//pnlBenutzer.setPasswort(sPasswort);
				bGesperrt = rs.getBoolean( "Gesperrt");
					//pnlBenutzer.setGesperrt(bGesperrt);
				iBenutzergruppe = rs.getInt("BenutzergruppeID");
					//pnlBenutzer.setBenutzergruppe(iBenutzergruppeID);
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
