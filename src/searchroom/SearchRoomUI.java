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
public class SearchRoomUI extends javax.swing.JFrame {

    /**
     * Creates new form SearchRoomUI
     */
    public SearchRoomUI() {
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

        searchPanel = new javax.swing.JPanel();
        entryPanel = new javax.swing.JPanel();
        locationLabel = new javax.swing.JLabel();
        fromLabel = new javax.swing.JLabel();
        toLabel = new javax.swing.JLabel();
        roomLabel = new javax.swing.JLabel();
        locationText = new javax.swing.JTextField();
        fromText = new javax.swing.JTextField();
        toText = new javax.swing.JTextField();
        roomText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        bckgLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();
        searchMenu = new javax.swing.JMenu();
        profileMenu = new javax.swing.JMenu();
        aboutMenu = new javax.swing.JMenu();
        contactMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchPanel.setPreferredSize(new java.awt.Dimension(1920, 1080));
        searchPanel.setLayout(null);

        entryPanel.setBackground(new java.awt.Color(60, 175, 247));

        locationLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        locationLabel.setText("LOCATION :");

        fromLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fromLabel.setText("NUMBER OF ROOMS : ");

        toLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        toLabel.setText("FROM DATE :");

        roomLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        roomLabel.setText("TO DATE :");

        locationText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        locationText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationTextActionPerformed(evt);
            }
        });

        fromText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        toText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        roomText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        searchButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        searchButton.setText("SEARCH");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayResults(evt);
            }
        });

        javax.swing.GroupLayout entryPanelLayout = new javax.swing.GroupLayout(entryPanel);
        entryPanel.setLayout(entryPanelLayout);
        entryPanelLayout.setHorizontalGroup(
            entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entryPanelLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(roomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(toLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(locationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fromLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(locationText, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromText, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toText, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomText, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entryPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(242, 242, 242))
        );
        entryPanelLayout.setVerticalGroup(
            entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entryPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationText, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomText, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toText, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromText, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        searchPanel.add(entryPanel);
        entryPanel.setBounds(500, 90, 890, 700);

        bckgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchroom/bckg1.jpg"))); // NOI18N
        searchPanel.add(bckgLabel);
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
            .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void locationTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationTextActionPerformed

    private void displayResults(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayResults
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new SearchResultsUI().setVisible(true);

    }//GEN-LAST:event_displayResults

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
            java.util.logging.Logger.getLogger(SearchRoomUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchRoomUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchRoomUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchRoomUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchRoomUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JLabel bckgLabel;
    private javax.swing.JMenu contactMenu;
    private javax.swing.JPanel entryPanel;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JTextField fromText;
    private javax.swing.JMenu homeMenu;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JTextField locationText;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu profileMenu;
    private javax.swing.JLabel roomLabel;
    private javax.swing.JTextField roomText;
    private javax.swing.JButton searchButton;
    private javax.swing.JMenu searchMenu;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JLabel toLabel;
    private javax.swing.JTextField toText;
    // End of variables declaration//GEN-END:variables
}