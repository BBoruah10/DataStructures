import java.util.ArrayList;
import java.util.Scanner;

public class fibonacci {
  public static ArrayList<Integer> fiboSeries(int n){
    ArrayList<Integer> res=new ArrayList<>();
    int a=0;
    int b=1;
    res.add(a);
    res.add(b);
    for(int i=2;i<=n;i++){
      int c=a+b;
      res.add(c);
      a=b;
      b=c;
    }
    return res;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n=sc.nextInt();
    ArrayList<Integer> res=fiboSeries(n);
    System.out.println("The fibonacci series upto "+n+" is:");
    for(int e:res){
      System.out.println(e);
    }
    sc.close();
  }
  
}
