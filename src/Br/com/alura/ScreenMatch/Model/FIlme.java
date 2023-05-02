package Br.com.alura.ScreenMatch.Model;

import Br.com.alura.ScreenMatch.Calculos.CLassificavel;

public class FIlme extends Titulo implements CLassificavel {

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
}
