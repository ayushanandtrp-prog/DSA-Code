package LinkedList;

public class TraverseNode {
//    public static void display(Node Head){
//        Node temp = Head;
//        while(temp != null){
//            System.out.print(temp.val+ " ");
//            temp = temp.next;
//        }
//        System.out.println();
    //Using Recursion
    public static void displayrec(Node Head){
        if(Head == null) return;
        System.out.println(Head.val + " ");
        displayrec(Head.next);
    }
    public static void main(String[]args){
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = b; b.next = c;
        c.next = d; d.next = e;
        e.next = f;
//       display(a);
        displayrec(a);
    }
}
