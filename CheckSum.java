/** Support class Checksum
  * Tony
  */
import java.util.Scanner;

public class CheckSum {
  
  public static long getCheckSum(int[] n) {
    long result = 0;
    int limits = 10000007;
    for (int i = 0; i < n.length; i++) {
      result = (result + n[i]) * 113;
      result %= limits;
    }
    return result;
  }
}