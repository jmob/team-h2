/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.kunde;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author H.Petersen
 */
public class frmKunde extends JInternalFrame{
	JPanel pnlHaupt = new JPanel();
	
	public frmKunde() {
		try {
			jbInit();
		}
		catch( Exception e ) {
			
		}
	}

	/**
	 * jbInit initialisiert das Fenster
	 *
	 * @throws java.lang.Exception
	 */
	public void jbInit() throws Exception {
		this.setLocation( 190, 262 );
		this.setSize( 800, 600 );
		this.getContentPane().setLayout( new BorderLayout() );
		this.getContentPane().add( pnlHaupt, BorderLayout.CENTER );

		initialisierePanelHaupt();
	}

	/**
	 * initialisierePanelHaupt initialisiert den Inhalt
	 *
	 * @throws java.lang.Exception
	 */
	public void initialisierePanelHaupt() throws Exception {
		pnlHaupt.setLayout( new BorderLayout() );
	
		pnlKunde Kunde = new pnlKunde();

		pnlHaupt.add( Kunde, BorderLayout.CENTER );
	}
}
