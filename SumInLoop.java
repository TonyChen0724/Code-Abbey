/** Sum in loop
  * Tony Chen
  */
import java.util.Scanner;
public class SumInLoop{
  
  public static void main(String[] args){
    
    int Sum = 0;
    
    Scanner scan = new Scanner(System.in);
    int loop_num = scan.nextInt();
    
    for (int n = 0; n < loop_num; n++) {
      Sum += scan.nextInt();
    }
    System.out.println(Sum);
  }
}
      