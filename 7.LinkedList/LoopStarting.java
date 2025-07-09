public class LoopStarting {
  public static Node start(Node head){
    Node slow=head;
    Node fast=head;
    boolean hasLoop=false;
    while(fast != null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
      if(slow == fast){
        hasLoop=true;
        break;
      }
    }
    if(hasLoop){
      slow=head;
      while(fast != slow){
        slow=slow.next;
        fast=fast.next;
      }
      return slow;
    }
    return null;
  }
  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);

    // Creating a loop: node 5 points back to node 3
    head.next.next.next.next.next = head.next.next;

    Node curr = start(head);
    System.out.println("THe starting node contains "+curr.data);
  }
}
