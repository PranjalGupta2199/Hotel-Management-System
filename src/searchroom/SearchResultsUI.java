/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchroom;

/**
 *
 * @author PRANJAL
 */
public class SearchResultsUI extends javax.swing.JFrame {

    /**
     * Creates new form SearchResultsUI
     */
    public SearchResultsUI() {
        initComponents();
        this.setSize(1920,1080);
        this.setResizable(false);
        
    }
        public SearchResultsUI(boolean isAvailable[],String location) {
        initComponents();
        this.setSize(1920,1080);
        this.setResizable(false);
        displayHotel( isAvailable,location);
        
    }
    
    public void displayHotel(boolean isAvailable[],String location){
        Cursor conn = new Cursor ();
        conn.getData(location);
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultPanel = new javax.swing.JPanel();
        displayPanel = new javax.swing.JPanel();
        displayLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        payementButton = new javax.swing.JButton();
        bckgLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();
        searchMenu = new javax.swing.JMenu();
        profileMenu = new javax.swing.JMenu();
        aboutMenu = new javax.swing.JMenu();
        contactMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        resultPanel.setPreferredSize(new java.awt.Dimension(1920, 954));
        resultPanel.setLayout(null);

        displayPanel.setBackground(new java.awt.Color(204, 255, 0));
        displayPanel.setLayout(null);

        displayLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        displayLabel.setText("THESE ARE THE AVAILABLE HOTELS : ");
        displayPanel.add(displayLabel);
        displayLabel.setBounds(12, 13, 1036, 42);

        jLabel1.setText("jLabel1");
        jLabel1.setOpaque(true);
        displayPanel.add(jLabel1);
        jLabel1.setBounds(550, 110, 480, 280);

        jLabel2.setText("jLabel1");
        jLabel2.setOpaque(true);
        displayPanel.add(jLabel2);
        jLabel2.setBounds(50, 420, 480, 290);

        jButton4.setText("jButton1");
        displayPanel.add(jButton4);
        jButton4.setBounds(330, 340, 140, 50);

        jLabel3.setText("jLabel1");
        jLabel3.setOpaque(true);
        displayPanel.add(jLabel3);
        jLabel3.setBounds(550, 420, 480, 290);

        jButton1.setText("jButton1");
        displayPanel.add(jButton1);
        jButton1.setBounds(600, 250, 140, 50);

        jCheckBox1.setText("jCheckBox1");
        displayPanel.add(jCheckBox1);
        jCheckBox1.setBounds(80, 260, 93, 25);

        jCheckBox2.setText("jCheckBox2");
        displayPanel.add(jCheckBox2);
        jCheckBox2.setBounds(80, 290, 93, 25);

        jLabel5.setText("jLabel5");
        jLabel5.setOpaque(true);
        displayPanel.add(jLabel5);
        jLabel5.setBounds(80, 190, 240, 50);

        jButton2.setText("jButton2");
        displayPanel.add(jButton2);
        jButton2.setBounds(70, 340, 160, 50);

        jLabel4.setOpaque(true);
        displayPanel.add(jLabel4);
        jLabel4.setBounds(40, 110, 480, 290);

        jButton3.setText("jButton1");
        displayPanel.add(jButton3);
        jButton3.setBounds(830, 240, 140, 50);

        resultPanel.add(displayPanel);
        displayPanel.setBounds(230, 80, 1060, 770);

        backButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backButton.setText("BACK");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        resultPanel.add(backButton);
        backButton.setBounds(1540, 620, 320, 100);

        payementButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        payementButton.setText("PROCEED TO PAYMENT");
        payementButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payementButtonMouseClicked(evt);
            }
        });
        resultPanel.add(payementButton);
        payementButton.setBounds(1540, 740, 320, 100);

        bckgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchroom/bckg2.jpg"))); // NOI18N
        resultPanel.add(bckgLabel);
        bckgLabel.setBounds(0, 0, 1920, 950);

        menuBar.setPreferredSize(new java.awt.Dimension(1920, 126));

        homeMenu.setText("HOME");
        homeMenu.setToolTipText("Homepage");
        homeMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        homeMenu.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        homeMenu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        homeMenu.setPreferredSize(new java.awt.Dimension(384, 24));
        menuBar.add(homeMenu);

        searchMenu.setText("SEARCH ");
        searchMenu.setToolTipText("Search for hotels");
        searchMenu.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        searchMenu.setPreferredSize(new java.awt.Dimension(384, 24));
        menuBar.add(searchMenu);

        profileMenu.setText("MY PROFILE");
        profileMenu.setToolTipText("View your account details");
        profileMenu.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        profileMenu.setPreferredSize(new java.awt.Dimension(384, 24));
        menuBar.add(profileMenu);

        aboutMenu.setText("ABOUT US");
        aboutMenu.setToolTipText("Get to know more about our sites and other services");
        aboutMenu.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        aboutMenu.setPreferredSize(new java.awt.Dimension(384, 24));
        menuBar.add(aboutMenu);

        contactMenu.setText("CONTACT US");
        contactMenu.setToolTipText("Contact informtation");
        contactMenu.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        contactMenu.setPreferredSize(new java.awt.Dimension(384, 24));
        menuBar.add(contactMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(resultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new SearchRoomUI().setVisible(true);
        
    }//GEN-LAST:event_backButtonMouseClicked

    private void payementButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payementButtonMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new ModeOfPayment().setVisible(true);       
    }//GEN-LAST:event_payementButtonMouseClicked

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
            java.util.logging.Logger.getLogger(SearchResultsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchResultsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchResultsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchResultsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchResultsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bckgLabel;
    private javax.swing.JMenu contactMenu;
    private javax.swing.JLabel displayLabel;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JMenu homeMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton payementButton;
    private javax.swing.JMenu profileMenu;
    private javax.swing.JPanel resultPanel;
    private javax.swing.JMenu searchMenu;
    // End of variables declaration//GEN-END:variables
}
