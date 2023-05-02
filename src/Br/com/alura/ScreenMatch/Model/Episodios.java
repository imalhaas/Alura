package Br.com.alura.ScreenMatch.Model;

import Br.com.alura.ScreenMatch.Calculos.CLassificavel;

public class Episodios implements CLassificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualiacoes;

    public int getTotalVisualiacoes() {
        return totalVisualiacoes;
    }

    public void setTotalVisualiacoes(int totalVisualiacoes) {
        this.totalVisualiacoes = totalVisualiacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if(totalVisualiacoes > 100){
            return 4;
        }else {
            return 2;
        }
    }
}
