/**A comparison based sorting algorithm that sorts the sequence by selecting an element and inserting the element in the correct position */
import java.util.Scanner;

public class InsertionSort {
  public static void insertionSort(int[] a){
    for(int i=1;i<a.length;i++){
      int key=a[i];
      int j=i-1;
      /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
      while(j>=0 && a[j] > key){
        a[j+1]=a[j];
        j=j-1;
      }
      a[j+1]=key;
    }
  }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array:");
    int N=sc.nextInt(); 
    int a[]=new int[N];
    System.out.println("Enter the array elements:");
    for(int i=0;i<N;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("The inserted Array is:");
    for(int i=0;i<N;i++){
      System.out.println(a[i]);
    }
    insertionSort(a);
    System.out.println("The sorted array is :");
    for(int i=0;i<N;i++){
      System.out.println(a[i]);
    }
    sc.close();
  } 
}
