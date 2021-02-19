public class Main {
  public static void main(String[] args) {
    String initialString = "   John  Rambo    ";
    System.out.println( initialString + "!" );

    // Supprimer les espaces en début et fin de chaîne :
    String strippedString = initialString.strip();
    System.out.println( strippedString + "!");

    // Supprimer les espaces en double :
    strippedString = strippedString.replaceAll("\\s+", " "); 
    System.out.println( strippedString + "!");
  }
}
