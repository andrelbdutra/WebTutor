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
public class Materia {
    private int id;
    private String nome;
    private String descricao;
    public Materia(int id, String nome, String descricao){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
                
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
