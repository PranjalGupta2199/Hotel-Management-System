/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchroom;

/**
 *
 * @author medet
 */
public class AboutUs extends javax.swing.JFrame {

    /**
     * Creates new form AboutUs
     */
    public AboutUs() {
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

        AbousUsP = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        HomeM = new javax.swing.JMenu();
        SearchM = new javax.swing.JMenu();
        MyProfileM = new javax.swing.JMenu();
        AboutUsM = new javax.swing.JMenu();
        ContactUsM = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        AbousUsP.setBackground(new java.awt.Color(51, 255, 255));
        AbousUsP.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Our Team");
        AbousUsP.add(jLabel2);
        jLabel2.setBounds(0, 60, 1620, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchroom/Dhruv.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        AbousUsP.add(jLabel3);
        jLabel3.setBounds(90, 320, 290, 230);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchroom/pranjalgupta_1.jpg"))); // NOI18N
        AbousUsP.add(jLabel4);
        jLabel4.setBounds(570, 280, 240, 310);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchroom/saarthakjain_1.jpg"))); // NOI18N
        AbousUsP.add(jLabel5);
        jLabel5.setBounds(1350, 300, 200, 260);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchroom/smitshah.jpg"))); // NOI18N
        AbousUsP.add(jLabel6);
        jLabel6.setBounds(910, 280, 270, 290);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField1.setText("Dhruv Gupta");
        AbousUsP.add(jTextField1);
        jTextField1.setBounds(90, 630, 290, 50);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField2.setText("Pranjal Gupta");
        AbousUsP.add(jTextField2);
        jTextField2.setBounds(560, 630, 230, 50);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField3.setText("Smit Shah");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        AbousUsP.add(jTextField3);
        jTextField3.setBounds(910, 620, 290, 60);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField4.setText("Saarthak Jain");
        AbousUsP.add(jTextField4);
        jTextField4.setBounds(1350, 630, 240, 50);

        getContentPane().add(AbousUsP);
        AbousUsP.setBounds(160, 0, 1620, 870);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchroom/bckg6.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1920, 960);

        jMenuBar1.setPreferredSize(new java.awt.Dimension(1920, 126));

        HomeM.setText("HOME");
        HomeM.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        HomeM.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        HomeM.setPreferredSize(new java.awt.Dimension(384, 24));
        jMenuBar1.add(HomeM);

        SearchM.setText("SEARCH");
        SearchM.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        SearchM.setPreferredSize(new java.awt.Dimension(384, 24));
        jMenuBar1.add(SearchM);

        MyProfileM.setText("MY PROFILE");
        MyProfileM.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        MyProfileM.setPreferredSize(new java.awt.Dimension(384, 24));
        jMenuBar1.add(MyProfileM);

        AboutUsM.setText("ABOUT US");
        AboutUsM.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        AboutUsM.setPreferredSize(new java.awt.Dimension(384, 24));
        jMenuBar1.add(AboutUsM);

        ContactUsM.setText("CONTACT US");
        ContactUsM.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        ContactUsM.setPreferredSize(new java.awt.Dimension(384, 24));
        jMenuBar1.add(ContactUsM);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutUs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AbousUsP;
    private javax.swing.JMenu AboutUsM;
    private javax.swing.JMenu ContactUsM;
    private javax.swing.JMenu HomeM;
    private javax.swing.JMenu MyProfileM;
    private javax.swing.JMenu SearchM;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
