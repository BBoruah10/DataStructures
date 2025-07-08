public class DetectLoop {
  public static boolean isloop(Node head){
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
      if(slow == fast){
        return true;
      }
    }
    return false;
  }
  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);

    // Creating a loop: node 5 points back to node 3
    head.next.next.next.next.next = head.next.next;

    // Checking for loop
    if (isloop(head)) {
      System.out.println("Loop detected");
    } else {
      System.out.println("No loop");
    }
  }
}
