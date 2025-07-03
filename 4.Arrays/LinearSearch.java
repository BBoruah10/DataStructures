
import java.util.Scanner;

public class LinearSearch {


    public static boolean linearSearch(int a[],int n,int k){
      for(int i=0;i<n;i++){
        if(a[i] == k){
          return true;
        }
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
      System.out.print(a[i]+ " ");
    }
    System.out.println("Enter the element to search: ");
    int k=sc.nextInt();
    boolean res=linearSearch(a,N,k);
    if(res==true){
      System.out.println("Element found!");
    }else{
      System.out.println("Element not found!");
    }
    sc.close();
  }
}
