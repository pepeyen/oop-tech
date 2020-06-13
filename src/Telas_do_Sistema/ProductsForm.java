package Telas_do_Sistema;
import Classes_do_Sistema.Products;
import java.awt.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;

public class ProductsForm extends javax.swing.JFrame {
    
    int coordX, coordY;
    Products product = new Products();
    
    public ProductsForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    
    public String regProduct()
    {
        String path = "src\\Outputs_do_Sistema\\Products.txt";
        try {
            FileWriter fw = new FileWriter(path,true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Product ID:"+jIptProdID.getText());

            pw.println("Product Name:"+jIptProdName.getText());

            pw.println("Product Description:"+jIptProdDescription.getText());
            
            pw.println("Product Production Price:"+jIptProdProductionPrice.getText());

            pw.println("Product Selling Price:"+jIptProdSellingPrice.getText());
            
            pw.print("---------------------------------------------\n");
            pw.flush();
            pw.close();
            fw.close();
        } 
        catch (Exception e) {
            
        }
        return null;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBackgroundPane = new javax.swing.JLayeredPane();
        jTitleBar = new javax.swing.JLayeredPane();
        jMinimizeButton = new javax.swing.JButton();
        jCloseButton = new javax.swing.JButton();
        jIptProdName = new javax.swing.JTextField();
        jRegProduct = new javax.swing.JButton();
        jIptProdProductionPrice = new javax.swing.JTextField();
        jIptProdID = new javax.swing.JTextField();
        jIptProdDescription = new javax.swing.JTextField();
        jIptProdSellingPrice = new javax.swing.JTextField();
        jIptProdIDLabel = new javax.swing.JLabel();
        jIptProdNameLabel = new javax.swing.JLabel();
        jIptProdDescriptionLabel = new javax.swing.JLabel();
        jIptProdSellingPriceLabel = new javax.swing.JLabel();
        jIptProdProductionPriceLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        jBackgroundPane.setBackground(new java.awt.Color(139, 139, 139));
        jBackgroundPane.setOpaque(true);
        jBackgroundPane.setPreferredSize(new java.awt.Dimension(1280, 720));

        jMinimizeButton.setBackground(new java.awt.Color(249, 249, 249));
        jMinimizeButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jMinimizeButton.setForeground(new java.awt.Color(249, 249, 249));
        jMinimizeButton.setText("-");
        jMinimizeButton.setBorderPainted(false);
        jMinimizeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMinimizeButton.setFocusPainted(false);
        jMinimizeButton.setOpaque(false);
        jMinimizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMinimizeButtonActionPerformed(evt);
            }
        });

        jCloseButton.setBackground(new java.awt.Color(249, 249, 249));
        jCloseButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCloseButton.setForeground(new java.awt.Color(249, 249, 249));
        jCloseButton.setText("X");
        jCloseButton.setBorderPainted(false);
        jCloseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCloseButton.setFocusPainted(false);
        jCloseButton.setOpaque(false);
        jCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCloseButtonActionPerformed(evt);
            }
        });

        jTitleBar.setLayer(jMinimizeButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTitleBar.setLayer(jCloseButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jTitleBarLayout = new javax.swing.GroupLayout(jTitleBar);
        jTitleBar.setLayout(jTitleBarLayout);
        jTitleBarLayout.setHorizontalGroup(
            jTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTitleBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jMinimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jTitleBarLayout.setVerticalGroup(
            jTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMinimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCloseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jIptProdName.setBackground(new java.awt.Color(189, 189, 189));
        jIptProdName.setForeground(new java.awt.Color(102, 102, 102));
        jIptProdName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        jIptProdName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIptProdNameActionPerformed(evt);
            }
        });

        jRegProduct.setBackground(new java.awt.Color(149, 149, 149));
        jRegProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRegProduct.setForeground(new java.awt.Color(249, 249, 249));
        jRegProduct.setText("Inserir");
        jRegProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        jRegProduct.setOpaque(false);
        jRegProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegProductActionPerformed(evt);
            }
        });

        jIptProdProductionPrice.setBackground(new java.awt.Color(189, 189, 189));
        jIptProdProductionPrice.setForeground(new java.awt.Color(102, 102, 102));
        jIptProdProductionPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));

        jIptProdID.setBackground(new java.awt.Color(189, 189, 189));
        jIptProdID.setForeground(new java.awt.Color(102, 102, 102));
        jIptProdID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));

        jIptProdDescription.setBackground(new java.awt.Color(189, 189, 189));
        jIptProdDescription.setForeground(new java.awt.Color(102, 102, 102));
        jIptProdDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));

        jIptProdSellingPrice.setBackground(new java.awt.Color(189, 189, 189));
        jIptProdSellingPrice.setForeground(new java.awt.Color(102, 102, 102));
        jIptProdSellingPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));

        jIptProdIDLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jIptProdIDLabel.setForeground(new java.awt.Color(249, 249, 249));
        jIptProdIDLabel.setText("Product ID");

        jIptProdNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jIptProdNameLabel.setForeground(new java.awt.Color(249, 249, 249));
        jIptProdNameLabel.setText("Product Name");

        jIptProdDescriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jIptProdDescriptionLabel.setForeground(new java.awt.Color(249, 249, 249));
        jIptProdDescriptionLabel.setText("Product Description");

        jIptProdSellingPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jIptProdSellingPriceLabel.setForeground(new java.awt.Color(249, 249, 249));
        jIptProdSellingPriceLabel.setText("Product Selling Price");

        jIptProdProductionPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jIptProdProductionPriceLabel.setForeground(new java.awt.Color(249, 249, 249));
        jIptProdProductionPriceLabel.setText("Product Production Price");

        jBackgroundPane.setLayer(jTitleBar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptProdName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jRegProduct, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptProdProductionPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptProdID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptProdDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptProdSellingPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptProdIDLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptProdNameLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptProdDescriptionLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptProdSellingPriceLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIptProdProductionPriceLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jBackgroundPaneLayout = new javax.swing.GroupLayout(jBackgroundPane);
        jBackgroundPane.setLayout(jBackgroundPaneLayout);
        jBackgroundPaneLayout.setHorizontalGroup(
            jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTitleBar)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBackgroundPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jIptProdID, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jIptProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRegProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jIptProdDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jIptProdSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jIptProdProductionPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
            .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jIptProdIDLabel)
                .addGap(118, 118, 118)
                .addComponent(jIptProdNameLabel)
                .addGap(94, 94, 94)
                .addComponent(jIptProdDescriptionLabel)
                .addGap(84, 84, 84)
                .addComponent(jIptProdSellingPriceLabel)
                .addGap(55, 55, 55)
                .addComponent(jIptProdProductionPriceLabel)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jBackgroundPaneLayout.setVerticalGroup(
            jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                .addComponent(jTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246)
                .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jIptProdIDLabel)
                    .addComponent(jIptProdNameLabel)
                    .addComponent(jIptProdDescriptionLabel)
                    .addComponent(jIptProdSellingPriceLabel)
                    .addComponent(jIptProdProductionPriceLabel))
                .addGap(18, 18, 18)
                .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jIptProdID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIptProdDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIptProdSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIptProdProductionPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIptProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jRegProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 247, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jBackgroundPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBackgroundPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMinimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMinimizeButtonActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jMinimizeButtonActionPerformed

    private void jCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCloseButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_jCloseButtonActionPerformed

    private void jRegProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegProductActionPerformed
        regProduct();
    }//GEN-LAST:event_jRegProductActionPerformed

    private void jIptProdNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIptProdNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIptProdNameActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jBackgroundPane;
    private javax.swing.JButton jCloseButton;
    private javax.swing.JTextField jIptProdDescription;
    private javax.swing.JLabel jIptProdDescriptionLabel;
    private javax.swing.JTextField jIptProdID;
    private javax.swing.JLabel jIptProdIDLabel;
    private javax.swing.JTextField jIptProdName;
    private javax.swing.JLabel jIptProdNameLabel;
    private javax.swing.JTextField jIptProdProductionPrice;
    private javax.swing.JLabel jIptProdProductionPriceLabel;
    private javax.swing.JTextField jIptProdSellingPrice;
    private javax.swing.JLabel jIptProdSellingPriceLabel;
    private javax.swing.JButton jMinimizeButton;
    private javax.swing.JButton jRegProduct;
    private javax.swing.JLayeredPane jTitleBar;
    // End of variables declaration//GEN-END:variables
}
