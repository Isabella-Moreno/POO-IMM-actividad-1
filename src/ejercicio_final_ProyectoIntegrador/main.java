package ejercicio_final_ProyectoIntegrador;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Registro de Libro ===");
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.print("Número de páginas: ");
        int paginas = Integer.parseInt(sc.nextLine());

        Libro libro = new Libro(titulo, autor, paginas);
        Libro libroDefault = new Libro();

        System.out.println("\n=== Registro de Cuenta Bancaria ===");
        System.out.print("Número de cuenta: ");
        String numeroCuenta = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = Double.parseDouble(sc.nextLine());
        System.out.print("Tipo de cuenta: ");
        String tipoCuenta = sc.nextLine();

        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);
        CuentaBancaria cuentaDefault = new CuentaBancaria();

        System.out.println("\n=== Registro de Estudiante ===");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.print("Curso: ");
        String curso = sc.nextLine();

        Estudiante estudiante = new Estudiante(nombre, edad, curso);
        Estudiante estudianteDefault = new Estudiante();

        System.out.println("\n================ RESULTADOS ================");
        System.out.println("Libro (parametrizado): " + libro);
        System.out.println("Libro (por defecto): " + libroDefault);
        System.out.println("Cuenta (parametrizada): " + cuenta);
        System.out.println("Cuenta (por defecto): " + cuentaDefault);
        System.out.println("Estudiante (parametrizado): " + estudiante);
        System.out.println("Estudiante (por defecto): " + estudianteDefault);

        sc.close();
    }
}