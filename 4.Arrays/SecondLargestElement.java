
import java.util.Scanner;

public class SecondLargestElement {

  public static int secondLargestElement(int []a,int n){
    int large=Integer.MIN_VALUE;
    int secondLarge=Integer.MIN_VALUE;

    for(int e:a){
      if(e>large){
        secondLarge=large;
        large=e;
      }
      else if(secondLarge != large && e>secondLarge){
        secondLarge=e;
      }
    }
    int res=secondLarge == Integer.MIN_VALUE?-1:secondLarge;
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
      System.out.print(a[i]+ " ");
    }
    int res=secondLargestElement(a,N);
    if(res == -1){
      System.out.println("Second largest element Does not exist");
    }else{
      System.out.println("The second Largest element is "+res);
    }
    sc.close();
  }
  
}
