
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.text.BadLocationException;

public class ManageEvent extends javax.swing.JFrame {

    boolean TimeOK = false;
    boolean DateOK = false;
    StringBuilder sb = new StringBuilder();
    EncryptionDecryption ED = new EncryptionDecryption();
    DefaultListModel<String> list = new DefaultListModel<>();
    String workingDirectory = System.getProperty("user.dir");
    File dir = new File(workingDirectory + File.separator + "EncDiary Plus" + File.separator + "Events");
    File file = new File(dir + File.separator + "Events[DO_NOT_MODIFY].edp");

    public ManageEvent() {
        initComponents();
        setIcon();
        updateEventList();
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Img/FIcon/event.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        lblDelHead = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEventSubject = new javax.swing.JTextField();
        txtEventDate = new javax.swing.JTextField();
        txtNotes = new javax.swing.JTextField();
        cbEventType = new javax.swing.JComboBox<>();
        btnEventCreate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEvents = new javax.swing.JList<>();
        btnDelEvent = new javax.swing.JButton();
        lblAddHead = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtEventTime = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EncDiary Plus | Manage Events, Reminders, Birthdays");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblDelHead.setFont(new java.awt.Font("Pristina", 1, 20)); // NOI18N
        lblDelHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDelHead.setText("DELETE EVENTS");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Specify Event Type:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Specify Event Subject:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Specify Event Date:");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Event Brief Note:");

        txtEventSubject.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        txtEventSubject.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEventSubject.setToolTipText("Subject");

        txtEventDate.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        txtEventDate.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEventDate.setToolTipText("dd-mm-yyyy");
        txtEventDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEventDateFocusLost(evt);
            }
        });
        txtEventDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEventDateKeyTyped(evt);
            }
        });

        txtNotes.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        txtNotes.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNotes.setToolTipText("Brief Note");

        cbEventType.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        cbEventType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Birthday", "Reminder", "Event   " }));
        cbEventType.setSelectedIndex(2);
        cbEventType.setToolTipText("Select from dropdown list");
        cbEventType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnEventCreate.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnEventCreate.setText("Schedule Event");
        btnEventCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEventCreate.setFocusPainted(false);
        btnEventCreate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEventCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventCreateActionPerformed(evt);
            }
        });

        lstEvents.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lstEvents.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstEvents.setToolTipText("Choose Event");
        lstEvents.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lstEvents.setFocusable(false);
        lstEvents.setVisibleRowCount(10);
        lstEvents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstEventsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstEvents);

        btnDelEvent.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnDelEvent.setText("Remove All Event");
        btnDelEvent.setToolTipText("Remove All Events");
        btnDelEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelEventActionPerformed(evt);
            }
        });

        lblAddHead.setFont(new java.awt.Font("Pristina", 1, 20)); // NOI18N
        lblAddHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddHead.setText("CREATE EVENTS");

        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/back.png"))); // NOI18N
        lblBack.setText("Back to Home");
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBack.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("[ dd-mm-yyyy ]");
        jLabel1.setToolTipText("Year Range[1900-2099]");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtEventTime.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        txtEventTime.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEventTime.setToolTipText("dd-mm-yyyy");
        txtEventTime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEventTimeFocusLost(evt);
            }
        });
        txtEventTime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEventTimeKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Event Time:");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("[ HH:mm:ss ]");
        jLabel7.setToolTipText("24 Hrs. clock time format.");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNotes)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEventTime)
                            .addComponent(cbEventType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEventSubject)
                            .addComponent(txtEventDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addGap(23, 23, 23))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(btnEventCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDelHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(lblAddHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelEvent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddHead)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbEventType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEventSubject))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEventDate)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEventTime)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNotes))
                .addGap(18, 18, 18)
                .addComponent(btnEventCreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblDelHead, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelEvent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEventCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventCreateActionPerformed
        int t = javax.swing.JOptionPane.showConfirmDialog(rootPane, "Confirm details before proceeding.\nDo you wish to continue?", "Create Event", 0);
        if (t == 0) {
            if (txtEventSubject.getText().length() > 1 && txtNotes.getText().length() > 1) {
                if (txtEventDate.getText().length() == 10 && DateOK == true) {
                    if (txtEventTime.getText().length() == 8 && TimeOK == true) {
                        String temp = null;
                        try {
                            FileWriter fw = new FileWriter(file, true);
                            temp = "#_" + txtEventDate.getText() + "_#&_" + txtEventTime.getText() + "_&%_" + cbEventType.getItemAt(cbEventType.getSelectedIndex()) + "_%$<" + txtEventSubject.getText() + ">$ *_" + txtNotes.getText() + "_*";
                            //fw.write(temp+'\n');
                            fw.write(ED.encryptFile(temp) + '\n');
                            fw.close();
                            javax.swing.JOptionPane.showMessageDialog(rootPane, "Event created successfully!", cbEventType.getItemAt(cbEventType.getSelectedIndex()) + " Added", 1);
                            list.removeAllElements();
                            lstEvents.setModel(list);
                            updateEventList();
                        } catch (IOException ex) {
                            javax.swing.JOptionPane.showMessageDialog(null, ex.toString());
                        }
                    } else {
                        javax.swing.JOptionPane.showMessageDialog(rootPane, "Oops! Invalid time format.\nAlways remember to use HH:mm:ss as time format.\nTime Format: 24Hours\nExample Time Format: 08:20:15", "Alert", 2);
                    }
                } else {
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Oops! Invalid date format.\nAlways remember to use dd-mm-yyyy as date format.", "Alert", 2);
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(rootPane, "All fields must be filled to continue!", "Alert", 2);
            }
        }
    }//GEN-LAST:event_btnEventCreateActionPerformed

    private void lstEventsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstEventsMouseClicked
        try {
            String temp = lstEvents.getSelectedValue();
            if (temp != null) {
                int res = javax.swing.JOptionPane.showConfirmDialog(rootPane, "Event description:\n" + temp + "\nDo you wish to update this event?", "Edit Events", 0);
                if (res == 0) {
                    txtEventDate.setText(temp.substring(temp.indexOf("Event Date: ") + 12, temp.indexOf("Event Time: ") - 1));
                    txtEventDate.setText(txtEventDate.getText().trim());
                    txtEventTime.setText(temp.substring(temp.indexOf("Event Time: ") + 12, temp.indexOf("Event Type: ") - 1));
                    String et = temp.substring(temp.indexOf("Event Type: ") + 12, temp.indexOf("Subject: ") - 1);
                    et = et.trim();
                    if (et.matches("Events")) {
                        cbEventType.setSelectedIndex(2);
                    } else if (et.matches("Reminder")) {
                        cbEventType.setSelectedIndex(1);
                    } else if (et.matches("Birthday")) {
                        cbEventType.setSelectedIndex(0);
                    }

                    txtEventSubject.setText(temp.substring(temp.indexOf("Subject: ") + 9, temp.indexOf("Event Info: ")));
                    txtEventSubject.setText(txtEventSubject.getText().trim());
                    txtNotes.setText(temp.substring(temp.indexOf("Event Info: ") + 12, temp.length()));
                }
            }
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_lstEventsMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void btnDelEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelEventActionPerformed
        int temp = javax.swing.JOptionPane.showConfirmDialog(rootPane, "All events will be deleted.\nDo you still wish to continue?", "Event Remove Confirm", 0);
        if (temp == 0) {
            list.removeAllElements();
            lstEvents.setModel(list);
            FileWriter fw;
            try {
                fw = new FileWriter(file);
                fw.close();
            } catch (IOException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, ex.toString());
            }
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Event deleted successflly!");
            updateEventList();
        }
    }//GEN-LAST:event_btnDelEventActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        dispose();
        EncDiaryHome Home = new EncDiaryHome();
        Home.setVisible(true);
    }//GEN-LAST:event_lblBackMouseClicked

    private void txtEventTimeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEventTimeFocusLost
        try {
            if (txtEventTime.getText().length() == 8) {
                if (txtEventTime.getText().charAt(2) == ':' && txtEventTime.getText().charAt(5) == ':') {
                    try {
                        int HH = Integer.parseInt(txtEventTime.getText(0, 2));
                        int mm = Integer.parseInt(txtEventTime.getText(3, 2));
                        int ss = Integer.parseInt(txtEventTime.getText(6, 2));
                        if ((HH < 0 || HH > 24) || (mm < 0 || mm > 59) || (ss < 0 || ss > 59)) {
                            TimeOK = false;
                            javax.swing.JOptionPane.showMessageDialog(rootPane, "Oops! Either hour or minute or second is out of limit.\nPlease use 24 hours clock timing(e.g. 13:20:15)", "Event Time", 2);
                        } else {
                            TimeOK = true;
                        }
                    } catch (NumberFormatException ex) {
                        javax.swing.JOptionPane.showMessageDialog(rootPane, "Aww! Time can only container interger values.\n" + ex.toString(), "Event Time", 2);
                    } catch (BadLocationException ex) {
                        javax.swing.JOptionPane.showMessageDialog(rootPane, "Please use (:) at appropriate place (e.g. HH:mm:ss).\n" + ex.toString(), "Event Time", 2);
                    }
                } else {
                    TimeOK = false;
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Invalid time format.\nFormat required HH:mm:ss(e.g. 08:20:15)", "Event Time", 2);
                }
            }
        } catch (StringIndexOutOfBoundsException ex) {
            TimeOK = false;
            javax.swing.JOptionPane.showMessageDialog(null, "Oops! Invalid time format or length.\n" + ex.toString(), "Event Time", 2);
        }
    }//GEN-LAST:event_txtEventTimeFocusLost

    private void txtEventDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEventDateFocusLost
        try {
            if (txtEventDate.getText().length() == 10) {
                if (txtEventDate.getText().charAt(2) == '-' && txtEventDate.getText().charAt(5) == '-') {
                    try {
                        int day = Integer.parseInt(txtEventDate.getText(0, 2));
                        int month = Integer.parseInt(txtEventDate.getText(3, 2));
                        int year = Integer.parseInt(txtEventDate.getText(6, 4));
                        if ((day < 1 || day > 31) || (month < 1 || month > 12) || (year < 1900 || year > 2099)) {
                            DateOK = false;
                            javax.swing.JOptionPane.showMessageDialog(rootPane, "Oops! Either day, month or year is out of limit.\nPlease use a valid date(e.g. 01-01-2018)\nUse year range from 1900 to 2099.", "Event Date", 2);
                        } else {
                            DateOK = true;
                        }
                    } catch (NumberFormatException ex) {
                        javax.swing.JOptionPane.showMessageDialog(rootPane, "Aww! Date can only container interger values.\n" + ex.toString(), "Event Date", 2);
                    } catch (BadLocationException ex) {
                        javax.swing.JOptionPane.showMessageDialog(rootPane, "Please use (-) at appropriate place (e.g. dd-mm-yyyy).\n" + ex.toString(), "Event Date", 2);
                    }
                } else {
                    DateOK = false;
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Invalid date format.\nFormat required dd-mm-yyyy(e.g. 01-01-2018)", "Event Time", 2);
                }
            }
        } catch (StringIndexOutOfBoundsException ex) {
            DateOK = false;
            javax.swing.JOptionPane.showMessageDialog(null, "Oops! Invalid date format or length.\n" + ex.toString(), "Event Date", 2);
        }
    }//GEN-LAST:event_txtEventDateFocusLost

    private void txtEventDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEventDateKeyTyped
        int txtLen = txtEventDate.getText().length();
        if (txtLen > 9) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEventDateKeyTyped

    private void txtEventTimeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEventTimeKeyTyped
        int txtLen = txtEventTime.getText().length();
        if (txtLen > 7) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEventTimeKeyTyped

    private void updateEventList() {
        try {
            String temp;
            String Dtemp;
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while ((temp = br.readLine()) != null) {
                Dtemp = ED.decryptFile(temp);
                //Making Data Looks Good
                list.addElement(
                        "Event Date: " + Dtemp.substring(Dtemp.indexOf("#_") + 2, Dtemp.indexOf("_#")) + " Event Time: " + Dtemp.substring(Dtemp.indexOf("&_") + 2, Dtemp.indexOf("_&")) + " Event Type: " + Dtemp.substring(Dtemp.indexOf("%_") + 2, Dtemp.indexOf("_%")) + " Subject: " + Dtemp.substring(Dtemp.indexOf("$<") + 2, Dtemp.indexOf(">$")) + " Event Info: " + Dtemp.substring(Dtemp.indexOf("*_") + 2, Dtemp.indexOf("_*"))
                );
                //End
            }
            lstEvents.setModel(list);
            fr.close();
            br.close();
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

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
            java.util.logging.Logger.getLogger(ManageEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ManageEvent().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelEvent;
    private javax.swing.JButton btnEventCreate;
    private javax.swing.JComboBox<String> cbEventType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddHead;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblDelHead;
    private javax.swing.JList<String> lstEvents;
    private javax.swing.JTextField txtEventDate;
    private javax.swing.JTextField txtEventSubject;
    private javax.swing.JTextField txtEventTime;
    private javax.swing.JTextField txtNotes;
    // End of variables declaration//GEN-END:variables
}
