
import java.util.Scanner;

class NodeLL{
  int data;
  NodeLL next;
  public NodeLL(int x){
    data=x;
    next=null;
  }
}
public class InsertAtPos {
  public static NodeLL insertAtPos(NodeLL head,int pos,int X){
    NodeLL temp=new NodeLL(X);
    if(head == null){
      return temp;
    }
    if(pos == 1){
      temp.next=head;
      return temp;
    }
    NodeLL curr=head;
    for(int i=2;i<pos-1 && curr!=null;i++){
      curr=curr.next;
    }
    if (curr == null) {
      System.out.println("Position is greater than the length of the list.");
      return head;
    }
    temp.next=curr.next;
    curr.next=temp;
    return head;
  }

  public static void main(String[] args) {
    NodeLL head=new NodeLL(1);
    NodeLL temp=new NodeLL(2);
    head.next=temp;
    NodeLL temp2=new NodeLL(3);
    temp.next=temp2;
   
    NodeLL curr=head;
    while(curr != null){
      System.out.println(curr.data);
      curr=curr.next;
    }
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the element you want to insert");
    int X=sc.nextInt();
    System.out.println("Enter the postion you want to insert the element");
    int pos=sc.nextInt();
    head=insertAtPos(head,pos,X);
    System.out.println("After insertion .The Linked List becomes:");
    NodeLL cur=head;
    while(cur != null){
      System.out.println(cur.data);
      cur=cur.next;
    }
  }
  
  



}
