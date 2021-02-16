import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner( System.in );
        System.out.println("Entrez l'heure :");
        int h = scanner.nextInt();
        System.out.println("Entrez les minutes :");
        int m = scanner.nextInt();
        scanner.close();

        if ( m == 59 ) {
            h += 1;
            m = 0;
            if ( h == 24 ) {
                h = 0;
            }
        }
        else {
            m += 1;            
        }        
        System.out.println("Dans une minute il sera " + h + ":" + m + ".");
    }
}
