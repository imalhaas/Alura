package Br.com.alura.ScreenMatch.Principal;

import Br.com.alura.ScreenMatch.Model.Filme;
import Br.com.alura.ScreenMatch.Model.Serie;
import Br.com.alura.ScreenMatch.Model.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Velozes e furiosos",2023);
        meuFilme.avalia(6);
        Filme filme2 = new Filme("Doce Dupla", 2013);
        filme2.avalia(8);
        Serie gameOfThrones = new Serie("Game Of Thrones", 2011);
        gameOfThrones.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(filme2);
        lista.add(gameOfThrones);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme){
                Filme filme =(Filme) item;
                System.out.println("classificaçao: " + filme.getClassificacao());
            }
        }
    }
}
