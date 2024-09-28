public class Usuario {
    String nome;
    String matricula;
    String curso;
    String email;
    int livrosEmprestados;

    public Usuario(String nome, String matricula, String curso, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.email = email;
        this.livrosEmprestados = 0;
    }

    public void realizarEmprestimo() {
        livrosEmprestados++;
    }

    public void devolverLivro() {
        livrosEmprestados--;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("Email: " + email);
        System.out.println("Livros Emprestados: " + livrosEmprestados);
    }
}