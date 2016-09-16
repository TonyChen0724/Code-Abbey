/** Neumann's Random Generator
  * Tony
  */
import java.util.Scanner;

public class Solution24 {
  
  public static String process(String n) {
    int num = Integer.parseInt(n);
    int squareN = num * num;
    String strSquare = Integer.toString(squareN);
    while (strSquare.length() != 8) {
      strSquare = "0" + strSquare;
    }
    return strSquare.substring(2, 6);
  }
  
  public static boolean contain (String item, String[] items) {
    int a = 0;
    for (String each : items) {
      if (item.equals(each)) {
        a ++;
      }
    }
    if (a > 0) {
      return true;
    }
    else {
      return false;
    }
  }
  //^ method process and contain works.    
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      String in = sc.next();
      String generated = in + " ";
      int repeat = 0;
      String[] generatedArray = {" "};
      int duplicate = 0;
      do {
        in = process(in);
        repeat ++;
        
        if(contain(in, generatedArray)){
          duplicate ++;
        }
        generated += in + " ";
        //test:
        //System.out.print(generated + ",");
        generatedArray = generated.split(" ");
      } while(duplicate != 2);
      System.out.print(repeat-1 + " ");
      
    }
  }
}

