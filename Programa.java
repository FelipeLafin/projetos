import java.util.Scanner;
import classes.Cliente;

public class Programa {
    public static Programa program = new Programa();
    public static Scanner scanner = new Scanner(System.in);

    public static double personal = 1.4;
    public static double guarantee = 1.3;
    public static double consigned = 1.2;
    
    public static void main(String[] args) {
        desafio();
    }

    public static void desafio() {
        Cliente cliente = new Cliente(
            "Erikaya",
            "123.456.789-10",
            29,
            "SP",
            3000
            );

        System.out.println("{");
        System.out.println("  \"customer\": \"" + cliente.getName() + "\",");
        System.out.println("  \"loans\": [");
        System.out.println("    {");
        
        if (cliente.age < 30 && cliente.location.equals("SP") && cliente.income <= 3000) {
            System.out.println("      \"type\": \"personal\",");
            System.out.println("      \"taxes\": " + personal);
        } else if (cliente.location.equals("SP") && (cliente.income > 3000 && cliente.income < 5000)) {
            System.out.println("      \"type\": \"consigned\",");
            System.out.println("      \"taxes\": " + consigned);
        } else if (cliente.age < 30 && cliente.income >= 5000) {
            System.out.println("      \"type\": \"guarantee\",");
            System.out.println("      \"taxes\": " + guarantee);
        }
        System.out.println("    }");
        System.out.println("  ]");
        System.out.println("}");
            
    }
    }