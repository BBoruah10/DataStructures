import java.util.Scanner;

public class Nonrepeating {
  public static int nonRep(int a[],int n){
    int res=a[0];
    for(int i=0;i<n;i++){
      res=res^a[i];
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
      System.out.println(a[i]+ " ");
    }
   
   int res=nonRep(a,N);
   System.out.println("THe non repeating element in the array is "+res);
    sc.close();
  
  }
}
