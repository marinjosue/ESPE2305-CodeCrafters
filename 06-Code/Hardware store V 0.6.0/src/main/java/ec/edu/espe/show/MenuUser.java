/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.show;

import ec.edu.espe.show.ShowOffers;

/**
 *
 * @author USER
 */
public class MenuUser extends javax.swing.JFrame {

    /**
     * Creates new form MenuUser
     */
    public MenuUser() {
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

        jLabel1 = new javax.swing.JLabel();
        btnCatalog = new javax.swing.JButton();
        btnShowOffers = new javax.swing.JButton();
        btnCart = new javax.swing.JButton();
        btnComments = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Menu de Usuario");

        btnCatalog.setText("Ver Catalogo");
        btnCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogActionPerformed(evt);
            }
        });

        btnShowOffers.setText("Mostrar Promociones y ofertas ");
        btnShowOffers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowOffersActionPerformed(evt);
            }
        });

        btnCart.setText("Carrito de Compras");
        btnCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartActionPerformed(evt);
            }
        });

        btnComments.setText("Dejar Comentarios");
        btnComments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommentsActionPerformed(evt);
            }
        });

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnShowOffers)
                    .addComponent(btnCatalog, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCart, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComments, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnExit)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnCatalog)
                .addGap(18, 18, 18)
                .addComponent(btnShowOffers)
                .addGap(18, 18, 18)
                .addComponent(btnCart)
                .addGap(18, 18, 18)
                .addComponent(btnComments)
                .addGap(28, 28, 28)
                .addComponent(btnExit)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogActionPerformed
        Catalog catalog = new Catalog();
        catalog.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCatalogActionPerformed

    private void btnShowOffersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowOffersActionPerformed
        ShowOffers showOffers = new ShowOffers();
        showOffers.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnShowOffersActionPerformed

    private void btnCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartActionPerformed
        Cart cart = new Cart();
        cart.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCartActionPerformed

    private void btnCommentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommentsActionPerformed
        Comments comments = new Comments();
        comments.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCommentsActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        HardwareStoreDSA hardwareStoreDSA = new HardwareStoreDSA();
        hardwareStoreDSA.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCart;
    private javax.swing.JButton btnCatalog;
    private javax.swing.JButton btnComments;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnShowOffers;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
