/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.View;

import com.mycompany.webtutor.ListaProfessores;

/**
 *
 * @author Pichau
 */
public class TelaConfigProfessor extends javax.swing.JFrame {
    private int id;
    
    /**
     * Creates new form TelaConfigProfessor
     */
    public TelaConfigProfessor(int id) {
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

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelSobrenome = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelMateria = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nome");

        jLabelNome.setText("jLabel2");
        jLabelNome.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabelNomeAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Sobrenome");

        jLabelSobrenome.setText("jLabel4");
        jLabelSobrenome.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabelSobrenomeAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Username");

        jLabelUsername.setText("jLabel6");
        jLabelUsername.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabelUsernameAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Email");

        jLabelEmail.setText("jLabel8");
        jLabelEmail.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabelEmailAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Cpf");

        jLabelCpf.setText("jLabel10");
        jLabelCpf.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabelCpfAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Materia");

        jLabelMateria.setText("jLabel12");
        jLabelMateria.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabelMateriaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Senha");

        jLabelSenha.setText("-");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Sexo");

        jLabelSexo.setText("jLabel4");
        jLabelSexo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabelSexoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Editar dados");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 404, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabelSobrenome)
                            .addComponent(jLabel5)
                            .addComponent(jLabelUsername)
                            .addComponent(jLabelMateria)
                            .addComponent(jLabel9)
                            .addComponent(jLabelEmail)
                            .addComponent(jLabelCpf)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabelSexo)
                            .addComponent(jLabelSenha)
                            .addComponent(jLabel13))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNome)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSobrenome)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUsername)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEmail)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMateria)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSexo)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSenha)
                .addContainerGap(36, Short.MAX_VALUE))
        );

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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelNomeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabelNomeAncestorAdded
        // Printa na tela o nome do professor.
        jLabelNome.setText(new ListaProfessores().getUsuarios().get(id).getUsuario().getNome());        
    }//GEN-LAST:event_jLabelNomeAncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // volta para a tela de Professor.
        new TelaProfessor(id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabelSobrenomeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabelSobrenomeAncestorAdded
        // Printa na tela o sobrenome do professor.
        jLabelSobrenome.setText(new ListaProfessores().getUsuarios().get(id).getUsuario().getSobrenome());   
    }//GEN-LAST:event_jLabelSobrenomeAncestorAdded

    private void jLabelUsernameAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabelUsernameAncestorAdded
        // Printa na tela o nome de usuario.
        jLabelUsername.setText(new ListaProfessores().getUsuarios().get(id).getUsuario().getNomeLogin());   
    }//GEN-LAST:event_jLabelUsernameAncestorAdded

    private void jLabelEmailAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabelEmailAncestorAdded
        // Printa na tela o email do professor.
        jLabelEmail.setText(new ListaProfessores().getUsuarios().get(id).getUsuario().getEmail()); 
    }//GEN-LAST:event_jLabelEmailAncestorAdded

    private void jLabelCpfAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabelCpfAncestorAdded
        // Printa na tela o nome do professor.
        jLabelCpf.setText(new ListaProfessores().getUsuarios().get(id).getUsuario().getCpf()); 
    }//GEN-LAST:event_jLabelCpfAncestorAdded

    private void jLabelMateriaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabelMateriaAncestorAdded
        // Printa na tela o email do professor.
        jLabelMateria.setText(new ListaProfessores().getUsuarios().get(id).getUsuarioProfessor().getMateria()); 
    }//GEN-LAST:event_jLabelMateriaAncestorAdded

    private void jLabelSexoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabelSexoAncestorAdded
        // Printa na tela o email do professor.
        jLabelSexo.setText(new ListaProfessores().getUsuarios().get(id).getUsuarioProfessor().getSexo()); 
    }//GEN-LAST:event_jLabelSexoAncestorAdded

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // voi para a tela de editar Professor.
        new TelaEditarProfessor(id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelMateria;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelSobrenome;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
