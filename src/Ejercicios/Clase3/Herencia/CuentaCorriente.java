package Clase3.Herencia;

public class CuentaCorriente extends Cuenta{
    private float sobregiro = 0;

    public CuentaCorriente(float saldo, float tasaAnual, float sobregiro) {
        super(saldo, tasaAnual);
        this.sobregiro = sobregiro;
    }

    @Override
    public void Consignar(float cantidad) {
        super.Consignar(cantidad);
        if (sobregiro > 0){
            this.saldo += sobregiro;
            sobregiro = 0;
        }
    }

    @Override
    public void Retirar(float cantidad) {
        this.saldo -= cantidad;
        if (saldo < 0){
            sobregiro += saldo;
            saldo = 0;
        }
    }

    @Override
    public void ExtractoMensual() {
        super.ExtractoMensual();
    }

    @Override
    public void Imprimir() {
        System.out.println("Saldo: $" + saldo);
        System.out.println("Comision Mensual: " + comisionAnual/12);
        System.out.println("Transacciones Totales: " + (numeroConsignaciones + numeroRetiros));
        System.out.println("Sobregiro: " + sobregiro);
    }
}