import java.util.HashSet;
import java.util.Scanner;

public class TwoSum {

  public static boolean twoSum(int a[],int n,int sum){
     HashSet<Integer> h=new HashSet<>();
     for(int e:a){
      if(h.contains(sum-e)){
        return true;
      }
      h.add(e);
     }
     return false;
  }
   public static void main(String[] args) {

      
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements in the array:");
    int N=sc.nextInt();
    int a[]=new int[N];
    System.out.println("Enter the array elements:");
    for(int i=0;i<N;i++){
       a[i]=sc.nextInt();
    }
    System.out.println("The elements in the array are:");
    for(int i=0;i<N;i++){
        System.out.println(a[i]+ " ");
   }
    System.out.println("Enter the sum: ");
    int X=sc.nextInt();
    boolean res=twoSum(a,N,X);
    if(res==true){
      System.out.println("Sum found!");
    }else{
      System.out.println("Sum not found!");
    }
     sc.close();
  }
}
