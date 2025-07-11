public class AddNumbers {
  public static Node addTwoNumbers(Node l1,Node l2){
    Node dummy=new Node(0);
    Node curr=dummy;
    int carry = 0;
    while(l1 != null || l2 !=null || carry != 0){
      int val1=(l1!=null)?l1.data:0;
      int val2=(l2!=null)?l2.data:0;

      int sum=val1+val2+carry;
      carry=sum/10;
      curr.next=new Node(sum%10);
      curr=curr.next;

      if (l1 != null) l1 = l1.next;
      if (l2 != null) l2 = l2.next;

    }
    return dummy.next;
  }
  public static void main(String[] args) {
     Node l1 = new Node(2);
    l1.next = new Node(4);
    l1.next.next = new Node(3);

    Node l2 = new Node(5);
    l2.next = new Node(6);
    l2.next.next = new Node(4);

    Node result = addTwoNumbers(l1, l2);
    printList(result);
  }
  public static void printList(Node head) {
    while (head != null) {
        System.out.print(head.data);
        if (head.next != null) System.out.print(" -> ");
        head = head.next;
    }
    System.out.println();
  }
}
