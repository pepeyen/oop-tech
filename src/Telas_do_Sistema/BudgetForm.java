package Telas_do_Sistema;
import Classes_do_Sistema.Budget;
import static Classes_do_Sistema.Home.clients;
import static Classes_do_Sistema.Home.totalClients;
import static Classes_do_Sistema.Home.totalProducts;
import static Classes_do_Sistema.Home.products;
import static Classes_do_Sistema.Home.currentBudget;
import static Classes_do_Sistema.Home.totalBudget;
import Classes_do_Sistema.ReadNDWrite.InitWriting;
import java.awt.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class BudgetForm extends javax.swing.JFrame implements InitWriting{
    Budget budget = new Budget();
    int item = 0;
    
    public BudgetForm() {
        initComponents();
        this.setLocationRelativeTo(null);   
        fillCBXClientName();
        fillCBXProductID();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnGroupPayment = new javax.swing.ButtonGroup();
        jBackgroundPane = new javax.swing.JLayeredPane();
        jTitleBar = new javax.swing.JLayeredPane();
        jMinimizeButton = new javax.swing.JButton();
        jCloseButton = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLblBudgetID = new javax.swing.JLabel();
        jIptBudgetID = new javax.swing.JTextField();
        jBtnStartBugdet = new javax.swing.JButton();
        jBtnRegBudget = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblBudgetCart = new javax.swing.JTable();
        jLblBudgetClient = new javax.swing.JLabel();
        jIptBudgetSeller = new javax.swing.JTextField();
        jLblBudgetSeller = new javax.swing.JLabel();
        jLblBudgetProductDescription = new javax.swing.JLabel();
        jIptBudgetProductDescription = new javax.swing.JTextField();
        jCBXBudgetClient = new javax.swing.JComboBox<>();
        jCBXBudgetProductID = new javax.swing.JComboBox<>();
        jLblBudgetProductID = new javax.swing.JLabel();
        jLblBudgetSeller1 = new javax.swing.JLabel();
        jTxtTotalPrice = new javax.swing.JTextField();
        jRBtnPaymentMoney = new javax.swing.JRadioButton();
        jRBtnPaymentDebitC = new javax.swing.JRadioButton();
        jRBtnPaymentCreditC = new javax.swing.JRadioButton();
        jLblPaymentMoney = new javax.swing.JLabel();
        jLblPaymentCreditC = new javax.swing.JLabel();
        jLblPaymentDebitC = new javax.swing.JLabel();
        jCBoxFileExtensions = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setName("budgetFrame"); // NOI18N
        setUndecorated(true);

        jBackgroundPane.setBackground(new java.awt.Color(139, 139, 139));
        jBackgroundPane.setOpaque(true);

        jTitleBar.setPreferredSize(new java.awt.Dimension(640, 50));

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
                .addContainerGap(1182, Short.MAX_VALUE)
                .addComponent(jMinimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jTitleBarLayout.setVerticalGroup(
            jTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMinimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCloseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLayeredPane1.setBackground(new java.awt.Color(249, 249, 249));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(960, 480));

        jLblBudgetID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblBudgetID.setForeground(new java.awt.Color(1, 1, 1));
        jLblBudgetID.setText("ID Orçamento");
        jLblBudgetID.setEnabled(false);

        jIptBudgetID.setEditable(false);
        jIptBudgetID.setBackground(new java.awt.Color(139, 139, 139));
        jIptBudgetID.setForeground(new java.awt.Color(139, 139, 139));
        jIptBudgetID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 139, 139)));
        jIptBudgetID.setEnabled(false);
        jIptBudgetID.setOpaque(false);

        jBtnStartBugdet.setBackground(new java.awt.Color(139, 139, 139));
        jBtnStartBugdet.setForeground(new java.awt.Color(249, 249, 249));
        jBtnStartBugdet.setText("Novo Orçamento");
        jBtnStartBugdet.setBorder(null);
        jBtnStartBugdet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnStartBugdet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnStartBugdetActionPerformed(evt);
            }
        });

        jBtnRegBudget.setBackground(new java.awt.Color(139, 139, 139));
        jBtnRegBudget.setForeground(new java.awt.Color(249, 249, 249));
        jBtnRegBudget.setText("Finaliza Orçamento");
        jBtnRegBudget.setBorder(null);
        jBtnRegBudget.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnRegBudget.setEnabled(false);
        jBtnRegBudget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegBudgetActionPerformed(evt);
            }
        });

        jTblBudgetCart.setBackground(new java.awt.Color(249, 249, 249));
        jTblBudgetCart.setForeground(new java.awt.Color(109, 109, 109));
        jTblBudgetCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID do Orçamento", "Nome do Cliente", "Nome do Vendedor", "ID do Produto", "Descrição do Produto", "Preço Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblBudgetCart.setGridColor(new java.awt.Color(109, 109, 109));
        jTblBudgetCart.setSelectionBackground(new java.awt.Color(139, 139, 139));
        jTblBudgetCart.setSelectionForeground(new java.awt.Color(249, 249, 249));
        jScrollPane1.setViewportView(jTblBudgetCart);

        jLblBudgetClient.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblBudgetClient.setForeground(new java.awt.Color(1, 1, 1));
        jLblBudgetClient.setText("Cliente");

        jIptBudgetSeller.setBackground(new java.awt.Color(139, 139, 139));
        jIptBudgetSeller.setForeground(new java.awt.Color(139, 139, 139));
        jIptBudgetSeller.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 139, 139)));
        jIptBudgetSeller.setEnabled(false);
        jIptBudgetSeller.setOpaque(false);

        jLblBudgetSeller.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblBudgetSeller.setForeground(new java.awt.Color(1, 1, 1));
        jLblBudgetSeller.setText("Vendedor");
        jLblBudgetSeller.setEnabled(false);

        jLblBudgetProductDescription.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblBudgetProductDescription.setForeground(new java.awt.Color(1, 1, 1));
        jLblBudgetProductDescription.setText("Descrição do Produto");
        jLblBudgetProductDescription.setEnabled(false);

        jIptBudgetProductDescription.setEditable(false);
        jIptBudgetProductDescription.setBackground(new java.awt.Color(139, 139, 139));
        jIptBudgetProductDescription.setForeground(new java.awt.Color(139, 139, 139));
        jIptBudgetProductDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 139, 139)));
        jIptBudgetProductDescription.setEnabled(false);
        jIptBudgetProductDescription.setOpaque(false);

        jCBXBudgetClient.setBackground(new java.awt.Color(189, 189, 189));
        jCBXBudgetClient.setForeground(new java.awt.Color(102, 102, 102));
        jCBXBudgetClient.setMaximumRowCount(5);
        jCBXBudgetClient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));

        jCBXBudgetProductID.setBackground(new java.awt.Color(189, 189, 189));
        jCBXBudgetProductID.setForeground(new java.awt.Color(102, 102, 102));
        jCBXBudgetProductID.setMaximumRowCount(5);
        jCBXBudgetProductID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));

        jLblBudgetProductID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblBudgetProductID.setForeground(new java.awt.Color(1, 1, 1));
        jLblBudgetProductID.setText("ID Produto");

        jLblBudgetSeller1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLblBudgetSeller1.setForeground(new java.awt.Color(139, 139, 139));
        jLblBudgetSeller1.setText("TOTAL");

        jTxtTotalPrice.setBackground(new java.awt.Color(139, 139, 139));
        jTxtTotalPrice.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTxtTotalPrice.setForeground(new java.awt.Color(139, 139, 139));
        jTxtTotalPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtTotalPrice.setText("0");
        jTxtTotalPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 139, 139)));
        jTxtTotalPrice.setOpaque(false);

        jBtnGroupPayment.add(jRBtnPaymentMoney);
        jRBtnPaymentMoney.setForeground(new java.awt.Color(139, 139, 139));
        jRBtnPaymentMoney.setText("Boleto");
        jRBtnPaymentMoney.setEnabled(false);
        jRBtnPaymentMoney.setOpaque(false);
        jRBtnPaymentMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBtnPaymentMoneyActionPerformed(evt);
            }
        });

        jBtnGroupPayment.add(jRBtnPaymentDebitC);
        jRBtnPaymentDebitC.setForeground(new java.awt.Color(139, 139, 139));
        jRBtnPaymentDebitC.setText("Cartão de Débito");
        jRBtnPaymentDebitC.setEnabled(false);
        jRBtnPaymentDebitC.setOpaque(false);
        jRBtnPaymentDebitC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBtnPaymentDebitCActionPerformed(evt);
            }
        });

        jBtnGroupPayment.add(jRBtnPaymentCreditC);
        jRBtnPaymentCreditC.setForeground(new java.awt.Color(139, 139, 139));
        jRBtnPaymentCreditC.setText("Cartão de Crédito");
        jRBtnPaymentCreditC.setEnabled(false);
        jRBtnPaymentCreditC.setOpaque(false);
        jRBtnPaymentCreditC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBtnPaymentCreditCActionPerformed(evt);
            }
        });

        jLblPaymentMoney.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblPaymentMoney.setForeground(new java.awt.Color(1, 1, 1));
        jLblPaymentMoney.setText("20% de Desconto");
        jLblPaymentMoney.setEnabled(false);

        jLblPaymentCreditC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblPaymentCreditC.setForeground(new java.awt.Color(1, 1, 1));
        jLblPaymentCreditC.setText("12x Sem juros");
        jLblPaymentCreditC.setEnabled(false);

        jLblPaymentDebitC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblPaymentDebitC.setForeground(new java.awt.Color(1, 1, 1));
        jLblPaymentDebitC.setText("12x Sem juros");
        jLblPaymentDebitC.setEnabled(false);

        jCBoxFileExtensions.setBackground(new java.awt.Color(179, 179, 179));
        jCBoxFileExtensions.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBoxFileExtensions.setForeground(new java.awt.Color(249, 249, 249));
        jCBoxFileExtensions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".txt", ".doc" }));
        jCBoxFileExtensions.setFocusable(false);

        jLayeredPane1.setLayer(jLblBudgetID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jIptBudgetID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jBtnStartBugdet, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jBtnRegBudget, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLblBudgetClient, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jIptBudgetSeller, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLblBudgetSeller, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLblBudgetProductDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jIptBudgetProductDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jCBXBudgetClient, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jCBXBudgetProductID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLblBudgetProductID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLblBudgetSeller1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTxtTotalPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jRBtnPaymentMoney, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jRBtnPaymentDebitC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jRBtnPaymentCreditC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLblPaymentMoney, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLblPaymentCreditC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLblPaymentDebitC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jCBoxFileExtensions, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLblBudgetID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jIptBudgetID, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCBoxFileExtensions, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnRegBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBXBudgetProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblBudgetProductID))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jIptBudgetProductDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblBudgetProductDescription))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRBtnPaymentDebitC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRBtnPaymentCreditC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRBtnPaymentMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblPaymentMoney)
                                    .addComponent(jLblPaymentDebitC)
                                    .addComponent(jLblPaymentCreditC))
                                .addGap(176, 176, 176)
                                .addComponent(jTxtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBXBudgetClient, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblBudgetClient))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jLblBudgetSeller)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jIptBudgetSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLblBudgetSeller1)
                                        .addGap(86, 86, 86))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnStartBugdet, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnStartBugdet, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnRegBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblBudgetID)
                    .addComponent(jIptBudgetID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBoxFileExtensions, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblBudgetClient)
                    .addComponent(jLblBudgetSeller))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblBudgetSeller1)
                    .addComponent(jCBXBudgetClient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIptBudgetSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLblBudgetProductDescription)
                                .addGap(18, 18, 18)
                                .addComponent(jIptBudgetProductDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLblBudgetProductID)
                                .addGap(18, 18, 18)
                                .addComponent(jCBXBudgetProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(63, 63, 63))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jTxtTotalPrice)
                        .addGap(52, 52, 52))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRBtnPaymentMoney)
                            .addComponent(jLblPaymentMoney))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRBtnPaymentDebitC)
                            .addComponent(jLblPaymentDebitC))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRBtnPaymentCreditC)
                            .addComponent(jLblPaymentCreditC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jBackgroundPane.setLayer(jTitleBar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBackgroundPane.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jBackgroundPaneLayout = new javax.swing.GroupLayout(jBackgroundPane);
        jBackgroundPane.setLayout(jBackgroundPaneLayout);
        jBackgroundPaneLayout.setHorizontalGroup(
            jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        jBackgroundPaneLayout.setVerticalGroup(
            jBackgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackgroundPaneLayout.createSequentialGroup()
                .addComponent(jTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBackgroundPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBackgroundPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMinimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMinimizeButtonActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jMinimizeButtonActionPerformed

    private void jCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCloseButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_jCloseButtonActionPerformed

    private void jBtnStartBugdetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnStartBugdetActionPerformed
        if(jCBXBudgetClient.getItemAt(jCBXBudgetClient.getSelectedIndex()) != null && jCBXBudgetProductID.getItemAt(jCBXBudgetProductID.getSelectedIndex()) != null){
            enableBudget();
        }     
    }//GEN-LAST:event_jBtnStartBugdetActionPerformed

    private void jRBtnPaymentMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBtnPaymentMoneyActionPerformed
        calcFullPrice("Money");
    }//GEN-LAST:event_jRBtnPaymentMoneyActionPerformed

    private void jRBtnPaymentDebitCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBtnPaymentDebitCActionPerformed
        calcFullPrice("DebitC");
    }//GEN-LAST:event_jRBtnPaymentDebitCActionPerformed

    private void jRBtnPaymentCreditCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBtnPaymentCreditCActionPerformed
        calcFullPrice("CreditC");
    }//GEN-LAST:event_jRBtnPaymentCreditCActionPerformed

    private void jBtnRegBudgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegBudgetActionPerformed
        reg();
    }//GEN-LAST:event_jBtnRegBudgetActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BudgetForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BudgetForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BudgetForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BudgetForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BudgetForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jBackgroundPane;
    private javax.swing.ButtonGroup jBtnGroupPayment;
    private javax.swing.JButton jBtnRegBudget;
    private javax.swing.JButton jBtnStartBugdet;
    private javax.swing.JComboBox<String> jCBXBudgetClient;
    private javax.swing.JComboBox<String> jCBXBudgetProductID;
    private javax.swing.JComboBox<String> jCBoxFileExtensions;
    private javax.swing.JButton jCloseButton;
    private javax.swing.JTextField jIptBudgetID;
    private javax.swing.JTextField jIptBudgetProductDescription;
    private javax.swing.JTextField jIptBudgetSeller;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel jLblBudgetClient;
    private javax.swing.JLabel jLblBudgetID;
    private javax.swing.JLabel jLblBudgetProductDescription;
    private javax.swing.JLabel jLblBudgetProductID;
    private javax.swing.JLabel jLblBudgetSeller;
    private javax.swing.JLabel jLblBudgetSeller1;
    private javax.swing.JLabel jLblPaymentCreditC;
    private javax.swing.JLabel jLblPaymentDebitC;
    private javax.swing.JLabel jLblPaymentMoney;
    private javax.swing.JButton jMinimizeButton;
    private javax.swing.JRadioButton jRBtnPaymentCreditC;
    private javax.swing.JRadioButton jRBtnPaymentDebitC;
    private javax.swing.JRadioButton jRBtnPaymentMoney;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblBudgetCart;
    private javax.swing.JLayeredPane jTitleBar;
    private javax.swing.JTextField jTxtTotalPrice;
    // End of variables declaration//GEN-END:variables

    public void updateOrderID(){
        item = Integer.parseInt(jCBXBudgetProductID.getItemAt(jCBXBudgetProductID.getSelectedIndex()));
        
        totalBudget ++;
        budget.Hash(Integer.parseInt(jCBXBudgetProductID.getItemAt(jCBXBudgetProductID.getSelectedIndex())), totalBudget);
        
        jIptBudgetID.setText(budget.getBudgetID());
    }
    
    public void fillCBXClientName(){
        String[] list= new String[10];
        
        for(int i = 0; i <= totalClients; i++)
        {
            System.out.println(i);
            list[i] = clients[i].getClientName();
        }
        DefaultComboBoxModel listNameClients = new DefaultComboBoxModel(list);
        jCBXBudgetClient.setModel(listNameClients);
    }
    
    public void fillCBXProductID(){
        String[] list= new String[10];
        
        for(int i = 0; i <= totalProducts; i++)
        {
            list[i] = Integer.toString(products[i].getProductID());
        }
        DefaultComboBoxModel listIDProducts = new DefaultComboBoxModel(list);
        jCBXBudgetProductID.setModel(listIDProducts);
    }
    
    public void enableBudget(){
        updateOrderID();
        
        jIptBudgetProductDescription.setText(products[item].getProductName()+ " - " + products[item].getProductDescription());

        jRBtnPaymentMoney.setEnabled(true);
        jRBtnPaymentDebitC.setEnabled(true);
        jRBtnPaymentCreditC.setEnabled(true);
        jIptBudgetID.setEnabled(true);
        jIptBudgetSeller.setEnabled(true);
        jIptBudgetProductDescription.setEnabled(true);     
    }
    
    public void calcFullPrice(String paymentType){
        if(paymentType.equals("Money")){
            jLblPaymentMoney.setEnabled(true);
            jLblPaymentDebitC.setEnabled(false);
            jLblPaymentCreditC.setEnabled(false);
            getFullPrice(0.2);           
        }else{
            if(paymentType.equals("DebitC")){
                jLblPaymentMoney.setEnabled(false);
                jLblPaymentDebitC.setEnabled(true);
                jLblPaymentCreditC.setEnabled(false);
                getFullPrice(0);                
            }else{
                jLblPaymentMoney.setEnabled(false);
                jLblPaymentDebitC.setEnabled(false);
                jLblPaymentCreditC.setEnabled(true);
                getFullPrice(0);                
            }
        }
    }
    
    public void getFullPrice(double discountPercentage) {
        jTxtTotalPrice.setText(String.valueOf(products[item].getProductSellingPrice() - (products[item].getProductSellingPrice() * discountPercentage))); 
        jBtnRegBudget.setEnabled(true);
    }
    public void reg(){        
        insertToCart();
        writeFile("Budgets",(String)jCBoxFileExtensions.getSelectedItem());
        currentBudget ++;
        jIptBudgetID.setText("");
        jBtnRegBudget.setBackground(new java.awt.Color(COLOR_DEFAULT[0],COLOR_DEFAULT[1], COLOR_DEFAULT[2]));
    }
    
    public void insertToCart(){
        DefaultTableModel cart = (DefaultTableModel) jTblBudgetCart.getModel();
        Object[] cart_data = {
            jIptBudgetID.getText(),
            jCBXBudgetClient.getItemAt(jCBXBudgetClient.getSelectedIndex()),
            jIptBudgetSeller.getText(),
            jCBXBudgetProductID.getItemAt(jCBXBudgetProductID.getSelectedIndex()),
            jIptBudgetProductDescription.getText(),
            jTxtTotalPrice.getText()
        };
        cart.addRow(cart_data);
    }
    
    @Override
    public void writeFile(String fileName, String fileExtension) {
        String filePath = DEFAULT_FILE_PATH + fileName + fileExtension;
        
        try {
            FileWriter fw = new FileWriter(filePath,true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Budget-ID: "+ jIptBudgetID.getText());

            pw.println("Budget-Client-Name: "+ jCBXBudgetClient.getItemAt(jCBXBudgetClient.getSelectedIndex()));
            
            pw.println("Budget-Seller: "+ jIptBudgetSeller.getText());
            
            pw.println("Budget-Product-ID: "+ jCBXBudgetProductID.getItemAt(jCBXBudgetProductID.getSelectedIndex()));
            
            pw.println("Budget-Production-Description: "+ jIptBudgetProductDescription.getText());
            
            pw.println("Budget-Total-Price: "+ jTxtTotalPrice.getText());
            
            pw.print("---------------------------------------------\n");
            pw.flush();
            pw.close();
            fw.close();
        } 
        catch (Exception e) {
            jBtnRegBudget.setBackground(new java.awt.Color(COLOR_ERROR[0],COLOR_ERROR[1], COLOR_ERROR[2]));
        }
        jBtnRegBudget.setBackground(new java.awt.Color(COLOR_SUCESS[0],COLOR_SUCESS[1], COLOR_SUCESS[2]));
    }
}
