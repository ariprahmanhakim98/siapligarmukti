package tampilan;
import java.sql.*;
import koneksi.koneksi;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import siapligarmukti.Siapligarmukti;
import java.io.*;
import java.util.HashMap;
import java.util.Locale;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author ASUS
 */
public class suratdomisili extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    /**
     * Creates new form suratdomisili
     */
    public suratdomisili() {
        initComponents();
        datatable();
        setLocationRelativeTo(null);
    }
    
    
     protected void aktif(){
        txtnama.setEnabled(true);
        txttempatlahir.setEnabled(true);
        txttgllahir.setEnabled(true);
        txtagama.setEnabled(true);
        txtkewarganegaraan.setEnabled(true);
        txtpekerjaan.setEnabled(true);
        txtnik.setEnabled(true);
        txtalamat.setEnabled(true);
        txtnik.requestFocus();
    }
    
    protected void kosong(){
        txtnik.setText("");
        txtnama.setText("");
        txttempatlahir.setText("");
        txttgllahir.setText("");
        txtagama.setText("");
        txtpekerjaan.setText("");
        txtkewarganegaraan.setText("");
        txtalamat.setText("");
        txtcari.setText("");
    }     
     
     
    protected void datatable(){
        Object[] Baris = {"NAMA","TEMPAT_LAHIR","TGL_LAHIR","AGAMA","KEWARGANEGARAAN","PEKERJAAN","NIK","ALAMAT"};
        tabmode = new DefaultTableModel(null, Baris);
        tabeldatapenduduk.setModel(tabmode);
        
        String sql = "select * from datapenduduk";
        
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("nama");
                String b = hasil.getString("tempat_lahir");
                String c = hasil.getString("tanggal_lahir");
                String d = hasil.getString("agama");
                String e = hasil.getString("kewarganegaraan");
                String f = hasil.getString("pekerjaan");
                String g = hasil.getString("nik");
                String h = hasil.getString("alamat");
                
                String[] data={a,b,c,d,e,f,g,h};
                tabmode.addRow(data);
            }
            
        }catch(Exception e){
            
        }
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txttempatlahir = new javax.swing.JTextField();
        txttgllahir = new javax.swing.JTextField();
        txtagama = new javax.swing.JTextField();
        txtpekerjaan = new javax.swing.JTextField();
        txtnik = new javax.swing.JTextField();
        txtkewarganegaraan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        btnubah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnbersihkan = new javax.swing.JButton();
        btncetak = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabeldatapenduduk = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SURAT KETERANGAN DOMISILI");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NAMA");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TEMPAT LAHIR");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TGL LAHIR");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("AGAMA");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PEKERJAAN");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NIK");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ALAMAT");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("KEWARGANEGARAAN");

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        txttgllahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttgllahirActionPerformed(evt);
            }
        });

        txtkewarganegaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkewarganegaraanActionPerformed(evt);
            }
        });

        txtalamat.setColumns(20);
        txtalamat.setRows(5);
        jScrollPane1.setViewportView(txtalamat);

        btnubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/4 change.png"))); // NOI18N
        btnubah.setText("UBAH");
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });

        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/5 delete.png"))); // NOI18N
        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnbersihkan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/3 clear.png"))); // NOI18N
        btnbersihkan.setText("BERSIHKAN");
        btnbersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbersihkanActionPerformed(evt);
            }
        });

        btncetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/1 print.png"))); // NOI18N
        btncetak.setText("CETAK");
        btncetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncetakActionPerformed(evt);
            }
        });

        btnkeluar.setBackground(new java.awt.Color(255, 51, 0));
        btnkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/2 back.png"))); // NOI18N
        btnkeluar.setText("KELUAR");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        tabeldatapenduduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabeldatapenduduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldatapendudukMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabeldatapenduduk);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Masukan Nama");

        btncari.setText("CARI");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btncari))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(37, 37, 37))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnama)
                                    .addComponent(txttempatlahir)
                                    .addComponent(txttgllahir)
                                    .addComponent(txtagama)
                                    .addComponent(txtkewarganegaraan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(111, 111, 111)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtpekerjaan)
                                    .addComponent(txtnik)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnbersihkan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnhapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btncetak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnkeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(259, 259, 259))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(488, 488, 488)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncari))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnubah)
                        .addGap(18, 18, 18)
                        .addComponent(btnhapus)
                        .addGap(18, 18, 18)
                        .addComponent(btnbersihkan)
                        .addGap(16, 16, 16)
                        .addComponent(btncetak)
                        .addGap(18, 18, 18)
                        .addComponent(btnkeluar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttempatlahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txttgllahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtagama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtkewarganegaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtkewarganegaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkewarganegaraanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkewarganegaraanActionPerformed

    private void txttgllahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttgllahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttgllahirActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        new menuutama().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        Object[] Baris = {"NIK","NAMA","TEMPAT_LAHIR","TGL_LAHIR","AGAMA","PEKERJAAN","KEWARGANEGARAAN","ALAMAT"};
        tabmode = new DefaultTableModel(null, Baris);
        tabeldatapenduduk.setModel(tabmode);
        
        String sql = "SELECT * FROM datapenduduk WHERE nama like'%"+txtcari.getText()+"%' ";
        try{
            java.sql.Statement stat=conn.createStatement();
            ResultSet rs=stat.executeQuery(sql);
            while(rs.next()){
                String a = rs.getString("nik");
                String b = rs.getString("nama");
                String c = rs.getString("tempat_lahir");
                String d = rs.getString("tanggal_lahir");
                String e = rs.getString("agama");
                String f = rs.getString("pekerjaan");
                String g = rs.getString("kewarganegaraan");
                String h = rs.getString("alamat");
                
                String[] data ={a,b,c,d,e,f,g,h};
                tabmode.addRow(data);
                //////////////////////////////////////////////////kosong();
            }
            
        }catch(Exception e){
        
        }
    }//GEN-LAST:event_btncariActionPerformed

    private void btnbersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbersihkanActionPerformed
        kosong();
        datatable();
    }//GEN-LAST:event_btnbersihkanActionPerformed

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        try{
            String sql="UPDATE datapenduduk set nama=?, tempat_lahir=?, tanggal_lahir=?, agama=?, kewarganegaraan=?, pekerjaan=?, alamat=? WHERE nik=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtnama.getText());
            stat.setString(2, txttempatlahir.getText());
            stat.setString(3, txttgllahir.getText());
            stat.setString(4, txtagama.getText());
            stat.setString(5, txtkewarganegaraan.getText());
            stat.setString(6, txtpekerjaan.getText()); 
            stat.setString(7, txtalamat.getText());
            stat.setString(8, txtnik.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Berhasil Di Ubah" );
            kosong();
            txtnik.requestFocus();
            datatable();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Data Gagal Di Ubah" );
        }
    }//GEN-LAST:event_btnubahActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        int hapus=JOptionPane.showConfirmDialog(null, "Hapus", "Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        if(hapus==0){
           String sql="DELETE FROM datapenduduk where nik='"+txtnik.getText()+"'";
           try{
               PreparedStatement stat=conn.prepareStatement(sql);
               stat.executeUpdate();
               JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus" );
               kosong();
               txtnik.requestFocus();
               datatable();
           }catch(SQLException e){
               JOptionPane.showMessageDialog(null, "Data Gagal Di Hapus" );           
           }
       } 
    }//GEN-LAST:event_btnhapusActionPerformed

    private void tabeldatapendudukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldatapendudukMouseClicked
        int bar = tabeldatapenduduk.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();
        String f = tabmode.getValueAt(bar, 5).toString();
        String g = tabmode.getValueAt(bar, 6).toString();
        String h = tabmode.getValueAt(bar, 7).toString();
        
        txtnama.setText(a);
        txttempatlahir.setText(b);
        txttgllahir.setText(c);
        txtagama.setText(d);
        txtkewarganegaraan.setText(e);
        txtpekerjaan.setText(f);
        txtnik.setText(g);
        txtalamat.setText(h);
    }//GEN-LAST:event_tabeldatapendudukMouseClicked

    private void btncetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetakActionPerformed
        try{
           String namaFile="src/laporan/LaporanDomisili.jasper";
           Connection conn=new koneksi().connect(); 
           HashMap parameter = new HashMap();
           File report_file=new File(namaFile);
           //mengambil parameter
           parameter.put("pnik", String.valueOf(txtnik.getText()));
           JasperReport jasper = (JasperReport) JRLoader.loadObject(report_file.getPath());
           //JasperReport jasper = (JasperReport) JRLoader.loadObject(report_file.getPath());
           
           JasperPrint jasperPrint=JasperFillManager.fillReport(jasper, parameter, conn);
           JasperViewer.viewReport(jasperPrint, false);
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
    }//GEN-LAST:event_btncetakActionPerformed

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
            java.util.logging.Logger.getLogger(suratdomisili.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(suratdomisili.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(suratdomisili.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(suratdomisili.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new suratdomisili().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbersihkan;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btncetak;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tabeldatapenduduk;
    private javax.swing.JTextField txtagama;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtkewarganegaraan;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnik;
    private javax.swing.JTextField txtpekerjaan;
    private javax.swing.JTextField txttempatlahir;
    private javax.swing.JTextField txttgllahir;
    // End of variables declaration//GEN-END:variables
}
