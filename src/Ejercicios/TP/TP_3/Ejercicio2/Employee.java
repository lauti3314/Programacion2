package TP.TP_3.Ejercicio2;

public class Employee {


    private String name;
    private Employee supervisor;


    public Employee(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public void assignSupervisor(Employee supervisor){
        this.supervisor = supervisor;
    }

    public String  getSupervisorName(){
        if (this.supervisor == null) {
            return "Sin supervisor";
        } else {
            return supervisor.name;
        }
    }
}
