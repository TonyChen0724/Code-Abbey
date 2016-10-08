/** Anagrams
  * Tony
  */
import java.util.*;
import java.io.*;

public class Solution127 {
  
  public static void main(String[] args) {
    try{
      Scanner sc = new Scanner(System.in);
      
      int times = sc.nextInt();
      
      for (int i = 0; i < times; i++) {
        Scanner rf = new Scanner(new File("words.txt")); // rf read a file names "words.txt"(route maybe wrong)
        String in = sc.next();
        int count = 0; // count the same words(include itself)
        while (rf.hasNext()) {
          if (anagram(in, rf.next())) {
            count ++;
          }
        }
        System.out.print(count - 1 + " ");
      }
    }catch(FileNotFoundException e) {
      System.out.println("Where is the file?");
    }
  }
  
  
  /** anagram method
    * param word1 word2
    * determine if they are anagrams, if so return true
    */
  
  private static boolean anagram(String w1, String w2) {
    
    List<Character> charOne = new ArrayList<Character>(); // a list to store charcater in w1
    List<Character> charTwo = new ArrayList<Character>(); // a list to store charcater in w2
    if (w1.length() != w2.length()) {
      return false;
    }
    
    else {
      /* fullfill the charOne list */
      for (int c = 0; c < w1.length(); c++) {
        charOne.add(w1.charAt(c));
      }
      
      /* fullfill the charTwo list */
      for (int c = 0; c < w2.length(); c++) {
        charTwo.add(w2.charAt(c));
      }
      
      /* check if every item in charOne is exist in charTwo:
       * we first find the index of the item(charOne) in charTwo
       * if number is -1 (which means don't exist then we return false immediately
       * if number is not -1 then we remove it in charTwo and carry on
       * if we don't hit -1 in the process then we return true */
      for (int c = 0; c < w2.length(); c++) {
        if (charTwo.indexOf(charOne.get(c)) == -1) {
          return false;
        }
        else {
          charTwo.remove(charTwo.indexOf(charOne.get(c)));
        }
      }
      return true;
    }
  }
}

