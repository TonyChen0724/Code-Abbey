/** check debug
  * for Solution156
  * Tony
  */

public class checkDebug {
  
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
  
  public static void main(String[] args) {
    System.out.print(check("3942682966937054"));
  }
}