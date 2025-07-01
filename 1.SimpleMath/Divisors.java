import java.util.ArrayList;
import java.util.Scanner;

public class Divisors {
  public static ArrayList<Integer> allDivisors(int n){
    ArrayList<Integer> res=new ArrayList<>();
    while(n%2 == 0){
      res.add(2);
      n=n/2;
    }
    for(int i=3;i<=Math.sqrt(n);i=i+2){
      while(n % i ==0){
        res.add(i);
        n=n/i;
      }

    }
    if(n>2){
      res.add(3);
    }
    return res;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n=sc.nextInt();
    ArrayList<Integer> res=allDivisors(n);
    System.out.println("The divisors of "+n+" are :");
    for(int i=0;i<res.size();i++){
      System.out.println(res.get(i));
    }
    sc.close();
  }
}
