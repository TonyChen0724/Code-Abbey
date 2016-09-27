/** Prime Numbers Generation
  * Tony
  */
import java.util.*;

public class PrimeNumG {
  public static void main(String[] args) {
    
    List <Long> allOddNums = new ArrayList<Long>();
    for (long i = 3; i < 3000000; i += 2) {
      allOddNums.add(i);
    }
    
    // composite number generator:
    List <Long> allComposite = new ArrayList<Long>();
    for (long a = 2; a < Math.round(Math.sqrt(3000000)); a += 2) {
      for (long b = 2; b < Math.round(Math.sqrt(3000000)); b += 2) {
        allComposite.add(a*b);
      }
    }
    
    // remove duplicated:
    Set <Long> hs = new HashSet<Long>();
    hs.addAll(allComposite);
    allComposite.clear();
    allComposite.addAll(hs);
    
    // remove all composite from allRealNums = allPrime
    allOddNums.removeAll(allComposite);
    allOddNums.add(0, (long)2);
    
    System.out.printf("%s ", allOddNums);
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    
    for (int i = 0; i < times; i++) {
      int index = sc.nextInt();
      System.out.print(allOddNums.get(index) + " ");
      
    }
  }
  
  
 
  
  
}