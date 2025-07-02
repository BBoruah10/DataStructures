
import java.util.Scanner;


public class QuickSort {
  public static int partition(int [] a,int l,int r){
    int i=l-1;
    int j=r+1;
    int P=a[l];
    while(true){
      do{i++;}while(a[i]<P);
      do{j--;}while(a[j]>P);
      if(i>=j) return j;
      int temp=a[i];
      a[i]=a[j];
      a[j]=temp;
    }
  }
  public static void quickSort(int [] a,int l,int r){
    if(l<r){
      int p = partition(a, l, r);
      quickSort(a, l, p);
      quickSort(a, p+1, r);
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
    int l=0;
    int r=a.length - 1;
    quickSort(a,l,r);
    System.out.println("The sorted array is :");
    for(int i=0;i<N;i++){
      System.out.println(a[i]);
    }
    sc.close();
  } 
}
