package ejercicio2_CuentaBancaria;

public class main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.mostrarDetalles();
        System.out.println();

        CuentaBancaria cuenta2 = new CuentaBancaria("123456", "Corriente");
        cuenta2.mostrarDetalles();
        System.out.println();

        CuentaBancaria cuenta3 = new CuentaBancaria("789012", 500000.0, "Ahorros");
        cuenta3.mostrarDetalles();

        cuenta3.depositar(100000);
        cuenta3.retirar(50000);
        System.out.println("\nSaldo final cuenta3: $" + cuenta3.getSaldo());
    }
}
