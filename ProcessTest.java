/** process test : only character left
  * Tony
  */

public class ProcessTest{
  
  
  public static String process (String n) {
    String step1 = n.replace(" ", "");
    String step2 = step1;
    for (int i = 0; i < step1.length(); i++) {
      boolean a = (int)step1.charAt(i) >= 33 && (int)step1.charAt(i) <= 46;
      boolean b = (int)step1.charAt(i) >= 58 && (int)step1.charAt(i) <= 64;
      boolean c = (int)step1.charAt(i) >= 91 && (int)step1.charAt(i) <= 96;
      boolean d = (int)step1.charAt(i) >= 123 && (int)step1.charAt(i) <= 126;
      boolean condition = a || b || c || d;
      
      if(condition) {
        System.out.println(step1.charAt(i));
        step2 = step2.replace(Character.toString(step1.charAt(i)), "");
        System.out.println(step2);
      }
      else {
        step2 = step2;
      }
    }
    return step2;
  }
  
  public static void main(String[] args) {
    System.out.println(process("O, a kak Uwakov lil vo kawu kakao!"));
  }
}