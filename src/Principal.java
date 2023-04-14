public class Principal {
    public static void main(String[] args) {
        FIlme meuFilme = new FIlme();

        meuFilme.nome = "Velozes e furiosos";
        meuFilme.duracaoEmMinutos = 80;

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.duracaoEmMinutos);

        meuFilme.avalia(10);
        meuFilme.avalia(9.5);
        meuFilme.avalia(8);

        System.out.println("Avaliçao do filme: " + meuFilme.somaDasAvaliacoes);
        System.out.println("Avaliações feitas: " + meuFilme.totalDeAvaliacoes);
        System.out.println("A media das avaliações é: " + meuFilme.pegaMedia());
    }
}
