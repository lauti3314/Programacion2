package Clase4.Ejercicio3.Clases;
import Clase4.Ejercicio3.Interfaces.Personaje;

public class Mago extends PersonajeBase {

    public Mago(int nivel, int vida, String nombre) {
        super(nivel, vida, nombre);
    }


    public int atacar(Personaje objetivo) {

        int damage;
        if (objetivo instanceof Picaro) {
            damage = 10;
        } else if (objetivo instanceof Guerrero) {
            damage = 15;
        } else {
            damage = atacar();
        }

        objetivo.recibirDanio(defender(damage));
        return 0;
    }


    @Override
    public int atacar() {
        return 5;
    }


    @Override
    public int defender(int danio) {
        int defensaMagica = 8; //
        return danio - defensaMagica; //
    }
}
