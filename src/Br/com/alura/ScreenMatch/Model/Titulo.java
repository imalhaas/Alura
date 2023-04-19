package Br.com.alura.ScreenMatch.Model;

public class Titulo {

    private String nome;
    private int anoDelancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDelancamento(int anoDelancamento) {
        this.anoDelancamento = anoDelancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println(nome);
        System.out.println(anoDelancamento);
    }
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public  double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }



}
