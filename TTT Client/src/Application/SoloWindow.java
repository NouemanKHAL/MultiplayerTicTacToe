/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import Game.PCTicTacToe;
import Game.SoloTicTacToe;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author hajar
 */
public class SoloWindow extends javax.swing.JFrame {

    /**
     * Creates new form Solo
     */
    public SoloWindow() {
        super("Solo");
        initComponents();
        getContentPane().setBackground(new java.awt.Color(247, 247, 247));
        
        this.setLocationRelativeTo(null); 
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false); 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnPC = new javax.swing.JButton();
        btnAmi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(14, 121, 183));
        jLabel1.setText("Choose your opponent !");

        btnPC.setBackground(new java.awt.Color(14, 121, 183));
        btnPC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPC.setForeground(new java.awt.Color(204, 255, 255));
        btnPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Application/images/icons8_Computer_20px.png"))); // NOI18N
        btnPC.setText("Computer");
        btnPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPCActionPerformed(evt);
            }
        });

        btnAmi.setBackground(new java.awt.Color(14, 121, 183));
        btnAmi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAmi.setForeground(new java.awt.Color(204, 255, 255));
        btnAmi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Application/images/icons8_Friends_20px.png"))); // NOI18N
        btnAmi.setText("Friend");
        btnAmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPC, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAmi, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAmi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPCActionPerformed
        // TODO add your handling code here:
        SwingUtilities.invokeLater( new Runnable() {
            public void run() {
                new PCTicTacToe().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnPCActionPerformed

    private void btnAmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmiActionPerformed
        // TODO add your handling code here:
       Thread t = new Thread() {
           public void run() {
               new SoloTicTacToe().setVisible(true);
           }
       };
       t.start();
    }//GEN-LAST:event_btnAmiActionPerformed

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
            java.util.logging.Logger.getLogger(SoloWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SoloWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SoloWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SoloWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SoloWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAmi;
    private javax.swing.JButton btnPC;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
