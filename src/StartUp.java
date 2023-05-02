import Br.com.alura.ScreenMatch.Calculos.CalculadoraDeTempo;
import Br.com.alura.ScreenMatch.Calculos.FiltroRecomendacao;
import Br.com.alura.ScreenMatch.Model.FIlme;
import Br.com.alura.ScreenMatch.Model.Serie;

public class StartUp {
    public static void main(String[] args) {
        FIlme meuFilme = new FIlme();

        meuFilme.setNome("Velozes e furiosos");
        meuFilme.setDuracaoEmMinutos(80);

        System.out.println("Nome do filme: " + meuFilme.getNome());
        System.out.println("Duraçao em minutos: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.avalia(10);
        meuFilme.avalia(9.5);
        meuFilme.avalia(8);

        System.out.println("Avaliações feitas: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("A media das avaliações é: " + meuFilme.pegaMedia());

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Game Of Thrones");
        minhaSerie.setTemporadas(8);
        minhaSerie.setEpsodiosPorTemporada(10);
        minhaSerie.setMinutosPorEpsodios(70);
        minhaSerie.setAnoDelancamento(2011);
        System.out.println("Total em minutos para maratonar a serie: " + minhaSerie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        System.out.println("\n*********************************");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

    }
}
