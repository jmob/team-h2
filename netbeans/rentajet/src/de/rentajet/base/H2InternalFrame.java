/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.base;

import javax.swing.JInternalFrame;

/**
 *
 * @author Petersen
 */
public class H2InternalFrame extends JInternalFrame {
	
	public H2InternalFrame( String sFenster) {
    super( sFenster,
          false, //resizable
          true, //closable
          false, //maximizable
          false  //iconifiable
		);   
	}
}
