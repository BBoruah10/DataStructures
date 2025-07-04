import java.util.Scanner;

public class Sort3types {
  public static void sort(int a[],int n){
    int l=0;
    int h=n-1;
    int mid=0;
    while(mid <= h){
      if(a[mid] == 0){
        int temp=a[l];
        a[l]=a[mid];
        a[mid]=temp;
        l++;
        mid++;
      }else if(a[mid] == 1){
        mid++;
      }else{
        int temp=a[h];
        a[h]=a[mid];
        a[mid]=temp;
        h--;
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
        System.out.println(a[i]+ " ");
   }
   sort(a,N);
  System.out.println("THe sorted array is:");
   for(int i=0;i<N;i++){
        System.out.println(a[i]+ " ");
   }
   
     sc.close();
  }
}
