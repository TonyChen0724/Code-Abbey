/** Test for a method that reverse String
  * Tony
  */

public class ReverseTest {
  public static String reverse (String n) {
    int len = n.length();
    int lenoriginal = len;
    String a = "";
    for (int i = 0; i < lenoriginal; i++) {
      a += n.charAt(len-1);
      len --;
    }
    return a;
  }
  
  public static void main(String[] args) {
    String original = "helloIamtony";
    System.out.print(reverse(original));
  }
}

/** the for loop should operate 12 times but it only operates 6 times??? why?*/