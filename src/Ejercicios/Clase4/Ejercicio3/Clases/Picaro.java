package Clase4.Ejercicio3.Clases;
import Clase4.Ejercicio3.Interfaces.Personaje;

public class Picaro extends PersonajeBase{

    public Picaro(int nivel, int vida, String nombre) {
        super(nivel, vida, nombre);
    }

    public int atacar(Personaje objetivo) {

        int damage;
        if (objetivo instanceof Mago) {
            damage = 15;
        } else if (objetivo instanceof Guerrero) {
            damage = 10;
        } else {
            damage = atacar(); //
        }

        objetivo.recibirDanio(defender(damage));
        return 0;
    }


    @Override
    public int atacar() {
        return 4;
    }


    @Override
    public int defender(int danio) {
        int armadura = 6;
        return danio - armadura;
    }
}
