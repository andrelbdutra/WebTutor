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
public abstract class Usuario {
    protected int ID;
    private boolean aluno;
    private boolean professor;
    private static int quantidadeContas;
    private String nome;
    private String sobrenome;
    private String nomeLogin;
    private String email;
    private String cpf;
    private String sexo;
    private int telefone;
    private String senha;

    public Usuario() {
        this.ID = quantidadeContas++;
        nome = "";
        sobrenome = "";
        nomeLogin = "";
        email = "";
        cpf = "";
        sexo = "";
        telefone = 0;
        senha = "";
    } 
    
    public Usuario(String nom, String sobrenom, String nomeLogi, String emai, String cp, String sex, int tel, String senh) {
        this.ID = quantidadeContas++;
        nome = nom;
        sobrenome = sobrenom;
        nomeLogin = nomeLogi;
        email = emai;
        cpf = cp;
        sexo = sex;
        telefone = tel;
        senha = senh;
    }    
    
    public boolean isAluno() {
        return aluno;
    }

    public void setAluno(boolean aluno) {
        this.aluno = aluno;
    }

    public boolean isProfessor() {
        return professor;
    }

    public void setProfessor(boolean professor) {
        this.professor = professor;
    }
    
    public Usuario getUsuario(){
        return this;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static int getQuantidadeContas() {
        return quantidadeContas;
    }

    public static void setQuantidadeContas(int quantidadeContas) {
        Usuario.quantidadeContas = quantidadeContas;
    }
    
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeLogin() {
        return nomeLogin;
    }

    public void setNomeLogin(String nomeLogin) {
        this.nomeLogin = nomeLogin;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
