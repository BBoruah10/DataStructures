class DeleteFirst{
  public Node deleteFirst(Node head){
    if(head == null){
      return null;
    }
    return head.next;
  }
}
class DeleteLast{
  public Node deleteLast(Node head){
    if(head==null){
      return null;
    }
    if(head.next == null){
      return head;
    }
    Node curr=head;
    while(curr.next.next!=null){
      curr=curr.next;
    }
    curr.next=null;
    return head;
  }
}
class DeletePos{
  public Node deleteAtPos(Node head,int pos){
     if(head==null){
      return null;
    }
    if(pos == 1){
      return head.next;
    }
    Node curr=head;
    for(int i=1;i<pos-1;i++){
      if (curr == null || curr.next == null) {
        return head; // Position out of bounds
      }
      curr=curr.next;
    }
   if (curr.next != null) {
      curr.next = curr.next.next;
    }
    return head;
  }
}
public class DeletingNode {
  public static void main(String[] args) {
    Node head=null;
    head=InsertAtBeg.insertAtBeg(head, 3);
    head=InsertAtBeg.insertAtBeg(head, 4);
    head=InsertAtBeg.insertAtBeg(head, 5);
    head=InsertAtBeg.insertAtBeg(head, 6);

    traverseLL(head);

    /** 
    DeleteFirst df=new DeleteFirst();
    head = df.deleteFirst(head);
    System.out.println("After deleting the first node:");
    traverseLL(head);

    DeleteLast dl=new DeleteLast();
    head=dl.deleteLast(head);
    System.out.println("After deleting the Last node:");
    traverseLL(head);*/

    DeletePos dp=new DeletePos();
    head=dp.deleteAtPos(head, 3);
     System.out.println("After deleting the POS node:");
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
