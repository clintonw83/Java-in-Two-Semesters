public class Opdracht1_2 {
    public static void main(String[] args) {
        int getal1, getal2, getal3, temp;
        getal1 = 3;
        getal2 = 5;
        getal3 = 2;
        System.out.println("De waarde van getal1 is "+ getal1 );
        System.out.println("De waarde van getal2 is "+ getal2 );
        System.out.println("De waarde van getal3 is "+ getal3 );
        System.out.println("");
        temp= getal1;
        getal1 = getal3;
        getal3 = getal2;
        getal2 = temp;
        System.out.println("De waarde van getal1 is "+ getal1 );
        System.out.println("De waarde van getal2 is "+ getal2 );
        System.out.println("De waarde van getal3 is "+ getal3 );
    }
}
