/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchroom;
import javax.swing.table.JTableHeader;
import javax.swing.table.*;


/**
 *
 * @author PRANJAL
 */
public class ViewTranscations extends javax.swing.JFrame {

    /**
     * Creates new form ViewTranscations
     */
    static String Username;
    
    public ViewTranscations(String name) {
        Username = name;
        initComponents();
        this.setSize(1920,1080);
        this.setResizable(false);
        displayTransactions(Username);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void displayTransactions(String Username){
        Cursor conn = new Cursor();
        String transactions[][];
        transactions = conn.getTransactions(Username);
        DefaultTableModel model = (DefaultTableModel) bookingTable.getModel();

        
        for (int i = 0; i < 20; i++ ){
            String row[];
            row = transactions[i];
            /*for (int j = 0; j < 7; j++) {
                System.out.print(row[j]);
                System.out.println();
            }*/
            
            model.insertRow(i, row);
        }
      
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookingPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookingTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();
        searchMenu = new javax.swing.JMenu();
        profileMenu = new javax.swing.JMenu();
        aboutMenu = new javax.swing.JMenu();
        contactMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bookingPanel.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));

        bookingTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JTableHeader header = bookingTable.getTableHeader();
        header.setFont( header.getFont().deriveFont(24) );
        bookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Location", "Hotel Name", "From Date", "To Date", "Total Rooms", "Total Guests", "Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookingTable.setColumnSelectionAllowed(true);
        bookingTable.setRowHeight(30);
        jScrollPane1.setViewportView(bookingTable);
        bookingTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (bookingTable.getColumnModel().getColumnCount() > 0) {
            bookingTable.getColumnModel().getColumn(6).setPreferredWidth(25);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("YOUR BOOKING HISTORY ");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("CANCEL BOOKING");

        jButton2.setBackground(new java.awt.Color(255, 255, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("MODIFY BOOKING");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        bookingPanel.add(jPanel2);
        jPanel2.setBounds(270, 90, 1310, 680);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchroom/bckg8.jpg"))); // NOI18N
        bookingPanel.add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 960);

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
        searchMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMenuMouseClicked(evt);
            }
        });
        menuBar.add(searchMenu);

        profileMenu.setText("MY PROFILE");
        profileMenu.setToolTipText("View your account details");
        profileMenu.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        profileMenu.setPreferredSize(new java.awt.Dimension(384, 24));
        profileMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMenuMouseClicked(evt);
            }
        });
        menuBar.add(profileMenu);

        aboutMenu.setText("ABOUT US");
        aboutMenu.setToolTipText("Get to know more about our sites and other services");
        aboutMenu.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        aboutMenu.setPreferredSize(new java.awt.Dimension(384, 24));
        aboutMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMenuMouseClicked(evt);
            }
        });
        menuBar.add(aboutMenu);

        contactMenu.setText("CONTACT US");
        contactMenu.setToolTipText("Contact informtation");
        contactMenu.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        contactMenu.setPreferredSize(new java.awt.Dimension(384, 24));
        contactMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactMenuMouseClicked(evt);
            }
        });
        menuBar.add(contactMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMenuMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new SearchRoomUI(Username).setVisible(true);
    }//GEN-LAST:event_searchMenuMouseClicked

    private void profileMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMenuMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new withback(Username).setVisible(true);
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewTranscations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTranscations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTranscations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTranscations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTranscations(Username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JPanel bookingPanel;
    private javax.swing.JTable bookingTable;
    private javax.swing.JMenu contactMenu;
    private javax.swing.JMenu homeMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu profileMenu;
    private javax.swing.JMenu searchMenu;
    // End of variables declaration//GEN-END:variables
}
