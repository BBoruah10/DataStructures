
import java.util.Scanner;

public class PowerTwo {
  public static boolean  isTwoPower(int n){
    return (n & (n - 1)) == 0;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENter the number:");
    int n=sc.nextInt();
    boolean res=isTwoPower(n);
    System.out.println(res);
    sc.close();
  }
  
}
