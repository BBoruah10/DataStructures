//Left rotate an array by D

import java.util.Scanner;

public class LeftRotate {


  public static  void reverse(int a[],int l,int h){
    while(l<h){
      int temp=a[l];
      a[l]=a[h];
      a[h]=temp;
      l++;
      h--;
    }
  }

  public static void leftRotateByD(int a[],int d){
    int n=a.length;
    d=d % n;

    reverse(a,0,d-1);
    reverse(a,d,n-1);
    reverse(a,0,n-1);
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
    System.out.println("");
    System.out.println("Enter the places(d) by which you want to rotate:");
    int d=sc.nextInt();
    leftRotateByD(a,d);
    for(int i=0;i<N;i++){
      System.out.println(a[i]);
    }
    sc.close();
  }
  
  
}
