/** print all the prime numbers less than N
  * Tony
  */

public class primeGenerator {
  public static void main(String[] args) {
    int n = 3000000;
    boolean[] isPrime = new boolean[n];
    isPrime[0] = false; // because 1 is not a prime number
    
    for (int i = 1; i < n; i++) {
      isPrime[i] = true;
    } // we set 2,3,4,5,6...to true
    
    // the real number is always (the index of boolean + 1)
    
    for (int i = 2; i <= n; i++) {
      if (isPrime[i-1]) {
        System.out.println(i);
        for (int j = 2 * i; j < n; j += i /* because j is determined by i, so the third parameter doesn't mater*/) {
          isPrime[j-1] = false;
        }
      }
    }
  }
}