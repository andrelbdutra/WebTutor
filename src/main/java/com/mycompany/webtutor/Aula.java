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
    private Materia materia;
    private Date data;
    private UsuarioAluno aluno;
    public Aula(Materia materia,Date data){
        this.materia = materia;
        this.data = data;
        }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
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

    public void setAluno(UsuarioAluno aluno) {
        this.aluno = aluno;
    }
    
    
    
   
}
