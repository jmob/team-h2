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
public class ZahlungsbedingungInfo {
	private pnlZahlungsbedingung pnlZahlungsbedingung;
	private int iID;
	private int iNummer;
	private int iValuta;
	private int iSkontoValuta;
	private double dSkontosatz;
	private String sBezeichnung;
	private String sBelegtext;

	public ZahlungsbedingungInfo() {
		pnlZahlungsbedingung = new pnlZahlungsbedingung();
	}
	
	public void show( JPanel pnlMain ) {
		H2InternalFrame frmZahlungsbedingung = new H2InternalFrame( "Zahlungsbedingung" );
		frmZahlungsbedingung.add( pnlZahlungsbedingung, BorderLayout.CENTER );
		frmZahlungsbedingung.setVisible( true );
		pnlMain.add( frmZahlungsbedingung );
		try {
			frmZahlungsbedingung.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	
}
