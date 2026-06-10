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
    int size;
    void AddAtHead(int value){
        Node temp = new Node(value);
        if(Head == null) Head = tail = temp;
        else{
            temp.next = Head;
            Head = temp;
        }
        size++;
    }
    void AddAtTail(int value){
        Node temp = new Node(value);
        if(tail == null) Head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void DeleteAtHead(){
        if(Head == null){
            System.out.println("Lis is Empty! ");
            return;
        }
        Head = Head.next;
        if(Head == null){
            tail = null;
        }
        size--;
    }
    void display(){
        Node temp = Head;
        if(Head == null) return;
        while(temp != null){
            System.out.print(temp.val +" ");
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
        ll.AddAtHead(50);
        ll.AddAtHead(60);
        ll.display();
        ll.DeleteAtHead();
        ll.display();
        System.out.print(ll.size);
    }
}
