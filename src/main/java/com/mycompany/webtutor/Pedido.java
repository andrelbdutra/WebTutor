/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webtutor;

/**
 *
 * @author pedro
 */
public class Pedido {
    private String status;
    private UsuarioAluno aluno;
    private String token;
    private UsuarioProfessor professor;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UsuarioAluno getAluno() {
        return aluno;
    }

    public void setAluno(UsuarioAluno aluno) {
        this.aluno = aluno;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UsuarioProfessor getProfessor() {
        return professor;
    }

    public void setProfessor(UsuarioProfessor professor) {
        this.professor = professor;
    }
 
    //resportaProfessor
    
    
}
