package ejercicio3_Estudiante;

public class main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        e1.mostrarDetalles();
        System.out.println();

        Estudiante e2 = new Estudiante("Isabella Moreno", 21);
        e2.mostrarDetalles();
        System.out.println();

        Estudiante e3 = new Estudiante("Carlos Martinez", 21, "Ingeniería del Software");
        e3.mostrarDetalles();
    }
}