/** minimum of two
  * Tony Chen
  */
import java.util.Scanner;
public class solution4{
  public static int compare(int a, int b) {
    if (a > b) {
      return b;
    }
    else {
      return a;
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    
    for (int i = 0; i < times; i++) {
      int numA = sc.nextInt();
      int numB = sc.nextInt();
      System.out.print(compare(numA, numB) + " ");
    }
  }
}