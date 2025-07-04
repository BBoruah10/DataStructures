import java.util.Scanner;

public class MaximumSubarraySum {

  public static int sum(int a[],int n){
    int res=a[0];
    int maxEnd=a[0];
    for(int i=1;i<n;i++){
      maxEnd=Math.max(a[i],a[i]+maxEnd);
      res=Math.max(res,maxEnd);
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
      System.out.println(a[i]+ " ");
    }
    int res=sum(a,N);
    System.out.println("The maximum subarray sum is: "+res);
    sc.close();
  }
}
