package Clase6.Ejercicio_En_Clase;

public class Main {
    public static void main(String[] args) {

        Team team = new Team();

        Player player1 = new Player("Messi","Delantero",10);
        Player player2 = new Player("Martinez","Portero",1);

        team.addPlayer(player1);
        team.addPlayer(player2);

        System.out.println("Jugadores en el Equipo:");
        for (Player player: team) {
            System.out.println("--------------------------------");
            System.out.println("Nombre: " +player.getName());
            System.out.println("Posicion: " +player.getPosition());
            System.out.println("Camiseta: " +player.getPlayerNumber());
        }
        team.iterator();
    }
}