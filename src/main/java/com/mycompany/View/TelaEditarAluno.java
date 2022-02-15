/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.View;

import com.mycompany.webtutor.ListaAlunos;
import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class TelaEditarAluno extends javax.swing.JFrame {
    private int id;
    
    /**
     * Creates new form TelaEditarAluno
     */
    public TelaEditarAluno(int id) {
        this.id = id;
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

        jButton3 = new javax.swing.JButton();
        txtSobrenome = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        Sobrenome = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        Cpf = new javax.swing.JLabel();
        NomeDeUsuario = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtNomeDeUsuario = new javax.swing.JTextField();
        Senha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Voltar");
        jButton3.setPreferredSize(new java.awt.Dimension(91, 25));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtSobrenome.setText("exemplo");
        txtSobrenome.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtSobrenomeAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSobrenomeActionPerformed(evt);
            }
        });

        jButtonSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSave.setText("Salvar");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Sexo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Dados");

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "M", "F" }));
        jComboBoxSexo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBoxSexoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Editar");

        Sobrenome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Sobrenome.setText("Sobrenome");

        Nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Nome.setText("Nome");

        txtEmail.setText("exemplo");
        txtEmail.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtEmailAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtNome.setText("exemplo");
        txtNome.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtNomeAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        Cpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cpf.setText("CPF");

        NomeDeUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NomeDeUsuario.setText("Nome de usuário");

        txtCpf.setText("exemplo");
        txtCpf.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtCpfAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txtNomeDeUsuario.setText("exemplo");
        txtNomeDeUsuario.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtNomeDeUsuarioAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtNomeDeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDeUsuarioActionPerformed(evt);
            }
        });

        Senha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Senha.setText("Senha");

        txtSenha.setText("exemplo");
        txtSenha.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtSenhaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Email.setText("E-mail");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Email))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NomeDeUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Senha))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNomeDeUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSobrenome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Sobrenome))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSave)))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel2))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sobrenome)
                    .addComponent(Nome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeDeUsuario)
                    .addComponent(Senha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cpf)
                    .addComponent(Email))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSave))
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Volta para a tela inical.
        new TelaAluno(id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtSobrenomeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtSobrenomeAncestorAdded
        // Imprime na tela o nome de login atual da conta.
        txtSobrenome.setText(new ListaAlunos().getUsuarios().get(id).getUsuarioAluno().getSobrenome());
    }//GEN-LAST:event_txtSobrenomeAncestorAdded

    private void txtSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSobrenomeActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // salva edição de dados.
        new ListaAlunos().getUsuarios().get(id).getUsuarioAluno().setNome(txtNome.getText());
        new ListaAlunos().getUsuarios().get(id).getUsuarioAluno().setNomeLogin(txtNomeDeUsuario.getText());
        new ListaAlunos().getUsuarios().get(id).getUsuarioAluno().setSobrenome(txtSobrenome.getText());
        new ListaAlunos().getUsuarios().get(id).getUsuarioAluno().setSenha(txtSenha.getText());
        new ListaAlunos().getUsuarios().get(id).getUsuarioAluno().setCpf(txtCpf.getText());
        new ListaAlunos().getUsuarios().get(id).getUsuarioAluno().setSexo(jComboBoxSexo.getSelectedItem().toString());
        new ListaAlunos().getUsuarios().get(id).getUsuarioAluno().setEmail(txtEmail.getText());
        JOptionPane.showMessageDialog(null, "Dados editados com sucesso!");
        new TelaAluno(id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jComboBoxSexoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBoxSexoAncestorAdded
        jComboBoxSexo.setSelectedItem(new ListaAlunos().getUsuarios().get(id).getUsuarioAluno().getSexo());
    }//GEN-LAST:event_jComboBoxSexoAncestorAdded

    private void txtEmailAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtEmailAncestorAdded
        // Imprime na tela o nome de login atual da conta.
        txtEmail.setText(new ListaAlunos().getUsuarios().get(id).getUsuario().getEmail());
    }//GEN-LAST:event_txtEmailAncestorAdded

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNomeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtNomeAncestorAdded
        // Imprime o nome atual.
        txtNome.setText(new ListaAlunos().getUsuarios().get(id).getUsuarioAluno().getNome());
    }//GEN-LAST:event_txtNomeAncestorAdded

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCpfAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtCpfAncestorAdded
        // Imprime na tela o nome de login atual da conta.
        txtCpf.setText(new ListaAlunos().getUsuarios().get(id).getUsuario().getCpf());
    }//GEN-LAST:event_txtCpfAncestorAdded

    private void txtNomeDeUsuarioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtNomeDeUsuarioAncestorAdded
        // Imprime o nome atual de login.
        txtNomeDeUsuario.setText(new ListaAlunos().getUsuarios().get(id).getUsuarioAluno().getNomeLogin());
    }//GEN-LAST:event_txtNomeDeUsuarioAncestorAdded

    private void txtNomeDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDeUsuarioActionPerformed

    }//GEN-LAST:event_txtNomeDeUsuarioActionPerformed

    private void txtSenhaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtSenhaAncestorAdded
        // Imprime a senha atual.
        txtSenha.setText(new ListaAlunos().getUsuarios().get(id).getUsuarioAluno().getSenha());
    }//GEN-LAST:event_txtSenhaAncestorAdded

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cpf;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel NomeDeUsuario;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel Sobrenome;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeDeUsuario;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}