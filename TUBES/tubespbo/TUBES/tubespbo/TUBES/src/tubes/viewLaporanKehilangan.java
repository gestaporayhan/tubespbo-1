/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author YAHYA
 */
public class viewLaporanKehilangan extends javax.swing.JFrame {

    /**
     * Creates new form viewLaporanKehilangan
     */
    public viewLaporanKehilangan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tanggalKehilangan = new javax.swing.JTextField();
        jamKehilangan = new javax.swing.JTextField();
        sebabKehilangan = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        Batal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(tanggalKehilangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 250, 30));
        getContentPane().add(jamKehilangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 250, 30));
        getContentPane().add(sebabKehilangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 250, 30));

        ok.setText("OK");
        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 70, 40));

        Batal.setText("Batal");
        getContentPane().add(Batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 70, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\GitHub\\TUBES\\tubespbo\\TUBES\\background\\14.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 944, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(viewLaporanKehilangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewLaporanKehilangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewLaporanKehilangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewLaporanKehilangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewLaporanKehilangan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Batal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jamKehilangan;
    private javax.swing.JButton ok;
    private javax.swing.JTextField sebabKehilangan;
    private javax.swing.JTextField tanggalKehilangan;
    // End of variables declaration//GEN-END:variables
}
