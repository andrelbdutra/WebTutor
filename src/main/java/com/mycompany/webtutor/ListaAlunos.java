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
 * @author Pichau
 */
public class ListaAlunos {
    static private List<UsuarioAluno> alunos = new ArrayList<>();  
    
    public ListaAlunos() {

    }
    
    public List<UsuarioAluno> getUsuarios() {
        return ListaAlunos.alunos;
    }

    public void addAluno(UsuarioAluno aluno) {
        alunos.add(aluno);
    }
    
        public void addAluno() {
        alunos.add(null);
    }
}
