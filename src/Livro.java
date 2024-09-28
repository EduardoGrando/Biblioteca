public class Livro {
    String titulo;
    String isbn;
    Autor autor;
    int numeroPaginas;
    boolean disponivel;

    public Livro(String titulo, String isbn, Autor autor, int numeroPaginas) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponivel = true; // Livro começa como disponível
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
        } else {
            System.out.println("Livro já está emprestado.");
        }
    }

    public void devolver() {
        disponivel = true;
    }
}
