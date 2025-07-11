
import java.util.Scanner;

public class KthBitSet {
  public static boolean isKthBitSet(int n,int k){
    int x=1 << k;
    if((x & n)!=0){
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENter the number:");
    int n=sc.nextInt();
    System.out.println("Enter k:");
    int k=sc.nextInt();
    boolean res=isKthBitSet(n,k);
    System.out.println(res);
    sc.close();
  }
}
