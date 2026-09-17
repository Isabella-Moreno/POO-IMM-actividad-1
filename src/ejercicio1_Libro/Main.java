package ejercicio1_Libro;
public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.mostrarDetalles();

        System.out.println();

        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 471);
        libro2.mostrarDetalles();
    }
}