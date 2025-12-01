package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculos.Classificavel;

/* Aqui em Filme, vou implementar minha INTERFACE para poder classificar meus filmes
*  Vou dizer que que Filme Implementa o Classificável*/
public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/2;
    }
}
