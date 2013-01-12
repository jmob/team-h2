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
public class AnredeInfo {
	private pnlAnrede pnlAnrede;
	private int iID;
	private int iNummer;
	private String sBezeichnung;
	
	public AnredeInfo() {
		pnlAnrede = new pnlAnrede();
	}
	
	public void show( JPanel pnlMain ) {
		H2InternalFrame frmAnrede = new H2InternalFrame( "Anrede" );
		frmAnrede.add( pnlAnrede, BorderLayout.CENTER );
		frmAnrede.setVisible( true );
		pnlMain.add( frmAnrede );
		try {
			frmAnrede.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	
}
