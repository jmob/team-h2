/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.frames;

import javax.swing.*;

/**
 *
 * @author H.Petersen
 */
public class pnlKunde extends javax.swing.JPanel {

	/**
	 * Creates new form pnlKunde
	 */
	public pnlKunde() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel4 = new javax.swing.JPanel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jTextField10 = new javax.swing.JTextField();
    jTextField11 = new javax.swing.JTextField();
    jTabbedPane1 = new javax.swing.JTabbedPane();
    jPanel5 = new javax.swing.JPanel();
    jComboBox1 = new javax.swing.JComboBox();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    jLabel13 = new javax.swing.JLabel();
    jLabel14 = new javax.swing.JLabel();
    jTextField1 = new javax.swing.JTextField();
    jTextField2 = new javax.swing.JTextField();
    jTextField3 = new javax.swing.JTextField();
    jTextField4 = new javax.swing.JTextField();
    jTextField5 = new javax.swing.JTextField();
    jTextField6 = new javax.swing.JTextField();
    jButton1 = new javax.swing.JButton();
    jPanel6 = new javax.swing.JPanel();
    jLabel15 = new javax.swing.JLabel();
    jLabel16 = new javax.swing.JLabel();
    jLabel17 = new javax.swing.JLabel();
    jTextField12 = new javax.swing.JTextField();
    jTextField13 = new javax.swing.JTextField();
    jTextField14 = new javax.swing.JTextField();
    jPanel7 = new javax.swing.JPanel();
    jLabel18 = new javax.swing.JLabel();
    jLabel19 = new javax.swing.JLabel();
    jLabel20 = new javax.swing.JLabel();
    jLabel21 = new javax.swing.JLabel();
    jTextField15 = new javax.swing.JTextField();
    jTextField16 = new javax.swing.JTextField();
    jCheckBox1 = new javax.swing.JCheckBox();
    jComboBox2 = new javax.swing.JComboBox();

    setMinimumSize(new java.awt.Dimension(500, 455));

    jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel7.setText("Nummer");

    jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel8.setText("Matchcode");

    jTextField10.setName("jtxtfldNummer"); // NOI18N

    jTextField11.setName("jtxtfldMatchcode"); // NOI18N

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel7)
          .addComponent(jLabel8))
        .addGap(44, 44, 44)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
          .addComponent(jTextField11))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel7)
          .addComponent(jTextField10))
        .addGap(18, 18, 18)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel8)
          .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(43, 43, 43))
    );

    jTabbedPane1.setName("jtbdpnAnschrift"); // NOI18N
    jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        jTabbedPane1MousePressed(evt);
      }
    });

    jPanel5.setName("pnlAnschrift"); // NOI18N

    jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel9.setText("Name 1");
    jLabel9.setToolTipText("");
    jLabel9.setName("jlblName1"); // NOI18N

    jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel10.setText("Name 2");
    jLabel10.setName("jlblName2"); // NOI18N

    jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel11.setText("Name 3");
    jLabel11.setName("jlblName3"); // NOI18N

    jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel12.setText("Straße");
    jLabel12.setName("jlblStrasse"); // NOI18N

    jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel13.setText("PLZ / Ort");
    jLabel13.setName("jlblPLZOrt"); // NOI18N

    jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel14.setText("Anrede");

    jTextField1.setName("jtxtfldName1"); // NOI18N

    jTextField2.setName("jtxtfldName2"); // NOI18N

    jTextField3.setName("jtxtfldName3"); // NOI18N

    jTextField4.setName("jtxtfldStrasse"); // NOI18N

    jTextField5.setToolTipText("");
    jTextField5.setName("jtxtfldPLZ"); // NOI18N

    jTextField6.setName("jtxtfldOrt"); // NOI18N

    jButton1.setText("...");
    jButton1.setName("jbtnOrt"); // NOI18N

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel14)
          .addComponent(jLabel9)
          .addComponent(jLabel10)
          .addComponent(jLabel11)
          .addComponent(jLabel12)
          .addComponent(jLabel13))
        .addGap(55, 55, 55)
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jTextField1)
          .addComponent(jTextField2)
          .addComponent(jTextField3)
          .addComponent(jTextField4)
          .addGroup(jPanel5Layout.createSequentialGroup()
            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, Short.MAX_VALUE)))
        .addContainerGap(12, Short.MAX_VALUE))
    );
    jPanel5Layout.setVerticalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel14))
        .addGap(18, 18, 18)
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel9)
          .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel10)
          .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel11)
          .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel12)
          .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel13)
          .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton1))
        .addContainerGap(57, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Anschrift", jPanel5);

    jPanel6.setName("pnlTelefon"); // NOI18N

    jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel15.setText("Telefon");
    jLabel15.setName("jlblTelefon"); // NOI18N

    jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel16.setText("Telefax");
    jLabel16.setName("jlblTelefax"); // NOI18N

    jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel17.setText("Mobil");
    jLabel17.setName("jlblMobil"); // NOI18N

    jTextField12.setName("jtxtfldTelefon"); // NOI18N

    jTextField13.setName("jtxtfldTelefax"); // NOI18N

    jTextField14.setName("jtxtfldMobil"); // NOI18N

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
      jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel6Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel15)
          .addComponent(jLabel16)
          .addComponent(jLabel17))
        .addGap(62, 62, 62)
        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
          .addComponent(jTextField13)
          .addComponent(jTextField14))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel6Layout.setVerticalGroup(
      jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel6Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel15)
          .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel16)
          .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel17)
          .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(174, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Kommunikation", jPanel6);

    jPanel7.setName("pnlAllgemein"); // NOI18N
    jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        jPanel7MousePressed(evt);
      }
    });

    jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel18.setText("Kundenberater");
    jLabel18.setName("jlblKundenberater"); // NOI18N

    jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel19.setText("Kreditlimit");
    jLabel19.setName("jlblKreditlimit"); // NOI18N

    jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel20.setText("Steuernummer");
    jLabel20.setToolTipText("");
    jLabel20.setName("jlblSteuernummer"); // NOI18N

    jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel21.setText("Gesperrt");
    jLabel21.setName("jlblGesperrt"); // NOI18N

    jTextField15.setName("jtxtfldKreditlimit"); // NOI18N

    jTextField16.setName("jtxtfldSteuernummer"); // NOI18N

    jCheckBox1.setName("jchckbxGesperrt"); // NOI18N

    jComboBox2.setName("jcmbxKundenberater"); // NOI18N

    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(
      jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel7Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel7Layout.createSequentialGroup()
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel20)
              .addComponent(jLabel21))
            .addGap(18, 18, 18)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jCheckBox1)))
          .addGroup(jPanel7Layout.createSequentialGroup()
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel18)
              .addComponent(jLabel19))
            .addGap(18, 18, 18)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jTextField15)
              .addComponent(jComboBox2, 0, 215, Short.MAX_VALUE))))
        .addContainerGap(154, Short.MAX_VALUE))
    );
    jPanel7Layout.setVerticalGroup(
      jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel7Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel18)
          .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel19)
          .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel20)
          .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jCheckBox1)
          .addComponent(jLabel21))
        .addContainerGap(135, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Allgemein", jPanel7);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(8, 8, 8)
        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGap(8, 8, 8))
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jTabbedPane1)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(16, Short.MAX_VALUE))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void jTabbedPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MousePressed
    
  }//GEN-LAST:event_jTabbedPane1MousePressed

  private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
    jTabbedPane1.setSelectedIndex( 1 );
  }//GEN-LAST:event_jPanel7MousePressed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JCheckBox jCheckBox1;
  private javax.swing.JComboBox jComboBox1;
  private javax.swing.JComboBox jComboBox2;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel15;
  private javax.swing.JLabel jLabel16;
  private javax.swing.JLabel jLabel17;
  private javax.swing.JLabel jLabel18;
  private javax.swing.JLabel jLabel19;
  private javax.swing.JLabel jLabel20;
  private javax.swing.JLabel jLabel21;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JPanel jPanel6;
  private javax.swing.JPanel jPanel7;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JTextField jTextField1;
  private javax.swing.JTextField jTextField10;
  private javax.swing.JTextField jTextField11;
  private javax.swing.JTextField jTextField12;
  private javax.swing.JTextField jTextField13;
  private javax.swing.JTextField jTextField14;
  private javax.swing.JTextField jTextField15;
  private javax.swing.JTextField jTextField16;
  private javax.swing.JTextField jTextField2;
  private javax.swing.JTextField jTextField3;
  private javax.swing.JTextField jTextField4;
  private javax.swing.JTextField jTextField5;
  private javax.swing.JTextField jTextField6;
  // End of variables declaration//GEN-END:variables
	public void setNummer( int iNummer ) {
		jTextField10.setText( iNummer + "" );
	}
	
	public String getNummer() {
		return jTextField10.getText();
	}

	public void setAnrede( String sAnrede ) {
		jComboBox1.setName( sAnrede );
	}
	
	public String getAnrede() {
		return jComboBox1.getName();
	}

	public void setMatchcode( String sMatchcode ) {
		jTextField11.setText( sMatchcode );
	}
	
	public String getMatchcode() {
		return jTextField11.getText();
	}

	public void setName1( String sName1 ) {
		jTextField1.setText( sName1 );
	}
	
	public String getName1() {
		return jTextField1.getText();
	}

	public void setName2( String sName2 ) {
		jTextField2.setText( sName2 );
	}
	
	public String getName2() {
		return jTextField2.getText();
	}

	public void setName3( String sName3 ) {
		jTextField4.setText( sName3 );
	}
	
	public String getName3() {
		return jTextField3.getText();
	}

	public void setStrasse( String sStrasse ) {
		jTextField4.setText( sStrasse );
	}
	
	public String getStrasse() {
		return jTextField4.getText();
	}

	public void setPLZ( String sPLZ ) {
		jTextField5.setText( sPLZ );
	}
	
	public String getPLZ() {
		return jTextField5.getText();
	}

	public void setOrt( String sOrt ) {
		jTextField6.setText( sOrt );
	}
	
	public String getOrt() {
		return jTextField6.getText();
	}

	public void setTelefon( String sTelefon ) {
		jTextField12.setText( sTelefon );
	}
	
	public String getTelefon() {
		return jTextField12.getText();
	}

	public void setTelefax( String sTelefax ) {
		jTextField13.setText( sTelefax );
	}
	
	public String getTelefax() {
		return jTextField13.getText();
	}

	public void setMobil( String sMobil ) {
		jTextField14.setText( sMobil );
	}
	
	public String getMobil() {
		return jTextField14.getText();
	}

	public void setGesperrt( boolean bGesperrt ) {
		jCheckBox1.setSelected( bGesperrt );
	}
	
	public boolean isGesperrt() {
		return jCheckBox1.isSelected();
	}

	public void setKreditlimit( double dKreditlimit ) {
		jTextField15.setText( dKreditlimit + "" );
	}
	
	public String getKreditlimit() {
		return jTextField15.getText();
	}

	public void setSteuernummer( String sSteuernummer ) {
		jTextField16.setText( sSteuernummer );
	}
	
	public String getSteuernummer() {
		return jTextField16.getText();
	}

	public void setKundenberater( String sKundenbarater ) {
		jComboBox2.setName( sKundenbarater );
	}
	
	public String getKundenberater() {
		return jComboBox2.getName();
	}
}
