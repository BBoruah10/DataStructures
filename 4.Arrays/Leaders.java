import java.util.ArrayList;
import java.util.Scanner;

public class Leaders {

  public static void reverse(ArrayList<Integer> res){
    int low=0;
    int high=res.size()-1;
    while(low <= high){
      int temp=res.get(low);
      res.set(low,res.get(high));
      res.set(high,temp);
      low++;
      high--;
    }
  }

  public static ArrayList<Integer> leader(int a[],int n){
    ArrayList<Integer> res=new ArrayList<>();
    int curr_leader=a[n-1];
    res.add(curr_leader);
    for(int i=n-2;i>=0;i--){
      if(curr_leader < a[i]){
        curr_leader=a[i];
        res.add(curr_leader);
      }
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
    ArrayList<Integer> res=leader(a,N);
    System.out.println("The leaders in the array are: ");
    for(int e:res){
      System.out.println(e);
    }
    
    sc.close();
  
  }
}
