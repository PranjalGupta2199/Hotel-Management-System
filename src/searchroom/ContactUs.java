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
public class ContactUs extends javax.swing.JFrame {

    /**
     * Creates new form ContactUs
     */
    public ContactUs() {
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

        AboutUsP = new javax.swing.JPanel();
        MoreP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FNameTf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        SendFeedbackB = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        HomeM = new javax.swing.JMenu();
        SearchM = new javax.swing.JMenu();
        MyProfileM = new javax.swing.JMenu();
        AboutUsM = new javax.swing.JMenu();
        ContactUsM = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        AboutUsP.setPreferredSize(new java.awt.Dimension(1920, 1080));
        AboutUsP.setLayout(null);

        MoreP.setBackground(new java.awt.Color(102, 255, 51));
        MoreP.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Contact Us");
        MoreP.add(jLabel1);
        jLabel1.setBounds(0, 0, 1450, 100);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Name :");
        MoreP.add(jLabel3);
        jLabel3.setBounds(250, 120, 260, 70);

        FNameTf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MoreP.add(FNameTf);
        FNameTf.setBounds(680, 110, 330, 80);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("Your Feedback :");
        MoreP.add(jLabel5);
        jLabel5.setBounds(250, 220, 420, 80);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        MoreP.add(jScrollPane1);
        jScrollPane1.setBounds(680, 230, 450, 270);

        SendFeedbackB.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        SendFeedbackB.setText("Send Feedback");
        SendFeedbackB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendFeedbackBActionPerformed(evt);
            }
        });
        MoreP.add(SendFeedbackB);
        SendFeedbackB.setBounds(470, 670, 490, 70);

        AboutUsP.add(MoreP);
        MoreP.setBounds(310, 70, 1450, 800);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchroom/bckg5.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        AboutUsP.add(jLabel9);
        jLabel9.setBounds(0, 0, 1920, 970);

        getContentPane().add(AboutUsP);
        AboutUsP.setBounds(0, 0, 1920, 1080);

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

    private void SendFeedbackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendFeedbackBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SendFeedbackBActionPerformed

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
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactUs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AboutUsM;
    private javax.swing.JPanel AboutUsP;
    private javax.swing.JMenu ContactUsM;
    private javax.swing.JTextField FNameTf;
    private javax.swing.JMenu HomeM;
    private javax.swing.JPanel MoreP;
    private javax.swing.JMenu MyProfileM;
    private javax.swing.JMenu SearchM;
    private javax.swing.JButton SendFeedbackB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}