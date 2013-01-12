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
public class StaatInfo {
	private pnlStaat pnlStaat;
	private int iID;
	private int iNummer;
	private String sBezeichnung;
	private String sLaendercode;
	private String sPostKuerzel;
	private String sPostName;
	
	public StaatInfo() {
		pnlStaat = new pnlStaat();
	}
	
	public void show( JPanel pnlMain ) {
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
}
