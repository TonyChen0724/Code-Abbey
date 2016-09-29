/** Funny Words Generator
  * Tony
  */

import java.util.*;

public class Solution72 {
  
  //data field (can be accessed in whole class):
  private static int xC; // define a xCurrent so we can access it all over the class
  private static int n;
  private static String[] consonants = {"b","c","d","f","g","h","j","k","l","m","n","p","r","s","t","v","w","x","z"};
  private static String[] vowels = {"a", "e", "i", "o", "u"};
  private static String funnyWords = "";
  
  
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    xC = sc.nextInt(); // seeds
    
    for (int i = 0; i < times; i++) {
      n = sc.nextInt(); // we get how much recurence we have to generate
      funnyWords = ""; // reset the funnyWords each new time
      for (int d = 0; d < n; d ++) {
        
        int letterNum = randomGenerator(); /* random generator will generate numbers based on current x */
        int letterIndex = 0; /* letterNum % 19 or % 5 based on condition */
        
        if ((d + 1) % 2 == 0) {
          letterIndex = letterNum % 5;
          funnyWords += vowels[letterIndex];
        }
        
        else if ((d + 1) % 2 != 0) {
          letterIndex = letterNum % 19;
          funnyWords += consonants[letterIndex];
        }
      }
      System.out.print(funnyWords + " ");
    }
  }
  
  /** randomGenerator
    * param: N(generate times), seeds
    * return: update the xC and return it */
  private static int randomGenerator() {
    int a = 445;
    int c = 700001;
    int m = 2097152;
    xC = (a * xC + c) % m; // update
    return xC; // return
  }

}
      
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  