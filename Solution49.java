/** Rock Paper Scissors
  * Tony
  */
import java.util.*;

public class Solution49 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    String voider = sc.nextLine();
    
    for (int i = 0; i < times; i++) {
      String in = sc.nextLine();
      String[] games = in.split(" ");
      int firstWin = 0;
      int secondWin = 0;
      
      for (String game : games) {
        switch(game.charAt(0)) {
          case 'S':
            if (game.charAt(1) == 'P') {
            firstWin ++;
          }
            else if (game.charAt(1) == 'R') {
              secondWin ++;
            }
            
            break;
          
          case 'R':
              if (game.charAt(1) == 'S') {
            firstWin ++;
          }
            else if (game.charAt(1) == 'P') {
              secondWin ++;
            }
            
            break;
          
          case 'P':
              if (game.charAt(1) == 'R') {
            firstWin ++;
          }
            else if (game.charAt(1) == 'S') {
              secondWin ++;
            }
            
            break;
        }
      }
      
      if (firstWin > secondWin) {
        System.out.print("1 ");
      }
      else {
        System.out.print("2 ");
      }
      
    }
  }
}