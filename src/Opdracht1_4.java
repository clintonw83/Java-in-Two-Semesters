import java.util.Scanner;

public class Opdracht1_4 {
    public static void main(String[] args) {
        int eerste, tweede, derde;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Geef 3 getallen aan:");
        eerste = keyboard.nextInt();
        tweede = keyboard.nextInt();
        derde = keyboard.nextInt();
        System.out.println("Geeft 3 onderling verschillende gehele getallen:"+ eerste +"-"+ tweede +"-"+ derde );
        if (eerste>tweede){
            if (eerste>derde){
                System.out.println("Het eerste getal is het grootst");
            }else{
                System.out.println("Het derde getal is het grootst");
            }
        }else if (tweede> eerste){
            if (tweede > derde){
                System.out.println("Het tweede getal is het grootst");
            }else{
                System.out.println("Het derde getal is het grootst");
            }
        }
    }
}
