import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] tab = new int[6];

        Random random = new Random();

        int a = 0;

        for (int i = 0; i < tab.length ; i++) {
            for (int j = 0 ; j < tab.length ; j++) {
                if (tab[j] == a) {
                    a = random.nextInt(6);
                }
            }
            tab[i] = a;
            System.out.println(tab[i]);
        }
    }
}
