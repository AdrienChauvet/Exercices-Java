import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Entrez le nombre de photocopies :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        double price = 0;

        if (n <= 10) {
            price = 0.1 * n;
        }
        if  (n > 10 && n <= 30) {
            price = 0.1 * 10 + (n - 10) * 0.09;
        }
        if (n > 30) {
            price = 0.1 * 10 + 0.09 * 20 + (n - 30) * 0.08;
        }        
        System.out.println("Prix à payer : " + price);
    }
}
