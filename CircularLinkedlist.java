public class CircularLinkedList
{
    public Node head;
    public Node tail;
    public int size=0;
    class Node{
        int data;
        Node next;
            Node(int data, Node next){
                this.data = data;
                this.next = next;
            }
    }
    
    public void printList() {
        Node currentNode = head;
        //using size operator to check the lenght of the list
        if (size>1) {
            while(currentNode.next != head) {   //loop will continue till the !=head because there is no null in circularlist
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }
        System.out.println(currentNode.data);
    }
    
    public void addLast(int data) {
        Node newNode = new Node(data, null);
        if(head==null) {
            head = newNode;
            tail = newNode;
            size++;
        }
        else {
            tail.next = newNode;
            newNode.next = head;  //making link b/w head and the newly added node as circularlist
            tail = newNode;
            size++;
        }
    }
    
    public void addAtIndex(int data, int index){ //adding at index is same as single linkedlist
        Node newNode = new Node(data, null);
        Node currentNode = head;
        for(int i=0; i<index-1; i++) {
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        size++;
    }
    
	public static void main(String[] args) {
	    CircularLinkedList list = new CircularLinkedList();
	    list.addLast(1);
	    list.addLast(2);
	    list.addLast(3);
	    list.addLast(4);
	    list.printList();
	    
	    list.addAtIndex(100,2);
	    list.printList();
	    list.addAtIndex(200,4);
	    list.printList();
		System.out.println("===END===");
	}
}
