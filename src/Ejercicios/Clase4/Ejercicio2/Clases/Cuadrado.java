package Clase4.Ejercicio2.Clases;
import Clase4.Ejercicio2.Interfaces.Dibujable;
import Clase4.Ejercicio2.Interfaces.Figura;
import Clase4.Ejercicio2.Interfaces.Rotable;

public class Cuadrado implements Figura, Rotable, Dibujable {
    private int lados;
    //Constructor
    public Cuadrado(int lados) {
        this.lados = lados;
    }
    //Getter y Setter
    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }
    //Metodos
    @Override
    public float Area() {
        return lados*lados;
    }

    @Override
    public void Dibujar() {
        System.out.println("Se ha dibujado en el Cuadrado");
    }

    @Override
    public void Rotar() {
        System.out.println("La figura ha rotado 90º");
    }

}