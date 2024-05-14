package Clase8.Ejercicio_En_Clase;

import java.util.InputMismatchException;
import static javax.swing.JOptionPane.*;
public class Calculadora{
    public static void main(String[] args) {
        boolean flag = false;
        while (!flag){
            try {
                int number1 = Integer.parseInt(showInputDialog("Ingrese el primer numero: "));
                int number2 = Integer.parseInt(showInputDialog("Ingrese el segundo numero: "));
                showMessageDialog(null, "Operaciones Matematicas: '+','-','*','/'.");
                String operator = showInputDialog("Indique la operacion: ");
                int result = operacionMatematica(number1,number2,operator);
                showMessageDialog(null,"Resultado: " + result);
            }catch (NumberFormatException nfe) {
                showMessageDialog(null,"Ingreso incorrecto, error: " + nfe.getMessage());
            } catch (InputMismatchException ime) {
                showMessageDialog(null,"Ingreso incorrecto, error: " +ime.getMessage());
            }catch (ArithmeticException ae){
                showMessageDialog(null,"Division incorrecta, error: " +ae.getMessage());
            }finally {
                if (showInputDialog(null, "Ingrese 'si' para salir").equalsIgnoreCase("si")){
                    flag = true;
                }
            }
        }
    }
    public static int operacionMatematica(int n1,int n2,String op) throws IllegalArgumentException,ArithmeticException{
        switch (op){
            case "+":
                return (n1 + n2);
            case "-":
                return (n1 - n2);
            case "*":
                return (n1 * n2);
            case "/":
                try {
                    return (n1 / n2);
                }catch (ArithmeticException ae){
                    throw new ArithmeticException("Division por cero.");
                }
            default:
                throw new InputMismatchException("Operador incorrecto");
        }
    }
}