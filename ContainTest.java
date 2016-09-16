/** test for containfunction of Solution24
  * Tony
  */

public class ContainTest{
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
  public static void main(String[] args) {
    String[] items = {"a", "b", "c"};
    String item = "b";
    String item2 = "d";
    System.out.println(contain(item,items));
    System.out.println(contain(item2,items));
  }
}