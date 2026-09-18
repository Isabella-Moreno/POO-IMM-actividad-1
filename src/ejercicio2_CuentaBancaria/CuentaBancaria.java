package ejercicio2_CuentaBancaria;

public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    public CuentaBancaria() {
        this("000000", 0.0, "Ahorros");
    }


    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this(numeroCuenta, 0.0, tipoCuenta);
    }


    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = (numeroCuenta == null || numeroCuenta.isBlank()) ? "000000" : numeroCuenta;
        this.saldo = (saldo < 0) ? 0.0 : saldo;
        this.tipoCuenta = (tipoCuenta == null || tipoCuenta.isBlank()) ? "Ahorros" : tipoCuenta;
    }

    public String getNumeroCuenta() { return numeroCuenta; }
    public double getSaldo() { return saldo; }
    public String getTipoCuenta() { return tipoCuenta; }

    public void setNumeroCuenta(String numeroCuenta) { this.numeroCuenta = numeroCuenta; }
    public void setTipoCuenta(String tipoCuenta) { this.tipoCuenta = tipoCuenta; }

    public void depositar(double monto) {
        if (monto > 0) this.saldo += monto;
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
        } else {
            System.out.println("Operación inválida: saldo insuficiente o monto incorrecto.");
        }
    }

    public void mostrarDetalles() {
        System.out.println("----- Detalles de la Cuenta -----");
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo: $" + saldo);
    }

    @Override
    public String toString() {
        return "CuentaBancaria{numeroCuenta='" + numeroCuenta + "', saldo=" + saldo +
                ", tipoCuenta='" + tipoCuenta + "'}";
    }
}
