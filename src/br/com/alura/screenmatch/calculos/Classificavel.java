package br.com.alura.screenmatch.calculos;
/* Uma Class para classificar o filme com estrelas
Eu gostaria de avaliar o Filme, a Série, o Episódio, o Usuário
Só que o Filme já Extends o Título e no Java eu só posso usar herança uma vez
Só posso herdar de uma única Class.
Se eu não posso Extender, eu posso usar outro recurso da linguágem que a gente chama de INTERFACE */
public interface Classificavel {
    /* Vou definir aqui qual é o método que eu quero que seja comum, a episódio, a Filme, a Série ao que eu quiser que implemente este método
    Eu quero que o Classificável me retorne uma classificação
     Não quero a nota, eu quero as ESTRELAS
     É um contrato! Quem usar o Classificável terá um getClassificação*/
    int getClassificacao();
}
