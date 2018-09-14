/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import dao.ClienteDAO;
/**
 *
 * @author alunoces
 */
public class FormPrincipal extends javax.swing.JFrame {

    public static ClienteDAO daoCliente = null;
    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
        daoCliente = new ClienteDAO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCadCliente = new javax.swing.JMenuItem();
        jMenuItemCadProdutos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuItemConsuClientes = new javax.swing.JMenuItem();
        jMenuItemConsuProdutos = new javax.swing.JMenuItem();
        jMenuCompras = new javax.swing.JMenu();
        jMenuItemDia = new javax.swing.JMenuItem();
        jMenuItemMes = new javax.swing.JMenuItem();
        jMenuItemAno = new javax.swing.JMenuItem();
        Venda = new javax.swing.JMenu();
        jMenuItemVendaNovaVenda = new javax.swing.JMenuItem();
        jMenuItemVendaEmitirNotaFiscal = new javax.swing.JMenuItem();
        jMenuSuporte = new javax.swing.JMenu();
        jMenuItemSuporteAjuda = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSuporteSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Eletrônico de Livraria");
        setExtendedState(6);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        jMenuCadastros.setText("Cadastros");

        jMenuItemCadCliente.setText("Clientes");
        jMenuCadastros.add(jMenuItemCadCliente);

        jMenuItemCadProdutos.setText("Produtos");
        jMenuCadastros.add(jMenuItemCadProdutos);
        jMenuCadastros.add(jSeparator1);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.setToolTipText("");
        jMenuCadastros.add(jMenuItemSair);

        jMenuBar1.add(jMenuCadastros);

        jMenuConsultas.setText("Consultas");

        jMenuItemConsuClientes.setText("Clientes");
        jMenuItemConsuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsuClientesActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemConsuClientes);

        jMenuItemConsuProdutos.setText("Produtos");
        jMenuConsultas.add(jMenuItemConsuProdutos);

        jMenuCompras.setText("Compras");

        jMenuItemDia.setText("Dia");
        jMenuCompras.add(jMenuItemDia);

        jMenuItemMes.setText("Mês");
        jMenuCompras.add(jMenuItemMes);

        jMenuItemAno.setText("Ano");
        jMenuCompras.add(jMenuItemAno);

        jMenuConsultas.add(jMenuCompras);

        jMenuBar1.add(jMenuConsultas);

        Venda.setText("Venda");

        jMenuItemVendaNovaVenda.setText("Nova Venda");
        Venda.add(jMenuItemVendaNovaVenda);

        jMenuItemVendaEmitirNotaFiscal.setText("Emitir Nota Fiscal");
        Venda.add(jMenuItemVendaEmitirNotaFiscal);

        jMenuBar1.add(Venda);

        jMenuSuporte.setText("Suporte");

        jMenuItemSuporteAjuda.setText("Ajuda");
        jMenuSuporte.add(jMenuItemSuporteAjuda);
        jMenuSuporte.add(jSeparator2);

        jMenuItemSuporteSobre.setText("Sobre");
        jMenuSuporte.add(jMenuItemSuporteSobre);

        jMenuBar1.add(jMenuSuporte);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(634, 451));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemConsuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsuClientesActionPerformed
        new FormCliente().setVisible(true);
    }//GEN-LAST:event_jMenuItemConsuClientesActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Venda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuCompras;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuItemAno;
    private javax.swing.JMenuItem jMenuItemCadCliente;
    private javax.swing.JMenuItem jMenuItemCadProdutos;
    private javax.swing.JMenuItem jMenuItemConsuClientes;
    private javax.swing.JMenuItem jMenuItemConsuProdutos;
    private javax.swing.JMenuItem jMenuItemDia;
    private javax.swing.JMenuItem jMenuItemMes;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSuporteAjuda;
    private javax.swing.JMenuItem jMenuItemSuporteSobre;
    private javax.swing.JMenuItem jMenuItemVendaEmitirNotaFiscal;
    private javax.swing.JMenuItem jMenuItemVendaNovaVenda;
    private javax.swing.JMenu jMenuSuporte;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
