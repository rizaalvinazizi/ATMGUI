/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmgui;

import javax.swing.JOptionPane;

/**
 *
 * @author rizaalvin
 */
public class Transfer3 extends javax.swing.JFrame {
int saldo;
String tujuan;
int jumlah;
    /**
     * Creates new form Transfer3
     */
    public Transfer3(int uang, String to, String jml) {
        initComponents();
        saldo = uang;
        tujuan = to;
        jumlah = Integer.parseInt(jml);
        
        jTujuan.setText(tujuan);
        jJumlah.setText(""+jumlah);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jJumlah = new javax.swing.JTextField();
        jTujuan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("ATM BNI SYARIAH");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(230, 20, 140, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("ANDA INGIN MELAKUKAN TRANSFER DENGAN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 80, 310, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("JUMLAH");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 210, 60, 40);

        jJumlah.setEditable(false);
        getContentPane().add(jJumlah);
        jJumlah.setBounds(190, 220, 190, 40);

        jTujuan.setEditable(false);
        getContentPane().add(jTujuan);
        jTujuan.setBounds(190, 150, 190, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("TUJUAN");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 140, 60, 40);

        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        jLabel5.setText("APAKAH DATA TERSEBUT BENAR?");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 280, 210, 50);

        jButton1.setText("YA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 350, 70, 23);

        jButton3.setText("TIDAK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(320, 350, 70, 23);

        setBounds(0, 0, 609, 430);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        saldo = saldo - jumlah;
        if (saldo > 0){
        JOptionPane.showMessageDialog(null,"Proses transfer berhasil!");
        JOptionPane.showMessageDialog(null,"Sisa saldo anda "+saldo);
        int z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain?","ATM BNI SYARIAH", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
if (z==0){
    new ATM(saldo).setVisible(true);
    this.dispose();}
else{
    new Terimakasih().setVisible(true);
        this.dispose();
        }
       } else {
            JOptionPane.showMessageDialog(null,"Saldo anda tidak mencukupi untuk melakukan transaksi ini");
            saldo = saldo + jumlah;
            JOptionPane.showMessageDialog(null,"Saldo anda saat ini "+saldo);
            new ATM(saldo).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new Transfer(saldo).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Transfer3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transfer3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transfer3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transfer3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField jJumlah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTujuan;
    // End of variables declaration//GEN-END:variables
}
