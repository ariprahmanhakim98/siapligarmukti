/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;

/**
 *
 * @author ASUS
 */
public class menuutama extends javax.swing.JFrame {

    /**
     * Creates new form menuutama
     */
    public menuutama() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btndomisili = new javax.swing.JButton();
        btnsku = new javax.swing.JButton();
        btnkematian = new javax.swing.JButton();
        btndatapenduduk = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuitemarsip = new javax.swing.JMenuItem();
        menuitemuser = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menulogout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tegarberiman.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 100, 100));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("PEMERINTAH KABUPATEN BOGOR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("KECAMATAN KLAPANUNGGAL");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("DESA LIGARMUKTI");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(26, 188, 156));
        jLabel5.setText("SISTEM INFORMASI ADMINISTRASI PERSURATAN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/1.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 50, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/2.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/3.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 50, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/4.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, 50, 50));

        background.setBackground(new java.awt.Color(0, 153, 153));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/viewdesa.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 0, -1, 468));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(230, 126, 34));
        jLabel6.setText("SURAT KETERANGAN");

        btndomisili.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/5.png"))); // NOI18N
        btndomisili.setText("DOMISILI");
        btndomisili.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndomisiliActionPerformed(evt);
            }
        });

        btnsku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/5.png"))); // NOI18N
        btnsku.setText("SKU            ");
        btnsku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnskuActionPerformed(evt);
            }
        });

        btnkematian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/5.png"))); // NOI18N
        btnkematian.setText("KEMATIAN");
        btnkematian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkematianActionPerformed(evt);
            }
        });

        btndatapenduduk.setText("DATA PENDUDUK");
        btndatapenduduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndatapendudukActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnkematian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnsku, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(btndomisili, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btndatapenduduk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(btndomisili)
                .addGap(37, 37, 37)
                .addComponent(btnsku)
                .addGap(32, 32, 32)
                .addComponent(btnkematian)
                .addGap(45, 45, 45)
                .addComponent(btndatapenduduk)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 468));

        jMenu1.setText("File");

        jMenuItem1.setText("Surat Domisili");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menuitemarsip.setText("Surat SKU");
        menuitemarsip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemarsipActionPerformed(evt);
            }
        });
        jMenu1.add(menuitemarsip);

        menuitemuser.setText("Surat Kematian");
        menuitemuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemuserActionPerformed(evt);
            }
        });
        jMenu1.add(menuitemuser);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("About");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        menulogout.setText("Logout");
        menulogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menulogoutMouseClicked(evt);
            }
        });
        menulogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menulogoutActionPerformed(evt);
            }
        });
        jMenuBar1.add(menulogout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menulogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menulogoutActionPerformed
        new login().setVisible(true);
        dispose();
    }//GEN-LAST:event_menulogoutActionPerformed

    private void btndomisiliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndomisiliActionPerformed
        new suratdomisili().setVisible(true);
        dispose();
    }//GEN-LAST:event_btndomisiliActionPerformed

    private void btnskuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnskuActionPerformed
        new suratsku().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnskuActionPerformed

    private void btnkematianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkematianActionPerformed
        new suratkematian().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnkematianActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new suratdomisili().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuitemarsipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemarsipActionPerformed
       new suratsku().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuitemarsipActionPerformed

    private void menuitemuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemuserActionPerformed
        new suratkematian().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuitemuserActionPerformed

    private void btndatapendudukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndatapendudukActionPerformed
        new datapenduduk().setVisible(true);
        dispose();
    }//GEN-LAST:event_btndatapendudukActionPerformed

    private void menulogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menulogoutMouseClicked
        new login().setVisible(true);
        dispose();
    }//GEN-LAST:event_menulogoutMouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        new about().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

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
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuutama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btndatapenduduk;
    private javax.swing.JButton btndomisili;
    private javax.swing.JButton btnkematian;
    private javax.swing.JButton btnsku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem menuitemarsip;
    private javax.swing.JMenuItem menuitemuser;
    private javax.swing.JMenu menulogout;
    // End of variables declaration//GEN-END:variables
}
