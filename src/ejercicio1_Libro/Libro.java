package ejercicio1_Libro;

public class Libro {

    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Autor desconocido";
        this.numeroPaginas = 0;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = (titulo == null || titulo.isBlank()) ? "Sin título" : titulo;
        this.autor = (autor == null || autor.isBlank()) ? "Autor desconocido" : autor;
        this.numeroPaginas = (numeroPaginas < 0) ? 0 : numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas >= 0) this.numeroPaginas = numeroPaginas;
    }

    public void mostrarDetalles() {
        System.out.println("----- Detalles del Libro -----");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }

    @Override
    public String toString() {
        return "Libro{titulo='" + titulo + "', autor='" + autor +
                "', numeroPaginas=" + numeroPaginas + "}";
    }
}

