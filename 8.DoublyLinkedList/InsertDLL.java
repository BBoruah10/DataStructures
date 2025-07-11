class InsertAtBeg{
  public Node insertAtBeg(Node head,int data){
    Node temp=new Node(data);
    if(head==null){
      return temp;
    }
    temp.next=head;
    head.prev=temp;
    return temp;
  }
}
class InsertAtEnd{
  public Node insertAtEnd(Node head,int data){
    Node temp=new Node(data);
    if(head == null){
      return temp;
    }
    Node curr=head;
    while(curr.next!=null){
      curr=curr.next;
    }
    curr.next=temp;
    temp.prev=curr;
    return head;
  }

}
class InsertAtPos{
  public Node insertAtPos(Node head,int data,int pos){
    Node temp = new Node(data);
    if(head==null){
      return temp;
    }
    if(pos == 1){
      temp.next=head;
      head.prev=temp;
      return temp;
    }
    Node curr= head;
    for(int i=1;i<pos-1 && curr!=null ;i++){
      curr=curr.next;
    }
    if (curr == null) return head;
    temp.next=curr.next;
    temp.prev=curr;

    if (curr.next != null) curr.next.prev = temp;

    curr.next=temp;

    return head;
  }


}
public class InsertDLL {
   public static void main(String[] args) {
      InsertAtBeg ib=new InsertAtBeg();
      InsertAtEnd ie=new InsertAtEnd();
      InsertAtPos ip=new InsertAtPos();

      Node head = null;
      head=ib.insertAtBeg(head, 2);
      head=ib.insertAtBeg(head, 1);

      head=ie.insertAtEnd(head, 45);
      head=ie.insertAtEnd(head, 77);

      head=ip.insertAtPos(head, 69, 3);

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
