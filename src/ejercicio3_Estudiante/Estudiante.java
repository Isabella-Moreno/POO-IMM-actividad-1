package ejercicio3_Estudiante;

public class Estudiante {

    private String nombre;
    private int edad;
    private String curso;


    public Estudiante() {
        this("Sin nombre", 0);
    }


    public Estudiante(String nombre, int edad) {
        this(nombre, edad, "Sin asignar");
    }


    public Estudiante(String nombre, int edad, String curso) {
        this.nombre = (nombre == null || nombre.isBlank()) ? "Sin nombre" : nombre;
        this.edad = (edad < 0) ? 0 : edad;
        this.curso = (curso == null || curso.isBlank()) ? "Sin asignar" : curso;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getCurso() { return curso; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { if (edad >= 0) this.edad = edad; }
    public void setCurso(String curso) { this.curso = curso; }

    public void mostrarDetalles() {
        System.out.println("----- Detalles del Estudiante -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
    }

    @Override
    public String toString() {
        return "Estudiante{nombre='" + nombre + "', edad=" + edad + ", curso='" + curso + "'}";
    }
}
