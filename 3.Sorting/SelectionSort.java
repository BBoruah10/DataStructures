/**A comparison based sorting algorithm that sorts by repeatedly selecting the smallest element from the unsorted array and putting it in the sorted array */
import java.util.Scanner;

public class SelectionSort {

   public static void selectionSort(int [] a){
    for(int i=0;i<a.length-1;i++){
      int minIndex=i;
      for(int j=i+1;j<a.length;j++){
        if(a[j]<a[minIndex]){
          minIndex = j;
        }
      }
      int temp=a[i];
      a[i]=a[minIndex];
      a[minIndex]=temp;
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
    selectionSort(a);
    System.out.println("The sorted array is :");
    for(int i=0;i<N;i++){
      System.out.println(a[i]);
    }
  } 
}
