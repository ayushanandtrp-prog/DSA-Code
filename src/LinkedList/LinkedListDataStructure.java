package LinkedList;

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
            System.out.println("List is Empty! ");
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
    void insert(int val , int idx){
        if(idx < 0 || idx > size){
            System.out.println("Invalid Index ! ");
            return;
        }
        else if(idx == 0){
            AddAtHead(val);
        } else if(idx == size){
            AddAtTail(val);
        }
        else {
            Node temp = Head;
            for(int i = 1 ; i < idx-1 ; i++){
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }
    void Delete(int idx){
        if(idx < 0 || idx >= size){
            System.out.println("Invalid Index ! ");
            return;
        }
        if(idx == 0){
            DeleteAtHead();
            return;
        }
        Node temp = Head;
        for(int i = 1 ; i <= idx-1 ; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(idx == size-1) tail = temp;
        size--;
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
        ll.insert(56 , 3);
        ll.display();
        ll.Delete(3);
        ll.display();
    }
}
