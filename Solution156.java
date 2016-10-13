/** Luhn Algorithm
  * Tony
  */
import java.util.*;

public class Solution156 {
  
  /* give ch the global access */
  private static int ch;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    String variation; // is to hold replaced experiment string 
    for (int i = 0; i < times; i++) {
      /* prompt input */
      String input = sc.next();
      /* condition seperation:
       * contain "?"
       * not contain "?"
       */
      if (incomplete(input)) {
        /* we have to determine the "?" value
         * we substitute it with 0~9
         */
        for (int d = 0; d < 10; d++) {
          variation = input.replace('?', (char)(d+48));
          
          //System.out.println(variation);
          if (check(variation)) {
            System.out.print(variation + " ");
            break;
          }
        }
      }
      else {
        /* we have to find the swap 
         * swap each number 
         */
        for (ch = 0; ch < input.length() - 1; ch++) {
          variation = swap(input, input.charAt(ch), input.charAt(ch+1));
          if (check(variation)) {
            System.out.print(variation + " ");
            break;
          }
        }
        
        
      }
    }
  }
  
  
  /** incomplete method
    * return true if input string contain "?"
    */
  private static boolean incomplete(String n) {
    for (int i = 0; i < n.length(); i++) {
      if (n.charAt(i) == '?') {
        return true;
      }
    }
    return false;
  }
  
  /** check method
    * use specific equation to check if input string is fit
    */
  private static boolean check(String n) {
    int specialLocation = 0; // count special location
    for (int c = 0; c < n.length(); c += 2) {
      if (Character.getNumericValue(n.charAt(c)) * 2 < 10){
        specialLocation += Character.getNumericValue(n.charAt(c)) * 2;
      }
      else {
        specialLocation += Character.getNumericValue(n.charAt(c)) * 2 - 9;
      }
    }
    
    int ordinaryLocation = 0; // count ordinary location
    for (int c = 1; c < n.length(); c += 2) {
      ordinaryLocation += Character.getNumericValue(n.charAt(c));
    }
    
    int sum = specialLocation + ordinaryLocation;
    if (sum % 10 == 0) {
      return true;
    }
    else {
      return false;
    }
  }
  
  /** swap method
    * swap two characters in a string and return new string
    */
  private static String swap(String n, char a, char b) {
    StringBuilder s = new StringBuilder(n);
    s.setCharAt(ch, b);
    s.setCharAt(ch+1, a);
    return s.toString();
  }
  
  
  
  
}