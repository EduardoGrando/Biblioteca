public class Autor {
    String nome;
    String nacionalidade;
    String dataNascimento;
    String biografia;

    public Autor(String nome, String nacionalidade, String dataNascimento, String biografia) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
        this.biografia = biografia;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Biografia: " + biografia);
    }
}
