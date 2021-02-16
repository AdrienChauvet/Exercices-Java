import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Entrez l'heure :");
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        System.out.println("Entrez les minutes :");
        int m = scanner.nextInt();
        System.out.println("Entrez les secondes :");
        int s = scanner.nextInt();
        scanner.close();

        s += 1;

        if ( s == 60){
            s = 0;
            m += 1;
        }
        if ( m == 60 ) {
            m = 0;
            h += 1;
        }
        if (h == 24) {
            h = 0;
        }

        System.out.println("Dans une seconde il sera " + h + ":" + m + ":" + s + ".");
    }
}
