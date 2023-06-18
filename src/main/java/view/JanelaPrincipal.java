/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controllers.ControllerConexao;

import javax.swing.*;

/**
 *
 * @author 202112030001
 */
public class    JanelaPrincipal extends javax.swing.JFrame {
private   ControllerConexao controllerConexao;
    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
       controllerConexao = new ControllerConexao();
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

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuPerfumaria = new javax.swing.JMenuItem();
        jMenuMedicamento = new javax.swing.JMenuItem();
        jMenuFabricante = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu = new javax.swing.JMenu();
        jMenuVenda = new javax.swing.JMenuItem();
        jMenuConsultar = new javax.swing.JMenu();
        menuFabricante = new javax.swing.JMenuItem();
        menuMedicamento = new javax.swing.JMenuItem();
        menuPerfumaria = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        setTitle("Farmacia");

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastro");

        jMenuPerfumaria.setText("Perfumaria");
        jMenuPerfumaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPerfumariaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuPerfumaria);

        jMenuMedicamento.setText("Medicamento");
        jMenuMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMedicamentoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuMedicamento);

        jMenuFabricante.setText("Fabricante");
        jMenuFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFabricanteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuFabricante);

        jMenuItem1.setText("Receita Medica");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu.setText("Venda");
        jMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuActionPerformed(evt);
            }
        });

        jMenuVenda.setText("Venda");
        jMenuVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVendaActionPerformed(evt);
            }
        });
        jMenu.add(jMenuVenda);

        jMenuBar1.add(jMenu);

        jMenuConsultar.setText("Consultar");

        menuFabricante.setText("Fabricante");
        menuFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFabricanteActionPerformed(evt);
            }
        });
        jMenuConsultar.add(menuFabricante);

        menuMedicamento.setText("Medicamento");
        menuMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMedicamentoActionPerformed(evt);
            }
        });
        jMenuConsultar.add(menuMedicamento);

        menuPerfumaria.setText("Perfumaria");
        menuPerfumaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPerfumariaActionPerformed(evt);
            }
        });
        jMenuConsultar.add(menuPerfumaria);

        jMenuBar1.add(jMenuConsultar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFabricanteActionPerformed
        JanelaFabricante fab = new JanelaFabricante();
        desktop.add(fab);
        fab.setVisible(true);
    }//GEN-LAST:event_jMenuFabricanteActionPerformed

    private void jMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuActionPerformed
       
    }//GEN-LAST:event_jMenuActionPerformed

    private void jMenuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVendaActionPerformed
        JanelaVenda venda = new JanelaVenda();
        desktop.add(venda);
        venda.setVisible(true);    }//GEN-LAST:event_jMenuVendaActionPerformed

    private void jMenuMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMedicamentoActionPerformed
        JanelaMedicamento med = new JanelaMedicamento();
        desktop.add(med);
        med.setVisible(true);    }//GEN-LAST:event_jMenuMedicamentoActionPerformed

    private void menuFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFabricanteActionPerformed
        JanelaConsultaFabricante consFab = new JanelaConsultaFabricante();
        desktop.add(consFab);
        consFab.setVisible(true);
    }//GEN-LAST:event_menuFabricanteActionPerformed

    private void menuMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMedicamentoActionPerformed
        JanelaConsultaMedicamento consMed = new JanelaConsultaMedicamento();
        desktop.add(consMed);
        consMed.setVisible(true);
    }//GEN-LAST:event_menuMedicamentoActionPerformed

    private void menuPerfumariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPerfumariaActionPerformed
       JanelaConsultaPerfumaria consPerf = new JanelaConsultaPerfumaria();
       desktop.add(consPerf);
       consPerf.setVisible(true);
    }//GEN-LAST:event_menuPerfumariaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JanelaCadastroReceita janelaCadastroReceita = new JanelaCadastroReceita();
        desktop.add(janelaCadastroReceita);
        janelaCadastroReceita.setVisible(true);
        
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuPerfumariaActionPerformed(java.awt.event.ActionEvent evt) {                                                
        JanelaPerfumaria perf = new JanelaPerfumaria();
        desktop.add(perf);
        perf.setVisible(true);    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {
       conectarBanco();
    }
    private void conectarBanco(){
        controllerConexao.abrirConexao("root","jvictor01");
        String mensagem = controllerConexao.getMensagem();
        JOptionPane.showMessageDialog(this, mensagem);
    }

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConsultar;
    private javax.swing.JMenuItem jMenuFabricante;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuMedicamento;
    private javax.swing.JMenuItem jMenuPerfumaria;
    private javax.swing.JMenuItem jMenuVenda;
    private javax.swing.JMenuItem menuFabricante;
    private javax.swing.JMenuItem menuMedicamento;
    private javax.swing.JMenuItem menuPerfumaria;
    // End of variables declaration//GEN-END:variables
}
