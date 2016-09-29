/** Cards Shuffling
  * Tony
  */

import java.util.*;

public class Solution45 {
  
  /** swap method
    * param: array, index-a, index-b
    * return: void
    * operation: swap item-a with item-b in array n
    */
  
  private static void swap(String[] n, int a, int b) {
    String container = n[a];
    n[a] = n[b];
    n[b] = container;
  }
  
  /** trim method
    * param: number
    * return: new number range within 51
    */
  private static int trim(int num) {
    return num % 52;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    /* define an string array contain deck of cards */
    String[] cardsDeck = {
      "CA", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "CT", "CJ", "CQ", "CK", "DA", "D2",
      "D3", "D4", "D5", "D6", "D7", "D8", "D9", "DT", "DJ", "DQ", "DK", "HA", "H2", "H3", "H4", "H5", "H6",
      "H7", "H8", "H9", "HT", "HJ", "HQ", "HK", "SA", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9","ST",
      "SJ", "SQ", "SK"};
    for (int i = 0; i < 52; i++) {
      int input = sc.nextInt();
      int swapIndex = trim(input);
      //swap:
      swap(cardsDeck, i, swapIndex);
    }
    
    /* print out the new cardsDeck after 52 times of swaping */
    for (String card : cardsDeck) {
      System.out.print(card + " ");
    }
  }
}
      