/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.frames;

import de.rentajet.base.H2InternalFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Petersen
 */
public class BenutzergruppeInfo {
	private pnlBenutzergruppe pnlBenutzergruppe;
	private int iID;
	private int iNummer;
	private String sBezeichnung;
	
	public BenutzergruppeInfo() {
		pnlBenutzergruppe = new pnlBenutzergruppe();
	}
	
	public void show( JPanel pnlMain ) {
		H2InternalFrame frmBenutzergruppe = new H2InternalFrame( "Benutzergruppe" );
		frmBenutzergruppe.add( pnlBenutzergruppe, BorderLayout.CENTER );
		frmBenutzergruppe.setVisible( true );
		pnlMain.add( frmBenutzergruppe );
		try {
			frmBenutzergruppe.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	
}
