/** vowelcounting
  * Tony
  */

import java.util.Scanner;

public class Solution20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    String jump = sc.nextLine();
    for (int i = 0; i < times; i++) {
      String Sentence = sc.nextLine();
      int count = 0;
      for (int d = 0; d < Sentence.length(); d++) {
        if ("aeiouy".indexOf(Sentence.charAt(d)) >= 0) {
          count ++;
        }
      }
    System.out.print(count + " ");
    }
  }
}
      