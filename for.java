public class Main {
  public static void main(String[] args) {
  
    for (int i = 0 ; i < 5 ; i++) {
      System.out.println("Bonjour !");
      if (i == 3) {
        System.out.println("Salut !");
      }
    }
    
    String[] cars = {"Volvo", "BMW", "Honda", "Renault"};
    
    for (String i : cars) {
      System.out.println(i);
    }
    
    for (int j = 10 ; i < 0 ; i--) {
      if (j == 4) {
        continue;
      }
      System.out.println(j);
    }
  }
}
