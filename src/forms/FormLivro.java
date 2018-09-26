/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import classes.Livro;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author bruna
 */
public class FormLivro extends javax.swing.JFrame {

    /**
     * Creates new form FormLivro
     */
    public FormLivro() {
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

        btCadastrar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbFornecedores = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfValorUnitario = new javax.swing.JTextField();
        tfQuantidadeEstoque = new javax.swing.JTextField();
        tfDataPublicacao = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("##/##/####");

            tfDataPublicacao = new javax.swing.JFormattedTextField(data);
        }catch(Exception e){
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btCadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icCadlivro.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btAtualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icAtualizar.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icSair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Título:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Fornecedores:");

        cbFornecedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Editora Melhoramento", "Rocco", "Buqui", "Editora Saraiva", "Gulliver Editora" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Valor Unitário:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Quantidade em Estoque:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Data de Publicação:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAtualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btSair))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(113, 113, 113)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cbFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfValorUnitario))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tfQuantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(tfDataPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btCadastrar)
                        .addComponent(btAtualizar)
                        .addComponent(btSair))
                    .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDataPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        Livro livro = new Livro();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        livro.setCodigo(Integer.parseInt(tfCodigo.getText()));
        livro.setTitulo(tfTitulo.getText());
        livro.setFornecedor(cbFornecedores.getSelectedItem().toString());
        livro.setValorUnitario(Float.parseFloat(tfValorUnitario.getText()));
        livro.setQuantidadeEstoque(Integer.parseInt(tfQuantidadeEstoque.getText()));

        
        try {
            livro.setDataPublicacao(sdf.parse(tfDataPublicacao.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(FormLivro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        FormPrincipal.daoLivro.adicionarLivro(livro);
        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Cadastro de cliente", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        tfCodigo.setText("");
        tfTitulo.setText("");
        cbFornecedores.setSelectedIndex(-1);
        tfValorUnitario.setText("");
        tfQuantidadeEstoque.setText("");
        tfDataPublicacao.setText("");
        
        tfCodigo.requestFocus();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        Livro livro = new Livro();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        livro.setCodigo(Integer.parseInt(tfCodigo.getText()));
        livro.setTitulo(tfTitulo.getText());
        livro.setFornecedor(cbFornecedores.getSelectedItem().toString());
        livro.setValorUnitario(Float.parseFloat(tfValorUnitario.getText()));
        livro.setQuantidadeEstoque(Integer.parseInt(tfQuantidadeEstoque.getText()));

        
        try {
            livro.setDataPublicacao(sdf.parse(tfDataPublicacao.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(FormLivro.class.getName()).log(Level.SEVERE, null, ex);
        }
        FormPrincipal.daoLivro.adicionarLivro(livro);
        JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!", "Cadastro de cliente", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(FormLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> cbFornecedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDataPublicacao;
    private javax.swing.JTextField tfQuantidadeEstoque;
    private javax.swing.JTextField tfTitulo;
    private javax.swing.JTextField tfValorUnitario;
    // End of variables declaration//GEN-END:variables
}
