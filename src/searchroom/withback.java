/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smit
 */
package searchroom;

public class withback extends javax.swing.JFrame {

    /**
     * Creates new form withback
     */
    static String Username;
    
    public withback(String name) {
        this.Username = name;
        System.out.println(Username);
        initComponents();
        this.setSize(1920,1080);
        this.setResizable(false);
        displayInfo(Username);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jLabel6 = new javax.swing.JLabel();
        profilePanel = new javax.swing.JPanel();
        entryPanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        emailidLabel = new javax.swing.JLabel();
        mobileLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        viewtransactionsButton = new javax.swing.JButton();
        userpicLabel = new javax.swing.JLabel();
        valueofusernameLabel = new javax.swing.JLabel();
        valueofemailidLabel = new javax.swing.JLabel();
        valueofmobileLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        valueofaddressLabel = new java.awt.TextArea();
        bckgimageLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();
        searchMenu = new javax.swing.JMenu();
        profileMenu = new javax.swing.JMenu();
        aboutMenu = new javax.swing.JMenu();
        contactMenu = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");
        jMenu2.setOpaque(true);

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-10, 0, 0, 0);

        profilePanel.setPreferredSize(new java.awt.Dimension(1920, 100));
        profilePanel.setLayout(null);

        entryPanel.setBackground(new java.awt.Color(255, 201, 175));

        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        usernameLabel.setText("Username :");

        emailidLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        emailidLabel.setText("EmailId     :");

        mobileLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        mobileLabel.setText("Mobile       :");

        addressLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        addressLabel.setText("Address     :");

        viewtransactionsButton.setBackground(new java.awt.Color(153, 255, 153));
        viewtransactionsButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        viewtransactionsButton.setText("View Transactions");

        userpicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchroom/img1.jpg"))); // NOI18N

        valueofusernameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valueofusernameLabel.setOpaque(false);

        valueofemailidLabel.setBackground(new java.awt.Color(255, 255, 255));
        valueofemailidLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valueofemailidLabel.setOpaque(false);

        valueofmobileLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valueofmobileLabel.setOpaque(false);

        logoutButton.setBackground(new java.awt.Color(255, 0, 0));
        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        valueofaddressLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        valueofaddressLabel.setEditable(false);
        valueofaddressLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout entryPanelLayout = new javax.swing.GroupLayout(entryPanel);
        entryPanel.setLayout(entryPanelLayout);
        entryPanelLayout.setHorizontalGroup(
            entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entryPanelLayout.createSequentialGroup()
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(entryPanelLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(viewtransactionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(entryPanelLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(entryPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mobileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(83, 83, 83)
                        .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(entryPanelLayout.createSequentialGroup()
                                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(valueofemailidLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                                    .addComponent(valueofusernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(valueofmobileLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(170, 170, 170)
                                .addComponent(userpicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(entryPanelLayout.createSequentialGroup()
                                .addComponent(valueofaddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(219, 219, 219)))))
                .addGap(60, 60, 60))
        );
        entryPanelLayout.setVerticalGroup(
            entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entryPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(entryPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(userpicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(entryPanelLayout.createSequentialGroup()
                        .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(entryPanelLayout.createSequentialGroup()
                                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emailidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(entryPanelLayout.createSequentialGroup()
                                .addComponent(valueofusernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(valueofemailidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(entryPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(valueofmobileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entryPanelLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(mobileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(entryPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(entryPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(valueofaddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83)
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewtransactionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        profilePanel.add(entryPanel);
        entryPanel.setBounds(360, 110, 1230, 620);

        bckgimageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchroom/hotel-imperiale-roma-camere-01-2.jpg"))); // NOI18N
        profilePanel.add(bckgimageLabel);
        bckgimageLabel.setBounds(0, 0, 1920, 960);

        getContentPane().add(profilePanel);
        profilePanel.setBounds(0, 0, 1950, 970);

        jMenuBar1.setPreferredSize(new java.awt.Dimension(1920, 127));

        homeMenu.setText("HOME");
        homeMenu.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        homeMenu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        homeMenu.setPreferredSize(new java.awt.Dimension(384, 24));
        homeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(homeMenu);
        homeMenu.getAccessibleContext().setAccessibleDescription("HomePage");

        searchMenu.setText("SEARCH");
        searchMenu.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        searchMenu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        searchMenu.setPreferredSize(new java.awt.Dimension(384, 24));
        searchMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(searchMenu);
        searchMenu.getAccessibleContext().setAccessibleDescription("Seacrh for Hotels");

        profileMenu.setText("MY PROFILE");
        profileMenu.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        profileMenu.setPreferredSize(new java.awt.Dimension(384, 24));
        profileMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(profileMenu);
        profileMenu.getAccessibleContext().setAccessibleDescription("View your account details");

        aboutMenu.setText("ABOUT US");
        aboutMenu.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        aboutMenu.setPreferredSize(new java.awt.Dimension(384, 24));
        aboutMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(aboutMenu);
        aboutMenu.getAccessibleContext().setAccessibleDescription("Get to know more about our sites and other services");

        contactMenu.setText("CONTACT US");
        contactMenu.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        contactMenu.setPreferredSize(new java.awt.Dimension(384, 24));
        contactMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(contactMenu);
        contactMenu.getAccessibleContext().setAccessibleDescription("Contact Information");

        setJMenuBar(jMenuBar1);

        getAccessibleContext().setAccessibleName("HOME");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayInfo(String UserID){
        Cursor conn = new Cursor();
        String [] info;
        info = conn.getUserInfo(Username);
        
        valueofusernameLabel.setText(info[0]);
        valueofemailidLabel.setText(info[1]);
        valueofmobileLabel.setText(info[2]);
        valueofaddressLabel.setText(info[3]);
    }
    
    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new AppStart().setVisible(true);
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void homeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMenuMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new home(Username).setVisible(true);       
    }//GEN-LAST:event_homeMenuMouseClicked

    private void searchMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMenuMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new SearchRoomUI(Username).setVisible(true);  
    }//GEN-LAST:event_searchMenuMouseClicked

    private void profileMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_profileMenuMouseClicked

    private void aboutMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMenuMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new AboutUs(Username).setVisible(true);
    }//GEN-LAST:event_aboutMenuMouseClicked

    private void contactMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMenuMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new ContactUs(Username).setVisible(true);
    }//GEN-LAST:event_contactMenuMouseClicked

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
            java.util.logging.Logger.getLogger(withback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(withback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(withback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(withback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new withback(Username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel bckgimageLabel;
    private javax.swing.JMenu contactMenu;
    private javax.swing.JLabel emailidLabel;
    private javax.swing.JPanel entryPanel;
    private javax.swing.JMenu homeMenu;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JMenu profileMenu;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JMenu searchMenu;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel userpicLabel;
    private java.awt.TextArea valueofaddressLabel;
    private javax.swing.JLabel valueofemailidLabel;
    private javax.swing.JLabel valueofmobileLabel;
    private javax.swing.JLabel valueofusernameLabel;
    private javax.swing.JButton viewtransactionsButton;
    // End of variables declaration//GEN-END:variables
}
