public class DoublyCircularLinkedList
{
    public Node head;
    public Node tail;
    public int size=0;
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
    
    public void printList() {
        Node currentNode = head;
        if (size>1) {
            while(currentNode.next != head) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }
        System.out.println(currentNode.data);
    }
    
    public void printBack() {
        Node currentNode = tail;
        if (size>1) {
            while(currentNode.prev!=tail) {
                System.out.print(currentNode.data +  " ");
                currentNode = currentNode.prev;
            }
        }
        System.out.println(currentNode.data);
    }
    
    public void addLast(int data) {
        Node newNode = new Node(data, null, null);
        if(head==null) {
            head = newNode;
            tail = newNode;
            size++;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            tail.prev = 
            tail = newNode;
            // tail.next = newNode;
            // newNode.next = head;
            // tail = newNode;
            size++;
        }
    }
    
    public void addAtIndex(int data, int index){
        Node newNode = new Node(data, null, null);
        Node currentNode = head;
        for(int i=0; i<index-1; i++) {
            currentNode = currentNode.next;
        }
        
    }
    
	public static void main(String[] args) {
	    DoublyCircularLinkedList list = new DoublyCircularLinkedList();
	    list.addLast(1);
	    list.addLast(2);
	    list.addLast(3);
	    list.addLast(4);
	    list.printList();
	    
	    list.addAtIndex(100,2);
	    list.addAtIndex(200,4);
	    list.printList();
	    list.printBack();
		System.out.println("===END===");
	}
}
