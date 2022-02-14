/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webtutor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author André
 */
public class UsuarioAluno extends Usuario{
    private boolean aluno;
    private static int quantidadeAlunosTotal;
    private ArrayList<UsuarioProfessor> professores = new ArrayList<UsuarioProfessor>();
    private static int quantidadePofessores;
    
    public UsuarioAluno(){
        
    }
    
    public UsuarioAluno(String nome, String sobrenome, String nomeLog, String email, String cpf, String sexo, int telefone, String sen) {
        super(nome, sobrenome, nomeLog, email, cpf, sexo, telefone, sen);
        this.aluno = true;
        quantidadeAlunosTotal++;
    }

    public static int getQuantidadePofessores() {
        return quantidadePofessores;
    }

    /**
     *
     * @param professores
     */

    public boolean isAluno() {
        return aluno;
    }

    public void setAluno(boolean aluno) {
        this.aluno = aluno;
    }

    public void addProfessores(UsuarioProfessor professor){
        professores.add(professor);
        this.quantidadePofessores++;
    }
    
    public UsuarioAluno getUsuarioAluno(){
        return this;
    }

    public ArrayList<UsuarioProfessor> getProfessores() {
        return professores;
    }
    
}
