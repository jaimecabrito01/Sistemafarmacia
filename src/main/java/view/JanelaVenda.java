/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controllers.ControllerVenda;
import model.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author 202112030001
 */
public class JanelaVenda extends javax.swing.JInternalFrame {
private ControllerVenda controllerVenda;
private String mensagem ;

    /**
     * Creates new form JanelaVenda
     */
    public JanelaVenda() {
        controllerVenda = new ControllerVenda();
        initComponents();
        listarMedicamentos();
        listarPerfumaria();

    }




    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel2 = new javax.swing.JPanel();
        lblNomeCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        lblTeladeVendas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPerfume = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListMedicamentos = new javax.swing.JList<>();
        lblPerfume = new javax.swing.JLabel();
        lblMedicamentosItem = new javax.swing.JLabel();
        btnInserirPerfume = new javax.swing.JButton();
        btnCadVenda = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtReceita = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblProdutos1 = new javax.swing.JTable();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Venda");

        lblNomeCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNomeCliente.setText("Nome do cliente:");

        lblTeladeVendas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTeladeVendas.setText("Tela de Vendas");

        jListPerfume.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListPerfumeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListPerfume);

        jListMedicamentos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jListMedicamentosComponentHidden(evt);
            }
        });
        jScrollPane2.setViewportView(jListMedicamentos);

        lblPerfume.setText("Perfume");

        lblMedicamentosItem.setText("Medicamentos");

        btnInserirPerfume.setText("Inserir Perfume");
        btnInserirPerfume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirPerfumeActionPerformed(evt);
            }
        });

        btnCadVenda.setText("Cadastrar Venda");
        btnCadVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadVendaActionPerformed(evt);
            }
        });

        jButton1.setText("Inserir Medicamento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Numero da receita(Se tiver)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(lblTeladeVendas))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblNomeCliente)
                                .addGap(18, 18, 18)
                                .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblPerfume)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMedicamentosItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(57, 57, 57)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(btnCadVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(btnInserirPerfume)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jButton1))))
                .addGap(128, 128, 128))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTeladeVendas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCliente)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerfume)
                    .addComponent(lblMedicamentosItem)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserirPerfume)
                    .addComponent(jButton1))
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        tblProdutos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantidade", "Numero", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblProdutos1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(446, 446, 446))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public  void listarMedicamentos(){
        ListModel<Produto> model = (ListModel<Produto>)  jListMedicamentos.getModel();
        int tamanho = model.getSize();
        for( int i = 0;i<tamanho;i++){
            jListMedicamentos.remove(0);
        }
        ArrayList<Produto> produtos = controllerVenda.listMedicamentos();
        DefaultListModel<Produto> listModel = new DefaultListModel<>();

        for (Produto produto: produtos) {
            listModel.addElement(produto);
        }
        jListMedicamentos.setModel(listModel);
    }
    private static java.sql.Date obterdata(){
        LocalDate  dataAtual= LocalDate.now();

        return java.sql.Date.valueOf(dataAtual);

    }
    public  void listarPerfumaria(){
        ListModel<Produto> model = (ListModel<Produto>)  jListPerfume.getModel();
        int tamanho = model.getSize();
        for( int i = 0;i<tamanho;i++){
            jListPerfume.remove(0);
        }
        ArrayList<Produto> produtos = controllerVenda.listPerfumaria();
        DefaultListModel<Produto> listModel = new DefaultListModel<>();

         for(Produto produto: produtos) {

            listModel.addElement(produto);
        }
        jListPerfume.setModel(listModel);
    }
    private void jListMedicamentosComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jListMedicamentosComponentHidden

        // TODO add your handling code here:
    }//GEN-LAST:event_jListMedicamentosComponentHidden
    public int gerarNumeroNotaVenda() {
        Random random = new Random();
        int numeroNota = random.nextInt(10000);


        return numeroNota;
    }
    private void btnCadVendaActionPerformed(java.awt.event.ActionEvent evt) {                                            
    String nome_cliente = txtNomeCliente.getText().trim();
    String nome_comercial;
    int quantidade;
    int numero_nota = gerarNumeroNotaVenda();
    DefaultTableModel modeloTabela = (DefaultTableModel) tblProdutos1   .getModel();
    ArrayList<Object> produtos = new ArrayList<>();
    int quant = modeloTabela.getRowCount();
    for(int i=0;i<quant;i++) {
        nome_comercial = tblProdutos1.getValueAt(i, 0).toString();
        quantidade = Integer.parseInt(tblProdutos1.getValueAt(i, 1).toString());
        int numero = Integer.parseInt(tblProdutos1.getValueAt(i, 2).toString());
        String tipo = tblProdutos1.getValueAt(i, 3).toString();
        if (tipo.equals("medicamento")) {


            controllerVenda.insertVenda(numero_nota,obterdata(),nome_cliente);
            int receita = Integer.parseInt(txtReceita.getText().trim());
            boolean inserido = controllerVenda.insertVendaMedicamento(numero,numero_nota,receita,quantidade,12.30);
            mensagem = controllerVenda.getMensagem();
            JOptionPane.showMessageDialog(this,mensagem);

        } else {
            controllerVenda.insertVenda(numero_nota,obterdata(),nome_cliente);
            controllerVenda.insertVendaPerfumaria(numero,numero_nota,12.50,quantidade);
            mensagem = controllerVenda.getMensagem();
            JOptionPane.showMessageDialog(this,mensagem);
        }

    }
    }


    private void btnInserirPerfumeActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel modeloTabela = (DefaultTableModel) tblProdutos1.getModel();



        int[] indices = jListPerfume.getSelectedIndices();
        ArrayList<Produto> produtos = new ArrayList<>();
        for(int i =0;i<indices.length;i++) {
            String nome =   jListPerfume.getSelectedValue().getNome_comercial();
            int numero = jListPerfume.getSelectedValue().getNumero();
            int quantidade = jListPerfume.getSelectedValue().getQuantidade();
            Produto produto = new Produto(numero,0,nome,"",quantidade,"");
            produtos.add(produto);

        }

        for (Produto produto:produtos){
            String nome = produto.getNome_comercial();
            int numero = produto.getNumero();
            int quantidade = produto.getQuantidade();
            modeloTabela.addRow(
                    new Object[]{
                            nome,
                            0,
                            numero,
                            "perfumaria"

                    }
            );


        }

    }

    private void jListPerfumeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListPerfumeMouseClicked


    }//GEN-LAST:event_jListPerfumeMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel modeloTabela = (DefaultTableModel) tblProdutos1.getModel();



        int[] indices = jListMedicamentos.getSelectedIndices();
        ArrayList<Produto> produtos = new ArrayList<>();
        for(int i =0;i<indices.length;i++) {
            String nome =   jListMedicamentos.getSelectedValue().getNome_comercial();
            int numero = jListMedicamentos.getSelectedValue().getNumero();
            int quantidade = jListMedicamentos.getSelectedValue().getQuantidade();
            Produto produto = new Produto(numero,0,nome,"",quantidade,"");
            produtos.add(produto);

        }

        for (Produto produto:produtos){
            String nome = produto.getNome_comercial();
            int numero = produto.getNumero();
            int quantidade = produto.getQuantidade();
            modeloTabela.addRow(
                    new Object[]{
                            nome,
                            0,
                            numero,
                            "medicamento"

                    }
            );


        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadVenda;
    private javax.swing.JButton btnInserirPerfume;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<Produto> jListMedicamentos;
    private javax.swing.JList<Produto> jListPerfume;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblMedicamentosItem;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblPerfume;
    private javax.swing.JLabel lblTeladeVendas;
    private javax.swing.JTable tblProdutos1;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtReceita;
    // End of variables declaration//GEN-END:variables
}
