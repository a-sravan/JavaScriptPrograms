
public class LinkedList
{   
    public Node head;
    public Node tail;
    class Node {
        int data;
        Node next;
            Node(int data, Node next) {
                this.data = data;
                this.next = next;
            }
    }
    
    //printing
    public void printList() {
        Node currentNode =  head;
        while(currentNode != null) {
            System.out.print(currentNode.data+ " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
    
    //add First Node
    public void addFirst(int data) {
        Node newNode = new Node(data, null);
        if (head==null) {
            tail = newNode;
        }
        else {
            newNode.next = head;
        }
        head = newNode;
    }
    
    //add Last Node
    public void addLast(int data) {
        Node newNode = new Node(data, null);
        if (head==null) {
            head = newNode;
        }
        else {
            tail.next = newNode;
        }
        tail = newNode;
        // Node newNode = new Node(data, null);
        // if (head==null) {
        //     head = newNode;
        // }
        // else {
        //     Node currentNode = head;
        //     while(currentNode.next!=null) {
        //         currentNode = currentNode.next;
        //     }
        //     currentNode.next = newNode;
        // }
    }
    
    public void addAtIndex(int data, int index){
        Node newNode = new Node(data, null);
        Node currentNode = head;
        
        for(int i=0; i<index-1 && currentNode!=null; i++) {
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        
        // while(index-1 > 0 && currentNode!=null) {
        //     currentNode = currentNode.next;
        //     index++;
        // }
    }
    
    
    
	public static void main(String[] args) {
	    LinkedList list = new LinkedList();
	    list.addFirst(1);
	    list.addFirst(2);
	    list.addFirst(3);
	    list.printList();
	    
	    list.addLast(4);
	    list.addLast(5);
	    list.printList();
	    
	    list.addAtIndex(10, 2);
	    list.printList();
	    
	    //list.deleteFirst(2);
	    
	}
}
