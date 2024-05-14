package Clase3.Herencia;

public class Main {
    public static void main(String[] args) {
        CuentaDeAhorros cuentaAhorros = new CuentaDeAhorros(15000, 5);

        cuentaAhorros.Consignar(2000);

        cuentaAhorros.Retirar(500);

        cuentaAhorros.ExtractoMensual();

        cuentaAhorros.Imprimir();

    }
}
