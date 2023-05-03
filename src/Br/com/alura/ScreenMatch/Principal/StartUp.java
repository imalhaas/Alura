package Br.com.alura.ScreenMatch.Principal;

import Br.com.alura.ScreenMatch.Calculos.CalculadoraDeTempo;
import Br.com.alura.ScreenMatch.Calculos.FiltroRecomendacao;
import Br.com.alura.ScreenMatch.Model.Filme;
import Br.com.alura.ScreenMatch.Model.Serie;

import java.util.ArrayList;

public class StartUp {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Velozes e furiosos",2023);
        meuFilme.setDuracaoEmMinutos(80);

        System.out.println("Nome do filme: " + meuFilme.getNome());
        System.out.println("Duraçao em minutos: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.avalia(10);
        meuFilme.avalia(9.5);
        meuFilme.avalia(8);

        System.out.println("Avaliações feitas: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("A media das avaliações é: " + meuFilme.pegaMedia());

        Serie minhaSerie = new Serie("Game Of Thrones", 2011);
        minhaSerie.setTemporadas(8);
        minhaSerie.setEpsodiosPorTemporada(10);
        minhaSerie.setMinutosPorEpsodios(70);
        System.out.println("Total em minutos para maratonar a serie: " + minhaSerie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        System.out.println("\n*********************************");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);


        Filme filme2 = new Filme("Doce Dupla", 2013);
        filme2.setDuracaoEmMinutos(109);
        filme2.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(filme2);
        System.out.println("Tamanho da lista = " + listaDeFilmes.size());
        System.out.println("Primeiro Filme" + listaDeFilmes.get(0).getNome());
        System.out.println("To String do filme " + listaDeFilmes.get(0).toString());
    }
}
