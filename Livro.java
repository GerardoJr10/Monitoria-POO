public class Livro {
    private String titulo;
    private double preco;
    private Autor autor; // Composição

    public Livro(String titulo, double preco, Autor autor) {
        this.titulo = titulo;
        this.preco = preco;
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor.getNome());
        System.out.printf("Preço: R$ %.2f%n", preco);
    }

    public static void main(String[] args) {
        Autor autor1 = new Autor("Machado de Assis", "Brasileira");
        Livro livro1 = new Livro("Dom Casmurro", 39.90, autor1);

        livro1.exibirDetalhes();
    }
}
