import java.util.Scanner;

class FirstOcc {
  public static int firstOcc(int a[],int n,int X){
    int l=0;
    int h=n-1;
    while(l<=h){
      int m=(l+h)/2;
      if(a[m] > X){
        h=m-1;
      }else if(a[m] < X){
        l=m+1;
      }else{
        if(m == 0 || X !=a[m-1]){
          return m;
        }else{
          h=m-1;
        }
      }
    }
    return -1;
  }
}
class LastOcc {
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
}
public class CountOcc {
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
    System.out.println("Enter the value for counting Occurance: ");
    int x=sc.nextInt();
    int firstOcc=FirstOcc.firstOcc(a, N, x);
    int lastOcc=LastOcc.lastOcc(a, N, x);
    if(firstOcc == -1){
      System.out.println("Value does not exists!");
    }
    int res=lastOcc-firstOcc+1;
   
   System.out.println("THe count of occurance of "+x+" is : "+res);
    sc.close();
  
  
  
  }

 
  
  
}
