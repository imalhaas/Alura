package Br.com.alura.ScreenMatch.Model;

public class Serie extends Titulo{

    private int temporadas;
    private boolean ativa;
    private int epsodiosPorTemporada;
    private int minutosPorEpsodios;

    public Serie(String nome, int anoDelancamento) {
        super(nome, anoDelancamento);
    }


    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpsodiosPorTemporada() {
        return epsodiosPorTemporada;
    }

    public void setEpsodiosPorTemporada(int epsodiosPorTemporada) {
        this.epsodiosPorTemporada = epsodiosPorTemporada;
    }

    public int getMinutosPorEpsodios() {
        return minutosPorEpsodios;
    }

    public void setMinutosPorEpsodios(int minutosPorEpsodios) {
        this.minutosPorEpsodios = minutosPorEpsodios;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epsodiosPorTemporada * minutosPorEpsodios;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + "(" + this.getAnoDelancamento() + ")";
    }
}
