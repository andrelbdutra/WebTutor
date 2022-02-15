/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webtutor;

import java.util.ArrayList;

/**
 *
 * @author André
 */
public class UsuarioProfessor extends Usuario{
    private boolean professor;
    private static int quantidadeProfessores;
    private static int quantidadeAlunos;
    private String materia;
    private ArrayList<UsuarioAluno> alunos = new ArrayList<UsuarioAluno>();
    private ArrayList<Aula> listaAulas = new ArrayList<Aula>();
    private Feedback feedback = new Feedback();


    public ArrayList<Aula> getListaAulas() {
        return listaAulas;
    }
  public void addAula(Aula aula){
        listaAulas.add(aula);
    }
    public void setListaAulas(ArrayList<Aula> listaAulas) {
        this.listaAulas = listaAulas;
    }
    

    public UsuarioProfessor(){
        
    }
    
    public UsuarioProfessor(String nome, String sobrenome, String nomeLog, String email, String cpf, String sexo, int telefone,String materia, String sen) {
        super(nome, sobrenome, nomeLog, email, cpf, sexo, telefone, sen);
        this.professor = true;
        this.materia = materia;
        if(nome != null)
        quantidadeProfessores++;
    }

    public void addAlunos(UsuarioAluno aluno){
        alunos.add(aluno);
        this.quantidadeAlunos++;
    }

    public static int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public ArrayList<UsuarioAluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<UsuarioAluno> alunos) {
        this.alunos = alunos;
    }

    public static int getQuantidadeProfessores() {
        return quantidadeProfessores;
    }
    
        public static void tiraQuantidadeProfessores() {
        quantidadeProfessores--;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    public boolean isProfessor() {
        return professor;
    }

    public UsuarioProfessor getUsuarioProfessor(){
        return this;
    }
    
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
     

}
