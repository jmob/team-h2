/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.frames;

import de.rentajet.frames.AnredeListCellRenderer;
import de.rentajet.frames.AnredeInfo;
import de.rentajet.entity.Anrede;
import de.rentajet.uti.Util;
import java.awt.Component;
import javax.swing.*;

/**
 *
 * @author H.Petersen
 */
public class pnlKunde extends javax.swing.JPanel {
	KundeInfo main = new KundeInfo();

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
    bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

    rentajetPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("rentajetPU").createEntityManager();
    anredeQuery = java.beans.Beans.isDesignTime() ? null : rentajetPUEntityManager.createQuery("SELECT a FROM Anrede a");
    anredeList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : anredeQuery.getResultList();
    anredeQuery1 = java.beans.Beans.isDesignTime() ? null : rentajetPUEntityManager.createQuery("SELECT a FROM Anrede a");
    anredeList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : anredeQuery1.getResultList();
    kundeInfo1 = new de.rentajet.frames.KundeInfo();
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
    jTextField7 = new javax.swing.JTextField();
    jButton2 = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
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

    setMinimumSize(new java.awt.Dimension(500, 455));

    jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel7.setText("Nummer");

    jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel8.setText("Matchcode");

    jTextField10.setName("jtxtfldNummer"); // NOI18N
    jTextField10.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        jTextField10FocusLost(evt);
      }
    });

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

    jComboBox1.setRenderer(new DefaultListCellRenderer() {
      @Override
      public Component getListCellRendererComponent(
        JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof Anrede) {
          Anrede mec = (Anrede)value;
          setText(mec.getBezeichnung());
        }
        return this;
      }
    });

    org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, anredeList, jComboBox1, "");
    bindingGroup.addBinding(jComboBoxBinding);

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

    jTextField6.setEditable(false);
    jTextField6.setName("jtxtfldOrt"); // NOI18N

    jButton1.setText("...");
    jButton1.setName("jbtnOrt"); // NOI18N
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

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
        .addContainerGap(67, Short.MAX_VALUE))
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
        .addContainerGap(184, Short.MAX_VALUE))
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

    jButton2.setText("...");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel1.setText(" ");

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
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 145, Short.MAX_VALUE))
              .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        .addContainerGap())
    );
    jPanel7Layout.setVerticalGroup(
      jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel7Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel18)
          .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton2)
          .addComponent(jLabel1))
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
        .addContainerGap(142, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Allgemein", jPanel7);

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
      .addGroup(layout.createSequentialGroup()
        .addGap(8, 8, 8)
        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGap(8, 8, 8))
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jTabbedPane1)
        .addContainerGap())
      .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    bindingGroup.bind();
  }// </editor-fold>//GEN-END:initComponents

  private void jTabbedPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MousePressed
    
  }//GEN-LAST:event_jTabbedPane1MousePressed

  private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
    jTabbedPane1.setSelectedIndex( 1 );
  }//GEN-LAST:event_jPanel7MousePressed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    OrtInfo ort = new OrtInfo();
		ort.sucheDatensatz();
		if( ort.getiID() <= 0 )
			JOptionPane.showMessageDialog(
				null, "Es ist ein Fehler aufgetreten!", "Fehler", 
				JOptionPane.OK_OPTION
			);
		else {
			jTextField5.setText( ort.getiPLZ() + "" );
			jTextField6.setText( ort.getsBezeichnung() );
			
		}  }//GEN-LAST:event_jButton1ActionPerformed

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   KundenberaterInfo kundenberater = new KundenberaterInfo();
		kundenberater.sucheDatensatz();
		if( kundenberater.getiID() <= 0 )
			JOptionPane.showMessageDialog(
				null, "Es ist ein Fehler aufgetreten!", "Fehler", 
				JOptionPane.OK_OPTION
			);
		else {
			jTextField7.setText( kundenberater.getiNummer() + "" );
			jLabel1.setText( kundenberater.getsNachname() );
		}
  }//GEN-LAST:event_jButton2ActionPerformed

  private void jTextField10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusLost
    int iNummer = Util.statischStringNachInt( jTextField10.getText());
		main.istDatensatzVorhanden( iNummer );
		setzeAnzeige();
		setNummer( iNummer );
  }//GEN-LAST:event_jTextField10FocusLost

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
		setAnrede( main.getsAnrede() );
		setMatchcode( main.getsMatchcode() );
		setName1( main.getsName1() );
		setName2( main.getsName2() );
		setName3( main.getsName3() );
		setStrasse( main.getsStrasse() );
		setPLZ( main.getsPLZ() );
		setOrt( main.getsOrt() );
		setTelefon( main.getsTelefon() );
		setTelefax( main.getsTelefax() );
		setMobil( main.getsMobil() );
		setKundenberater( main.getiKundenberater() );
		setKreditlimit( main.getdKreditlimit() );
		setSteuernummer( main.getsSteuernummer() );
		setGesperrt( main.isbGesperrt() );
	}
	
		
	private void leseausAnzeige() {
		main.setiNummer( Util.statischStringNachInt( getMatchcode() ));
		main.setsAnrede( getAnrede() );
		main.setsMatchcode( getMatchcode() );
		main.setsName1( getName1() );
		main.setsName2( getName2() );
		main.setsName3( getName3() );
		main.setsStrasse( getStrasse() );
		main.setsPLZ( getPLZ() );
		main.setsOrt( getOrt() );
		main.setsTelefon( getTelefon() );
		main.setsTelefax( getTelefax() );
		main.setsMobil( getMobil() );
//		main.setiKundenberaterID( Util.statischStringNachInt( getKundenberater() ));
		main.setdKreditlimit( Util.statischStringNachDouble( getKreditlimit(), 2 ));
		main.setsSteuernummer( getSteuernummer() );
		main.setbGesperrt( isGesperrt() );		
	}
	
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private java.util.List<de.rentajet.entity.Anrede> anredeList;
  private java.util.List<de.rentajet.entity.Anrede> anredeList1;
  private javax.persistence.Query anredeQuery;
  private javax.persistence.Query anredeQuery1;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton17;
  private javax.swing.JButton jButton18;
  private javax.swing.JButton jButton19;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton20;
  private javax.swing.JButton jButton21;
  private javax.swing.JButton jButton22;
  private javax.swing.JButton jButton23;
  private javax.swing.JButton jButton24;
  private javax.swing.JButton jButton25;
  private javax.swing.JButton jButton26;
  private javax.swing.JButton jButton27;
  private javax.swing.JCheckBox jCheckBox1;
  private javax.swing.JComboBox jComboBox1;
  private javax.swing.JLabel jLabel1;
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
  private javax.swing.JToolBar.Separator jSeparator5;
  private javax.swing.JToolBar.Separator jSeparator6;
  private javax.swing.JToolBar.Separator jSeparator7;
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
  private javax.swing.JTextField jTextField7;
  private javax.swing.JToolBar jToolBar1;
  private de.rentajet.frames.KundeInfo kundeInfo1;
  private javax.persistence.EntityManager rentajetPUEntityManager;
  private org.jdesktop.beansbinding.BindingGroup bindingGroup;
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

	public void setKundenberater( int iKundenbarater ) {
		jTextField7.setText( iKundenbarater + "" );
	}
	
	public String getKundenberater() {
		return jTextField7.getName();
	}
}
