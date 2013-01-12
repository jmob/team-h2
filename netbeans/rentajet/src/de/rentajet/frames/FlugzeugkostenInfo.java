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
public class FlugzeugkostenInfo {
	private pnlFlugzeugkosten pnlFlugzeugkosten;
	private int iID;
	private int iNummer;
	private int iFlugzeugID;
	private int iRentabilitaetStd;
	private String sBezeichnung;
	private double dFixkosten;
	private double dFixkostenStd;
	private double dStundensatz;
	
	public FlugzeugkostenInfo() {
		pnlFlugzeugkosten = new pnlFlugzeugkosten();
	}
	
	public void show( JPanel pnlMain ) {
		H2InternalFrame frmFlugzeugkosten = new H2InternalFrame( "Flugzeugkosten" );
		frmFlugzeugkosten.add( pnlFlugzeugkosten, BorderLayout.CENTER );
		frmFlugzeugkosten.setVisible( true );
		pnlMain.add( frmFlugzeugkosten );
		try {
			frmFlugzeugkosten.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	
}
