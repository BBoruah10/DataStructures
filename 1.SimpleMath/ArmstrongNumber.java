import java.util.Scanner;

public class ArmstrongNumber {
  private static int countDigit(int n){
    int c=0;
    while(n>0){
      n=n/10;
      c++;
    }
    return c;
  }
  public static boolean isArmstrong(int n){
    int sum=0;
    int temp=n;
    int numDigits=countDigit(n);
    while(n>0){
      int digit=n%10;
      sum+=Math.pow(digit, numDigits);
      n=n/10;
    }
    return (temp==sum);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n=sc.nextInt();
    boolean isArm=isArmstrong(n);
    System.out.println(isArm);
    sc.close();
  }
}
