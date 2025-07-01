import java.util.Scanner;

public class Palindrome {
  public static boolean isPalindrome(int n){
    int rev=0;
    int temp=n;
    while(n>0){
      int digit=n%10;
      rev=rev*10+digit;
      n=n/10;
    }
    return (temp==rev);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n=sc.nextInt();
    boolean isPal=isPalindrome(n);
    System.out.println(isPal);
    sc.close();
  }
}
