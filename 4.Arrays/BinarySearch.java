
import java.util.Scanner;

public class BinarySearch {

  public static boolean binarySearch(int a[],int n,int k){
    int l=0;
    int h=n-1;
    while(l <= h){
      int mid=(l+h)/2;
      if(a[mid] == k){
        return true;
      }else if(a[mid] > k){
        h=mid-1;
      }else{
        l=mid+1;
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
    boolean res=binarySearch(a,N,k);
    if(res==true){
      System.out.println("Element found!");
    }else{
      System.out.println("Element not found!");
    }
     sc.close();
  }
}
