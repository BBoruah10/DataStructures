/*Divide and conquer algorithm */
import java.util.Scanner;


public class MergeSort {
  public static void merge(int [] a,int l,int m,int r){

    int n1=m-l+1;
    int n2=r-m;

    int[] L=new int[n1];
    int[] R=new int[n2];

    for(int i=0;i<n1;++i){
      L[i]=a[i+l];
    }
    for(int i=0;i<n2;++i){
      R[i]=a[m+i+1];
    }

    int i=0;
    int j=0;
    int k=l;
    while(i<n1 && j<n2){
      if(L[i]<R[j]){
        a[k]=L[i];
        i++;
        k++;
      }else{
        a[k]=R[j];
        j++;
        k++;
      }
    }
    while(i<n1){
      a[k]=L[i];
      i++;
      k++;
    }
    while(j<n2){
      a[k]=R[j];
      j++;
      k++;
    }

  }
  public static void mergeSort(int [] a,int l,int r){
    if(l<r){
      int m=l+(r-l)/2;
      mergeSort(a, l, m);
      mergeSort(a, m+1, r);
      merge(a,l,m,r);
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
    mergeSort(a,l,r);
    System.out.println("The sorted array is :");
    for(int i=0;i<N;i++){
      System.out.println(a[i]);
    }
    sc.close();
  } 
}
