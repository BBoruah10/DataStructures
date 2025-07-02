
import java.util.Scanner;

public class BubbleSort {

 

  public static void bubbleSort(int []a){
    for(int i=0;i<a.length-1;i++){
      for(int j=0;j<a.length-i-1;j++){
        if(a[j]>a[j+1]){
          int temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
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
    bubbleSort(a);
    System.out.println("The sorted array is :");
    for(int i=0;i<N;i++){
      System.out.println(a[i]);
    }
  } 
}
