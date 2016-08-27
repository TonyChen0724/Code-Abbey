/** minimum of three
  * Tony Chen
  */
import java.util.Scanner;
public class solution5{
  public static int compare(int a, int b, int c) {
    int d = 0;
    if (a > b) {
      d = b;
    }
    else {
      d = a;
    }
    if (c > d) {
      return d;
    }
    else {
      return c;
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    
    for (int i = 0; i < times; i++) {
      int numA = sc.nextInt();
      int numB = sc.nextInt();
      int numC = sc.nextInt();
      System.out.print(compare(numA, numB, numC) + " ");
    }
  }
}