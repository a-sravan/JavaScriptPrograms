public class DoublyLinkedList
{
    public Node head;
    public Node tail;
    class Node{
        int data;
        Node next;
        Node prev;
            Node(int data, Node next, Node prev){
                this.data = data;
                this.next = next;
                this.prev = prev;
            }
    }
    //print forward using head reference
    public void printList(){
        Node currNode = head;
        while(currNode!=null) {
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
        System.out.println();
    }
    //print backward using tail reference
    public void printBack() {
        Node currentNode = tail;
        //System.out.println(tail.data);
            while(currentNode != null) {
                System.out.print(currentNode.data +  " ");
                currentNode = currentNode.prev;
            }
        System.out.println();
    }
    
    public void addFirst(int data) {
        Node newNode = new Node(data, null, null);
        if(head==null){
            tail = newNode;
            head = newNode;
        }
        else{
            newNode.next = head;
            newNode.prev = null;
            head = newNode;
        }
    }
    
    public void addLast(int data) {
        Node newNode = new Node(data, null , null);
        if(head==null) {
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    
    public void addAtIndex(int data, int index) {
        Node newNode = new Node(data, null, null);
        Node currNode = head;
        for (int i=0; i<index-1; i++) {
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        newNode.prev = currNode;
        currNode.next = newNode;
    }
    
    public void deleteAtIndex(int index) {
        Node currNode = head;
        for(int i=0;i<index; i++) {
            currNode = currNode.next;
        }
        currNode.prev.next = currNode.next;
        currNode.next.prev = currNode.prev;
        
        // currNode.next = currNode.next.next;
        // currNode.next.next.prev = currNode;
    }
    
	public static void main(String[] args) {
	    DoublyLinkedList list = new DoublyLinkedList();
	    list.addFirst(1);
	    list.addFirst(2);
	    list.printList();
	    
	    list.addLast(3);
	    list.addLast(4);
	    list.printList();
	    
	    list.addAtIndex(100, 2);
	    list.printList();
	    list.addAtIndex(200, 4);
	    list.printList();
	    list.addAtIndex(300,5);
	    list.printList();
	    
	    list.deleteAtIndex(4);
	    list.printList();
	    list.printBack();
		System.out.println("===END===");
	}
}
