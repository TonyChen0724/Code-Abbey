/** rounding
  * Tony
  */

import java.util.Scanner;

public class Solution6{
  public static int positiveRounding(double num) {
    if (num - (int)num >= 0.5) {
      return (int)num + 1;
    }
    else {
      return (int)num;
    }
  }
  
  public static int negativeRounding(double num) {
    if (num - (int)num <= 0.5) {
      return (int)num - 1;
    }
    else {
      return (int)num;
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    double num1;
    double num2;
    double quotient;
    for (int i = 0; i < times; i++) {
      num1 = sc.nextDouble();
      num2 = sc.nextDouble();
      quotient = num1 / num2;
      if (quotient >= 0) {
        System.out.print(positiveRounding(quotient) + " ");
      }
      else {
        System.out.print(negativeRounding(quotient) + " ");
      }
    }
  }
}
      