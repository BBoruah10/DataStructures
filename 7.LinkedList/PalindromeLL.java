public class PalindromeLL {
  public static Node reverse(Node head){
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
  public static boolean isPalindrome(Node head){
    if (head == null || head.next == null) return true;
    Node slow=head;
    Node fast=head;
    while(fast.next != null && fast.next.next != null){
      slow=slow.next;
      fast=fast.next.next;
    }
    Node rev=reverse(slow.next);
    Node curr=head;
    while(curr != null && rev != null){
      if(curr.data != rev.data){
        return false;
      }
      curr=curr.next;
      rev=rev.next;
    }
    return true;
  }
  public static void main(String[] args) {
  Node head = new Node(1);
head.next = new Node(2);
head.next.next = new Node(2);
head.next.next.next = new Node(1);

System.out.println(isPalindrome(head));
  }
}
