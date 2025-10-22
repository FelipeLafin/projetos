package classes;

public class Cliente {

    public String name;
    public String cpf;
    public int age;
    public String location;
    public int income;

    public Cliente() {
        this.name = "";
        this.cpf = "";
        this.age = 0;
        this.location = "";
        this.income = 0;
    }

    public Cliente(String name, String cpf, int age, String location, int income) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;
        this.location = location;
        this.income = income;
    }

    public String getName() {
        return name;
    }
}