/** Code Guesser
  * using "reverse method" to make code guess
  * Tony
  */
import java.util.*;

public class Solution36final4digits {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /* create an ArrayList which contain the input */
    List<String> input = new ArrayList<String>();
    int times = sc.nextInt();
    String voider = sc.nextLine(); // ignore
    for (int i = 0; i < times; i++) {
      input.add(sc.nextLine());
    }
    
    /* cut the guess number(0,4) from the result(charAt(5)) 
     * and store it in the guesses list */
    List<String> guesses = new ArrayList<String>();
    for (int i = 0; i < times; i++) {
      guesses.add(input.get(i).substring(0,4));
    }
    
    
    /* we generate 1000 different combination(10 choose 3 allow duplicate) to test the black box 
     * first We put all number into a list testCase
     */
    List<String> testCase = new ArrayList<String>();
    for (int th = 0; th < 10; th++) {
      for (int h = 0; h < 10; h++) {
        for (int t = 0; t < 10; t++) {
          for (int d = 0; d < 10; d++) {
            if (th*1000 + h*100 + t*10 + d >= 1000) {
              testCase.add(Integer.toString(th*1000 + h*100 + t*10 + d));
            }
            else if (th*1000 + h*100 + t*10 + d >= 100 && th*1000 + h*100 + t*10 + d <= 999) {
              testCase.add("0" + Integer.toString(th*1000 + h*100 + t*10 + d));
            }
            else if (th*1000 + h*100 + t*10 + d >= 10 && th*1000 + h*100 + t*10 + d <= 99) {
              testCase.add("00" + Integer.toString(th*1000 + h*100 + t*10 + d));
            }
            else {
              testCase.add("000" + Integer.toString(th*1000 + h*100 + t*10 + d));
            }
          }
        }
      }
    }
    
    /* we put every item in testCase and every item in guesses inside method */
    
    for (int i = 0; i < testCase.size(); i++) {
      boolean right = true;
      for (int g = 0; g < times; g++) {
        
        
        if (results(testCase.get(i), guesses.get(g)).equals(input.get(g).substring(5,6))) {
          right = right && true;
          
        } 
        else {
          right = right && false;
          
        }
      }
      // System.out.print(right + " ");
      if (right == true) {
        System.out.print(testCase.get(i));
        break;
      }
    }
  }
  
  /** results method
    * return the result of the guess(using String form)
    */
  private static String results(String test, String guess) {
    
    int count = 0; // to count right
    for (int i = 0; i < test.length(); i++) {
      if (test.charAt(i) == guess.charAt(i)) {
        count ++;
      }
    }
    return Integer.toString(count);
  }
}
