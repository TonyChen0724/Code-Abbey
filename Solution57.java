/** Smoothing the Weather
  * Tony
  */
import java.util.Scanner;

public class Solution57 {
  
  public static double[] arrayCopy (double[] n) {
    double[] m = new double[n.length];
    for (int i = 0; i < n.length; i++) {
      m[i] = n[i];
    }
    return m;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int itemNums = sc.nextInt();
    double[] numArray = new double[itemNums];
    for (int i = 0; i < itemNums; i++) {
      numArray[i] = sc.nextDouble();
    }
    double[] arrayCopied = arrayCopy(numArray);
    
    for(int i = 1; i < itemNums - 1; i++) {
      numArray[i] = (arrayCopied[i-1] + arrayCopied[i] + arrayCopied[i+1]) / 3;
    }
    for (double num : numArray) {
      System.out.print(num + " ");
    }
  }
}
    