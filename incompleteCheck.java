/** check incomplete method
  * for Solution 156
  * Tony
  */

public class incompleteCheck {
  
  private static boolean incomplete(String n) {
    for (int i = 0; i < n.length(); i++) {
      if (n.charAt(i) == '?') {
        return true;
      }
    }
    return false;
  }
  
  public static void main(String[] args) {
    System.out.print(incomplete("?942682966937054"));
  }
}