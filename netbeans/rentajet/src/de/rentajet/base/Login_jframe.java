package de.rentajet.base;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author j.schipplick
 */
import java.sql.*;
import javax.swing.*;
public class Login_jframe extends javax.swing.JFrame {
	Connection conn=null;
	ResultSet rs = null;
	PreparedStatement pst=null;

	/**
	 * Creates new form Login_jframe
	 */
	public Login_jframe() {
		initComponents();
		conn=javaconnect.ConnectDb();
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
    jLabel2 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    txt_username = new javax.swing.JTextField();
    txt_password = new javax.swing.JPasswordField();
    cmd_login = new javax.swing.JButton();
    jLabel3 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(255, 255, 255));
    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), java.awt.Color.cyan)); // NOI18N
    jPanel1.setForeground(new java.awt.Color(255, 255, 255));

    jLabel2.setText("Passwort");

    jLabel1.setText("Benutzer");

    txt_username.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_usernameActionPerformed(evt);
      }
    });

    txt_password.setText("jPasswordField1");
    txt_password.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_passwordActionPerformed(evt);
      }
    });

    cmd_login.setText("Login");
    cmd_login.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmd_loginActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(cmd_login)
              .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
        .addComponent(cmd_login)
        .addGap(23, 23, 23))
    );

    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.gif"))); // NOI18N

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel3)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(227, 227, 227))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(110, 110, 110))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txt_usernameActionPerformed

  private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txt_passwordActionPerformed

  private void cmd_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_loginActionPerformed
    // TODO add your handling code here:
		String sql = "select * from benutzer where Login=? and Passwort=?";
		try{
			pst=conn.prepareStatement(sql);
			pst.setString(1,txt_username.getText());
			pst.setString(2,txt_password.getText());
			
			rs=pst.executeQuery();
			if(rs.next()){
			JOptionPane.showMessageDialog( null, "Benutzername und Passwort sind korrekt");
			//Login_info s= new Login_info();
			FrmMain s= new FrmMain();
			s.setVisible(true);
			}
			else{
				JOptionPane.showMessageDialog( null, "Benutzername und Passwort sind nicht korrekt");
			}
			}
			catch(Exception e)
			{
			JOptionPane.showMessageDialog( null, e);
  }//GEN-LAST:event_cmd_loginActionPerformed
	}
	/**
	 * @param args the command line arguments
	 */
	public static void main( String args[] ) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels() ) {
				if( "Nimbus".equals( info.getName() ) ) {
					javax.swing.UIManager.setLookAndFeel( info.getClassName() );
					break;
				}
			}
		}
		catch( ClassNotFoundException ex ) {
			java.util.logging.Logger.getLogger( Login_jframe.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
		}
		catch( InstantiationException ex ) {
			java.util.logging.Logger.getLogger( Login_jframe.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
		}
		catch( IllegalAccessException ex ) {
			java.util.logging.Logger.getLogger( Login_jframe.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
		}
		catch( javax.swing.UnsupportedLookAndFeelException ex ) {
			java.util.logging.Logger.getLogger( Login_jframe.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater( new Runnable() {
			public void run() {
				new Login_jframe().setVisible( true );
			}
		} );
	}
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton cmd_login;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPasswordField txt_password;
  private javax.swing.JTextField txt_username;
  // End of variables declaration//GEN-END:variables

/*	private static class javaconnect {

		private static Connection ConnectDb() {
			throw new UnsupportedOperationException( "Not yet implemented" );
		}

		public javaconnect() {
		}
	}
*/
	private static class txt_username {

		public txt_username() {
		}
	}
}
