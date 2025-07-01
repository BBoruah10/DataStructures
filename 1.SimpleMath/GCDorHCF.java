
import java.util.Scanner;

public class GCDorHCF {
  public static int gcd(int a,int b){
    while(b!=0){
      int temp=b;
      b=a%b;
      a=temp;
    }
    return a;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a:");
    int a= sc.nextInt();
    System.out.println("Enter b:");
    int b=sc.nextInt();
    int res=gcd(a,b);
    System.out.println("The GCD or HCF of "+a+" and "+b+" is :"+res);
    sc.close();
  }
}
