import java.util.Scanner;

public class Excepciones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa un entero: ");
        int number = input.nextInt();
        
        try {
            if (number % 2 != 0) {throw new Exception("Tu número no es par, escribe un numero par");}
                else {System.out.println("Tu número es par!");}
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
