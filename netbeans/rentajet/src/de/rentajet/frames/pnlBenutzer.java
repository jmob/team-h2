/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.frames;

import de.rentajet.uti.Util;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Petersen
 */
public class pnlBenutzer extends javax.swing.JPanel {
	BenutzerInfo main = new BenutzerInfo();

	/**
	 * Creates new form pnlBenutzer
	 */
	public pnlBenutzer() {
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

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jTextField3 = new javax.swing.JTextField();
    jTextField4 = new javax.swing.JTextField();
    jTabbedPane1 = new javax.swing.JTabbedPane();
    jPanel2 = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jTextField1 = new javax.swing.JTextField();
    jTextField2 = new javax.swing.JTextField();
    jCheckBox1 = new javax.swing.JCheckBox();
    jButton1 = new javax.swing.JButton();
    jTextField6 = new javax.swing.JTextField();
    jLabel9 = new javax.swing.JLabel();
    jPanel3 = new javax.swing.JPanel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jTextField5 = new javax.swing.JTextField();
    jPasswordField1 = new javax.swing.JPasswordField();
    jToolBar1 = new javax.swing.JToolBar();
    jButton17 = new javax.swing.JButton();
    jSeparator5 = new javax.swing.JToolBar.Separator();
    jButton18 = new javax.swing.JButton();
    jButton19 = new javax.swing.JButton();
    jButton20 = new javax.swing.JButton();
    jButton21 = new javax.swing.JButton();
    jButton22 = new javax.swing.JButton();
    jSeparator6 = new javax.swing.JToolBar.Separator();
    jButton23 = new javax.swing.JButton();
    jButton24 = new javax.swing.JButton();
    jButton25 = new javax.swing.JButton();
    jButton26 = new javax.swing.JButton();
    jSeparator7 = new javax.swing.JToolBar.Separator();
    jButton27 = new javax.swing.JButton();

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel1.setText("Nummer");

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel2.setText("Nachname");

    jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        jTextField3FocusLost(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jTextField3)
          .addComponent(jTextField4))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(43, Short.MAX_VALUE))
    );

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel3.setText("Vorname");

    jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel4.setText("Initialen");

    jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel5.setText("Benutzergruppe");

    jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel6.setText("Gesperrt");

    jButton1.setText("...");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel9.setText(" ");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
          .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jTextField1)
          .addComponent(jTextField2)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jCheckBox1)
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(jButton1)
          .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel9))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6)
          .addComponent(jCheckBox1))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Allgemein", jPanel2);

    jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel7.setText("Login");

    jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel8.setText("Passwort");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jTextField5)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 132, Short.MAX_VALUE)))
        .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7)
          .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel8)
          .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(87, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Login", jPanel3);

    jToolBar1.setRollover(true);

    jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/rentajet/bilder/24/st/drucker_24st.gif"))); // NOI18N
    jButton17.setFocusable(false);
    jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton17.setName("btnDrucken"); // NOI18N
    jButton17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jButton17.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton17ActionPerformed(evt);
      }
    });
    jToolBar1.add(jButton17);
    jToolBar1.add(jSeparator5);

    jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/rentajet/bilder/24/st/vcrbegin_24st.gif"))); // NOI18N
    jButton18.setFocusable(false);
    jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton18.setName("btnErster"); // NOI18N
    jButton18.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jButton18.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton18ActionPerformed(evt);
      }
    });
    jToolBar1.add(jButton18);

    jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/rentajet/bilder/24/st/vcrback_24st.gif"))); // NOI18N
    jButton19.setFocusable(false);
    jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton19.setName("btnVorheriger"); // NOI18N
    jButton19.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jButton19.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton19ActionPerformed(evt);
      }
    });
    jToolBar1.add(jButton19);

    jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/rentajet/bilder/24/st/vcrforward_24st.gif"))); // NOI18N
    jButton20.setFocusable(false);
    jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton20.setName("btnNaechster"); // NOI18N
    jButton20.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jButton20.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton20ActionPerformed(evt);
      }
    });
    jToolBar1.add(jButton20);

    jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/rentajet/bilder/24/st/vcrend_24st.gif"))); // NOI18N
    jButton21.setFocusable(false);
    jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton21.setName("btnLetzter"); // NOI18N
    jButton21.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jButton21.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton21ActionPerformed(evt);
      }
    });
    jToolBar1.add(jButton21);

    jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/rentajet/bilder/24/st/row_24st.gif"))); // NOI18N
    jButton22.setFocusable(false);
    jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton22.setName("btnSuche"); // NOI18N
    jButton22.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jButton22.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton22ActionPerformed(evt);
      }
    });
    jToolBar1.add(jButton22);
    jToolBar1.add(jSeparator6);

    jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/rentajet/bilder/24/st/save_24st.gif"))); // NOI18N
    jButton23.setFocusable(false);
    jButton23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton23.setName("btnSpeichern"); // NOI18N
    jButton23.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jButton23.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton23ActionPerformed(evt);
      }
    });
    jToolBar1.add(jButton23);

    jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/rentajet/bilder/24/st/erase2_24st.gif"))); // NOI18N
    jButton24.setFocusable(false);
    jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton24.setName("btnAbbrechen"); // NOI18N
    jButton24.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jButton24.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton24ActionPerformed(evt);
      }
    });
    jToolBar1.add(jButton24);

    jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/rentajet/bilder/24/st/deleterow_24st.gif"))); // NOI18N
    jButton25.setFocusable(false);
    jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton25.setName("btnLöschen"); // NOI18N
    jButton25.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jButton25.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton25ActionPerformed(evt);
      }
    });
    jToolBar1.add(jButton25);

    jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/rentajet/bilder/24/st/partie_24st.gif"))); // NOI18N
    jButton26.setFocusable(false);
    jButton26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton26.setName("btnAktualisieren"); // NOI18N
    jButton26.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jButton26.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton26ActionPerformed(evt);
      }
    });
    jToolBar1.add(jButton26);
    jToolBar1.add(jSeparator7);

    jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/rentajet/bilder/24/st/schrank1_24st.gif"))); // NOI18N
    jButton27.setFocusable(false);
    jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton27.setName("btnArchiv"); // NOI18N
    jButton27.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jButton27.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton27ActionPerformed(evt);
      }
    });
    jToolBar1.add(jButton27);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jTabbedPane1)
          .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
      .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jTabbedPane1)
        .addContainerGap())
    );
  }// </editor-fold>//GEN-END:initComponents

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    BenutzergruppeInfo benutzergruppe = new BenutzergruppeInfo();
		benutzergruppe.sucheDatensatz();
		if( benutzergruppe.getiID() <= 0 )
			JOptionPane.showMessageDialog(
				null, "Er ist ein Fehler aufgetreten!", "Fehler", 
				JOptionPane.OK_OPTION
			);
		else {
			jTextField6.setText( benutzergruppe.getiNummer() + "" );
			jLabel9.setText( benutzergruppe.getsBezeichnung() );
		}
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
    if( main.istDatensatzVorhanden( Util.statischStringNachInt( jTextField3.getText())) ) {
			jTextField3.setEnabled( false );
		}
  }//GEN-LAST:event_jTextField3FocusLost

  private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
    main.drucken();
  }//GEN-LAST:event_jButton17ActionPerformed

  private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
    main.ersterDatensatz();
		setzeAnzeige();
  }//GEN-LAST:event_jButton18ActionPerformed

  private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
    main.vorherigerdatensatz();
		setzeAnzeige();
  }//GEN-LAST:event_jButton19ActionPerformed

  private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
    main.naechsterDatensatz();
		setzeAnzeige();
  }//GEN-LAST:event_jButton20ActionPerformed

  private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
    main.letzterDatensatz();
		setzeAnzeige();
  }//GEN-LAST:event_jButton21ActionPerformed

  private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
    main.sucheDatensatz();
		setzeAnzeige();
  }//GEN-LAST:event_jButton22ActionPerformed

  private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
    int iNummer = Util.statischStringNachInt( getNummer() );
		leseausAnzeige();
		main.speichern( iNummer );
		setzeAnzeige();
  }//GEN-LAST:event_jButton23ActionPerformed

  private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
    main.abbrechen();
		setzeAnzeige();
  }//GEN-LAST:event_jButton24ActionPerformed

  private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
    int iNummer = Util.statischStringNachInt( getNummer() );
		main.loeschen( iNummer );
		setzeAnzeige();
  }//GEN-LAST:event_jButton25ActionPerformed

  private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
    setzeAnzeige();
  }//GEN-LAST:event_jButton26ActionPerformed

  private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
    main.zeigeArchiv();
  }//GEN-LAST:event_jButton27ActionPerformed

	private void setzeAnzeige() {
		setNummer( main.getiNummer() );
		setVorname( main.getsVorname() );
		setNachname( main.getsNachname() );
		setInitialen( main.getsInitialen() );
		setLogin( main.getsLogin() );
		setPasswort( main.getsPasswort() );
		setGesperrt( main.isbGesperrt() );
		setBenutzergruppe( main.getiBenutzergruppe() );
	}

	private void leseausAnzeige() {
		main.setiNummer( Util.statischStringNachInt( getNummer() ) );
		main.setsVorname( getVorname() );
		main.setsNachname( getNachname() );
		main.setsInitialen( getInitialen() );
		main.setsLogin( getLogin() );
		main.setsPasswort( getPasswort() );
		main.setbGesperrt( isGesperrt() );
		main.setiBenutzergruppe( Util.statischStringNachInt( getBenutzergruppe() ) );
	}
	
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton17;
  private javax.swing.JButton jButton18;
  private javax.swing.JButton jButton19;
  private javax.swing.JButton jButton20;
  private javax.swing.JButton jButton21;
  private javax.swing.JButton jButton22;
  private javax.swing.JButton jButton23;
  private javax.swing.JButton jButton24;
  private javax.swing.JButton jButton25;
  private javax.swing.JButton jButton26;
  private javax.swing.JButton jButton27;
  private javax.swing.JCheckBox jCheckBox1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPasswordField jPasswordField1;
  private javax.swing.JToolBar.Separator jSeparator5;
  private javax.swing.JToolBar.Separator jSeparator6;
  private javax.swing.JToolBar.Separator jSeparator7;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JTextField jTextField1;
  private javax.swing.JTextField jTextField2;
  private javax.swing.JTextField jTextField3;
  private javax.swing.JTextField jTextField4;
  private javax.swing.JTextField jTextField5;
  private javax.swing.JTextField jTextField6;
  private javax.swing.JToolBar jToolBar1;
  // End of variables declaration//GEN-END:variables
	public void setNummer( int iNummer ) {
		jTextField3.setText( iNummer + "" );
	}
	
	public String getNummer() {
		return jTextField3.getText();
	}

	public void setNachname( String sNachname ) {
		jTextField4.setText( sNachname );
	}
	
	public String getNachname() {
		return jTextField4.getText();
	}

	public void setVorname( String sVorname ) {
		jTextField1.setText( sVorname );
	}
	
	public String getVorname() {
		return jTextField1.getText();
	}

	public void setInitialen( String sInitialen ) {
		jTextField2.setText( sInitialen );
	}
	
	public String getInitialen() {
		return jTextField2.getText();
	}

	public void setLogin( String sLogin ) {
		jTextField5.setText( sLogin );
	}
	
	public String getLogin() {
		return jTextField5.getText();
	}

	public void setPasswort( String sPasswort ) {
		jPasswordField1.setText( sPasswort );
	}
	
	public String getPasswort() {
		return jPasswordField1.getText();
	}

	public void setBenutzergruppe( int iBenutzergruppe ) {
		jTextField6.setText( iBenutzergruppe + "" );
	}
	
	public String getBenutzergruppe() {
		return jTextField6.getText();
	}

	public void setGesperrt( boolean bGesperrt ) {
		jCheckBox1.setSelected( bGesperrt );
	}
	
	public boolean isGesperrt() {
		return jCheckBox1.isSelected();
	}
	
	public JPanel getPanel() {
		return this;
	}

}
