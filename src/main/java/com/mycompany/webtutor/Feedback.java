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
public class Feedback {
    int id;
    double pontuacao;
    String descricao;
    public Feedback(double pontuacao, String descricao){
        this.pontuacao = pontuacao;
        this.descricao = descricao;
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
      
    
}
