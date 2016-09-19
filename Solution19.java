/** Matching Brackets
  * Tony
  */
import java.util.*;

public class Solution19 {
  
  public static String process(String n) {
    /** build a condition combination: */
    String newString = "";
    for (int i = 0; i < n.length(); i++) {
      if (n.charAt(i) == '(' || n.charAt(i) == ')' || n.charAt(i) == '[' || n.charAt(i) == ']' 
            || n.charAt(i) == '<' || n.charAt(i) == '>' || n.charAt(i) == '{' || n.charAt(i) == '}') {
        newString += n.charAt(i);
      }
    }
    return newString;
  }
  
  
  public static String numForm(String s) {
    String newone = "";
    for (int i = 0; i < s.length(); i++) {
      switch(s.charAt(i)) {
        case '(': newone += "1 ";break;
        case ')': newone += "9 ";break;
        case '[': newone += "2 ";break;
        case ']': newone += "8 ";break;
        case '<': newone += "3 ";break;
        case '>': newone += "7 ";break;
        case '{': newone += "4 ";break;
        case '}': newone += "6 ";break;
      }
    }
    return newone;
  }
  
  public static Integer[] intArray(String m) {
    String[] stringArray = m.split(" ");
    Integer[] intArr = new Integer[stringArray.length];
    for (int i = 0; i < stringArray.length; i++) {
      intArr[i] = Integer.parseInt(stringArray[i]);
    }
    return intArr;
  }
  
  public static void printArray (Integer[] array) {
    for (int n : array) {
      System.out.print(n + " ");
    }
  }
  
  public static int[] oddPosition (int[] array) {
    int [] oddNumbers = new int[array.length / 2];
    int j = 0;
    for (int i = 0; i < array.length; i++) {
      if ((i + 1) % 2 != 0) {
        oddNumbers[j] = array[i];
        j ++;
      }
    }
    return oddNumbers;
  }
  
  public static int[] evenPosition (int[] array) {
    int [] evenNumbers = new int[array.length / 2];
    int j = 0;
    for (int i = 0; i < array.length; i++) {
      if ((i + 1) % 2 == 0) {
        evenNumbers[j] = array[i];
        j ++;
      }
    }
    return evenNumbers;
  }
  
  public static boolean addsUpten (int [] array) {
    boolean conditionSum = false;
    boolean conditionSingle = false;
    for (int i = 0; i < array.length; i++) {
      int d = 0;
      while (i + d < array.length) {
        if (array[i] + array[i+d] == 10) {
          conditionSingle = true;
        }
        conditionSum = (conditionSum || conditionSingle);
        d ++;
      }
    }
    return conditionSum;
  }
  
  
  
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    String voider = sc.nextLine();
    
    for (int i = 0; i < times; i ++) {
      String formula = sc.nextLine();
      String processed = process(formula);
      
      String numFormed = numForm(processed);
      // System.out.println(numFormed);
      Integer[] numArray = intArray(numFormed);
      
//      List<Integer> list = Arrays.asList(numArray);
//      Stack<Integer> stack = new Stack<Integer>();
//      stack.addAll(list);
//      // System.out.printf("%s ", stack);
//      printArray(numArray);
//      System.out.println();
      
      Stack<Integer> stack = new Stack<Integer>();
      boolean statement = false;
      for (int t = 0; t < numArray.length; t++) {
        if (numArray[t] < 5) {
          stack.push(numArray[t]);
        }
        else {
          if (!stack.empty()) {
            if (stack.pop() + numArray[t] != 10) {
              statement = statement || true;
            }
            else {
              statement = statement || false;
            }
          }
          else {
            statement = statement || true;
          }
        }
      }
      if (!stack.empty()) {
        statement = statement || true;
      }
      
      if (statement) {
        System.out.print("0 ");
      }
      else {
        System.out.print("1 ");
      }
      
      
    }
  }
}
