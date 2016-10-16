/** Dungeons and Dragons Dice
  * Tony
  */
import java.util.*;

public class Solution51 {
  
  public static void main(String[] args) {
    /* initial the 6 kinds of dice possiblities */
    List<Integer> twoSides = new ArrayList<Integer>();
    List<Integer> fourSides = new ArrayList<Integer>();
    List<Integer> sixSides = new ArrayList<Integer>();
    List<Integer> eightSides = new ArrayList<Integer>();
    List<Integer> tenSides = new ArrayList<Integer>();
    List<Integer> twelfSides = new ArrayList<Integer>();
    
    /* two sides operation */
    for (int times = 1; times <= 5; times++) {
      for (int number = times * 1; number <= times * 2; number++) {
        twoSides.add(number);
      }
    }
    
    /* four sides operation */
    for (int times = 1; times <= 5; times++) {
      for (int number = times * 1; number <= times * 4; number++) {
        fourSides.add(number);
      }
    }
    
    /* six sides operation */
    for (int times = 1; times <= 5; times++) {
      for (int number = times * 1; number <= times * 6; number++) {
        sixSides.add(number);
      }
    }
    
    /* eight sides operation */
    for (int times = 1; times <= 5; times++) {
      for (int number = times * 1; number <= times * 8; number++) {
        eightSides.add(number);
      }
    }
    
    /* ten sides operation */
    for (int times = 1; times <= 5; times++) {
      for (int number = times * 1; number <= times * 10; number++) {
        tenSides.add(number);
      }
    }
    
    /* twelf sides operation */
    for (int times = 1; times <= 5; times++) {
      for (int number = times * 1; number <= times * 12; number++) {
        twelfSides.add(number);
      }
    }
    
    /* then we reduce the duplicated items in each list to speed up process */
    Set<Integer> temp = new HashSet<Integer>();
    temp.addAll(twoSides);
    twoSides.clear();
    twoSides.addAll(temp);
    temp.clear(); // so we can reuse it
    
    temp.addAll(fourSides);
    fourSides.clear();
    fourSides.addAll(temp);
    temp.clear(); 
    
    temp.addAll(sixSides);
    sixSides.clear();
    sixSides.addAll(temp);
    temp.clear(); 
    
    temp.addAll(eightSides);
    eightSides.clear();
    eightSides.addAll(temp);
    temp.clear(); 
    
    temp.addAll(tenSides);
    tenSides.clear();
    tenSides.addAll(temp);
    temp.clear(); 
    
    temp.addAll(twelfSides);
    twelfSides.clear();
    twelfSides.addAll(temp);
    temp.clear(); 
    
    //System.out.print(twoSides); // how can twoSides contain items bigger than 10 ?
    
    /* input one hundred numbers */
    Scanner sc = new Scanner(System.in);
    List<Integer> line = new ArrayList<Integer> ();
    for (int l = 0; l < 3; l++) {
      line.clear(); // reset line
      /* init boolean of six kinds of dices */
      boolean isTwo = true;
      boolean isFour = true;
      boolean isSix = true;
      boolean isEight = true;
      boolean isTen = true;
      boolean isTwelf = true;
      
      for (int time = 0; time < 101; time++) {
        line.add(sc.nextInt());
      }
      line.remove(100);
      for (int time = 0; time < 100; time++) {
        if (!twoSides.contains(line.get(time))) {
          isTwo = isTwo && false;
        }
        if (!fourSides.contains(line.get(time))) {
          isFour = isFour && false;
        }
        if (!sixSides.contains(line.get(time))) {
          isSix = isSix && false;
        }
        if (!eightSides.contains(line.get(time))) {
          isEight = isEight && false;
        }
        if (!tenSides.contains(line.get(time))) {
          isTen = isTen && false;
        }
        if (!twelfSides.contains(line.get(time))) {
          isTwelf = isTwelf && false;
        }
        
      }
      
      
      A: for (int i = 0; i < 7; i++){
        
        
        
        if (isTwo) {
          if ((int)Math.ceil(Collections.max(line) / 2.0) <= Collections.min(line)){
            System.out.print((int)Math.ceil(Collections.max(line) / 2.0) + "d2" + " ");
            break A;
          }
        }
        if (isFour) {
          if ((int)Math.ceil(Collections.max(line) / 4.0) <= Collections.min(line)){
            System.out.print((int)Math.ceil(Collections.max(line) / 4.0) + "d4" + " ");
            break A;
          }
        }
        if (isSix) {
          if ((int)Math.ceil(Collections.max(line) / 6.0) <= Collections.min(line)) {
            System.out.print((int)Math.ceil(Collections.max(line) / 6.0) + "d6" + " ");
            break A;
          }
        }
        if (isEight) {
          if ((int)Math.ceil(Collections.max(line) / 8.0) <= Collections.min(line)) {
            System.out.print((int)Math.ceil(Collections.max(line) / 8.0) + "d8" + " ");
            
            break A;
          }
        }
        if (isTen) {
          if ((int)Math.ceil(Collections.max(line) / 10.0) <= Collections.min(line)) {
            System.out.print((int)Math.ceil(Collections.max(line) / 10.0) + "d10" + " ");
            break A;
          }
        }
        if (isTwelf) {
          if ((int)Math.ceil(Collections.max(line) / 12.0) <= Collections.min(line)) {
            System.out.print((int)Math.ceil(Collections.max(line) / 12.0) + "d12" + " ");
            break A;
          }
        }
      }
      
      
    }
  }
}