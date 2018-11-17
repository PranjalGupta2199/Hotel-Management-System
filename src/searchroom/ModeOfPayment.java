package searchroom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author medet
 */
public class ModeOfPayment extends javax.swing.JFrame {

    /**
     * Creates new form ModeOfPayment
     */
    public ModeOfPayment() {
        initComponents();
        this.setSize(1920,1080);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGroungPanel = new javax.swing.JPanel();
        ContentPanel = new javax.swing.JPanel();
        MakePaymentTitleL = new javax.swing.JLabel();
        CreditCardNameL = new javax.swing.JLabel();
        CreditCardNameTf = new javax.swing.JTextField();
        CvvnumL = new javax.swing.JLabel();
        CreditCardNumL = new javax.swing.JLabel();
        CreditCardNumTf = new javax.swing.JTextField();
        TotalAmountL = new javax.swing.JLabel();
        MakePaymentB = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        BackImageL = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        HomeM = new javax.swing.JMenu();
        SearchM = new javax.swing.JMenu();
        MyProfileM = new javax.swing.JMenu();
        AboutUsM = new javax.swing.JMenu();
        ContactUsM = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        BackGroungPanel.setLayout(null);

        ContentPanel.setBackground(new java.awt.Color(153, 255, 0));

        MakePaymentTitleL.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        MakePaymentTitleL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MakePaymentTitleL.setText("MAKE PAYMENT");
        MakePaymentTitleL.setAlignmentX(0.5F);

        CreditCardNameL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CreditCardNameL.setText("NAME ON CREDIT CARD :");

        CreditCardNameTf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        CvvnumL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CvvnumL.setText("CVV NUMBER :");

        CreditCardNumL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CreditCardNumL.setText("CREDIT CARD NUMBER :");

        CreditCardNumTf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        TotalAmountL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TotalAmountL.setText("TOTAL AMOUNT :");

        MakePaymentB.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        MakePaymentB.setText("Confirm Payment");
        MakePaymentB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MakePaymentBActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        backButton.setText("Back");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("The amount will be displayed here");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchroom/bckg7.jpg"))); // NOI18N

        javax.swing.GroupLayout ContentPanelLayout = new javax.swing.GroupLayout(ContentPanel);
        ContentPanel.setLayout(ContentPanelLayout);
        ContentPanelLayout.setHorizontalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanelLayout.createSequentialGroup()
                .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentPanelLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(MakePaymentTitleL, javax.swing.GroupLayout.PREFERRED_SIZE, 1293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentPanelLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176)
                        .addComponent(MakePaymentB))
                    .addGroup(ContentPanelLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContentPanelLayout.createSequentialGroup()
                                .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CreditCardNameL, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CvvnumL, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CreditCardNameTf)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)))
                            .addGroup(ContentPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ContentPanelLayout.createSequentialGroup()
                                        .addComponent(CreditCardNumL, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CreditCardNumTf, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ContentPanelLayout.createSequentialGroup()
                                        .addComponent(TotalAmountL, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(251, 251, 251)
                        .addComponent(jLabel8)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        ContentPanelLayout.setVerticalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(MakePaymentTitleL, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE))
                    .addGroup(ContentPanelLayout.createSequentialGroup()
                        .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContentPanelLayout.createSequentialGroup()
                                .addComponent(CreditCardNameL, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CvvnumL, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ContentPanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(CreditCardNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CreditCardNumTf, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CreditCardNumL, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TotalAmountL, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)))
                .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MakePaymentB)
                    .addComponent(backButton))
                .addGap(64, 64, 64))
        );

        BackGroungPanel.add(ContentPanel);
        ContentPanel.setBounds(190, 130, 1550, 790);

        BackImageL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchroom/bckg4.jpg"))); // NOI18N
        BackGroungPanel.add(BackImageL);
        BackImageL.setBounds(0, 0, 1920, 950);

        getContentPane().add(BackGroungPanel);
        BackGroungPanel.setBounds(0, 0, 1920, 1080);

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

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed

    private void MakePaymentBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MakePaymentBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MakePaymentBActionPerformed

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new SearchResultsUI().setVisible(true);
    }//GEN-LAST:event_backButtonMouseClicked

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
            java.util.logging.Logger.getLogger(ModeOfPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModeOfPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModeOfPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModeOfPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModeOfPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AboutUsM;
    private javax.swing.JPanel BackGroungPanel;
    private javax.swing.JLabel BackImageL;
    private javax.swing.JMenu ContactUsM;
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JLabel CreditCardNameL;
    private javax.swing.JTextField CreditCardNameTf;
    private javax.swing.JLabel CreditCardNumL;
    private javax.swing.JTextField CreditCardNumTf;
    private javax.swing.JLabel CvvnumL;
    private javax.swing.JMenu HomeM;
    private javax.swing.JButton MakePaymentB;
    private javax.swing.JLabel MakePaymentTitleL;
    private javax.swing.JMenu MyProfileM;
    private javax.swing.JMenu SearchM;
    private javax.swing.JLabel TotalAmountL;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
