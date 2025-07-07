class Node{
  int data;
  Node next;
  public Node(int x){
    data=x;
    next=null;
  }
}
public class InsertAtEnd {
  public static Node inserAtEnd(Node head,int x){
    Node temp=new Node(x);
    if(head==null){
      return temp;
    }
    Node curr=head;
    while(curr.next!=null){
      curr=curr.next;
    }
    curr.next=temp;
    return head;
  }
  public static void main(String[] args) {
    Node head=null;
    head=inserAtEnd(head,1);
    head=inserAtEnd(head, 2);
    head=inserAtEnd(head, 3);

     Node curr=head;
    while(curr != null){
      System.out.println(curr.data);
      curr=curr.next;
    }

  }
}
