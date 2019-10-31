
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;

public class BackupRestore extends javax.swing.JFrame {

    JFileChooser myFileChooser = new JFileChooser();
    String workingDirectory = System.getProperty("user.dir");
    File dir = new File(workingDirectory + File.separator + "EncDiary Plus" + File.separator + "Diaries");
    File targetFile;
    int cntHover;
        
    /*********INTERNET CONNECTIVITY**********/
    int iNetRes=0;
    Timer T = new Timer(100, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if (iNetRes==1) {
                iNetRes=MainClass.netConnection();
                setTitle("EncDiary Plus | Backup & Restore");
                lblNetALERT.setText("<html><p align=\"center\">SINGLE FILE ALLOWED AT A TIME<br /><span style=\"color:GREEN\">[Internet Connected]</span></p></html>");
                btnBackup.setEnabled(true);
            } else {
                iNetRes=MainClass.netConnection();
                lblNetALERT.setText("Internet not connected. Backup facility unavailable.");
                btnBackup.setEnabled(false);
                setTitle("EncDiary Plus | Backup & Restore [No Internet]");
            }
        }

    });
    /***************************************/

    public BackupRestore() {
        T.start();
        initComponents();
        setIcon();
        myFileChooser.setFileFilter(new FileNameExtensionFilter("EncDiary Files", "edf"));
        myFileChooser.setCurrentDirectory(dir);
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Img/FIcon/backup.png")));
    }

    private void setIconOkay() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Img/IconPack/okay.png")));
    }

    public void setIconWarning() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Img/IconPack/warning.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRestore = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlBackup = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBackup = new javax.swing.JButton();
        lblNetALERT = new javax.swing.JLabel();
        txtFileName = new javax.swing.JTextField();
        btnChoose = new javax.swing.JButton();
        lblHelp = new javax.swing.JLabel();
        lblFTPConfig = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EncDiary Plus | Backup & Restore");
        setResizable(false);

        pnlRestore.setBackground(new java.awt.Color(255, 204, 204));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html>\n<u>Restore from Web Server</u>\n</html>");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html>\n<p align=\"center\">\n<b style=\"color:RED\">Notice: </b>\n<br>\nRestore feature is currently supported through manual download only. You can anytime access your EncDiary from here: <b style=\"color:BLUE;text-decoration:Italic;\">http://encdiary.shubhamkumarsa.com/</b>\n<br />\nYou may require username and password to access your content online.\n<br />\n <b style=\"color:GREEN\">\nUsername: encdiaryplus\n<br />\nPassword: *Your MasterKey*\n</b>\n</p>\n</html>");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout pnlRestoreLayout = new javax.swing.GroupLayout(pnlRestore);
        pnlRestore.setLayout(pnlRestoreLayout);
        pnlRestoreLayout.setHorizontalGroup(
            pnlRestoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRestoreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRestoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        pnlRestoreLayout.setVerticalGroup(
            pnlRestoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRestoreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlBackup.setBackground(new java.awt.Color(204, 204, 255));
        pnlBackup.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlBackupMouseMoved(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>\n<u>Backup to Web Server</u>\n</html>");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Only EncDiary files are allowed for backup. Supported format( *.edf)");

        jLabel5.setText("Note: File once upload can't be deleted. Please be sure before proceeding.");

        btnBackup.setText("Backup");
        btnBackup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackupActionPerformed(evt);
            }
        });

        lblNetALERT.setForeground(new java.awt.Color(255, 0, 51));
        lblNetALERT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNetALERT.setText("SINGLE FILE ALLOWED AT A TIME");

        txtFileName.setEditable(false);
        txtFileName.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtFileName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFileName.setText("Choose file for backup :>");
        txtFileName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFileNameMouseClicked(evt);
            }
        });
        txtFileName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFileNameActionPerformed(evt);
            }
        });

        btnChoose.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnChoose.setText("Choose");
        btnChoose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBackupLayout = new javax.swing.GroupLayout(pnlBackup);
        pnlBackup.setLayout(pnlBackupLayout);
        pnlBackupLayout.setHorizontalGroup(
            pnlBackupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(lblNetALERT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBackupLayout.createSequentialGroup()
                        .addComponent(txtFileName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnChoose))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBackupLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlBackupLayout.setVerticalGroup(
            pnlBackupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNetALERT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChoose)
                    .addComponent(txtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBackup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(24, 24, 24))
        );

        lblHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/help.png"))); // NOI18N
        lblHelp.setToolTipText("I can help!");
        lblHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHelpMouseClicked(evt);
            }
        });

        lblFTPConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ftp_config.png"))); // NOI18N
        lblFTPConfig.setToolTipText("Manual FTP Server Configuration");
        lblFTPConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFTPConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFTPConfigMouseClicked(evt);
            }
        });

        lblBack.setBackground(new java.awt.Color(204, 204, 255));
        lblBack.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblBack.setForeground(new java.awt.Color(0, 153, 0));
        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/back2.png"))); // NOI18N
        lblBack.setText("Back to Home");
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBack.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlRestore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBackup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblFTPConfig)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(lblHelp)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHelp)
                    .addComponent(lblFTPConfig)
                    .addComponent(lblBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRestore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHelpMouseClicked
        javax.swing.JOptionPane.showMessageDialog(rootPane, "You can backup & restore your EncDiary from this window.", "Help | Backup & Restore", 1);
    }//GEN-LAST:event_lblHelpMouseClicked

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        int result = myFileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            targetFile = myFileChooser.getSelectedFile();
            if (targetFile.toString().endsWith("edf")) {
                txtFileName.setText(myFileChooser.getSelectedFile().toString());
            } else {
                javax.swing.JOptionPane.showMessageDialog(rootPane, "Invalid file format!\nOnly EncDiary(.edf) file format allowed.", "Alert", 0);
                targetFile = null;
                txtFileName.setText("Choose EncDiary file for backup :>");
            }
        }
    }//GEN-LAST:event_btnChooseActionPerformed

    private void btnBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackupActionPerformed
        int result = javax.swing.JOptionPane.showConfirmDialog(rootPane, "Do you wish to start backup?", "Backup Confirmation", 0);
        if (result == 0) {
            T.stop();
            btnBackup.setEnabled(false);
            if (targetFile != null) {
                /**
                 * ****************************
                 */
                FTPUpload ftp = new FTPUpload();
                int temp = ftp.Execute(targetFile);
                if (temp == 1) {
                    setIconOkay();
                    txtFileName.setText("Backup successful[ "+targetFile.getName()+" ]. Choose another file to upload :>");
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Backup Successful!\n" + targetFile.getName() + " uploaded successfully!", "Alert", 1);
                    targetFile = null;
                }
                else if(temp==0)
                {
                    setIconWarning();
                }
                /**
                 * ****************************
                 */
                btnBackup.setEnabled(true);
                T.start();
            } else {
                javax.swing.JOptionPane.showMessageDialog(rootPane, "Oops! No file selected.\nPlease select a file to start backup.", "Alert", 2);
                btnBackup.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnBackupActionPerformed

    private void lblFTPConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFTPConfigMouseClicked
        hide();
        FTPCredentials FC = new FTPCredentials();
        FC.setVisible(true);
    }//GEN-LAST:event_lblFTPConfigMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        dispose();
        EncDiaryHome Home = new EncDiaryHome();
        Home.setVisible(true);
    }//GEN-LAST:event_lblBackMouseClicked

    private void txtFileNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFileNameMouseClicked
        btnChoose.doClick();
    }//GEN-LAST:event_txtFileNameMouseClicked

    private void txtFileNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFileNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFileNameActionPerformed

    private void pnlBackupMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackupMouseMoved
        if(cntHover==100)
        {
            setIcon();
            cntHover=0;
        }
        else
        {
            cntHover++;
        }
    }//GEN-LAST:event_pnlBackupMouseMoved

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
            java.util.logging.Logger.getLogger(BackupRestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BackupRestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BackupRestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BackupRestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BackupRestore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBackup;
    private javax.swing.JButton btnChoose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblFTPConfig;
    private javax.swing.JLabel lblHelp;
    public javax.swing.JLabel lblNetALERT;
    private javax.swing.JPanel pnlBackup;
    private javax.swing.JPanel pnlRestore;
    private javax.swing.JTextField txtFileName;
    // End of variables declaration//GEN-END:variables
}
