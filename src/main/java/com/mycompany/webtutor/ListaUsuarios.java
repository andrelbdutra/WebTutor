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
public class ListaUsuarios {
    
    static private List<Usuario> usuarios = new ArrayList<>();  
    
    public ListaUsuarios() {

    }
    
    public List<Usuario> getUsuarios() {
        return ListaUsuarios.usuarios;
    }


    public void addProfessor(UsuarioProfessor professor) {
        usuarios.add(professor);
    }
    
    public void addAluno(UsuarioAluno professor) {
        usuarios.add(professor);
    }
    
        public void addAluno() {
        usuarios.add(null);
    }
}