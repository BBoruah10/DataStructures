public class MiddleOfLL {
  public static int middle(Node head){
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
    }
    return slow.data;
  }
  public static void main(String[] args) {
     Node head=null;
    head=InsertAtBeg.insertAtBeg(head, 5);
    head=InsertAtBeg.insertAtBeg(head, 4);
    head=InsertAtBeg.insertAtBeg(head, 3);
    head=InsertAtBeg.insertAtBeg(head, 2);
    head=InsertAtBeg.insertAtBeg(head, 1);

    Node curr=head;
    while(curr!=null){
      System.out.println(curr.data);
      curr=curr.next;
    }

    int res=middle(head);
    System.out.println("The middle of LL is :"+res);


  }
}
