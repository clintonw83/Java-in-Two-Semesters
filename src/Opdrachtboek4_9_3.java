public class Opdrachtboek4_9_3 {
    public static void main(String[] args) {
        for (int i = 0; i <6; i++) {
            if (i==2| i==3){
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            }else{
                for (int j = 0; j < 3; j++) {
                    System.out.print("* ");
            }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i <4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
