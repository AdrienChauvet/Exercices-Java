public class Main{
    public static void main(String[] args){
        String a = "test";
        // Longueur d'une chaîne
        System.out.println("The length of the string a is: " + a.length());
        
        String b = "hello, world!";
        // Capitalisation d'une chaîne
        System.out.println(b.toUpperCase());
        
        String c = "Ceci est un test.";
        // Trouver la position d'un caractère dans une chaîne
        System.out.println("Dans la chaîne c, le caractère 'u' se trouve à la position " + c.indexOf('u'));
    }
}
