import java.util.Scanner;

public class ReverseNumber {
  public static int reverseNum(int n){
    int rev=0;
    while(n>0){
      int digit=n%10;
      rev=rev*10+digit;
      n=n/10;
    }
    return rev;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n=sc.nextInt();
    int rev=reverseNum(n);
    System.out.println("The reverse of "+n+" is "+rev);
    sc.close();
  }
  
}
