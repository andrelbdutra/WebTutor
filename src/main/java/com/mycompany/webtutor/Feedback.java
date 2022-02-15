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
    private int id;
    private int  pontuacao;
    private static int numeroFeedbacks;
    public Feedback(){
        this.pontuacao = 5;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPontuacao() {
        return this.pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNumeroFeedbacks() {
        return numeroFeedbacks;
    }

    public void setNumeroFeedbacks(int numeroFeedbacks) {
        this.numeroFeedbacks = numeroFeedbacks;
    }
      
    public void addFeedback(int feedback){
        numeroFeedbacks ++;
        this.pontuacao = (pontuacao + feedback)/numeroFeedbacks;
    }
}
