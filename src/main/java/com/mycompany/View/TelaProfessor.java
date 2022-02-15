/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.View;

import com.mycompany.webtutor.Aula;
import com.mycompany.webtutor.ListaAlunos;
import com.mycompany.webtutor.ListaProfessores;
import com.mycompany.webtutor.ListaUsuarios;
import com.mycompany.webtutor.UsuarioAluno;
import com.mycompany.webtutor.UsuarioProfessor;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pichau
 */
public class TelaProfessor extends javax.swing.JFrame {
    private int id;
    
    /**
     * Creates new form TelaProfessor
     */
    public TelaProfessor() {
        initComponents();
        adicionaTabela();
    }
    
    public TelaProfessor(int id) {
        this.id = id;
         initComponents();
         adicionaTabela();
    }
    
        public void adicionaTabela(){
        // Cria uma cópia da lista de alunos do atual professor para a tabela.
        // Cria uma cópia da lista de professores do atual aluno para a tabela.
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        List<Aula> list = new ListaProfessores().getUsuarios().get(id).getListaAulas();
            Object addLinha[] = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            addLinha[0] = list.get(i).getData();
            addLinha[1] = i;
            addLinha[2] = list.get(i).getAluno().getNome();
            addLinha[3] = list.get(i).getProfessor().getMateria();
            if(list.get(i).isStatus() == true){
                addLinha[4] = "Aceita";
            }else{
                addLinha[4] = "Pendente";
            }
                
            model.addRow(addLinha);
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        nomeProfessor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idConta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtIdAula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAvaliacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Minha conta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Sair");
        jButton2.setPreferredSize(new java.awt.Dimension(107, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        nomeProfessor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nomeProfessor.setText("Nome Professor");
        nomeProfessor.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                nomeProfessorAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Professor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ID: ");

        idConta.setText("idConta");
        idConta.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                idContaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Id Aula", "Nome", "Materia", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Data");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Id Aula");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Nome");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Materia");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Status");
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Aulas");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Acessar Aula");
        jButton3.setPreferredSize(new java.awt.Dimension(115, 23));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtIdAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAulaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Id da Aula:");
        jLabel4.setPreferredSize(new java.awt.Dimension(53, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Avaliação:");

        txtAvaliacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAvaliacao.setText("jLabel6");
        txtAvaliacao.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtAvaliacaoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdAula, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idConta)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addComponent(nomeProfessor))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(126, 126, 126)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAvaliacao)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idConta)
                    .addComponent(jLabel5)
                    .addComponent(txtAvaliacao))
                .addGap(18, 18, 18)
                .addComponent(nomeProfessor)
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Volta para a tela de informações da conta.
        new TelaConfigProfessor(id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Volta para a tela inicial (sai da conta.)
        new TelaInicial().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nomeProfessorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_nomeProfessorAncestorAdded
        nomeProfessor.setText(new ListaUsuarios().getUsuarios().get(id).getUsuario().getNome());
    }//GEN-LAST:event_nomeProfessorAncestorAdded

    private void idContaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_idContaAncestorAdded
        idConta.setText(Integer.toString(new ListaProfessores().getUsuarios().get(id).getID()));
    }//GEN-LAST:event_idContaAncestorAdded

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    new TelaAulaProfessor(Integer.parseInt(txtIdAula.getText()),id).setVisible(true);
    
    this.dispose();
    
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtIdAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAulaActionPerformed

    private void txtAvaliacaoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtAvaliacaoAncestorAdded
    txtAvaliacao.setText(Integer.toString (new ListaProfessores().getUsuarios().get(id).getUsuarioProfessor().getFeedback().getPontuacao()));        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvaliacaoAncestorAdded

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel idConta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel nomeProfessor;
    private javax.swing.JLabel txtAvaliacao;
    private javax.swing.JTextField txtIdAula;
    // End of variables declaration//GEN-END:variables
}
