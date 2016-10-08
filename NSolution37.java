/** Mortgage Calculator
  * Tony
  */

import java.util.*;

public class NSolution37 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    double p = sc.nextDouble();
    double r = sc.nextDouble()/100/12;
    double n = sc.nextDouble();
    
    System.out.print((int)Math.ceil(p*(r*Math.pow((1+r), n)/(Math.pow((1+r), n)-1))));
  }
}
    