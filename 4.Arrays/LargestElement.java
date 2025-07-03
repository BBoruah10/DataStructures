
import java.util.Scanner;

public class LargestElement{
  public static int largestElement(int[] a,int n){
    int largest=a[0];
    for(int i=1;i<n;i++){
      if(a[i]>largest){
        largest=a[i];
      }
    }
    return largest;
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
    int res=largestElement(a,N);
    System.out.println("The largest element in the array is: "+res);
    sc.close();
  }
}