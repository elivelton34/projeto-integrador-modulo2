/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import repository.ProdutoRepository;
import model.ModelProduto;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Elivelton
 */
public class ViewConsultaProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaProduto
     */
    private JDesktopPane jDesktopPane2;

    public ViewConsultaProduto(JDesktopPane jdp) {
        initComponents();
        jDesktopPane2 = jdp;

        DefaultTableModel dtmProduto = (DefaultTableModel) tabProduto.getModel();
        tabProduto.setRowSorter(new TableRowSorter(dtmProduto));
        this.limpar();
        leituraTabela();
    }

    public void leituraTabela() {
        DefaultTableModel dtmProduto = (DefaultTableModel) tabProduto.getModel();
        dtmProduto.setNumRows(0);
        ProdutoRepository objpDAO = new ProdutoRepository();

        for (ModelProduto pro : objpDAO.Leitura()) {

            dtmProduto.addRow(new Object[]{
                pro.getIdProduto(),
                pro.getNomeProduto(),
                pro.getDescProduto(),
                pro.getValProduto(),
                pro.getEstoProduto(),});

        }

    }

    public void leituraTabelaporNome(String nomeProduto) {
        DefaultTableModel dtmProduto = (DefaultTableModel) tabProduto.getModel();
        dtmProduto.setNumRows(0);
        ProdutoRepository objpDAO = new ProdutoRepository();

        for (ModelProduto pro : objpDAO.Pesquisar(nomeProduto)) {

            dtmProduto.addRow(new Object[]{
                pro.getIdProduto(),
                pro.getNomeProduto(),
                pro.getDescProduto(),
                pro.getValProduto(),
                pro.getEstoProduto(),});

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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabProduto = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JButton();
        txtExcluir = new javax.swing.JButton();
        txtAlterar = new javax.swing.JButton();
        txtNovo = new javax.swing.JButton();
        txtNomePro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtVal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEsto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta de Produto");
        setPreferredSize(new java.awt.Dimension(630, 430));

        tabProduto.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        tabProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Descrição", "Valor", "Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabProdutoMouseClicked(evt);
            }
        });
        tabProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabProdutoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabProduto);
        if (tabProduto.getColumnModel().getColumnCount() > 0) {
            tabProduto.getColumnModel().getColumn(0).setMinWidth(40);
            tabProduto.getColumnModel().getColumn(0).setPreferredWidth(40);
            tabProduto.getColumnModel().getColumn(0).setMaxWidth(100);
            tabProduto.getColumnModel().getColumn(3).setMinWidth(100);
            tabProduto.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabProduto.getColumnModel().getColumn(3).setMaxWidth(200);
            tabProduto.getColumnModel().getColumn(4).setMinWidth(50);
            tabProduto.getColumnModel().getColumn(4).setPreferredWidth(50);
            tabProduto.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        txtPesquisar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/zoom.png"))); // NOI18N
        txtPesquisar.setText("Pesquisar");
        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });

        txtExcluir.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/basket_delete.png"))); // NOI18N
        txtExcluir.setText("Excluir");
        txtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExcluirActionPerformed(evt);
            }
        });

        txtAlterar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/basket_edit.png"))); // NOI18N
        txtAlterar.setText("Alterar");
        txtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlterarActionPerformed(evt);
            }
        });

        txtNovo.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/basket_add.png"))); // NOI18N
        txtNovo.setText("Novo");
        txtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNovoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setText("Descrição");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setText("Valor");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setText("Estoque");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setText("Nome");

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(txtExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNovo))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtNomePro, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPesquisar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtVal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEsto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(96, 96, 96)
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEsto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDesc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlterar)
                    .addComponent(txtExcluir)
                    .addComponent(txtNovo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNovoActionPerformed
        // TODO add your handling code here:

        ViewCadastrarProduto cadastrarProduto = new ViewCadastrarProduto();
        jDesktopPane2.add(cadastrarProduto);
        cadastrarProduto.setVisible(true);
        leituraTabela();

    }//GEN-LAST:event_txtNovoActionPerformed

    private void txtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExcluirActionPerformed
        // 
        //System.out.println("Linha selecionada: "+ tabProduto.getSelectedRow());

        if (tabProduto.getSelectedRow() != -1) {

            ModelProduto objProduto = new ModelProduto();
            ProdutoRepository dao = new ProdutoRepository();

            objProduto.setIdProduto((int) tabProduto.getValueAt(tabProduto.getSelectedRow(), 0));
            dao.Excluir(objProduto);

            txtNomePro.setText("");
            txtDesc.setText("");
            txtVal.setText("");
            txtEsto.setText("");

            leituraTabela();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione o produto para excluir!");
        }


    }//GEN-LAST:event_txtExcluirActionPerformed

    private void txtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlterarActionPerformed
        // TODO add your handling code here:

        if (tabProduto.getSelectedRow() != -1) {

            ModelProduto objproduto = new ModelProduto();
            ProdutoRepository dao = new ProdutoRepository();
            objproduto.setNomeProduto(txtNomePro.getText());
            objproduto.setDescProduto(txtDesc.getText());
            objproduto.setValProduto(Double.parseDouble(txtVal.getText()));
            objproduto.setEstoProduto(Integer.parseInt(txtEsto.getText()));
            objproduto.setIdProduto((int) tabProduto.getValueAt(tabProduto.getSelectedRow(), 0));
            dao.Alterar(objproduto);

            txtNomePro.setText("");
            txtDesc.setText("");
            txtVal.setText("");
            txtEsto.setText("");

            leituraTabela();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione o produto para alterar");

        }

    }//GEN-LAST:event_txtAlterarActionPerformed

    private void tabProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabProdutoMouseClicked
        // TODO add your handling code here:

        if (tabProduto.getSelectedRow() != -1) {

            txtNomePro.setText(tabProduto.getValueAt(tabProduto.getSelectedRow(), 1).toString());
            txtDesc.setText(tabProduto.getValueAt(tabProduto.getSelectedRow(), 2).toString());
            txtVal.setText(tabProduto.getValueAt(tabProduto.getSelectedRow(), 3).toString());
            txtEsto.setText(tabProduto.getValueAt(tabProduto.getSelectedRow(), 4).toString());

        }

    }//GEN-LAST:event_tabProdutoMouseClicked

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        // TODO add your handling code here

        leituraTabelaporNome(txtPesquisa.getText());

    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void tabProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabProdutoKeyReleased
        // TODO add your handling code here:
        if (tabProduto.getSelectedRow() != -1) {

            txtNomePro.setText(tabProduto.getValueAt(tabProduto.getSelectedRow(), 1).toString());
            txtDesc.setText(tabProduto.getValueAt(tabProduto.getSelectedRow(), 2).toString());
            txtVal.setText(tabProduto.getValueAt(tabProduto.getSelectedRow(), 3).toString());
            txtEsto.setText(tabProduto.getValueAt(tabProduto.getSelectedRow(), 4).toString());

        }

    }//GEN-LAST:event_tabProdutoKeyReleased

    private void limpar() {
        txtNomePro.setText("");
        txtDesc.setText("");
        txtVal.setText("");
        txtEsto.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabProduto;
    private javax.swing.JButton txtAlterar;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtEsto;
    private javax.swing.JButton txtExcluir;
    private javax.swing.JTextField txtNomePro;
    private javax.swing.JButton txtNovo;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JButton txtPesquisar;
    private javax.swing.JTextField txtVal;
    // End of variables declaration//GEN-END:variables
}
