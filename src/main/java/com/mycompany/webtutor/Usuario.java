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
public abstract class Usuario {
    private String nome;
    private String sobrenome;
    private String nomeLogin;
    private String email;
    private int cpf;
    private char sexo;
    private int telefone;
    private String senha;

    public abstract boolean validaLogin(String nomeLogin, String senha);
    
    public Usuario() {
    } 
    
    public Usuario(String nome, String sobrenome, String nomeLog, String email, int cpf, char sexo, int telefone, String sen) {
        nome = nome;
        sobrenome = sobrenome;
        nomeLogin = nomeLog;
        email = email;
        cpf = cpf;
        sexo = sexo;
        telefone = telefone;
        senha = sen;
    }    
    
    
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
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
