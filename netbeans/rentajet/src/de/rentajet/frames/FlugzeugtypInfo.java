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
public class FlugzeugtypInfo {
	private pnlFlugzeugtyp pnlFlugzeugtyp;
	private int iID;
	private int iNummer;
	private int iFlightcrew;
	private int iCabincrew;
	private int iRechweite;
	private int iSitzplaetze;
	private int iReisegeschwindigkeit;
	private int iTriebwerke;
	private int iTriebwerkartID;
	private String sBezeichnung;
	private String sHersteller;
	
	public FlugzeugtypInfo() {
		pnlFlugzeugtyp = new pnlFlugzeugtyp();
	}
	
	public void show( JPanel pnlMain ) {
		H2InternalFrame frmFlugzeugtyp = new H2InternalFrame( "Flugzeugtyp" );
		frmFlugzeugtyp.add( pnlFlugzeugtyp, BorderLayout.CENTER );
		frmFlugzeugtyp.setVisible( true );
		pnlMain.add( frmFlugzeugtyp );
		try {
			frmFlugzeugtyp.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	
}
