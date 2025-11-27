import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        //Vai na Classe br.com.alura.screenmatch.model.Filme e imprime a ficha técnica
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

    System.out.println("Média de pessoas que assistiram: " + meuFilme.pegaMedia());
    System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);


        System.out.println( "Episódios por temporada: " + lost.getEpisodiosPorTemporada());
        System.out.println("Em qual temporada estamos? " + lost.getTemporadas());
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos() + " min.");
    
    }
}
