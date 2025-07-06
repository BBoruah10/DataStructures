import java.util.Scanner;

public class PalindromeCheck {
  public static boolean checkPalindrome(String s){
    int l=0;
    int h=s.length()-1;
    while(l <=h ){
      if(s.charAt(l) != s.charAt(h)){
        return false;
      }
      l++;
      h--;
    }
    return true;
  }
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
  
    System.out.println("Enter the string: ");
    String s=sc.next();
    boolean res=checkPalindrome(s);
    if(res == true){
      System.out.println("Palindrome!");
    }else{
      System.out.println("Not Palindrome!");
    }
    sc.close();
  }
}
