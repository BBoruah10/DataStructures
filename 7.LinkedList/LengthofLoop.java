public class LengthofLoop {
  public static int lengthLoop(Node head){
    Node slow=head;
    Node fast=head;
    boolean hasLoop=false;
    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
      if(slow == fast){
        hasLoop=true;
        break;
      }
    }
    if(hasLoop){
      int count=0;
      Node temp=slow;
      do { 
          count++;
          temp=temp.next;
      } while (temp!=slow);
      return count;
    }
  return 0;

  }
  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);

    // Creating a loop: node 5 points back to node 3
    head.next.next.next.next.next = head.next.next;

    int res=lengthLoop(head);
    System.out.println("The length of loop is "+res);
  }
}
