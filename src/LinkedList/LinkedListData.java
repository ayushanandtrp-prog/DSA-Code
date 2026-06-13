package LinkedList;
class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}
class Linkedlist1{
    int size;
    Node Head;
    Node tail;
    void InsertAttail(int value){
        Node temp = new Node(value);
        if(Head == null) Head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void InsertAtHead(int value){
        Node temp = new Node(value);
        if(Head == null) Head = tail = temp;
        else{
           temp.next = Head;
           Head = temp;
        }
        size++;
    }
    void display(){
        Node temp = Head;
        if(Head == null) return;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void delete(){
        if(Head == null){
            System.out.println("List is empty! ");
            return;
        }
        Head = Head.next;
        if(Head == null){
            tail = null;
        }
        size--;
    }
//    boolean serch(int value){
//        Node temp = Head;
//        while(temp != null){
//            if(temp.val == value) return true;
//            temp = temp.next;
//        }
//        return false;
//    }
    int serch(int value){
        Node temp = Head;
        int idx = 0;
        while(temp != null){
            if(temp.val == value){
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }
    void insert(int val , int idx){
        if(idx < 0 || idx > size){
            System.out.println("Invalid Index !");
        }
//        else if(idx == 0)
    }
}
public class LinkedListData {
    public static void main(String[]args){
        Linkedlist1 ll = new Linkedlist1();
        ll.InsertAttail(10);
        ll.InsertAttail(20);
        ll.InsertAttail(30);
        ll.InsertAttail(40);
        ll.display();
//        ll.InsertAtHead(34);
//        ll.InsertAtHead(43);
//        ll.display();
//        ll.delete();
//        ll.display();
        System.out.println(ll.serch(20));
//        ll.display();
    }
}
