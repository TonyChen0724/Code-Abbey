/** wordsShift test
  * Tony
  */
import java.util.*;
public class WordsShift {
  public static String shift(String words, int shift) {
    List<Character> newcharacters = new ArrayList<Character>();
    for (int c = 0; c < words.length(); c++) {
      if ((int)(words.charAt(c)) != 46 && (int)(words.charAt(c)) - shift >= 65) {
        newcharacters.add((char)((int)(words.charAt(c)) - shift));
      }
      else if ((int)(words.charAt(c)) - shift < 65) {
        newcharacters.add((char)(91 - 65 + (int)(words.charAt(c)) - shift));
      }
      else {
        newcharacters.add('.');
      }
    }
    Character[] characters = new Character[newcharacters.size()];
    characters = newcharacters.toArray(characters);
    String newWords = "";
    for (Character n : characters) {
      newWords += String.valueOf(n);
    }
    return newWords;
  }
  public static void main(String[] args) {
    System.out.print(shift("BRX", 3));
  }
  
}