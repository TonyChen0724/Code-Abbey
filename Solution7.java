/** Fahrenheit to Celsius
  * Tony
  */

import java.util.Scanner;

public class Solution7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    double lambda = 100.0 / (212.0 - 32.0);
    
    for (int i = 0; i < times; i++) {
      System.out.print(Math.round((sc.nextInt() - 32) * lambda) + " ");
    }
  }
}