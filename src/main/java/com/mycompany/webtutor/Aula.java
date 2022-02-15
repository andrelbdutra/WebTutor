/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webtutor;

import java.util.Date;

/**
 *
 * @author pedro
 */
public class Aula {
    
    private Date data;
    private UsuarioAluno aluno;
    private UsuarioProfessor professor;
    private boolean status;
    private String link;
    // private static int aulaId;
    
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public Aula(Date data, UsuarioAluno aluno, UsuarioProfessor professor){
        this.aluno = aluno;
        this.professor = professor;
        this.data = data;
        this.status = false;
        this.link = "-";
       
        }


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public UsuarioAluno getAluno() {
        return aluno;
    }

    public UsuarioProfessor getProfessor() {
        return professor;
    }

    public void setProfessor(UsuarioProfessor professor) {
        this.professor = professor;
    }

    public void setAluno(UsuarioAluno aluno) {
        this.aluno = aluno;
    }
    
    
    
   
}
