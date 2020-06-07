package Telas_do_Sistema;
import java.awt.*;

public class HomeForm extends javax.swing.JFrame {
    int coordX, coordY;
    
    public HomeForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBackgroundPane = new javax.swing.JLayeredPane();
        jTitleBar = new javax.swing.JPanel();
        jMinimizeButton = new javax.swing.JButton();
        jCloseButton = new javax.swing.JButton();
        jTitlePane = new javax.swing.JLayeredPane();
        jTitleLabel = new javax.swing.JLabel();
        jProductsButton = new javax.swing.JButton();
        jClientButton = new javax.swing.JButton();
        jOrdersButton = new javax.swing.JButton();
        jIventoryButton = new javax.swing.JButton();
        jStockControlButton = new javax.swing.JButton();
        jIncomeInfluxButton = new javax.swing.JButton();
        jSalesButton = new javax.swing.JButton();
        jReportButton = new javax.swing.JButton();
        jBudgetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OOP Tech");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(249, 249, 249));
        setUndecorated(true);
        setResizable(false);

        jBackgroundPane.setBackground(new java.awt.Color(149, 149, 149));
        jBackgroundPane.setOpaque(true);

        jTitleBar.setBackground(new java.awt.Color(249, 249, 249));
        jTitleBar.setOpaque(false);
        jTitleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTitleBarMouseDragged(evt);
            }
        });
        jTitleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTitleBarMousePressed(evt);
            }
        });

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

        javax.swing.GroupLayout jTitleBarLayout = new javax.swing.GroupLayout(jTitleBar);
        jTitleBar.setLayout(jTitleBarLayout);
        jTitleBarLayout.setHorizontalGroup(
            jTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTitleBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jMinimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jTitleBarLayout.setVerticalGroup(
            jTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMinimizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jCloseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTitlePane.setBackground(new java.awt.Color(249, 249, 249));
        jTitlePane.setOpaque(true);

        jTitleLabel.setBackground(new java.awt.Color(249, 249, 249));
        jTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jTitleLabel.setForeground(new java.awt.Color(130, 130, 130));
        jTitleLabel.setText("OOP TECH");

        jTitlePane.setLayer(jTitleLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jTitlePaneLayout = new javax.swing.GroupLayout(jTitlePane);
        jTitlePane.setLayout(jTitlePaneLayout);
        jTitlePaneLayout.setHorizontalGroup(
            jTitlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTitlePaneLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jTitlePaneLayout.setVerticalGroup(
            jTitlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTitlePaneLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(319, Short.MAX_VALUE))
        );

        jProductsButton.setBackground(new java.awt.Color(149, 149, 149));
        jProductsButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jProductsButton.setForeground(new java.awt.Color(249, 249, 249));
        jProductsButton.setText("Produtos");
        jProductsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        jProductsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jProductsButton.setFocusPainted(false);
        jProductsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jProductsButtonMouseClicked(evt);
            }
        });

        jClientButton.setBackground(new java.awt.Color(149, 149, 149));
        jClientButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jClientButton.setForeground(new java.awt.Color(249, 249, 249));
        jClientButton.setText("Clientes");
        jClientButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        jClientButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jClientButton.setFocusPainted(false);
        jClientButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jClientButtonMouseClicked(evt);
            }
        });

        jOrdersButton.setBackground(new java.awt.Color(149, 149, 149));
        jOrdersButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jOrdersButton.setForeground(new java.awt.Color(249, 249, 249));
        jOrdersButton.setText("Pedidos");
        jOrdersButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        jOrdersButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jOrdersButton.setFocusPainted(false);
        jOrdersButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jOrdersButtonMouseClicked(evt);
            }
        });

        jIventoryButton.setBackground(new java.awt.Color(149, 149, 149));
        jIventoryButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jIventoryButton.setForeground(new java.awt.Color(249, 249, 249));
        jIventoryButton.setText("Iventario");
        jIventoryButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        jIventoryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jIventoryButton.setFocusPainted(false);
        jIventoryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIventoryButtonMouseClicked(evt);
            }
        });

        jStockControlButton.setBackground(new java.awt.Color(149, 149, 149));
        jStockControlButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jStockControlButton.setForeground(new java.awt.Color(249, 249, 249));
        jStockControlButton.setText("Controle De Estoque");
        jStockControlButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        jStockControlButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jStockControlButton.setFocusPainted(false);
        jStockControlButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jStockControlButtonMouseClicked(evt);
            }
        });

        jIncomeInfluxButton.setBackground(new java.awt.Color(149, 149, 149));
        jIncomeInfluxButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jIncomeInfluxButton.setForeground(new java.awt.Color(249, 249, 249));
        jIncomeInfluxButton.setText("Fluxo Do Caixa");
        jIncomeInfluxButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        jIncomeInfluxButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jIncomeInfluxButton.setFocusPainted(false);
        jIncomeInfluxButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIncomeInfluxButtonMouseClicked(evt);
            }
        });

        jSalesButton.setBackground(new java.awt.Color(149, 149, 149));
        jSalesButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSalesButton.setForeground(new java.awt.Color(249, 249, 249));
        jSalesButton.setText("Vendas");
        jSalesButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        jSalesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSalesButton.setFocusPainted(false);
        jSalesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSalesButtonMouseClicked(evt);
            }
        });

        jReportButton.setBackground(new java.awt.Color(149, 149, 149));
        jReportButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jReportButton.setForeground(new java.awt.Color(249, 249, 249));
        jReportButton.setText("Relatorio");
        jReportButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        jReportButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jReportButton.setFocusPainted(false);
        jReportButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jReportButtonMouseClicked(evt);
            }
        });

        jBudgetButton.setBackground(new java.awt.Color(149, 149, 149));
        jBudgetButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBudgetButton.setForeground(new java.awt.Color(249, 249, 249));
        jBudgetButton.setText("Orçamentos");
        jBudgetButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        jBudgetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBudgetButton.setFocusPainted(false);
        jBudgetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBudgetButtonMouseClicked(evt);
            }
        });

        jBackgroundPane.setLayer(jTitleBar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jTitlePane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jProductsButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jClientButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jOrdersButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIventoryButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jStockControlButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jIncomeInfluxButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jSalesButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jReportButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jBudgetButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jBackgroundPaneLayout = new javax.swing.GroupLayout(jBackgroundPane);
        jBackgroundPane.setLayout(jBackgroundPaneLayout);
        jBackgroundPaneLayout.setHorizontalGroup(
            jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                .addComponent(jTitlePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProductsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBudgetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIncomeInfluxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBackgroundPaneLayout.createSequentialGroup()
                        .addComponent(jClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jOrdersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBackgroundPaneLayout.createSequentialGroup()
                        .addComponent(jIventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jStockControlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBackgroundPaneLayout.createSequentialGroup()
                        .addComponent(jSalesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jBackgroundPaneLayout.setVerticalGroup(
            jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                .addComponent(jTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jProductsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jOrdersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jStockControlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBudgetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jIventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jIncomeInfluxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSalesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTitlePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBackgroundPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBackgroundPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCloseButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_jCloseButtonActionPerformed

    private void jMinimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMinimizeButtonActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jMinimizeButtonActionPerformed

    private void jTitleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTitleBarMousePressed
        coordX = evt.getX();
        coordY = evt.getY();
    }//GEN-LAST:event_jTitleBarMousePressed

    private void jTitleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTitleBarMouseDragged

        this.setLocation(this.getLocation().x + evt.getX() - coordX,this.getLocation().y + evt.getY() - coordY);
    }//GEN-LAST:event_jTitleBarMouseDragged

    private void jProductsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProductsButtonMouseClicked
        ProductsForm productsForm = new ProductsForm();
        productsForm.setVisible(true);
    }//GEN-LAST:event_jProductsButtonMouseClicked

    private void jClientButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jClientButtonMouseClicked
        ClientForm clientForm = new ClientForm();
        clientForm.setVisible(true);
    }//GEN-LAST:event_jClientButtonMouseClicked

    private void jOrdersButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jOrdersButtonMouseClicked
        OrdersForm ordersForm = new OrdersForm();
        ordersForm.setVisible(true);
    }//GEN-LAST:event_jOrdersButtonMouseClicked

    private void jBudgetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBudgetButtonMouseClicked
        BudgetForm budgetForm = new BudgetForm();
        budgetForm.setVisible(true);
    }//GEN-LAST:event_jBudgetButtonMouseClicked

    private void jIventoryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIventoryButtonMouseClicked
        IventoryForm iventoryForm = new IventoryForm();
        iventoryForm.setVisible(true);
    }//GEN-LAST:event_jIventoryButtonMouseClicked

    private void jStockControlButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jStockControlButtonMouseClicked
        StockControlForm stockControlForm = new StockControlForm();
        stockControlForm.setVisible(true);
    }//GEN-LAST:event_jStockControlButtonMouseClicked

    private void jIncomeInfluxButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIncomeInfluxButtonMouseClicked
        IncomeInfluxForm incomeInfluxForm = new IncomeInfluxForm();
        incomeInfluxForm.setVisible(true);
    }//GEN-LAST:event_jIncomeInfluxButtonMouseClicked

    private void jSalesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalesButtonMouseClicked
        SalesForm salesForm = new SalesForm();
        salesForm.setVisible(true);
    }//GEN-LAST:event_jSalesButtonMouseClicked

    private void jReportButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jReportButtonMouseClicked
        ReportForm reportForm = new ReportForm();
        reportForm.setVisible(true);
    }//GEN-LAST:event_jReportButtonMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jBackgroundPane;
    private javax.swing.JButton jBudgetButton;
    private javax.swing.JButton jClientButton;
    private javax.swing.JButton jCloseButton;
    private javax.swing.JButton jIncomeInfluxButton;
    private javax.swing.JButton jIventoryButton;
    private javax.swing.JButton jMinimizeButton;
    private javax.swing.JButton jOrdersButton;
    private javax.swing.JButton jProductsButton;
    private javax.swing.JButton jReportButton;
    private javax.swing.JButton jSalesButton;
    private javax.swing.JButton jStockControlButton;
    private javax.swing.JPanel jTitleBar;
    private javax.swing.JLabel jTitleLabel;
    private javax.swing.JLayeredPane jTitlePane;
    // End of variables declaration//GEN-END:variables
}
