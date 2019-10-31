
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.net.URL;
import java.net.URLConnection;

public class FTPCredentials extends javax.swing.JFrame {

    /*Making files and directories*/
    String workingDirectory = System.getProperty("user.dir");
    File dir = new File(workingDirectory + File.separator + "EncDiary Plus" + File.separator + "Config");
    File file = new File(dir + File.separator + "FTP_Config.sys");

    /**
     * **************************
     */
    public FTPCredentials() {
        /**
         *
         */
        try {
            String DefaultKey = javax.swing.JOptionPane.showInputDialog(null, "Application will be closed on invalid/wrong attempt.\nEnter default MasterKey[FTP Username]", "MasterKey Authentication", 3);
            if (DefaultKey.matches("*SECURE*")) {
                initComponents();
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Oops! Invalid default FTP username detected.\nApplication will exit now.", "Authentication Failed", 0);
                System.exit(0);
            }
        } catch (NullPointerException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Sorry! Defult FTP username authentication is compulsory to edit FTP configuration.\nApplication will exit now.", "Authentication Failed", 0);
            System.exit(0);
        }
        /*End of Authentication*/
        javax.swing.JOptionPane.showMessageDialog(rootPane, "You can save only one configuration at a time.\nAll your previous configuration will be automatically deleted.", "Alert", 1);
        try {
            dir.mkdir();
            file.createNewFile();
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex.toString());
        }
        setIcon();
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Img/FIcon/ftp.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHostName = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        lblBack = new javax.swing.JLabel();
        btnDefault = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblHelp = new javax.swing.JLabel();
        txtDirName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EncDiary Plus | FTP Configuration");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 17)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>\n<u>FTP Credentials Update</u>\n</html>");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("Enter FTP Host Name :");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("Enter FTP Username  :");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setText("Enter FTP Password   :");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel5.setText("<html>\n<p style=\"color:BLUE\" align=\"center\"><b style=\"color:RED\">IMPORTANT</b><br />Please make sure you have entered correct ftp details. Also make sure upload folder location is correct otherwise simply ignore those field to upload into root folder.\n</html>");

        txtHostName.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtHostName.setToolTipText("FTP Host Name");
        txtHostName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHostNameFocusLost(evt);
            }
        });

        txtUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtUsername.setToolTipText("FTP Username");

        btnSave.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setMaximumSize(new java.awt.Dimension(63, 23));
        btnSave.setMinimumSize(new java.awt.Dimension(63, 23));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtPassword.setToolTipText("FTP Password");

        lblBack.setBackground(new java.awt.Color(204, 204, 255));
        lblBack.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblBack.setForeground(new java.awt.Color(0, 153, 0));
        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/back2.png"))); // NOI18N
        lblBack.setText("Back to Backup & Restore");
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBack.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        btnDefault.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        btnDefault.setText("Reset to Default Configuration");
        btnDefault.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefaultActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel6.setText("FTP Folder Location:");

        lblHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/help.png"))); // NOI18N
        lblHelp.setToolTipText("I can help!");
        lblHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHelp.setPreferredSize(new java.awt.Dimension(16, 20));
        lblHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHelpMouseClicked(evt);
            }
        });

        txtDirName.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtDirName.setText("/");
        txtDirName.setToolTipText("FTP Host Name");
        txtDirName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDirNameFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(137, 137, 137)
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(btnReset))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(88, 88, 88)
                                    .addComponent(btnDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsername)
                                    .addComponent(txtHostName)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(txtDirName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHostName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtDirName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset))
                .addGap(18, 18, 18)
                .addComponent(btnDefault)
                .addGap(27, 27, 27)
                .addComponent(lblBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblHelp.getAccessibleContext().setAccessibleDescription("FTP Folder Help");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        int res = javax.swing.JOptionPane.showConfirmDialog(rootPane, "Do you wish to reset all fields?", "Reset Fields", 0);
        if (res == 0) {
            txtHostName.setText("");
            txtUsername.setText("");
            txtPassword.setText("");
        }
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtHostNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHostNameFocusLost
        if(txtHostName.getText().length()>=5)
        {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Please make sure this address is correct.\nMost common hostname format:\n1) example.com\n2)ftp.example.com\njust make sure you've typed hostname correct.");
        }
    }//GEN-LAST:event_txtHostNameFocusLost

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int res = javax.swing.JOptionPane.showConfirmDialog(rootPane, "Make sure all details are correct. All previous details will be discarded.\nDo you wish to save this FTP configuration?", "Confirmation", 0);
        if (res == 0) {
            EncryptionDecryption ED = new EncryptionDecryption();
            /**
             * ****CREATING STRING*******
             */
            String temp = "<H>" + txtHostName.getText() + "</H><U>" + txtUsername.getText() + "</U><P>" + txtPassword.getText() + "</P><F>" + txtDirName.getText() + "</F>";
            /**
             * **************************
             */
            try {
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(ED.encryptFile(temp));
                fw.close();
                bw.close();
                javax.swing.JOptionPane.showMessageDialog(rootPane, "New ftp configuration saved successfully!\nPlease note that all ongoing backup will be done on this host only.\nYou can delete this host from this page anytime.", "Success", 1);
                dispose();
                BackupRestore BR = new BackupRestore();
                BR.show();
            } catch (Exception ex) {
                javax.swing.JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        dispose();
        BackupRestore BS = new BackupRestore();
        BS.setVisible(true);
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefaultActionPerformed
        int res = javax.swing.JOptionPane.showConfirmDialog(rootPane, "FTP configuration will be reset to default.\nDo you wish to continue?", "Confirmation", 0);
        if (res == 0) {
            try {
                file.delete();
                javax.swing.JOptionPane.showMessageDialog(rootPane, "FTP configuration default setting applied!\nAll ongoing backup will be done on default ftp host.", "Success", 1);
                btnDefault.setEnabled(false);
            } catch (Exception ex) {
                javax.swing.JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
    }//GEN-LAST:event_btnDefaultActionPerformed

    private void lblHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHelpMouseClicked
        javax.swing.JOptionPane.showMessageDialog(rootPane, "FTP Folder on which your files are going to be stored.\nEnter '/' without quote for upload into root directory.\nAlternatively provide a valid ftp folder.", "Help", 1);
    }//GEN-LAST:event_lblHelpMouseClicked

    private void txtDirNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDirNameFocusLost
        //Starts With /
        if (!txtDirName.getText().startsWith("/")) {
            if (txtDirName.getText().length() == 0) {
                txtDirName.setText("/");
            } else {
                txtDirName.setText("/" + txtDirName.getText());
            }
        }
        //Ends With /
        if (!txtDirName.getText().endsWith("/")) {
            if (!txtDirName.getText().matches("/")) {
                txtDirName.setText(txtDirName.getText() + "/");
            }
        }
    }//GEN-LAST:event_txtDirNameFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FTPCredentials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FTPCredentials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FTPCredentials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FTPCredentials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FTPCredentials().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDefault;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblHelp;
    private javax.swing.JTextField txtDirName;
    private javax.swing.JTextField txtHostName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
