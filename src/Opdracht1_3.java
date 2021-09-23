
import java.util.Scanner;

public class Opdracht1_3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Double celsius, fahrenheit;

        System.out.println("Voer 2 temparatuur in, in graden Celsius en in Fahrenheit ");
        celsius = keyboard.nextDouble();
        fahrenheit = keyboard.nextDouble();
        System.out.println("Waarde van eerste temparatuur is "+ celsius);
        System.out.println("Waarde van tweede temparatuur is "+ fahrenheit);
        celsius = ((9.0/5.0) * celsius)+ 32.0 ;
        fahrenheit= ((5.0 / 9.0) * (fahrenheit - 32.0));
        System.out.println("Waarde van eerste temparatuur is "+ celsius+" Fahrenheit");
        System.out.println("Waarde van tweede temparatuur is "+ fahrenheit+" Fahrenheit");

    }
}
