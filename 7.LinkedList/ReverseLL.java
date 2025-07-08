public class ReverseLL {
  public static Node reverseLL(Node head){
    
    Node prev=null;
    Node curr=head;
    while(curr!=null){
      Node temp=curr.next;
      curr.next=prev;
      prev=curr;
      curr=temp;
     
    }
    return prev;
  }
  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);
    System.out.println("The original LL is:");
    traverseLL(head);
    head=reverseLL(head);
    System.out.println("The reversed LL is:");
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
