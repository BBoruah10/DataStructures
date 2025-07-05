import java.util.Scanner;

public class RotatedSorted {
  public static int rotatedSortedArr(int a[],int n,int X){
    int l=0;
    int h=n-1;
    while(l<=h){
      int mid=(l+h)/2;
      if(a[mid] == X){
        return mid;
      }
      if(a[l] <= a[mid]){
        if(a[l]<=X && a[mid]>X){
          h=mid-1;
        }else{
          l=mid+1;
        }
      }else {
            if (a[mid] < X && X <= a[h]) {
                l = mid + 1;
            } else {
                h = mid - 1;
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
   System.out.println("Enter the element to be searched");
   int X=sc.nextInt();
   int res=rotatedSortedArr(a,N,X);
   System.out.println("The element is present at  index "+res);
    sc.close();
  }
    
  
}
