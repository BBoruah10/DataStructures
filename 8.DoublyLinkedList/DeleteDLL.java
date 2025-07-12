class DeleteAtBeg {
  public Node deleteAtBeg(Node head) {
    if (head == null) return null;
    head = head.next;
    if (head != null) head.prev = null;
    return head;
  }
}
class DeleteAtEnd {
  public Node deleteAtEnd(Node head) {
    if (head == null || head.next == null) return null;
    Node curr = head;
    while (curr.next != null) {
      curr = curr.next;
    }
    curr.prev.next = null;
    return head;
  }
}
class DeleteAtPos {
  public Node deleteAtPos(Node head, int pos) {
    if (head == null) return null;
    if (pos == 1) {
      head = head.next;
      if (head != null) head.prev = null;
      return head;
    }

    Node curr = head;
    for (int i = 1; i < pos && curr != null; i++) {
      curr = curr.next;
    }

    if (curr == null) return head;

    if (curr.prev != null) curr.prev.next = curr.next;
    if (curr.next != null) curr.next.prev = curr.prev;

    return head;
  }
}

public class DeleteDLL {
  public static void main(String[] args) {
    InsertAtBeg ib = new InsertAtBeg();
    InsertAtEnd ie = new InsertAtEnd();
    InsertAtPos ip = new InsertAtPos();
    DeleteAtBeg db = new DeleteAtBeg();
    DeleteAtEnd de = new DeleteAtEnd();
    DeleteAtPos dp = new DeleteAtPos();

    Node head = null;

    // Insertions
    head = ib.insertAtBeg(head, 2);
    head = ib.insertAtBeg(head, 1);
    head = ie.insertAtEnd(head, 45);
    head = ie.insertAtEnd(head, 77);
    head = ip.insertAtPos(head, 69, 3);

    System.out.println("List after insertions:");
    traverseDLL(head);

    // Deletion at beginning
    head = db.deleteAtBeg(head);
    System.out.println("After deleting at beginning:");
    traverseDLL(head);

    // Deletion at end
    head = de.deleteAtEnd(head);
    System.out.println("After deleting at end:");
    traverseDLL(head);

    // Deletion at position
    head = dp.deleteAtPos(head, 2);
    System.out.println("After deleting at position 2:");
    traverseDLL(head);
  }

  public static void traverseDLL(Node head) {
    Node curr = head;
    while (curr != null) {
      System.out.print(curr.data + " ");
      curr = curr.next;
    }
    System.out.println();
  }
}
