/** binary search prepare
  * Tony
  */

public class BinarySearchP {
  
  public static void main(String[] args) {
    
    // low & high to store & update range:
    double low = 0;
    double high = 100;
    double middle = (low + high) / 2; // the current x in x * x function
    
    /** run 10 times to get 8 digits accuracy */
    for (int i = 0; i < 9; i++) {
      
      if (middle * middle > 100) {
        high = middle;
      }
      
      else if (middle * middle == 100) {
        System.out.print(middle);
        break;
      }
      
      else {
        low = middle;
      }
      
      middle = (high + low) / 2;
    }
    System.out.println(middle);
  }
}
        