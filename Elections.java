import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez score candidat A :");
        int a = scanner.nextInt();
        if (a > 50) {
            System.out.println("A remporte l'élection !");
        }

        System.out.println("Entrez score candidat B :");
        int b = scanner.nextInt();
        if (b > 50) {
            System.out.println("B remporte l'élection !");
        }

        System.out.println("Entrez score candidat C :");
        int c = scanner.nextInt();
        if (c > 50) {
            System.out.println("C remporte l'élection !");
        }

        System.out.println("Entrez score candidat D :");
        int d = scanner.nextInt();
        if (d > 50) {
            System.out.println("D remporte l'élection !");
        }

        if (a < 50 && b < 50 && c < 50 && d < 50) {
            System.out.println("Deuxième tour!");

            if (a < 12.5){
                System.out.println("A perd l'élection.");
            }
            if (a > b && a > c && a > d) {
                System.out.println("A est en ballotage favorable");
            }
            else {
                System.out.println("A est en ballotage défavorable.");
            }
        }
    }
}
