/** Caesar Shift Cipher
  * Tony
  */
import java.util.*;
public class Solution47 {
  
  public static String shift(String words, int shift) {
    List<Character> newcharacters = new ArrayList<Character>();
    for (int c = 0; c < words.length(); c++) {
      if ((int)(words.charAt(c)) != 46 && (int)(words.charAt(c)) - shift >= 65) {
        newcharacters.add((char)((int)(words.charAt(c)) - shift));
      }
      else if ((int)(words.charAt(c)) - shift < 65 && (int)(words.charAt(c)) != 46) {
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
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    int shifts = sc.nextInt();
    String voider = sc.nextLine();
    for (int i = 0; i < times; i++) {
      String in = sc.nextLine();
      String[] strings = in.split(" ");
      for (int s = 0; s < strings.length; s++) {
        String newWords = shift(strings[s], shifts);
        System.out.print(newWords + " ");
      }
    }
  }
}