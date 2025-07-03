import java.util.Scanner;

//Move Zeros to end


public class MoveZeros {

  public static void swap(int a[],int i,int count){
    int temp=a[i];
    a[i]=a[count];
    a[count]=temp;
  }

  public static void moveZeros(int [] a,int n){

    int count = 0;
    for(int i=0;i<n;i++){
      if(a[i] != 0){
        swap(a,i,count);
        count++;
      }
    }


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
    moveZeros(a,N);
    for(int i=0;i<N;i++){
      System.out.print(a[i]+ " ");
    }
    //System.out.println("The largest element in the array is: "+res);
    sc.close();
  }
}
