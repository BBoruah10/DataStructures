import java.util.Scanner;

public class isPrime {
  public static boolean isPrimeNumber(int n){
    if(n <= 1) return false;
    if(n==2 || n==3) return true;
    if(n%2==0 || n %3==0) return false;
    for(int i=5;i<=Math.sqrt(n);i=i+6){
      if(n%i == 0 || n%(i+2) == 0){
        return false;
      }

    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n=sc.nextInt();
    boolean isArm=isPrimeNumber(n);
    System.out.println(isArm);
    sc.close();
  }
}
