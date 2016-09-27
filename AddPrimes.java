import java.util.*;

public class AddPrimes {
  
  public static void main(String[] args) {
    
    //Initialize number as 2, the first possible prime number larger than one
    number = 2;
    //Main Loop; loop until 1 billion prime numbers have been discovered
    while(primeCounter < 1000000){
      //Initialize fields for Calculation Loop.
      m = Math.sqrt(number);
      divisor = 2;
      //Calculation Loop
      while(divisor <= m){
        //Initialize quotient
        quotient = number /divisor;
        //Initialize isInteger
        isInteger = checkIsInteger(quotient);
        //If the quotient is an integer, add it to the list of factors.  Increase divisor by 1.
        if(isInteger == true ){
          factors.add(quotient);
          divisor++;
          //If the quotient is not an integer, increase the divisor by 1.
        }else{
          divisor++;
        }
      }
      //Once all quotients are analyzed, if the list of factors is empty, then the number is prime.
      //Add the number to the sum of primes.  Increase primeCounter by 1.  Increase number by 1.
      if(factors.isEmpty() == true){
        sum += number;
        primeCounter ++;
        number++;
        //If the list of factors is not empty, then the number is not prime.  Clear the list of factors.
        //Increase number by 1.
      }else{
        factors.clear();
        number++;
      }
    }
    //Display the sum of the total number of primes discovered.
    System.out.println(sum);
  }
  /**
   * Determines whether or not the given double is an integer.
   * @param d - double
   * @return true if d is an integer or false if d is not an integer
   */
  public static boolean checkIsInteger(double d){
    boolean intCheck;
    String doubleText = Double.toString(d);
    if(doubleText.endsWith("0")){
      intCheck = true;
    }else{
      intCheck = false;
    }
    return intCheck;
  }
  
  //Necessary fields
  /**
   * The current number being tested for primality.
   */
  static double number;
  /**
   * The sum of all numbers determined to be prime.
   */
  static int sum;
  /**
   * The square root of the current number.
   */
  static double m;
  /**
   * The current divisor.
   */
  static int divisor;
  /**
   * The quotient of number / divisor.
   */
  static double quotient;
  /**
   * A counter that records the total number of discovered prime numbers.
   */
  static int primeCounter;
  /**
   * Boolean placeholder for the result of the checkInteger method.
   */
  static boolean isInteger;
  /**
   * List of any factors discovered for number.
   */
  static ArrayList factors = new ArrayList();
}