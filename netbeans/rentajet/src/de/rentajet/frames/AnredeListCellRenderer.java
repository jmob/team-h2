/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.frames;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList; 

/**
 *
 * @author j.schipplick
 */
public class AnredeListCellRenderer extends DefaultListCellRenderer{
	public Component getListCellRendererComponent(
		JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
			super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

			if (value instanceof pnlAnrede) {
				pnlAnrede c = (pnlAnrede) value;
				setText(c.getDdescription());
			}
		return this;
	}
} 	

