/* Code Guesser For 3 digits
 * Tony
 */
// current : transfer it into 4 digits program
import java.util.*;

public class Solution36Four {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    /* initialization of each arrayList(each digits possiblities) */
    Integer[] first = {0,1,2,3,4,5,6,7,8,9};
    List<Integer> firstDigits = new ArrayList<Integer>(Arrays.asList(first));
    Integer[] second = {0,1,2,3,4,5,6,7,8,9};
    List<Integer> secondDigits = new ArrayList<Integer>(Arrays.asList(second));
    Integer[] third = {0,1,2,3,4,5,6,7,8,9};
    List<Integer> thirdDigits = new ArrayList<Integer>(Arrays.asList(third));
    Integer[] forth = {0,1,2,3,4,5,6,7,8,9};
    List<Integer> forthDigits = new ArrayList<Integer>(Arrays.asList(forth));
    
    /* gather the data into an array(contain guess number and result)*/
    int times = sc.nextInt();
    String voider = sc.nextLine(); // ignore it
    String[] tryExamples = new String[times]; // initiate
    
    for (int i = 0; i < times; i++) {
      tryExamples[i] = sc.nextLine();
    }
    
    /* distinct array into 4 parts, 0 digit right(zeroR), 1 digit right(oneR), 2 digits right(twoR),3 digits right
     * based on charAt(5) */
    List<String> zeroR = new ArrayList<String> ();
    List<String> oneR = new ArrayList<String> ();
    List<String> twoR = new ArrayList<String> ();
    List<String> threeR = new ArrayList<String> ();
    
    for (int i = 0; i < times ; i++) {
      if (tryExamples[i].charAt(5) == '0') {
        zeroR.add(tryExamples[i]);
      }
      else if (tryExamples[i].charAt(5) == '1') {
        oneR.add(tryExamples[i]);
      }
      else if (tryExamples[i].charAt(5) == '2') {
        twoR.add(tryExamples[i]);
      }
      else if (tryExamples[i].charAt(5) == '3') {
        threeR.add(tryExamples[i]);
      }
    }
    
    /* three new lists(after remove results) */
    List<String> zero = new ArrayList<String> ();
    List<String> one = new ArrayList<String> ();
    List<String> two = new ArrayList<String> ();
    List<String> three = new ArrayList<String> ();
    
    for (int i = 0; i < zeroR.size(); i++) {
      zero.add(zeroR.get(i).substring(0, 4));
    }
    
    for (int i = 0; i < oneR.size(); i++) {
      one.add(oneR.get(i).substring(0, 4));
    }
    
    for (int i = 0; i < twoR.size(); i++) {
      two.add(twoR.get(i).substring(0, 4));
    }
    
    for (int i = 0; i < threeR.size(); i++) {
      three.add(threeR.get(i).substring(0, 4));
    }
    
    /* firstround! use zero as a rule to kill a bunch of people */
    for (int i = 0; i < zero.size(); i++) {
      if (firstDigits.indexOf(Character.getNumericValue(zero.get(i).charAt(0))) != -1) {
        firstDigits.remove(firstDigits.indexOf(Character.getNumericValue(zero.get(i).charAt(0))));
      }
      if (secondDigits.indexOf(Character.getNumericValue(zero.get(i).charAt(1))) != -1) {
        secondDigits.remove(secondDigits.indexOf(Character.getNumericValue(zero.get(i).charAt(1))));
      }
      if (thirdDigits.indexOf(Character.getNumericValue(zero.get(i).charAt(2))) != -1) {
        thirdDigits.remove(thirdDigits.indexOf(Character.getNumericValue(zero.get(i).charAt(2))));
      }
      if (forthDigits.indexOf(Character.getNumericValue(zero.get(i).charAt(3))) != -1) {
        forthDigits.remove(forthDigits.indexOf(Character.getNumericValue(zero.get(i).charAt(3))));
      }
    }
    
    /* secondround! (get exact digit check)*/
    if (three.size() > 1) {
      List<Integer> index = new ArrayList<Integer>();
      List<Integer> number = new ArrayList<Integer>();
      for (int i = 0; i < three.size()-1; i++) {
        index.add(similarIndex(three.get(i), three.get(i+1))); // get the index of similar digit
        number.add(similarNum(three.get(i),three.get(i+1))); // get the similar digit
      } 
      
      for (int i = 0; i < index.size(); i++) {
        /* if index is one, means we get first number already
         * then we just easily change firstDigits into a list contain only that number ...*/
        /* we use count to monitor behaviour */
        int countFirst = 0; 
        int countSecond = 0;
        int countThird = 0;
        int countForth = 0;
        
        if (index.get(i) == 0) {
          if (countFirst == 0) {
            firstDigits.clear();
            countFirst ++;
          }
          firstDigits.add(number.get(i));
          
          /* we can already rule out second digits as well: */
          if (countSecond == 0) {
            secondDigits.clear();
            countSecond ++;
          }
          secondDigits.add(Character.getNumericValue(two.get(i).charAt(1)));
          secondDigits.add(Character.getNumericValue(two.get(i+1).charAt(1)));
          
          if (countThird == 0) {
            thirdDigits.clear();
            countThird ++;
          }
          thirdDigits.add(Character.getNumericValue(two.get(i).charAt(2)));
          thirdDigits.add(Character.getNumericValue(two.get(i+1).charAt(2)));
          
          if (countForth == 0) {
            forthDigits.clear();
            countForth ++;
          }
          forthDigits.add(Character.getNumericValue(two.get(i).charAt(3)));
          forthDigits.add(Character.getNumericValue(two.get(i+1).charAt(3)));
          
        }
        
        else if (index.get(i) == 1) {
          if (countSecond == 0) {
            secondDigits.clear();
            countSecond ++;
          }
          secondDigits.add(number.get(i));
          if (countFirst == 0) {
            firstDigits.clear();
            countFirst ++;
          }
          firstDigits.add(Character.getNumericValue(two.get(i).charAt(0)));
          firstDigits.add(Character.getNumericValue(two.get(i+1).charAt(0)));
          if (countThird == 0) {
            thirdDigits.clear();
            countThird ++;
          }
          thirdDigits.add(Character.getNumericValue(two.get(i).charAt(2)));
          thirdDigits.add(Character.getNumericValue(two.get(i+1).charAt(2)));
          
          if (countForth == 0) {
            forthDigits.clear();
            countForth ++;
          }
          forthDigits.add(Character.getNumericValue(two.get(i).charAt(3)));
          forthDigits.add(Character.getNumericValue(two.get(i+1).charAt(3)));
        }
        
        else if (index.get(i) == 2) {
          if (countThird == 0) {
            thirdDigits.clear();
            countThird ++;
          }
          thirdDigits.add(number.get(i));
          if (countFirst == 0) {
            firstDigits.clear();
            countFirst ++;
          }
          firstDigits.add(Character.getNumericValue(two.get(i).charAt(0)));
          firstDigits.add(Character.getNumericValue(two.get(i+1).charAt(0)));
          if (countSecond == 0) {
            secondDigits.clear();
            countSecond ++;
          }
          secondDigits.add(Character.getNumericValue(two.get(i).charAt(1)));
          secondDigits.add(Character.getNumericValue(two.get(i+1).charAt(1)));
          if (countForth == 0) {
            forthDigits.clear();
            countForth ++;
          }
          forthDigits.add(Character.getNumericValue(two.get(i).charAt(3)));
          forthDigits.add(Character.getNumericValue(two.get(i+1).charAt(3)));
        }
        
        else if (index.get(i) == 3) {
          if (countForth == 0) {
            forthDigits.clear();
            countForth ++;
          }
          forthDigits.add(number.get(i));
          if (countFirst == 0) {
            firstDigits.clear();
            countFirst ++;
          }
          firstDigits.add(Character.getNumericValue(two.get(i).charAt(0)));
          firstDigits.add(Character.getNumericValue(two.get(i+1).charAt(0)));
          if (countSecond == 0) {
            secondDigits.clear();
            countSecond ++;
          }
          secondDigits.add(Character.getNumericValue(two.get(i).charAt(1)));
          secondDigits.add(Character.getNumericValue(two.get(i+1).charAt(1)));
          if (countThird == 0) {
            thirdDigits.clear();
            countThird ++;
          }
          thirdDigits.add(Character.getNumericValue(two.get(i).charAt(2)));
          thirdDigits.add(Character.getNumericValue(two.get(i+1).charAt(2)));
        }
      }
      
    }
    
    
    /* third round!  
     * if a digit in one is in the possible array then we remove other digits
     */
    for (int i = 0; i < one.size(); i++) {
      for (int d = 0; d < 4; d++) {
        if (d == 0) { 
          if (firstDigits.contains(Character.getNumericValue(one.get(i).charAt(d)))) {
            if (secondDigits.indexOf(Character.getNumericValue(one.get(i).charAt(1))) != -1) {
              secondDigits.remove(secondDigits.indexOf(Character.getNumericValue(one.get(i).charAt(1))));
            }
            if (thirdDigits.indexOf(Character.getNumericValue(one.get(i).charAt(2))) != -1){
              thirdDigits.remove(thirdDigits.indexOf(Character.getNumericValue(one.get(i).charAt(2))));
            }
            if (forthDigits.indexOf(Character.getNumericValue(one.get(i).charAt(3))) != -1){
              forthDigits.remove(forthDigits.indexOf(Character.getNumericValue(one.get(i).charAt(3))));
            }
          }
          
          if (d == 1) { 
            if (secondDigits.contains(Character.getNumericValue(one.get(i).charAt(d)))) {
//            firstDigits.remove(Character.getNumericValue(one.get(i).charAt(0)));
//            thirdDigits.remove(Character.getNumericValue(one.get(i).charAt(2)));
              if (firstDigits.indexOf(Character.getNumericValue(one.get(i).charAt(0))) != -1) {
                firstDigits.remove(firstDigits.indexOf(Character.getNumericValue(one.get(i).charAt(0))));
              }
              if (thirdDigits.indexOf(Character.getNumericValue(one.get(i).charAt(2))) != -1){
                thirdDigits.remove(thirdDigits.indexOf(Character.getNumericValue(one.get(i).charAt(2))));
              }
              if (forthDigits.indexOf(Character.getNumericValue(one.get(i).charAt(3))) != -1){
                forthDigits.remove(forthDigits.indexOf(Character.getNumericValue(one.get(i).charAt(3))));
              }
              
            }
          }
          
          if (d == 2) { 
            if (thirdDigits.contains(Character.getNumericValue(one.get(i).charAt(d)))) {
//            firstDigits.remove(Character.getNumericValue(one.get(i).charAt(0)));
//            secondDigits.remove(Character.getNumericValue(one.get(i).charAt(1)));
              if (firstDigits.indexOf(Character.getNumericValue(one.get(i).charAt(0))) != -1) {
                firstDigits.remove(secondDigits.indexOf(Character.getNumericValue(one.get(i).charAt(0))));
              }
              if (secondDigits.indexOf(Character.getNumericValue(one.get(i).charAt(1))) != -1){
                secondDigits.remove(secondDigits.indexOf(Character.getNumericValue(one.get(i).charAt(1))));
              }
              if (forthDigits.indexOf(Character.getNumericValue(one.get(i).charAt(3))) != -1){
                forthDigits.remove(forthDigits.indexOf(Character.getNumericValue(one.get(i).charAt(3))));
              }
            }
          }
          
          if (d == 3) { 
            if (forthDigits.contains(Character.getNumericValue(one.get(i).charAt(d)))) {
//            firstDigits.remove(Character.getNumericValue(one.get(i).charAt(0)));
//            secondDigits.remove(Character.getNumericValue(one.get(i).charAt(1)));
              if (firstDigits.indexOf(Character.getNumericValue(one.get(i).charAt(0))) != -1) {
                firstDigits.remove(secondDigits.indexOf(Character.getNumericValue(one.get(i).charAt(0))));
              }
              if (secondDigits.indexOf(Character.getNumericValue(one.get(i).charAt(1))) != -1){
                secondDigits.remove(secondDigits.indexOf(Character.getNumericValue(one.get(i).charAt(1))));
              }
              if (thirdDigits.indexOf(Character.getNumericValue(one.get(i).charAt(2))) != -1){
                thirdDigits.remove(thirdDigits.indexOf(Character.getNumericValue(one.get(i).charAt(2))));
              }
            }
          }
        }
      }
      
    }
    for (int i = 0; i < two.size(); i++) {
      for (int d = 0; d < 4; d++) {
        if (d == 0) { 
          if (firstDigits.contains(Character.getNumericValue(two.get(i).charAt(d)))) {
            if (secondDigits.indexOf(Character.getNumericValue(two.get(i).charAt(1))) != -1) {
              secondDigits.remove(secondDigits.indexOf(Character.getNumericValue(two.get(i).charAt(1))));
            }
            if (thirdDigits.indexOf(Character.getNumericValue(two.get(i).charAt(2))) != -1){
              thirdDigits.remove(thirdDigits.indexOf(Character.getNumericValue(two.get(i).charAt(2))));
            }
            if (forthDigits.indexOf(Character.getNumericValue(two.get(i).charAt(3))) != -1){
              forthDigits.remove(forthDigits.indexOf(Character.getNumericValue(two.get(i).charAt(3))));
            }
          }
          
          if (d == 1) { 
            if (secondDigits.contains(Character.getNumericValue(two.get(i).charAt(d)))) {
//            firstDigits.remove(Character.getNumericValue(two.get(i).charAt(0)));
//            thirdDigits.remove(Character.getNumericValue(two.get(i).charAt(2)));
              if (firstDigits.indexOf(Character.getNumericValue(two.get(i).charAt(0))) != -1) {
                firstDigits.remove(firstDigits.indexOf(Character.getNumericValue(two.get(i).charAt(0))));
              }
              if (thirdDigits.indexOf(Character.getNumericValue(two.get(i).charAt(2))) != -1){
                thirdDigits.remove(thirdDigits.indexOf(Character.getNumericValue(two.get(i).charAt(2))));
              }
              if (forthDigits.indexOf(Character.getNumericValue(two.get(i).charAt(3))) != -1){
                forthDigits.remove(forthDigits.indexOf(Character.getNumericValue(two.get(i).charAt(3))));
              }
              
            }
          }
          
          if (d == 2) { 
            if (thirdDigits.contains(Character.getNumericValue(two.get(i).charAt(d)))) {
//            firstDigits.remove(Character.getNumericValue(two.get(i).charAt(0)));
//            secondDigits.remove(Character.getNumericValue(two.get(i).charAt(1)));
              if (firstDigits.indexOf(Character.getNumericValue(two.get(i).charAt(0))) != -1) {
                firstDigits.remove(secondDigits.indexOf(Character.getNumericValue(two.get(i).charAt(0))));
              }
              if (secondDigits.indexOf(Character.getNumericValue(two.get(i).charAt(1))) != -1){
                secondDigits.remove(secondDigits.indexOf(Character.getNumericValue(two.get(i).charAt(1))));
              }
              if (forthDigits.indexOf(Character.getNumericValue(two.get(i).charAt(3))) != -1){
                forthDigits.remove(forthDigits.indexOf(Character.getNumericValue(two.get(i).charAt(3))));
              }
            }
          }
          
          if (d == 3) { 
            if (forthDigits.contains(Character.getNumericValue(two.get(i).charAt(d)))) {
//            firstDigits.remove(Character.getNumericValue(two.get(i).charAt(0)));
//            secondDigits.remove(Character.getNumericValue(two.get(i).charAt(1)));
              if (firstDigits.indexOf(Character.getNumericValue(two.get(i).charAt(0))) != -1) {
                firstDigits.remove(secondDigits.indexOf(Character.getNumericValue(two.get(i).charAt(0))));
              }
              if (secondDigits.indexOf(Character.getNumericValue(two.get(i).charAt(1))) != -1){
                secondDigits.remove(secondDigits.indexOf(Character.getNumericValue(two.get(i).charAt(1))));
              }
              if (thirdDigits.indexOf(Character.getNumericValue(two.get(i).charAt(2))) != -1){
                thirdDigits.remove(thirdDigits.indexOf(Character.getNumericValue(two.get(i).charAt(2))));
              }
            }
          }
        }
      }
      
    }
    // current : we should check the three array rather than one array 
    /* we check the two array, if there is one digit in items in two array not fit, if so we can be sure
     * another digit is the answer */
    
    for (int i = 0; i < three.size(); i++) {
      
      for (int d = 0; d < 4; d++) {
        if (d == 0) {
          if (!(firstDigits.contains(Character.getNumericValue(two.get(i).charAt(d))))) {
            secondDigits.clear();
            secondDigits.add(Character.getNumericValue(two.get(i).charAt(1)));
            thirdDigits.clear();
            thirdDigits.add(Character.getNumericValue(two.get(i).charAt(2)));
            forthDigits.clear();
            forthDigits.add(Character.getNumericValue(two.get(i).charAt(3)));
          }
        }
        if (d == 1) {
          if (!(secondDigits.contains(Character.getNumericValue(two.get(i).charAt(d))))) {
            firstDigits.clear();
            firstDigits.add(Character.getNumericValue(two.get(i).charAt(0)));
            thirdDigits.clear();
            thirdDigits.add(Character.getNumericValue(two.get(i).charAt(2)));
            forthDigits.clear();
            forthDigits.add(Character.getNumericValue(two.get(i).charAt(3)));
          }
        }
        
        if (d == 2) {
          if (!(thirdDigits.contains(Character.getNumericValue(two.get(i).charAt(d))))) {
            firstDigits.clear();
            firstDigits.add(Character.getNumericValue(two.get(i).charAt(0)));
            secondDigits.clear();
            secondDigits.add(Character.getNumericValue(two.get(i).charAt(1)));
            forthDigits.clear();
            forthDigits.add(Character.getNumericValue(two.get(i).charAt(3)));
          }
        }
        if (d == 3) {
          if (!(forthDigits.contains(Character.getNumericValue(two.get(i).charAt(d))))) {
            firstDigits.clear();
            firstDigits.add(Character.getNumericValue(two.get(i).charAt(0)));
            secondDigits.clear();
            secondDigits.add(Character.getNumericValue(two.get(i).charAt(1)));
            thirdDigits.clear();
            thirdDigits.add(Character.getNumericValue(two.get(i).charAt(2)));
          }
        }
      }
    }
    System.out.printf("%s ", firstDigits);  
    System.out.printf("%s ", secondDigits); 
    System.out.printf("%s ", thirdDigits); 
    
  }
  
  
  /** similarIndex & similarNum method
    * given two 3 digits number(String form), eg 816 848
    * return same index and the same digits
    */
  private static int similarIndex(String digits1, String digits2) {
    if (digits1.charAt(0) == digits2.charAt(0)) {
      return 0;
    }
    else if (digits1.charAt(1) == digits2.charAt(1)) {
      return 1;
    }
    else if (digits1.charAt(2) == digits2.charAt(2)) {
      return 2;
    }
    else if (digits1.charAt(3) == digits2.charAt(3)) {
      return 3;
    }
    else {
      return 0;
    }
  }
  
  private static int similarNum(String digits1, String digits2) {
    if (digits1.charAt(0) == digits2.charAt(0)) {
      return Character.getNumericValue(digits1.charAt(0));
    }
    else if (digits1.charAt(1) == digits2.charAt(1)) {
      return Character.getNumericValue(digits1.charAt(1));
    }
    else if (digits1.charAt(2) == digits2.charAt(2)) {
      return Character.getNumericValue(digits1.charAt(2));
    }
    else if (digits1.charAt(3) == digits2.charAt(3)) {
      return Character.getNumericValue(digits1.charAt(3));
    }
    else {
      return 0;
    }
    
    
  }
  
}
