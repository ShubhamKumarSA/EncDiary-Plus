
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class EncDiaryEditor extends javax.swing.JFrame {

    boolean status;
    EncryptionDecryption ED = new EncryptionDecryption();
    JFileChooser myFileChooser = new JFileChooser();
    String workingDirectory = System.getProperty("user.dir");
    File dir = new File(workingDirectory + File.separator + "EncDiary Plus" + File.separator + "Diaries");
    StringBuilder SB = new StringBuilder();
    StringBuilder keyStr = new StringBuilder();
    File targetFile;
    int cnt = 0;

    public EncDiaryEditor() {
        /*Validating MasterKey*/
        File TempDir = new File(workingDirectory + File.separator + "EncDiary Plus" + File.separator + "Config");
        File TempFile = new File(TempDir + File.separator + "FTP_Config.sys");
        String MKeyInput = "", MKeyFile = "epiz_20999466";
        if (TempDir.isDirectory() && TempFile.isFile()) {
            try {
                FileReader fr = new FileReader(TempFile);
                BufferedReader br = new BufferedReader(fr);
                String temp = br.readLine();
                br.close();
                fr.close();
                if (temp != null) {
                    temp = ED.decryptFile(temp);
                    MKeyFile = temp.substring(temp.indexOf("<U>") + 3, temp.indexOf("</U>"));
                }
            } catch (Exception ex) {
                javax.swing.JOptionPane.showMessageDialog(null, ex.toString());
                System.exit(0);
            }
        }
        try {
            MKeyInput = javax.swing.JOptionPane.showInputDialog(null, "Application will be closed on invalid/wrong attempt.\nEnter MasterKey[FTP Username]", "MasterKey Authentication", 3);
            if (MKeyInput.matches("epiz_20999466") || MKeyFile.matches(MKeyInput)) {
                initComponents();
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Oops! Invalid MasterKey detected.\nApplication will exit now.", "Authentication Failed", 0);
                System.exit(0);
            }
        } catch (NullPointerException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Sorry! MasterKey authentication is compulsory.\nApplication will exit now.", "Authentication Failed", 0);
            System.exit(0);
        }
        /*End of Validation*/

        if (!dir.exists()) {
            dir.mkdir();
        }
        myFileChooser.setFileFilter(new FileNameExtensionFilter("EncDiary Files", "edf"));
        myFileChooser.setCurrentDirectory(dir);
        setIconNew();
        //TipsWorker();   //Start showing tips

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        EncNote = new javax.swing.JTextArea();
        DiaryToolBar = new javax.swing.JToolBar();
        lblNew = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        lblOpen = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        lblSave = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        lblSaveAs = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        lblClose = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        lblHelp = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        lblFont = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        lblBack = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        lblPAssistant = new javax.swing.JLabel();
        txtTips = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EncDiary Plus");
        setState(2);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        EncNote.setColumns(20);
        EncNote.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        EncNote.setLineWrap(true);
        EncNote.setRows(5);
        jScrollPane1.setViewportView(EncNote);

        DiaryToolBar.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        DiaryToolBar.setBorder(null);
        DiaryToolBar.setFloatable(false);
        DiaryToolBar.setRollover(true);
        DiaryToolBar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        lblNew.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/NewFile.png"))); // NOI18N
        lblNew.setToolTipText("New");
        lblNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNew.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNewMouseClicked(evt);
            }
        });
        DiaryToolBar.add(lblNew);
        DiaryToolBar.add(jSeparator3);

        lblOpen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/OpenFile.png"))); // NOI18N
        lblOpen.setToolTipText("Open");
        lblOpen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblOpen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOpenMouseClicked(evt);
            }
        });
        DiaryToolBar.add(lblOpen);
        DiaryToolBar.add(jSeparator2);

        lblSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/SaveFile.png"))); // NOI18N
        lblSave.setToolTipText("Save");
        lblSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblSave.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSaveMouseClicked(evt);
            }
        });
        DiaryToolBar.add(lblSave);
        DiaryToolBar.add(jSeparator1);

        lblSaveAs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaveAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/SaveAsFile.png"))); // NOI18N
        lblSaveAs.setToolTipText("Save As");
        lblSaveAs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSaveAs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblSaveAs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSaveAsMouseClicked(evt);
            }
        });
        DiaryToolBar.add(lblSaveAs);

        jSeparator4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        DiaryToolBar.add(jSeparator4);

        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/CloseFile.png"))); // NOI18N
        lblClose.setToolTipText("Close");
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblClose.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        DiaryToolBar.add(lblClose);
        DiaryToolBar.add(jSeparator5);

        lblHelp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/help.png"))); // NOI18N
        lblHelp.setToolTipText("Close");
        lblHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHelp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblHelp.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHelpMouseClicked(evt);
            }
        });
        DiaryToolBar.add(lblHelp);
        DiaryToolBar.add(jSeparator6);

        lblFont.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/font.png"))); // NOI18N
        lblFont.setToolTipText("Font");
        lblFont.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFont.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblFont.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblFont.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFontMouseClicked(evt);
            }
        });
        DiaryToolBar.add(lblFont);
        DiaryToolBar.add(jSeparator7);

        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/back2.png"))); // NOI18N
        lblBack.setToolTipText("Back To Home");
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBack.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        DiaryToolBar.add(lblBack);
        DiaryToolBar.add(jSeparator8);

        lblPAssistant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPAssistant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tips.png"))); // NOI18N
        lblPAssistant.setToolTipText("Personal Assistant | Click here to hide/show personal assistant.");
        lblPAssistant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPAssistant.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPAssistant.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblPAssistant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPAssistantMouseClicked(evt);
            }
        });
        DiaryToolBar.add(lblPAssistant);

        txtTips.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        txtTips.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTips.setText("Hey! I am your personal assistant. I'm not available right now for you.");
        txtTips.setToolTipText("Click on Personal Assistant menu for more details.");
        txtTips.setBorder(null);
        txtTips.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DiaryToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
            .addComponent(txtTips)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DiaryToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(txtTips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Img/IconPack/file.png")));
    }
    
    private void setIconOpen() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Img/IconPack/file_edit.png")));
    }
    
    private void setIconNew() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Img/IconPack/file_add.png")));
    }

    private void TipsWorker() {
        try {
            FileReader fr = new FileReader(workingDirectory + File.separator + "EncDiary Plus" + File.separator + "Config" + File.separator + "TipsDict.txt");
            BufferedReader br = new BufferedReader(fr);
            String temp;
            while ((temp = br.readLine()) != null) {
                txtTips.setText(temp);
            }
            fr.close();
            br.close();
        } catch (IOException ex) {
            txtTips.setText("Hey! I am your personal assistant. Oops! I'm not available right now for you.");
            //javax.swing.JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    private void lblOpenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpenMouseClicked
        runFileOpenDialog();
    }//GEN-LAST:event_lblOpenMouseClicked

    private void lblSaveAsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveAsMouseClicked
        runFileSaveAsDialog();
    }//GEN-LAST:event_lblSaveAsMouseClicked

    private void lblSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseClicked
        try {
            if(EncNote.isVisible()==false)
            {
                javax.swing.JOptionPane.showMessageDialog(rootPane, "No file is currently opened.\nPlease open any file use this option well!", "Response", 2);
            }
            else
            {
                targetFile = myFileChooser.getSelectedFile();
                if (targetFile == null) {
                    runFileSaveAsDialog();
                } else if (!targetFile.exists()) {
                    targetFile = null;
                    runFileSaveAsDialog();
                } else if (targetFile.exists()) {
                    targetFile.createNewFile();
                    FileWriter fw = new FileWriter(targetFile);
                    String sBuff = ED.encryptFile(EncNote.getText());
                    fw.write(sBuff);
                    fw.close();
                    setTitle(targetFile.getName() + " | EncDiary Plus");
                }
            }
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_lblSaveMouseClicked

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        if (targetFile!=null) {
            int res = javax.swing.JOptionPane.showConfirmDialog(rootPane, "Save data before closing file.\nDo you wish to close current file?", "Close File", 0);
            if (res == 0) {
                targetFile = null;
                myFileChooser.setSelectedFile(null);
                EncNote.setVisible(false);
                EncNote.setText("");
                EncNote.requestFocus();
                setTitle("EncDiary Plus");
            }
        } else { 
            targetFile = null;
            myFileChooser.setSelectedFile(null);
            EncNote.setText("");
            EncNote.setVisible(false);
            EncNote.requestFocus();
            setTitle("EncDiary Plus");
        }
        setIcon();
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewMouseClicked
        if (!(null == targetFile)) {
            int res = javax.swing.JOptionPane.showConfirmDialog(rootPane, "Do you wish to close current file and open new file?", "Close File", 0);
            if (res == 0) {
                EncNote.setVisible(true);
                targetFile = null;
                EncNote.setText("");
                EncNote.requestFocus();
                setTitle("EncDiary Plus");
            }
        } else {
            EncNote.setVisible(true);
            targetFile = null;
            EncNote.setText("");
            EncNote.requestFocus();
            setTitle("EncDiary Plus");
        }
        setIconNew();
    }//GEN-LAST:event_lblNewMouseClicked

    private void lblHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHelpMouseClicked
        EncHelp EH = new EncHelp("EncDiaryEditor");
        EH.setVisible(true);
    }//GEN-LAST:event_lblHelpMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        EncHelp EH = new EncHelp("Test");
        EH.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        int res = javax.swing.JOptionPane.showConfirmDialog(rootPane, "You may lose unsaved data!\nDo you wish to go back to home?", "Back To Home", 0);
        if (res == JOptionPane.YES_OPTION) {
            dispose();
            EncDiaryHome Home = new EncDiaryHome();
            Home.setVisible(true);
        }
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblFontMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFontMouseClicked
        FontDialog FD = new FontDialog(this, true);
        FD.cbFontSize.setSelectedItem(Integer.toString(EncNote.getFont().getSize()));
        if (EncNote.getFont().isBold()) {
            FD.cbBold.setSelected(true);
        }
        if (EncNote.getFont().isItalic()) {
            FD.cbItalic.setSelected(true);
        }
        FD.show();
        switch (FontDialog.ButtonKey) {
            case 'D':
                setEditorFont("default");
                break;
            case 'O':
                setEditorFont("default");
                setEditorFont(FontDialog.rFSize, FontDialog.rFB, FontDialog.rFI, FontDialog.colorCode);
                break;
            case 'C':
                setEditorFont("cancel");
                break;
            default:
                setEditorFont("cancel");
                break;
        }
    }//GEN-LAST:event_lblFontMouseClicked

    private void lblPAssistantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPAssistantMouseClicked
        if (txtTips.getText().matches("Hey! I am your personal assistant. I'm not available right now for you.")) {
            javax.swing.JOptionPane.showMessageDialog(null, "No personal assistant dictionary found.\nPlease contact developer to acquire the 'PAssistant' dictionary.", "Personal Assistant", 2);
            txtTips.setVisible(true);
        }
    }//GEN-LAST:event_lblPAssistantMouseClicked

    public void runFileOpenDialog() {
        try{
            int result = myFileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                //Path path = myFileChooser.getSelectedFile().toPath();
                try {
                    FileReader fr = new FileReader(myFileChooser.getSelectedFile());
                    BufferedReader br = new BufferedReader(fr);
                    String temp;
                    do {
                        temp = br.readLine();
                        if (temp == null) {
                            break;
                        }
                        SB.append(temp);
                    } while (temp != null);
                    fr.close();
                    br.close();
                    int cnfCode = javax.swing.JOptionPane.showConfirmDialog(rootPane, "I need some more information before opening your file/diary.\nClick on 'Yes' if you're opening EncDiary, otherwise click 'No' to open it as a simple file.", "File Opening Confirmation", 0);
                    EncNote.setVisible(true);
                    if (cnfCode == 0) {
                        String trimStr = ED.decryptFile(SB.toString());
                        EncNote.setText(trimStr.trim());
                        EncNote.requestFocus();
                        setTitle(myFileChooser.getSelectedFile().getName() + " | EncDiary Plus");
                        //this.setExtendedState(this.MAXIMIZED_BOTH);
                    } else {
                        EncNote.setText(SB.toString());
                        EncNote.requestFocus();
                        setTitle(myFileChooser.getSelectedFile().getName() + " | EncDiary Plus");
                    }
                    setIconOpen();
                    SB.setLength(0);
                } catch (IOException ex) {
                    javax.swing.JOptionPane.showMessageDialog(null, "File not found!\n" + ex.toString());
                } catch (HeadlessException ex) {
                    javax.swing.JOptionPane.showMessageDialog(null, ex.toString());
                }
            }
        }catch(Exception ex)
        {
            javax.swing.JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    private void runFileSaveAsDialog() {
        if(EncNote.isVisible()==false)
        {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "No file is currently opened.\nPlease open any file use this option well!", "Response", 2);
        }
        else
        {
            int result = myFileChooser.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                targetFile = myFileChooser.getSelectedFile();
                if (!myFileChooser.getSelectedFile().getName().endsWith(".edf")) {
                    targetFile = new File(targetFile.getAbsolutePath() + ".edf");
                }
                try {
                    if (!targetFile.exists()) {
                        targetFile.createNewFile();
                        setTitle(targetFile.getName() + " | EncDiary Plus");
                    } else {
                        int res = javax.swing.JOptionPane.showConfirmDialog(rootPane, "File already exists.\nDo you wish to overwrite it?", "File Save Confirmation", 0);
                        if (res == 0) {
                            targetFile.createNewFile();
                            setTitle(targetFile.getName() + " | EncDiary Plus");
                        }
                    }
                    FileWriter fw = new FileWriter(targetFile);
                    String sBuff = ED.encryptFile(EncNote.getText());
                    fw.write(sBuff);
                    fw.close();
                    setIcon();
                } catch (IOException ex) {
                    javax.swing.JOptionPane.showMessageDialog(null, ex.toString());
                }
            }
        }
    }

    private void setEditorFont(String rData) {
        if (rData.matches("default")) {
            EncNote.setFont(new Font("Tahoma", Font.PLAIN, 16));
            EncNote.setForeground(Color.BLACK);
        }
    }

    private void setEditorFont(int rFSize, char rFB, char rFI, String colorCode) {
        if (rFB == 'Y' && rFI == 'Y') {
            EncNote.setFont(new Font("Tahoma", Font.BOLD + Font.ITALIC, rFSize));
        } else if (rFB == 'Y') {
            EncNote.setFont(new Font("Tahoma", Font.BOLD, rFSize));
        } else if (rFI == 'Y') {
            EncNote.setFont(new Font("Tahoma", Font.ITALIC, rFSize));
        } else {
            EncNote.setFont(new Font("Tahoma", Font.PLAIN, rFSize));
        }

        if (colorCode.matches("RED")) {
            EncNote.setForeground(Color.RED);
        } else if (colorCode.matches("GREEN")) {
            EncNote.setForeground(Color.GREEN);
        } else if (colorCode.matches("BLUE")) {
            EncNote.setForeground(Color.BLUE);
        } else if (colorCode.matches("BLACK")) {
            EncNote.setForeground(Color.BLACK);
        } else if (colorCode.matches("YELLOW")) {
            EncNote.setForeground(Color.YELLOW);
        } else if (colorCode.matches("PINK")) {
            EncNote.setForeground(Color.PINK);
        } else if (colorCode.matches("CYAN")) {
            EncNote.setForeground(Color.CYAN);
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
            java.util.logging.Logger.getLogger(EncDiaryEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncDiaryEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncDiaryEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncDiaryEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncDiaryEditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar DiaryToolBar;
    private javax.swing.JTextArea EncNote;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblFont;
    private javax.swing.JLabel lblHelp;
    private javax.swing.JLabel lblNew;
    private javax.swing.JLabel lblOpen;
    private javax.swing.JLabel lblPAssistant;
    private javax.swing.JLabel lblSave;
    private javax.swing.JLabel lblSaveAs;
    private javax.swing.JTextField txtTips;
    // End of variables declaration//GEN-END:variables
}
