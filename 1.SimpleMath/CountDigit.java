
import java.util.Scanner;

public class CountDigit{
  public static int countDigit(int n){
    int c=0;
    while(n>0){
      n=n/10;
      c++;
    }
    return c;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n=sc.nextInt();
    int count=countDigit(n);
    System.out.println("The number of digits in "+n+" is "+count);
    sc.close();
  }
}