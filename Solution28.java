/** Body Mass Index
  * Tony
  */

import java.util.Scanner;

public class Solution28 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      double weight = sc.nextDouble();
      double height = sc.nextDouble();
      double BMI = weight / Math.pow(height, 2);
      if (BMI < 18.5) {
        System.out.print("under ");
      }
      else if (BMI < 25 && BMI >= 18.5) {
        System.out.print("normal ");
      }
      else if (BMI < 30 && BMI >= 25) {
        System.out.print("over ");
      }
      else if (BMI >= 30) {
        System.out.print("obese ");
      }
    }
  }
}