/** Test of results method
  * for Solution36
  * Tony
  */
import java.util.*;
public class ResultsTest {
  
  private static String results(String test, String guess) {
    
    int count = 0; // to count right
    for (int i = 0; i < test.length(); i++) {
      if (test.charAt(i) == guess.charAt(i)) {
        count ++;
      }
    }
    return Integer.toString(count);
   }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String test = "1";
    for (int i = 0; i < 6; i++) {
      String guess = sc.next();
      System.out.print(results(test, guess) + " ");
    }
    
  }
}