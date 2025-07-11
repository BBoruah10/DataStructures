
import java.util.Scanner;

public class CountSetBits {
  public static int count(int n){
    int count=0;
    while(n>0){
      count++;
      n=n&(n-1);
  
    }
    return count;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENter the number:");
    int n=sc.nextInt();
    int res=count(n);
    System.out.println(res);
    sc.close();
  }
}
