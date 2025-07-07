class Node{
  int data;
  Node next;
  public Node(int x){
    data=x;
    next=null;
  }
}
public class CreateLL {
  public static void main(String[] args) {
    Node head=new Node(1);
    Node temp=new Node(2);
    head.next=temp;
    traverseLL(head);
  }
  public static void traverseLL(Node head){
    Node curr=head;
    while(curr!=null){
      System.out.println(curr.data);
      curr=curr.next;
    }
  }
}
