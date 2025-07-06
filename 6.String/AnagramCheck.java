
import java.util.Scanner;

public class AnagramCheck{
  public static boolean checkAnagram(String s1,String s2){
    if(s1.length() != s2.length()){
      return false;
    }
    int count[]=new int [256];
    for(int i=0;i<s1.length();i++){
      count[s1.charAt(i)]++;
      count[s2.charAt(i)]--;
    }
    for(int i=0;i<count.length;i++){
      if(count[i] != 0){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first string: ");
    String s1=sc.next();
    System.out.println("Enter the Second string: ");
    String s2=sc.next();
    boolean res=checkAnagram(s1,s2);
    if(res == true){
      System.out.println("Both Strings are Anagram of each other!");
    }else{
      System.out.println("Both Strings are not anagram");
    }
    sc.close();
  }
}