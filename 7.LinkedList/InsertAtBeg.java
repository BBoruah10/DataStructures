class Node{
  int data;
  Node next;
  public Node(int x){
    data=x;
    next=null;
  }
}
public class InsertAtBeg {

  public static Node insertAtBeg(Node head,int data){
    Node temp=new Node(data);
    temp.next=head;
    return temp;
  }
  public static void main(String[] args) {
    Node head=null;

    head=insertAtBeg(head, 1);
    head=insertAtBeg(head, 2);
    head=insertAtBeg(head, 3);

    Node curr=head;
    while(curr != null){
      System.out.println(curr.data);
      curr=curr.next;
    }
  }
}
