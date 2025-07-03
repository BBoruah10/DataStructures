
import java.util.Scanner;

public class ConsecutiveOnes {
  public static int consecutiveOnes(int a[],int n){
    int count=0;
    int res=0;
    for(int i=0;i<n;i++){
      if(a[i] == 1){
        count++;
        res=Math.max(res,count);
      }else{
        count=0;
      }
    }
    return res;
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
      System.out.print(a[i]+ " ");
    }
    int res=consecutiveOnes(a,N);
    System.out.println("The max number of consecutive 1's in the array is: "+res);
    sc.close();
  }
}
