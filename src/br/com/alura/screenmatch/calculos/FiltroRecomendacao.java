package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    /* Vou fazer um filtro usando POLIMORFISMO porque a recomendação pode vir de Filme,
     * de Série, de Usuário e o que eu criar em Título.
     * Aqui vou usar a minha interface Classificavel
     * Quando eu chamar o meu filtro Classificável, ele verá de onde está vindo
     * e vai fazer a classificação e devolver a mensagem.
     */
    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento!");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliação no momento!");
        }else{
            System.out.println("Coloque na sua lista para assistir depois!");
        }
    }
}


