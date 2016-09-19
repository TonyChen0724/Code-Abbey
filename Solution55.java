/** Matching Words
  * Tony
  */
import java.util.*;

public class Solution55 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String in = sc.nextLine();
    String[] words = in.split(" ");
    LinkedList<String> wordList = new LinkedList<String>(Arrays.asList(words));
    wordList.removeLast();
    ArrayList<String> newList = new ArrayList<String> ();
    for (String w : wordList) {
      if (Collections.frequency(wordList, w) > 1) {
        newList.add(w);
      }
    }

    Set<String> nonDuplicated = new HashSet<String>();
    nonDuplicated.addAll(newList);
    newList.clear();
    newList.addAll(nonDuplicated);
    Collections.sort(newList);             // Avoid duplicated items: List --> Set(not allow duplicate) --> List
    
    for (String w : newList) {
      System.out.print(w + " ");
    }
   }
}

