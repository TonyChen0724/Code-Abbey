/** Card Names
  * Tony
  */

import java.util.*;

public class Solution58 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    
    for (int i = 0; i < times; i++) {
      int cardsValue = sc.nextInt();
      int suitsIndex = cardsValue / 13;
      int ranksIndex = cardsValue % 13;
      
      System.out.print(ranks[ranksIndex] + "-of-" + suits[suitsIndex] + " ");
    }
  }
}
      
      
      
      
