import java.util.Date;

public class Emprestimo {
    Livro livro;
    Usuario usuario;
    Date dataEmprestimo;
    Date dataDevolucaoPrevista;
    Date dataDevolucaoReal;

    public Emprestimo(Livro livro, Usuario usuario, Date dataEmprestimo, Date dataDevolucaoPrevista) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.dataDevolucaoReal = null; // Ainda não devolvido
    }

    public void registrarDevolucao(Date dataDevolucaoReal) {
        this.dataDevolucaoReal = dataDevolucaoReal;
        livro.devolver();  // Marca o livro como disponível novamente
        usuario.devolverLivro(); // Atualiza o número de livros emprestados pelo usuário
    }

    public void exibirEmprestimo() {
        System.out.println("Livro: " + livro.titulo);
        System.out.println("Usuário: " + usuario.nome);
        System.out.println("Data de Empréstimo: " + dataEmprestimo);
        System.out.println("Data Prevista para Devolução: " + dataDevolucaoPrevista);
        if (dataDevolucaoReal != null) {
            System.out.println("Data de Devolução Real: " + dataDevolucaoReal);
        } else {
            System.out.println("Ainda não devolvido.");
        }
    }
}