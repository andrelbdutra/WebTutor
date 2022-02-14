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
public class ListaProfessores {
    static private List<UsuarioProfessor> professores = new ArrayList<>();  
    
    public ListaProfessores() {

    }
    
    public List<UsuarioProfessor> getUsuarios() {
        return ListaProfessores.professores;
    }


    public void addProfessor(UsuarioProfessor professor) {
        professores.add(professor);
    }

        public void addProfessor() {
        professores.add(null);
    }
}
