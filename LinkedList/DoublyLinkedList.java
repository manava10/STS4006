
class Node{
    int data;
    Node next; 
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class DLL{
    Node head;
    Node tail;

    DLL(){
        head = null;
        tail = null;
    
    }
    public void insertionAtBeginning(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println(data + "  Has been inserted");
    }
    public void insertionAtLast(int data){
        Node newNode = new Node(data);
        if(tail==null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    //Insertion after a given node;
    public void insert(int pos, int data){
        Node newNode = new Node(data);
        Node curr = head; 
        while(--pos!=0 && curr!=null){
            curr = curr.next;   
        }
        if(pos==1){
            newNode.next = curr.next;
            newNode.prev = curr;
            curr.next = newNode;
            if(newNode.next!=null){
                newNode.next.prev = newNode;
            }
        }else{
            System.out.println("The given position is out of bound");
        }
    }
    public void printList(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        DLL linkedlist1 = new DLL();
        linkedlist1.insertionAtBeginning(10);
        linkedlist1.insertionAtBeginning(20);
        linkedlist1.insertionAtLast(15);
        linkedlist1.printList();
    } 
}


//This code is handling correctly . The insertion and printing of list.