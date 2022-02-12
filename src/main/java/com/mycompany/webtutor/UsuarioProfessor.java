/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webtutor;

/**
 *
 * @author André
 */
public class UsuarioProfessor extends Usuario{
    private String materia;
    private String feedback[];

    public UsuarioProfessor(){
        
    }
    
    public UsuarioProfessor(String nome, String sobrenome, String nomeLog, String email, int cpf, char sexo, int telefone, String sen) {
        super(nome, sobrenome, nomeLog, email, cpf, sexo, telefone, sen);
    }

    @Override
    public boolean validaLogin(String nomeLogin, String senha) {
        if(getNomeLogin().equals(nomeLogin) && getSenha().equals(senha)){
            return true;
        }else{
            return false;
        }
    }
    
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
        public String[] getFeedback() {
        return feedback;
    }

    public void setFeedback(String[] feedback) {
        this.feedback = feedback;
    }
    
}
