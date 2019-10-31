
import java.awt.Color;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EncDiaryHome extends javax.swing.JFrame {

    static int logoutFlag;
    boolean UniversalFlag;
    EncryptionDecryption ED = new EncryptionDecryption();
    StringBuilder sb = new StringBuilder();
    String workingDirectory = System.getProperty("user.dir");
    File dir = new File(workingDirectory + File.separator + "EncDiary Plus" + File.separator + "Events");
    File file = new File(dir + File.separator + "Events[DO_NOT_MODIFY].edp");

    public EncDiaryHome() {
        initComponents();
        setIcon();
        /*Creating Directory and Files*/
        if (dir.isDirectory() && file.exists()) {
            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String temp = br.readLine();
                fr.close();
                br.close();
                if (temp == null) {
                    pnlUpdate.setVisible(false);
                    //javax.swing.JOptionPane.showMessageDialog(rootPane, "No updates for any events.");
                } else {
                    showEventPanel();
                }
            } catch (IOException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, ex.toString());
            }
        } else {
            try {
                dir.mkdir();
                file.createNewFile();
                pnlUpdate.setVisible(false);
            } catch (IOException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
        /**
         * *********************************
         */
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Img/IconPack/home.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNewDiary = new javax.swing.JLabel();
        lblOpenDiary = new javax.swing.JLabel();
        lblEvents = new javax.swing.JLabel();
        lblBackup = new javax.swing.JLabel();
        lblToolTips = new javax.swing.JLabel();
        lblLogOut = new javax.swing.JLabel();
        pnlUpdate = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnClosePanel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        UpdateNote = new javax.swing.JTextArea();
        lblBackgound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EncDiary Plus | Home");
        setAlwaysOnTop(true);
        setForeground(java.awt.SystemColor.activeCaption);

        lblNewDiary.setBackground(java.awt.Color.blue);
        lblNewDiary.setFont(new java.awt.Font("Tempus Sans ITC", 0, 15)); // NOI18N
        lblNewDiary.setForeground(java.awt.Color.orange);
        lblNewDiary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewDiary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/new.png"))); // NOI18N
        lblNewDiary.setLabelFor(this);
        lblNewDiary.setText("Create New Diary");
        lblNewDiary.setToolTipText("Create New Diary");
        lblNewDiary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNewDiary.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNewDiary.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblNewDiary.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblNewDiaryMouseMoved(evt);
            }
        });
        lblNewDiary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNewDiaryMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNewDiaryMouseExited(evt);
            }
        });

        lblOpenDiary.setBackground(java.awt.Color.blue);
        lblOpenDiary.setFont(new java.awt.Font("Tempus Sans ITC", 0, 15)); // NOI18N
        lblOpenDiary.setForeground(java.awt.Color.orange);
        lblOpenDiary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOpenDiary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/open.png"))); // NOI18N
        lblOpenDiary.setLabelFor(this);
        lblOpenDiary.setText("Open Diary");
        lblOpenDiary.setToolTipText("Open Diary");
        lblOpenDiary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOpenDiary.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblOpenDiary.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblOpenDiary.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblOpenDiaryMouseMoved(evt);
            }
        });
        lblOpenDiary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOpenDiaryMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOpenDiaryMouseExited(evt);
            }
        });

        lblEvents.setBackground(java.awt.Color.blue);
        lblEvents.setFont(new java.awt.Font("Tempus Sans ITC", 0, 15)); // NOI18N
        lblEvents.setForeground(java.awt.Color.orange);
        lblEvents.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEvents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/events.png"))); // NOI18N
        lblEvents.setLabelFor(this);
        lblEvents.setText("Manage Events");
        lblEvents.setToolTipText("Create or Manage Events, Reminders, Birthdays etc.");
        lblEvents.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEvents.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblEvents.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblEvents.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblEventsMouseMoved(evt);
            }
        });
        lblEvents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEventsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEventsMouseExited(evt);
            }
        });

        lblBackup.setBackground(java.awt.Color.blue);
        lblBackup.setFont(new java.awt.Font("Tempus Sans ITC", 0, 15)); // NOI18N
        lblBackup.setForeground(java.awt.Color.orange);
        lblBackup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/backup.png"))); // NOI18N
        lblBackup.setLabelFor(this);
        lblBackup.setText("Backup & Restore");
        lblBackup.setToolTipText("Backup & Restore");
        lblBackup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBackup.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblBackup.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblBackupMouseMoved(evt);
            }
        });
        lblBackup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackupMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBackupMouseExited(evt);
            }
        });

        lblToolTips.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        lblToolTips.setForeground(new java.awt.Color(255, 153, 153));
        lblToolTips.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblToolTips.setText("Welcome!");
        lblToolTips.setFocusable(false);
        lblToolTips.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblLogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logout.png"))); // NOI18N
        lblLogOut.setToolTipText("Logout");
        lblLogOut.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogOutMouseExited(evt);
            }
        });

        pnlUpdate.setBackground(new java.awt.Color(226, 231, 255));
        pnlUpdate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnlUpdate.setForeground(new java.awt.Color(102, 153, 0));
        pnlUpdate.setToolTipText("");
        pnlUpdate.setFocusable(false);
        pnlUpdate.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlUpdateMouseMoved(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 2, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Events Update Panel");

        btnClosePanel.setText("Close Panel");
        btnClosePanel.setToolTipText("Close Events Update Panel");
        btnClosePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClosePanel.setFocusPainted(false);
        btnClosePanel.setFocusable(false);
        btnClosePanel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClosePanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClosePanelActionPerformed(evt);
            }
        });

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        UpdateNote.setColumns(20);
        UpdateNote.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        UpdateNote.setRows(5);
        UpdateNote.setTabSize(0);
        UpdateNote.setToolTipText("Today's Event List");
        UpdateNote.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        UpdateNote.setFocusable(false);
        jScrollPane1.setViewportView(UpdateNote);

        javax.swing.GroupLayout pnlUpdateLayout = new javax.swing.GroupLayout(pnlUpdate);
        pnlUpdate.setLayout(pnlUpdateLayout);
        pnlUpdateLayout.setHorizontalGroup(
            pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(btnClosePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlUpdateLayout.setVerticalGroup(
            pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnClosePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblBackgound.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBackgound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/gif/EncDiaryPlus.gif"))); // NOI18N
        lblBackgound.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNewDiary, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(lblOpenDiary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEvents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBackup, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblToolTips, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblBackgound, javax.swing.GroupLayout.PREFERRED_SIZE, 349, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNewDiary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEvents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(lblLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBackup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOpenDiary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addComponent(lblToolTips, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(pnlUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblBackgound, javax.swing.GroupLayout.PREFERRED_SIZE, 445, Short.MAX_VALUE))
        );

        lblLogOut.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showEventPanel() {
        int cnt = 0;
        boolean flag = false;
        /*Setting up Date*/
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        //SimpleDateFormat et =new SimpleDateFormat ("HH:mm:ss"); //24hrs Format
        String todayD = (ft.format(date));
        //String todayT=(et.format(date));
        //System.out.println("HH:mm:ss"+todayT);
        /**
         * ***********
         */
        try {
            String temp = null;
            String Ftemp;
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            do {
                cnt++;
                temp = br.readLine();
                if (temp == null) {
                    break;
                }
                Ftemp = ED.decryptFile(temp);
                String gDate = Ftemp.substring(Ftemp.indexOf("#_") + 2, Ftemp.indexOf("_#"));
                //String gTime=Ftemp.substring(Ftemp.indexOf("&_")+2, Ftemp.indexOf("_&"));
                if (gDate.matches(todayD)) //&& gTime.matches(todayT))
                {
                    flag = true;
                    UpdateNote.setText(UpdateNote.getText() + "Event Date: " + Ftemp.substring(Ftemp.indexOf("#_") + 2, Ftemp.indexOf("_#")) + " Event Time: " + Ftemp.substring(Ftemp.indexOf("&_") + 2, Ftemp.indexOf("_&")) + " Type: " + Ftemp.substring(Ftemp.indexOf("%_") + 2, Ftemp.indexOf("_%")).trim() + " Subject: " + Ftemp.substring(Ftemp.indexOf("$<") + 2, Ftemp.indexOf(">$")) + "\n");
                }
            } while (temp != null);
            fr.close();
            br.close();
            if (flag == true) {
                pnlUpdate.setVisible(true);
                javax.swing.JOptionPane.showMessageDialog(rootPane, "You may have events, birthday or reminder for today!");
            } else {
                pnlUpdate.setVisible(false);
            }
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    private void lblNewDiaryMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewDiaryMouseMoved
        lblNewDiary.setForeground(Color.blue);
        lblToolTips.setText("CLICK HERE TO CREATE A NEW DIARY");
    }//GEN-LAST:event_lblNewDiaryMouseMoved

    private void lblNewDiaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewDiaryMouseClicked
        dispose();
        EncDiaryEditor EDP = new EncDiaryEditor();
        EDP.setVisible(true);
    }//GEN-LAST:event_lblNewDiaryMouseClicked

    private void lblNewDiaryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewDiaryMouseExited
        lblNewDiary.setForeground(Color.darkGray);
        lblToolTips.setText("EncDiary Plus");
    }//GEN-LAST:event_lblNewDiaryMouseExited

    private void lblOpenDiaryMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpenDiaryMouseMoved
        lblOpenDiary.setForeground(Color.blue);
        lblToolTips.setText("CLICK HERE TO OPEN A DIARY");
    }//GEN-LAST:event_lblOpenDiaryMouseMoved

    private void lblOpenDiaryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpenDiaryMouseExited
        lblOpenDiary.setForeground(Color.darkGray);
        lblToolTips.setText("EncDiary Plus");
    }//GEN-LAST:event_lblOpenDiaryMouseExited

    private void lblBackupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackupMouseExited
        lblBackup.setForeground(Color.darkGray);
        lblToolTips.setText("EncDiary Plus");
    }//GEN-LAST:event_lblBackupMouseExited

    private void lblBackupMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackupMouseMoved
        lblBackup.setForeground(Color.blue);
        lblToolTips.setText("CLICK HERE FOR BACKUP & RESTORE DIARY");
    }//GEN-LAST:event_lblBackupMouseMoved

    private void lblLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseClicked
        logoutFlag++;
        if (logoutFlag == 2) {
            dispose();
            AuthenticationWindow WP = new AuthenticationWindow();
            WP.setVisible(true);
        }
    }//GEN-LAST:event_lblLogOutMouseClicked

    private void lblLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseEntered
        lblToolTips.setText("CLICK TWICE HERE TO LOGOUT");
    }//GEN-LAST:event_lblLogOutMouseEntered

    private void lblLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseExited
        lblToolTips.setText("EncDiary Plus");
    }//GEN-LAST:event_lblLogOutMouseExited

    private void lblEventsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEventsMouseExited
        lblEvents.setForeground(Color.darkGray);
        lblToolTips.setText("EncDiary Plus");
    }//GEN-LAST:event_lblEventsMouseExited

    private void lblEventsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEventsMouseMoved
        lblEvents.setForeground(Color.blue);
        lblToolTips.setText("CLICK HERE TO CREATE OR MANAGE EVENTS");
    }//GEN-LAST:event_lblEventsMouseMoved

    private void lblEventsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEventsMouseClicked
        dispose();
        ManageEvent ME = new ManageEvent();
        ME.setVisible(true);
    }//GEN-LAST:event_lblEventsMouseClicked

    private void lblOpenDiaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpenDiaryMouseClicked
        dispose();
        EncDiaryEditor Plus = new EncDiaryEditor();
        Plus.setVisible(true);
        Plus.runFileOpenDialog();
    }//GEN-LAST:event_lblOpenDiaryMouseClicked

    private void lblBackupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackupMouseClicked
        dispose();
        BackupRestore BR = new BackupRestore();
        BR.setVisible(true);
    }//GEN-LAST:event_lblBackupMouseClicked

    private void btnClosePanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClosePanelActionPerformed
        pnlUpdate.setVisible(false);
    }//GEN-LAST:event_btnClosePanelActionPerformed

    private void pnlUpdateMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUpdateMouseMoved
        if (UniversalFlag == false) {
            String temp = "Hello! You've events for today.\nDo you wish to view/manage events?";
            int t = javax.swing.JOptionPane.showConfirmDialog(rootPane, temp, "Events Update", 0);
            if (t == 0) {
                dispose();
                ManageEvent ME = new ManageEvent();
                ME.setVisible(true);
            } else {
                UniversalFlag = true;
            }
        }
    }//GEN-LAST:event_pnlUpdateMouseMoved

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
            java.util.logging.Logger.getLogger(EncDiaryHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncDiaryHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncDiaryHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncDiaryHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncDiaryHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea UpdateNote;
    private javax.swing.JButton btnClosePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBackgound;
    private javax.swing.JLabel lblBackup;
    private javax.swing.JLabel lblEvents;
    private javax.swing.JLabel lblLogOut;
    private javax.swing.JLabel lblNewDiary;
    private javax.swing.JLabel lblOpenDiary;
    private javax.swing.JLabel lblToolTips;
    private javax.swing.JPanel pnlUpdate;
    // End of variables declaration//GEN-END:variables
}
