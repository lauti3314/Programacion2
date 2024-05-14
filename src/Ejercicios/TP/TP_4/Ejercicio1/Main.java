package TP.TP_4.Ejercicio1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guessNumber = random.nextInt(100) + 1;
        int tries = 0;

        System.out.println("Adivina el numero.");
        System.out.println("---------------------------------------------");

        while(true) {
            try {
                System.out.println("Ingrese un numero del 1 al 100: ");
                int number = scanner.nextInt();
                scanner.nextLine();

                if (number < 1 || number > 100){
                    throw new IllegalArgumentException(("Numero fuera del rango"));

                }else {
                    if (whatNumberIs(number, guessNumber)){
                        System.out.println("Has adivinado el numero. Número de intentos: " + tries);
                        break;
                    } else {
                        tries++;
                    }
                }
            } catch (InputMismatchException ime){
                System.out.println("El valor ingresado debe ser numerico");
                tries++;
            }catch (IllegalArgumentException iae){
                iae.getMessage();
            }catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
                tries++;
            }
            System.out.println("//Ingrese si para salir. Pulse cualquier otra opcion para continuar.//");
            String giveUp = scanner.nextLine();
            if (giveUp.equalsIgnoreCase("si")){
                break;
            }
            System.out.println("----------------------------------");
        }
    }

    private static boolean whatNumberIs(int number, int guessNumber){
        if (number== guessNumber){
            return true;
        } else if (number < guessNumber){
            System.out.println("El numero es mas grande");
        }else {
            System.out.println("El numero es mas pequeño");
        }
        return false;
    }
}