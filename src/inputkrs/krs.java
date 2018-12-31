package inputkrs;

import javax.swing.JOptionPane;

public class krs extends javax.swing.JFrame {

    public krs() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNim = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbJurusan = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtIpk = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSks = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrak = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTeori = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtBayar = new javax.swing.JTextField();
        txtKembali = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NIM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 69, -1, -1));

        txtNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNimActionPerformed(evt);
            }
        });
        getContentPane().add(txtNim, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 66, 130, -1));

        jLabel2.setText("NAMA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 119, -1, -1));

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 116, 130, -1));

        jLabel3.setText("JURUSAN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 171, -1, -1));

        cbJurusan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---JURUSAN---", "S1 INFORMATIKA", "S1 MANAJEMEN", "S1 AKUNTANSI" }));
        cbJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJurusanActionPerformed(evt);
            }
        });
        getContentPane().add(cbJurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 168, 130, -1));

        jLabel4.setText("IPK");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 231, -1, -1));

        txtIpk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIpkActionPerformed(evt);
            }
        });
        getContentPane().add(txtIpk, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 228, 130, -1));

        jLabel5.setText("TOTAL SKS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        txtSks.setEditable(false);
        txtSks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSksActionPerformed(evt);
            }
        });
        getContentPane().add(txtSks, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 66, 112, -1));

        jLabel6.setText("PRAKTIKUM");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        txtPrak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrakActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrak, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 116, 112, -1));

        jLabel7.setText("TEORI");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        txtTeori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeoriActionPerformed(evt);
            }
        });
        getContentPane().add(txtTeori, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 112, -1));

        jLabel8.setText("TOTAL BAYAR");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        txtTotal.setEditable(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 102, -1));

        jLabel9.setText("BAYAR");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));

        jLabel10.setText("KEMBALI");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        txtBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBayarActionPerformed(evt);
            }
        });
        getContentPane().add(txtBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 102, -1));

        txtKembali.setEditable(false);
        txtKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(txtKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 102, -1));

        jLabel11.setText("Rp");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, -1, -1));

        jLabel12.setText("Rp");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, -1));

        jLabel13.setText("Rp");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, -1, -1));

        jLabel14.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel14.setText("PEMBAYARAN SKS");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNimActionPerformed
    int sks;
    String temp;
    double ipk;
    private void txtIpkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIpkActionPerformed
        ipk=Double.parseDouble(txtIpk.getText());
        if((ipk<=4 )&& (ipk>3.4)){
            sks=24;
        }else if((ipk<=3.4) && (ipk>2.9)){
            sks=23;
        }else if((ipk<=2.9) && (ipk>2.4)){
            sks=22;
        }else if((ipk<=2.4) && (ipk>2)){
            sks=21;
        }else 
            sks=9;
        temp=String.valueOf(sks);
        txtSks.setText(temp);
    }//GEN-LAST:event_txtIpkActionPerformed
    int sksPraktik,sksTeori,totalsks,hrgSks,totalbayar;
    String jmlhbyr;
    private void txtPrakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrakActionPerformed
     
    }//GEN-LAST:event_txtPrakActionPerformed

    private void txtTeoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeoriActionPerformed
        
        try {
            sksPraktik=Integer.parseInt(txtPrak.getText());
            sksTeori=Integer.parseInt(txtTeori.getText());
            totalsks=sksPraktik+sksTeori;
            cekSks(totalsks);
        } catch (errorSKS e) {
            JOptionPane.showMessageDialog(this, "jUMLAH SKS MELEBIHI BATAS");
        } catch(NumberFormatException b){
            JOptionPane.showMessageDialog(this, "Inputan Salah,Harus Angka");
        }
    if(cbJurusan.getSelectedIndex()==0){
        
    }else if(cbJurusan.getSelectedIndex()==1){
        hrgSks=175000;
    }else if(cbJurusan.getSelectedIndex()==2){
        hrgSks=185000;
    }else if(cbJurusan.getSelectedIndex()==3){
        hrgSks=195000;}
    totalbayar=totalsks*hrgSks;
    jmlhbyr=String.valueOf(totalbayar);
    txtTotal.setText(jmlhbyr);
    }//GEN-LAST:event_txtTeoriActionPerformed
    int bayar,kembali;
    String TempKembali;
    private void txtBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBayarActionPerformed
       bayar=Integer.parseInt(txtBayar.getText());
       kembali=bayar-totalbayar;
       TempKembali=String.valueOf(kembali);
       txtKembali.setText(TempKembali);
    }//GEN-LAST:event_txtBayarActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKembaliActionPerformed

    private void txtSksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSksActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void cbJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJurusanActionPerformed

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
            java.util.logging.Logger.getLogger(krs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(krs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(krs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(krs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new krs().setVisible(true);
            }
        });
    }
    public void cekSks (int total) throws errorSKS {
        if(total>24){
            throw new errorSKS();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbJurusan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtIpk;
    private javax.swing.JTextField txtKembali;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNim;
    private javax.swing.JTextField txtPrak;
    private javax.swing.JTextField txtSks;
    private javax.swing.JTextField txtTeori;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
