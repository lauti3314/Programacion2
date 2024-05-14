package Clase4.Ejercicio3.Clases;
import Clase4.Ejercicio3.Interfaces.Personaje;

public class Guerrero extends PersonajeBase {

    public Guerrero(int nivel, int vida, String nombre) {
        super(nivel, vida, nombre);
    }


    public int atacar(Personaje objetivo) {

        int damage;
        if (objetivo instanceof Picaro) {
            damage = 15;
        } else if (objetivo instanceof Mago) {
            damage = 10;
        } else {
            damage = atacar();
        }

        objetivo.recibirDanio(defender(damage));
        return 0;
    }


    @Override
    public int atacar() {
        return 8;
    }


    @Override
    public int defender(int danio) {
        int armadura = 8; // Valor de armadura del guerrero
        return danio - armadura; // Ajustar daño basado en la armadura
    }
}