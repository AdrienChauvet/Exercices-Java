public class Main {
    public static void main(String[] args) {
        double[] tab = new double[6];

        for (int i = 0 ; i < tab.length ; i++) {
            tab[i] = Math.random() * ( 6 - 1 );
            System.out.println(tab[i]);
        }
    }
}
