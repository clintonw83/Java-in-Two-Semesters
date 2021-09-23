import java.util.Scanner;

public class Opdrachtboek4_9_6 {
    public static void main(String[] args) {
        int tafel;
        char answer;
        System.out.println("Vul een cijfer in ");
        Scanner keyboard = new Scanner(System.in);


        do {
            tafel = keyboard.nextInt();
            answer= keyboard.next().charAt(0);
            while (tafel<=2){
                tafel = keyboard.nextInt();
            }
            for (int i = 1; i <13; i++) {
                System.out.println(i+"x"+tafel+" = "+i*tafel);
            }
        }while (answer == 'y'|| answer == 'Y');


    }
}
