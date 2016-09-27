/** new approach to find prime numbers
  * Tony
  */
import java.util.*;

public class PrimeG {
  
  /** isPrime
    * To determine whether a number is prime by dividing the candidate number by each prime in that list
    */
  static List<Long> primes = new ArrayList<Long> ();
  
  private static void isPrime(long n) {
    boolean condition = true;
    for (int i = 0; i < primes.size(); i++) {
      if (n % primes.get(i) == 0) {
        condition = condition && false;
      }
    }
    if (condition) {
      findNextPrime(n);
    }
  }
  
  /** findNextPrime
    * expand the list of prime numbers 
    */
  private static void findNextPrime(long n) {
    primes.add(n);
  }
  
  
  
  
  
  public static void main(String[] args) {
    primes.add((long)2);
    primes.add((long)3);
    primes.add((long)5);
    primes.add((long)7);
    
    for (int i = 8; i < 3000000; i++) {
      isPrime(i);
      System.out.printf("%s", primes);
    }
    
    
  }
}