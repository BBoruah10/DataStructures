public class IntersectionLL {
  public static Node getIntersection(Node headA,Node headB){
    int countA=0;
    int countB=0;
    for(Node curr=headA;curr!=null;curr=curr.next){
      countA++;
    }
    for(Node curr=headB;curr!=null;curr=curr.next){
      countB++;
    }
    Node currA=headA;
    Node currB=headB;
    if(countA > countB){
      for(int i=0;i<Math.abs(countA-countB);i++){
        currA=currA.next;
      }
    }else{
       for(int i=0;i<Math.abs(countB-countA);i++){
        currB=currB.next;
      }
    }
      while (currA != null && currB != null) {
        if (currA == currB) {
            return currA;  // Intersection found
        }
        currA = currA.next;
        currB = currB.next;
    }

    return null;
  }
  public static void main(String[] args) {
    
    Node common = new Node(8);
    common.next = new Node(9);

    Node headA = new Node(1);
    headA.next = new Node(2);
    headA.next.next = common;

    Node headB = new Node(3);
    headB.next = new Node(4);
    headB.next.next = common;

    Node intersects = getIntersection(headA, headB);
    System.out.println(intersects.data);
  }
}
