package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.model.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0; //Quando declaro a variável(atributo) dentro da classe, não preciso colocar zero. java zera ela.

    // Aqui não precisei usar o setter porque quero que o cálculo seja automático, sem o usuário inserir valor

    public int getTempoTotal() {
        return this.tempoTotal; // Aqui não precisava explicitar o this.
    }

    /* ************  SE FOR POR ESSE CAMINHO, VOU FAZER VÁRIOS MÉTODOS "INCLUI" - ISSO NÃO É BOM!
    public void inclui (Filme f){
        this.tempoTotal += f.getDuracaoEmMinutos(); // Aqui não precisava explicitar o this.
   }
    public void inclui (Serie s) {
        this.tempoTotal += s.getDuracaoEmMinutos();
    }
     ************  A SERIE, O FILME, DOCUMENTÁRIO TUDO É UM TÍTULO ENTÃO...
      Vou criar um metodo só passando o Título que pode ser chamado de várias formas
      Filme, Serie, Documentário, o nome disso é POLIMORFISMO (MUITAS FORMAS)*/

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
