import java.util.Scanner;

public class RotateCheck {
  public static boolean checkRotation(String s1,String s2){
    if(s1.length() != s2.length()){
      return false;
    }
    return (s1+s1).indexOf(s2) >= 0;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first string: ");
    String s1=sc.next();
    System.out.println("Enter the Second string: ");
    String s2=sc.next();
    boolean res=checkRotation(s1,s2);
    if(res == true){
      System.out.println("Both Strings are rotation of each other!");
    }else{
      System.out.println("Both Strings are not rotation of each other");
    }
    sc.close();
  }
  
}
