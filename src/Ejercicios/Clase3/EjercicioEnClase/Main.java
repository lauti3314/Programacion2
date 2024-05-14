package Clase3.EjercicioEnClase;

public class Main {
    public static void main(String[] args) {
        Operario operario = new Operario("Joaquin Gomez","23.311.678");
        System.out.println(operario.toString());
        System.out.println();
        operario.Datos();

        System.out.println();
        System.out.println();


        Directivo directivo = new Directivo("Lautaro Tejada","Administrador de empresas");
        System.out.println(directivo.toString());
        System.out.println();
        directivo.Informacion();

        System.out.println();
        System.out.println();

        Oficial oficial = new Oficial("Marcos Di Meco","30.432.103","9877");
        System.out.println(oficial.toString());
        System.out.println();
        oficial.Datos();

        System.out.println();
        System.out.println();

        Tecnico tecnico = new Tecnico("Joaquin Parellada","28.235.143","San Martin 534");
        System.out.println(tecnico.toString());
        System.out.println();
        tecnico.Datos();
    }
}
