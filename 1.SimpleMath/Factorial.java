import java.util.Scanner;

public class Factorial {
  public static int factorial(int n){
    int fact=1;
    for(int i=n;i>=1;i--){
      fact*=i;
    }
    return fact;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n=sc.nextInt();
    int res=factorial(n);
    System.out.println("The factorial of "+n+" is "+res);
    sc.close();
  }
}
