public class RemoveDuplicates {
  public static Node removeDuplicates(Node head){
    Node curr=head;
    while(curr != null && curr.next !=null){
      if(curr.data == curr.next.data){
        curr.next=curr.next.next;
      }
      curr=curr.next;
    }
    return head;
  }
  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(3);
    head.next.next.next.next = new Node(4);
    head.next.next.next.next.next = new Node(4);
    head.next.next.next.next.next.next = new Node(5);
    System.out.println("The original LL is:");
    traverseLL(head);
    head=removeDuplicates(head);
    System.out.println("The  LL after removing  is:");
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
