class Node{
    int value;
    Node next;
    Node(int data){
        this.value = data;
        this.next = null;
    }
}
class LL{
    Node head;
    //Insertion at beginning 
    void insertionBegin (int value){
        Node newnode = new Node(value);
        if(head==null){
            head=newnode;
            System.out.println("A new node has been created as head");
        }else{
            newnode.next=head;
            head = newnode;
            System.out.println("Insertion has been done at beginning");
        }
    }
    void insertionLast(int value){
        //We have to create a new node as usual 
        Node newnode = new Node(value);
        if(head==null){
            head=newnode;
            System.out.println("A new node has been created as head");
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next = newnode;

            System.out.println("Insertion has been done at last");
        }
    }
    void insertionAtIndex(int value,int index){
        

    }
    void printList(){
        Node temp = head;
        if(head==null){
            System.out.println("The linked list is empty ");
        }
        else{
            while(temp!=null){
                if(temp.next!=null){
                    System.out.print(temp.value + "->");
                }else{
                    System.out.println(temp.value);
                }
                temp = temp.next;
                
            }
        }
        System.out.println();
    }
}
public class LinkedListEx{
    public static void main (String[] args){
        LL LinkedList1 = new LL();
        int[] array = {2,5,7,8,10,33};
        for(int i=0; i<array.length; i++){
            LinkedList1.insertionBegin(array[i]);
            LinkedList1.printList();
        }
        LinkedList1.insertionLast(12);
        LinkedList1.printList();
    }
}