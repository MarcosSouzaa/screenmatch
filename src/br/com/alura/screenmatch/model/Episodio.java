package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculos.Classificavel;

//Quero classificar também o episódio
public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie; //eu tenho uma série a qual esse episódio pertence
    private int totalVisualizacoes;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if(totalVisualizacoes > 100){
            return 4; // 4 estrelas
        }else{
            return 2; // 2 estrelas
        }
        /* O que vou fazer com essa informação?
        Vou criar uma class de recomendação. Ex: Se o que estou sentindo tem mais de
        4 estrelas, ele está entre os preferidos, senão não está.
         */
    }
}
