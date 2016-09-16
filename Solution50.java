/** Palindromes
  * Tony
  */

import java.util.Scanner;

public class Solution50 {
  
  public static String process (String n) {
    String step1 = n.replace(" ", "");
    step1 = step1.toLowerCase();
    String step2 = step1;
    for (int i = 0; i < step1.length(); i++) {
      boolean a = (int)step1.charAt(i) >= 33 && (int)step1.charAt(i) <= 46;
      boolean b = (int)step1.charAt(i) >= 58 && (int)step1.charAt(i) <= 64;
      boolean c = (int)step1.charAt(i) >= 91 && (int)step1.charAt(i) <= 96;
      boolean d = (int)step1.charAt(i) >= 123 && (int)step1.charAt(i) <= 126;
      boolean condition = a || b || c || d;
      
      if(condition) {
        step2 = step2.replace(Character.toString(step1.charAt(i)), "");
      }
      else {
        step2 = step2;
      }
    }
    return step2;
  }
  
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
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    String voider = sc.nextLine();
    for (int i = 0; i < times; i++) {
      String in = sc.nextLine();
      String processed = process(in);
      
//      System.out.println(processed); 
//      System.out.println(reverse(processed)); /*test*/
      
      if (processed.equals(reverse(processed))) {
        System.out.print("Y ");
      }
      else {
        System.out.print("N ");
      }
    }
  }
}