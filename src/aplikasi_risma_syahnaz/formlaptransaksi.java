/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi_risma_syahnaz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author user
 */
public class formlaptransaksi extends javax.swing.JFrame {
    Connection konek;
    PreparedStatement pst;
    ResultSet rst;
    String tanggal,tanggal2, sql;
    /**
     * Creates new form 
     */
    public formlaptransaksi() {
        initComponents();
        konek = Koneksi.KoneksiDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        daritgl = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btncari1 = new javax.swing.JButton();
        sampaitgl = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        sebelumtgl = new com.toedter.calendar.JDateChooser();
        btn3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        setelahtgl = new com.toedter.calendar.JDateChooser();
        btncari2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbllaptransaksi = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbldataproduk = new javax.swing.JTable();

        jLabel2.setText("jLabel2");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Sebelum Tanggal");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Diantara Tanggal");

        btncari1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btncari1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-search-20.png"))); // NOI18N
        btncari1.setText("cari");
        btncari1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncari1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("s/d");

        btn3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-search-20.png"))); // NOI18N
        btn3.setText("cari");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Setelah Tanggal");

        btncari2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btncari2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-search-20.png"))); // NOI18N
        btncari2.setText("cari");
        btncari2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncari2ActionPerformed(evt);
            }
        });

        tbllaptransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PenjualanID", "TanggalPenjualan", "TotalHarga", "JamPenjualan", "DetailID"
            }
        ));
        tbllaptransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbllaptransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbllaptransaksi);

        tbldataproduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DetailID", "PenjualanID", "ProdukID", "JumlahProduk", "SubTotal"
            }
        ));
        tbldataproduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldataprodukMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbldataproduk);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(btncari1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(sebelumtgl, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(setelahtgl, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(daritgl, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addGap(37, 37, 37)
                                        .addComponent(sampaitgl, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(btncari2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(sebelumtgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btncari1)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3))
                    .addComponent(daritgl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sampaitgl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(12, 12, 12)
                .addComponent(btncari2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(setelahtgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn3)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncari1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncari1ActionPerformed
 try {
     SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
     tanggal = format.format(sebelumtgl.getDate());
     sql = "select * from tbl_penjualan where TanggalPenjualan <'"+tanggal+"'";
     pst = konek.prepareStatement(sql);
     tbllaptransaksi.setModel(DbUtils.resultSetToTableModel(rst));
 } catch (Exception e) {
     JOptionPane.showMessageDialog(null, "Data Tidak Tampil");
 }
// TODO add your handling code here:
    }//GEN-LAST:event_btncari1ActionPerformed

    private void tbllaptransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbllaptransaksiMouseClicked
try {
    int row = tbllaptransaksi.getSelectedRow();
    String tableKlik = (tbllaptransaksi.getModel().getValueAt (row, 1).toString());
    String sql = "select * from tbl_detailpenjualan where DetailID=?";
    pst = konek.prepareStatement(sql);
    pst.setString(1, tableKlik);
    rst = pst.executeQuery();
    tbldataproduk.setModel(DbUtils.resultSetToTableModel(rst));
} catch (Exception e){
    JOptionPane.showMessageDialog(null, e);
}
    // TODO add your handling code here:
    }//GEN-LAST:event_tbllaptransaksiMouseClicked

    private void btncari2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncari2ActionPerformed
    try {
     SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
     tanggal = format.format(sebelumtgl.getDate());
     tanggal2 = format.format(sampaitgl.getDate());
     sql = "select * from tbl_penjualan where TanggalPenjualan <'"+tanggal+"'";
     pst = konek.prepareStatement(sql);
     tbllaptransaksi.setModel(DbUtils.resultSetToTableModel(rst));
 } catch (Exception e) {
     JOptionPane.showMessageDialog(null, "Data Tidak Tampil");
 }    // TODO add your handling code here:
    }//GEN-LAST:event_btncari2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
     try {
     SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
     tanggal = format.format(sebelumtgl.getDate());
     sql = "select * from tbl_penjualan where TanggalPenjualan >'"+tanggal+"'";
     pst = konek.prepareStatement(sql);
     tbllaptransaksi.setModel(DbUtils.resultSetToTableModel(rst));
 } catch (Exception e) {
     JOptionPane.showMessageDialog(null, "Data Tidak Tampil");
 }    // TODO add your handling code here:
    }//GEN-LAST:event_btn3ActionPerformed

    private void tbldataprodukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldataprodukMouseClicked
    try {
    int row = tbldataproduk.getSelectedRow();
    String tableKlik = (tbldataproduk.getModel().getValueAt (row, 1).toString());
    String sql = "select * from detailpenjualan where DetailID=?";
    pst = konek.prepareStatement(sql);
    pst.setString(1, tableKlik);
    rst = pst.executeQuery();
    tbllaptransaksi.setModel(DbUtils.resultSetToTableModel(rst));
 } catch (Exception e){
    JOptionPane.showMessageDialog(null, e);
}   
        // TODO add your handling code here:
    }//GEN-LAST:event_tbldataprodukMouseClicked

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
            java.util.logging.Logger.getLogger(formlaptransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formlaptransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formlaptransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formlaptransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formlaptransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn3;
    private javax.swing.JButton btncari1;
    private javax.swing.JButton btncari2;
    private com.toedter.calendar.JDateChooser daritgl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private com.toedter.calendar.JDateChooser sampaitgl;
    private com.toedter.calendar.JDateChooser sebelumtgl;
    private com.toedter.calendar.JDateChooser setelahtgl;
    private javax.swing.JTable tbldataproduk;
    private javax.swing.JTable tbllaptransaksi;
    // End of variables declaration//GEN-END:variables
}
