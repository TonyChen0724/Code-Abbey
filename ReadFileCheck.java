/** readFile Check
  * for Solution 127
  * Tony
  */

import java.util.*;
import java.io.*;

public class ReadFileCheck {
  
  public static void main(String[] args) {
    
    try
    {
      Scanner sc = new Scanner(new File("words.txt"));
      while (sc.hasNext()) {
        System.out.println(sc.nextLine());
      }
    }
    catch (FileNotFoundException e) {
      System.out.println("ha");
    }
    
    
  }
}