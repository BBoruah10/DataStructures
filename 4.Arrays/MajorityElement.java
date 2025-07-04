import java.util.Scanner;

public class MajorityElement {
  public static int majorityElement(int a[],int n){
    int count=1;
    int res=0;
    for(int i=1;i<n;i++){
      if(a[i] == a[res]){
        count++;
      }else{
        count--;
        if(count==0){
          res=i;
          count=1;
        }
      }
    }
    count=0;
    for(int i=0;i<n;i++){
      if(a[i] == a[res]){
        count++;
      }
    }
    if(count > n/2){
      return a[res];
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
    int res=majorityElement(a,N);
    System.out.println("The majority element in the array is: "+res);
    sc.close();
  
  }
}
