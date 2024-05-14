package Clase3.EjercicioEnClase;

public class Operario extends Empleado{

    private String dni;

    public Operario(String nombre, String dni) {
        super(nombre);
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Operario: " + this.getNombre();
    }

    public void Datos(){
        System.out.println("Nombre: " + this.getNombre() + "\n" +
                "Dni: " + dni);
    }
}