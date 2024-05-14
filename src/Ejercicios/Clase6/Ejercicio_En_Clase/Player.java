package Clase6.Ejercicio_En_Clase;

public class Player {

    //Atributos
    private String name;
    private String position;
    private int playerNumber;

    //Constructor
    public Player(String name, String position, int playerNumber) {
        this.name = name;
        this.position = position;
        this.playerNumber = playerNumber;
    }

    //Getter y Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }
    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
}
