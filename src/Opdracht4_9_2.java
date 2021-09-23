import java.util.Scanner;

public class Opdracht4_9_2 {
    public static void main(String[] args) {
        System.out.println("*** Displays odd or even numbers  ***");
        System.out.println();
        int num;
        Scanner keyboard = new Scanner(System.in);
        num = keyboard.nextInt();
        for (int i = 1; i <= num; i++) {

            if (i % 2 == 0) {
                System.out.println(i+" is even");
            }else{
                System.out.println(i+" is odd");
            }
        }
    }
}
