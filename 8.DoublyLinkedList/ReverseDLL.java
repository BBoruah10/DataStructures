public class ReverseDLL {
  public static Node reverseDLL(Node head){
    Node temp=null;
    Node curr=head;
    while(curr != null){
      temp = curr.prev;
      curr.prev=curr.next;
      curr.next=temp;

      curr=curr.prev;
    }
    return temp.prev;
  }
  public static void main(String[] args) {
    Node head = new Node(1);
head.next = new Node(2);
head.next.prev = head;
head.next.next = new Node(3);
head.next.next.prev = head.next;
head.next.next.next = new Node(4);
head.next.next.next.prev = head.next.next;

System.out.print("Before Reverse: ");
traverseDLL(head);

head = reverseDLL(head);

System.out.print("After Reverse: ");
traverseDLL(head);
  }
  public static void traverseDLL(Node head){
    Node curr = head;
    while(curr != null){
      System.out.println(curr.data);
      curr=curr.next;
    }
   }
  
}
