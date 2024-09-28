import java.util.Date;

public class BibliotecaMain {

    public static void main(String[] args) {
        // Criando autores
        Autor autor1 = new Autor("Bob Esponja", "Brasil", "01/01/1900", "Eu sou o batman");
        Autor autor2 = new Autor("Chiquititas", "Argentina", "25/06/1979", "Salve Jorge é meu apelido ");

        // Criando livros
        Livro livro1 = new Livro("Batman no mar", "978-3-16-148410-0", autor1, 78);
        Livro livro2 = new Livro("Bate bate com as maos", "978-0-452-28423-4", autor2, 328);

        // Criando usuários
        Usuario usuario1 = new Usuario("Eduardo Grando", "2021001", "Análise de Sistemas", "eduardo@mail.com");
        Usuario usuario2 = new Usuario("Murilo Ganzala", "2021002", "Agronomia", "murilo@mail.com");

        // Realizando um empréstimo
        Date dataEmprestimo = new Date();  // Data atual
        Date dataDevolucaoPrevista = new Date(dataEmprestimo.getTime() + (7 * 24 * 60 * 60 * 1000));  // 7 dias depois

        Emprestimo emprestimo1 = new Emprestimo(livro1, usuario1, dataEmprestimo, dataDevolucaoPrevista);

        // Exibindo detalhes do empréstimo
        emprestimo1.exibirEmprestimo();

        // Simulando devolução do livro
        Date dataDevolucaoReal = new Date();  // Hoje como data de devolução
        emprestimo1.registrarDevolucao(dataDevolucaoReal);

        // Exibindo detalhes do empréstimo após a devolução
        System.out.println("\nApós devolução:");
        emprestimo1.exibirEmprestimo();
    }
}
