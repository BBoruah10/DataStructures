import java.util.Scanner;

public class InsertPos {
  public static int insertPosition(int a[],int n,int X){
    int l=0;
    int h=n-1;
    if(X<a[l]){
      return 1;
    }
    while(l <= h){
      int mid=(l+h)/2;
      if (a[mid] == X) {
            return mid; // Element already present
        } else if (a[mid] < X) {
            l = mid + 1;
        } else {
            h = mid - 1;
        }
    }
    return l;
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
    System.out.println("Enter the element to be inserted:");
    int X=sc.nextInt();
    int res=insertPosition(a,N,X);
    System.out.println("The position at which "+X+" element will be inserted in the Sorted array is: "+res);
    sc.close();
  }
}
