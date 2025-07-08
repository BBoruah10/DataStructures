
import java.util.Scanner;

public class SearchAnELement {
  public static boolean searchElement(Node head,int x){
    Node curr=head;
    while(curr != null){
      if(curr.data == x){
        return true;
      }
      curr=curr.next;
    }
    return false;
  }
  public static void main(String[] args) {
    Node head=null;
    head=InsertAtBeg.insertAtBeg(head, 3);
    head=InsertAtBeg.insertAtBeg(head, 4);
    head=InsertAtBeg.insertAtBeg(head, 5);
    head=InsertAtBeg.insertAtBeg(head, 6);

    
    Node curr=head;
    while(curr!=null){
      System.out.println(curr.data);
      curr=curr.next;
    }
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the element you want to search:");
    int x=sc.nextInt();
    boolean res = searchElement(head,x);
    System.out.println(res);
    sc.close();


  }
}
