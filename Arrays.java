public class Main {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Nissan", "Toyota", "Tesla"};
    int[] numbers = {10, 4, 4, 5, 6, 7, 5, 4 , 89};
    
    // Afficher un élément d'un tableau
    System.out.println(cars[3]);
    
    // Assigner une nouvelle valeur à un élément du tableau
    cars[1] = "Mercedes";
    
    // Longueur d'un tableau
    System.out.println(numbers.length);
    
    // Parcourir un tableau
    for (int i = 0 ; i < numbers.length ; i ++) {
      System.out.println(numbers[i]);
    }
    
    for (String i : cars) {
      System.out.println(i);
    }
    
    // Multi-dimensional array
    int tab[][] = { {5, 4, 6}, {4, , 33, 2} };
    System.out.println(tab[1][1]);
    
   // Get the elements of a two-dimensional array 
   int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
  }
}
