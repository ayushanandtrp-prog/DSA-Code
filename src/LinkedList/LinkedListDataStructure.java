package LinkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class Linkedlist{
    Node tail;
    Node Head;
    void AddAtTail(int value){
        Node temp = new Node(value);
        if(tail == null) Head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
    }
    void display(){
        Node temp = Head;
        if(Head == null) return;
        while(temp != null){
            System.out.println(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedListDataStructure {
    public static void main(String[]args){
        Linkedlist ll = new Linkedlist();
        ll.AddAtTail(10);
        ll.AddAtTail(20);
        ll.AddAtTail(30);
        ll.AddAtTail(40);
        ll.display();
    }
}
