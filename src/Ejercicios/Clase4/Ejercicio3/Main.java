package Clase4.Ejercicio3;
import Clase4.Ejercicio3.Clases.*;

public class Main {
    public static void main(String[] args) {

        Guerrero guerrero = new Guerrero(1, 100, "Guerrero");
        Mago mago = new Mago(1, 100, "Mago");
        Picaro picaro = new Picaro(1, 100, "Pícaro");


        mago.atacar(guerrero);
        guerrero.atacar(picaro);
        picaro.atacar(mago);


        System.out.println("Vida del Guerrero después del ataque del Mago: " + guerrero.getVida());
        System.out.println("Vida del Pícaro después del ataque del Guerrero: " + picaro.getVida());
        System.out.println("Vida del Mago después del ataque del Pícaro: " + mago.getVida());
    }
}