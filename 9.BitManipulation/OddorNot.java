
import java.util.Scanner;

public class OddorNot {
  public static boolean isOddorNot(int n){
    return (n & 1)!=0;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENter the number:");
    int n=sc.nextInt();
    boolean res=isOddorNot(n);
    System.out.println(res);
    sc.close();
  }
}
