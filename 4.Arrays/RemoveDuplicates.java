
import java.util.Scanner;

//Remove Duplicates in-place from Sorted Array

public class RemoveDuplicates {

  public static int removeDuplicates(int a[],int n){
    int res=1;
    for(int i=1;i<n;i++){
      if(a[i] != a[res-1]){
        a[res]=a[i];
        res++;
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
    System.out.println();
    int res=removeDuplicates(a,N);
    System.out.println(res);
    sc.close();
  }
}
