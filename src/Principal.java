import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.model.Episodio;
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

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost); // Aqui chamei a Série na sobrecarga de métodos
        System.out.println( "Tempo total dos Filmes: " + calculadora.getTempoTotal());

        //Vou estanciar o FiltroRecomendação aqui para usar a classificação
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme); // Vai usar o método com seu contrato para imprimir

        //Veu pegar a classificação do EPISÓDIO
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
