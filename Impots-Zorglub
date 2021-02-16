import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entrez le sexe :");
        char sex = scanner.next().charAt(0);
        
        System.out.println("Entrez l'âge :");
        int age = scanner.nextInt();
        
        scanner.close();
        
        String tax = "Vous ne devez rien.";

        if (sex == 'm') {
            if (age > 20) {
                tax = "Monsieur, il faut payer !";
            }
        }
        if (sex == 'f') {
            if (age >= 18 && age <= 35){
                tax = "Madame, il faut payer !";
            }
        }
        System.out.println(tax);
    }
}
