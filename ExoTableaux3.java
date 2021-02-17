import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] tab = new int[9];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0 ; i < tab.length ; i++) {
            System.out.println("Entrez une valeur :");
            tab[i] = scanner.nextInt();
        }
        scanner.close();
    }
}
