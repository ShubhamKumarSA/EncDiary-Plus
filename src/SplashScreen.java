
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class SplashScreen extends javax.swing.JFrame {

    public static int TimeCnt = 0;
    Timer T = new Timer(100, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //Date currentTime=new Date();
            //lblTimer.setText(currentTime.toString());
            //if(PBar.getValue()<=100)
            //PBar.setValue(PBar.getValue()+10);
            if (TimeCnt >= 20) {
                T.stop();
                dispose();
                AuthenticationWindow WP = new AuthenticationWindow();
                WP.setVisible(true);
                WP.requestFocusInWindow();
            } else {
                TimeCnt++;
            }

        }

    });

    public SplashScreen() {
        initComponents();
        T.start();
        //this.getContentPane().setBackground(Color.red);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNet = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EncDiary Plus | Welcome");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setFocusable(false);
        setFocusableWindowState(false);
        setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        setUndecorated(true);

        lblNet.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        lblNet.setForeground(new java.awt.Color(0, 0, 153));
        lblNet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/network/disconn.png"))); // NOI18N
        lblNet.setToolTipText("Internet Disconnected.");
        lblNet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/gif/EncStart.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(lblNet, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblImg)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(lblNet, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblImg;
    public javax.swing.JLabel lblNet;
    // End of variables declaration//GEN-END:variables
}
