
public class StackUsingLinkedlist
{
    public Node top;
    class Node{
        int data;
        Node link;
            Node(int data, Node link) {
                this.data = data;
                this.link = link;
            }
    }
    
    //To print the complete stack values
    public void printStack() {
        Node currentNode = top;
        if (top==null) {
            System.out.println("Stack is empty/underflow");
        }
        while(currentNode!=null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.link;
        }
        System.out.println();
    }
    
    //peek used to find the top element of the stack
    public void peek(){
        if(top==null) {
            System.out.println("stack is empty");
            return;
        }
        else {
            System.out.println("The top(peek) element of the stack is: " + top.data);
        }
    }
    
    public void push(int data) {
        Node newNode = new Node(data, null);
        if (newNode==null) {
            System.out.println("Stack is overflow");
        }
        
        newNode.link = top;
        
        top = newNode;
    }
    
    public void pop() {
        if (top==null) {
            System.out.println("Stack is empty/underflow");
            return;
        }
        
        top = top.link;
     }
    
	public static void main(String[] args) {
	    StackUsingLinkedlist stk = new StackUsingLinkedlist();
	    stk.push(1);
	    stk.push(2);
	    stk.push(3);
	    stk.peek();
	    stk.printStack();
	    
	    stk.pop();
	    stk.printStack();
	    stk.pop();
	    stk.printStack();
	    stk.pop();
	    stk.printStack();
		System.out.println("===END===");
	}
}
