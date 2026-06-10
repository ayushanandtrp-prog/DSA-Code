package LinkedList;
public class NodeLink {
    public static void main(String[] args){
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
//        a.val = 10;
//        b.val = 20;
//        c.val = 30;
//        d.val = 40;
//        e.val = 50;
//        f.val = 60;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
       System.out.println(b);
//        System.out.println(c);
//        System.out.println(b.next);
        System.out.println(a.next);
        System.out.println(a.next.next);
        System.out.println(a.next.next.val);
    }
}
