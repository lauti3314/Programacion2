package TP.TP_3.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Crear dos instancias de Employee
        Employee employee1 = new Employee("Juan");
        Employee employee2 = new Employee("María");

        // Asignar un supervisor al segundo empleado
        employee2.assignSupervisor(employee1);

        // Mostrar el nombre del supervisor del primer empleado
        System.out.println("El supervisor de " + employee1.getName() + " es: " + employee1.getSupervisorName());
    }
}
