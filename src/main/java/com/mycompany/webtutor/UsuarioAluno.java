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
public class UsuarioAluno extends Usuario{
    
    public UsuarioAluno(){
        
    }
    
    public UsuarioAluno(String nome, String sobrenome, String nomeLog, String email, int cpf, char sexo, int telefone, String sen) {
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
    
}
