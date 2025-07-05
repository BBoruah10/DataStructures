import java.util.Scanner;

public class LastOcc {


  public static int lastOcc(int a[],int n,int X){
    int l=0;
    int h=n-1;
    while(l<=h){
      int m=(l+h)/2;
      if(a[m] > X){
        h=m-1;
      }else if(a[m] < X){
        l=m+1;
      }else{
        if(m == n-1 || X !=a[m+1]){
          return m;
        }else{
          l=m+1;
        }
      }
    }
    return -1;
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
    System.out.println("Enter the value for last Occurance: ");
    int x=sc.nextInt();
   int res=lastOcc(a,N,x);
   System.out.println("THe last occurance of "+x+" is : "+res);
    sc.close();
  
  
  }
}
