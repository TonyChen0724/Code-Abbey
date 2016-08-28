/** Maximum in array
  * Tony
  */
import java.util.Scanner;
public class solution15 {
  public static void main(String[] args) {
    int[] numlist = new int[300];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 300; i++) {
      numlist[i] = sc.nextInt();
    }
    int max = numlist[0];
    for (int i = 0; i < 300; i++) {
      if (numlist[i] > max) {
        max = numlist[i];
      }
    }
    int min = numlist[0];
    for (int i = 0; i < 300; i++) {
      if (numlist[i] < min) {
        min = numlist[i];
      }
    }
    System.out.println(max + " " + min);
  }
}
    