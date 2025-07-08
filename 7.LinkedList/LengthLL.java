public class LengthLL {
  public static void main(String[] args) {
    Node head=new Node(1);
    Node temp=new Node(2);
    head.next=temp;
    traverseLL(head);
    int length=lengthLL(head);
    System.out.println(length);
  }
  public static void traverseLL(Node head){
    Node curr=head;
    while(curr!=null){
      System.out.println(curr.data);
      curr=curr.next;
    }
  }
  public static int lengthLL(Node head){
    Node curr=head;
    int l=0;
    while(curr != null){
      l++;
      curr=curr.next;
    }
    return l;

  }
}
