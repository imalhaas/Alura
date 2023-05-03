package Br.com.alura.ScreenMatch.Model;

import Br.com.alura.ScreenMatch.Calculos.CLassificavel;

public class Filme extends Titulo implements CLassificavel {

    public Filme (String nome, int anoLancamento){
       super(nome, anoLancamento);
    }
 
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDelancamento() + ")";
    }
}
