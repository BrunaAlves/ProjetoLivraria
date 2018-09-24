/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import classes.Cliente;
import java.util.Enumeration;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author alunoces
 */
public class FormCliente extends javax.swing.JFrame {

    /**
     * Creates new form FormCliente
     */
    public FormCliente() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        tfCpf = new javax.swing.JTextField();
        tfNomeCompleto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();
        tbDadosCliente = new javax.swing.JTabbedPane();
        pDadosPessoais = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbSolteiro = new javax.swing.JRadioButton();
        rbCasado = new javax.swing.JRadioButton();
        rbDivorciado = new javax.swing.JRadioButton();
        rbUniaoEstavel = new javax.swing.JRadioButton();
        rbViuvo = new javax.swing.JRadioButton();
        pEnderecoCompleto = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tfLogradouro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfComplemento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfCep = new javax.swing.JTextField();
        cbEstado = new javax.swing.JComboBox<>();
        btCadastrar = new javax.swing.JButton();
        jAtualizar = new javax.swing.JButton();
        jLimpar = new javax.swing.JButton();
        jSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tfCpf.setText("   .   .   -  ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("CPF:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nome Completo:");

        btBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruna\\Documents\\NetBeansProjects\\ProjetoLivraria\\src\\imagens\\icBuscar.png")); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Telefone:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Email:");

        tfTelefone.setText("(  )    -");
        tfTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefoneActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Estado Civil: ");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        buttonGroup1.add(rbSolteiro);
        rbSolteiro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbSolteiro.setText("Solteiro");
        rbSolteiro.setActionCommand("Solteiro");

        buttonGroup1.add(rbCasado);
        rbCasado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbCasado.setText("Casado");
        rbCasado.setActionCommand("Casado");

        buttonGroup1.add(rbDivorciado);
        rbDivorciado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbDivorciado.setText("Divorciado");
        rbDivorciado.setActionCommand("Divorciado");

        buttonGroup1.add(rbUniaoEstavel);
        rbUniaoEstavel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbUniaoEstavel.setText("União Estável");
        rbUniaoEstavel.setActionCommand("União Estável");

        buttonGroup1.add(rbViuvo);
        rbViuvo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbViuvo.setText("Viúvo");
        rbViuvo.setActionCommand("Viúvo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbSolteiro)
                .addGap(17, 17, 17)
                .addComponent(rbCasado)
                .addGap(18, 18, 18)
                .addComponent(rbDivorciado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(rbUniaoEstavel)
                .addGap(18, 18, 18)
                .addComponent(rbViuvo)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbViuvo)
                    .addComponent(rbUniaoEstavel)
                    .addComponent(rbDivorciado)
                    .addComponent(rbCasado)
                    .addComponent(rbSolteiro))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pDadosPessoaisLayout = new javax.swing.GroupLayout(pDadosPessoais);
        pDadosPessoais.setLayout(pDadosPessoaisLayout);
        pDadosPessoaisLayout.setHorizontalGroup(
            pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        pDadosPessoaisLayout.setVerticalGroup(
            pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbDadosCliente.addTab("Dados Pessoais", pDadosPessoais);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Logradouro:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Complemento:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Cidade:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Estado:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("CEP:");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MG", "SP", "RJ", "ES", "AM", "AC", "AL", "BA", "CE", "MS", "MT" }));

        javax.swing.GroupLayout pEnderecoCompletoLayout = new javax.swing.GroupLayout(pEnderecoCompleto);
        pEnderecoCompleto.setLayout(pEnderecoCompletoLayout);
        pEnderecoCompletoLayout.setHorizontalGroup(
            pEnderecoCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEnderecoCompletoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEnderecoCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tfLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pEnderecoCompletoLayout.createSequentialGroup()
                        .addGroup(pEnderecoCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(pEnderecoCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(tfCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(tfCep))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pEnderecoCompletoLayout.setVerticalGroup(
            pEnderecoCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEnderecoCompletoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pEnderecoCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pEnderecoCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pEnderecoCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pEnderecoCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tbDadosCliente.addTab("Endereço Completo", pEnderecoCompleto);

        btCadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btCadastrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruna\\Documents\\NetBeansProjects\\ProjetoLivraria\\src\\imagens\\icIncluirCliente.png")); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        jAtualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jAtualizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruna\\Documents\\NetBeansProjects\\ProjetoLivraria\\src\\imagens\\icAtualizar2.png")); // NOI18N
        jAtualizar.setText("Atualizar");
        jAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAtualizarActionPerformed(evt);
            }
        });

        jLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLimpar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruna\\Documents\\NetBeansProjects\\ProjetoLivraria\\src\\imagens\\icLimpar.png")); // NOI18N
        jLimpar.setText("Limpar");
        jLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimparActionPerformed(evt);
            }
        });

        jSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruna\\Documents\\NetBeansProjects\\ProjetoLivraria\\src\\imagens\\icSair.png")); // NOI18N
        jSair.setText("Sair");
        jSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(tfNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tbDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(jAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(jLabel2)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tbDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCadastrar)
                    .addComponent(jAtualizar)
                    .addComponent(jLimpar)
                    .addComponent(jSair, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
         Cliente cliente = new Cliente();
        
        //pegar os dados da tela e inserir no objeto
        cliente.setCpf(tfCpf.getText());
        cliente.setNome(tfNomeCompleto.getText());
        cliente.setTelefone(tfTelefone.getText());
        cliente.setEmail(tfEmail.getText());
        cliente.setEstadocivil(buttonGroup1.getSelection().getActionCommand());
        cliente.getEndereco().setLogradouro(tfLogradouro.getText());
        cliente.getEndereco().setComplemento(tfComplemento.getText());
        cliente.getEndereco().setCidade(tfCidade.getText());
        cliente.getEndereco().setEstado(cbEstado.getSelectedItem().toString());
        cliente.getEndereco().setCep(tfCep.getText());
        
        FormPrincipal.daoCliente.adicionarCliente(cliente);
        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucess", "Cadastro de cliente", JOptionPane.INFORMATION_MESSAGE);
        
        limpar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void jAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAtualizarActionPerformed
        Cliente cliente = new Cliente();
        
        //pegar os dados da tela e inserir no objeto
        cliente.setCpf(tfCpf.getText());
        cliente.setNome(tfNomeCompleto.getText());
        cliente.setTelefone(tfTelefone.getText());
        cliente.setEmail(tfEmail.getText());
        cliente.setEstadocivil(buttonGroup1.getSelection().getActionCommand());
        cliente.getEndereco().setLogradouro(tfLogradouro.getText());
        cliente.getEndereco().setComplemento(tfComplemento.getText());
        cliente.getEndereco().setCidade(tfCidade.getText());
        cliente.getEndereco().setEstado(cbEstado.getSelectedItem().toString());
        cliente.getEndereco().setCep(tfCep.getText());
        
        FormPrincipal.daoCliente.adicionarCliente(cliente);
        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucess", "Cadastro de cliente", JOptionPane.INFORMATION_MESSAGE);
        
        limpar();
    }//GEN-LAST:event_jAtualizarActionPerformed

    private void tfTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefoneActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        String cpf = tfCpf.getText();
        
        Cliente cliente = FormPrincipal.daoCliente.buscarCliente(cpf);
        
        if(cpf != null){
            tfNomeCompleto.setText(cliente.getNome());
            tfTelefone.setText(cliente.getTelefone());
            tfEmail.setText(cliente.getEmail());
            tfLogradouro.setText(cliente.getEndereco().getLogradouro());
            tfComplemento.setText(cliente.getEndereco().getComplemento());
            tfCidade.setText(cliente.getEndereco().getCidade());
            tfCep.setText(cliente.getEndereco().getCep());

            for(int i = 0; i < cbEstado.getItemCount(); i++) // Seleciona a opção do combobox
            {
                if (cbEstado.getItemAt(i).equals(cliente.getEndereco().getEstado())){
                    cbEstado.setSelectedIndex(i);
                }
            }
            
            JRadioButton radio; //Selecionar a opção do botao de rádio
            Enumeration jr = buttonGroup1.getElements();
            while (jr.hasMoreElements() ) {
                radio = (JRadioButton) jr.nextElement();
                if (radio.getText().equals(cliente.getEstadocivil()))
                    radio.setSelected(true);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void jLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jLimparActionPerformed

    private void jSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jSairActionPerformed
    
    private void limpar(){
                tfNomeCompleto.setText("");
                tfCpf.setText("");
                tfTelefone.setText("");
                tfEmail.setText("");;
                tfLogradouro.setText("");
                tfComplemento.setText("");
                tfCidade.setText("");
                tfCep.setText("");
                buttonGroup1.clearSelection(); 
                cbEstado.setSelectedIndex(-1);
                
                tfCpf.requestFocus();
        
                tbDadosCliente.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JButton jAtualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jLimpar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jSair;
    private javax.swing.JPanel pDadosPessoais;
    private javax.swing.JPanel pEnderecoCompleto;
    private javax.swing.JRadioButton rbCasado;
    private javax.swing.JRadioButton rbDivorciado;
    private javax.swing.JRadioButton rbSolteiro;
    private javax.swing.JRadioButton rbUniaoEstavel;
    private javax.swing.JRadioButton rbViuvo;
    private javax.swing.JTabbedPane tbDadosCliente;
    private javax.swing.JTextField tfCep;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfLogradouro;
    private javax.swing.JTextField tfNomeCompleto;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
