import java.util.HashSet;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }
    
    public void append (int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length/2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

	// WRITE SWAPFIRSTLAST METHOD HERE //
	public void swapFirstLast() {
	    
        if (length < 2) {
            return;
	    }
        int temp = head.value;
        head.value = tail.value;
        tail.value = temp;
	}

    //Reverse
    public void reverse() {
        
        if (length < 2){
            return;
        }
        Node curr = head;
        Node temp = null;
        while (curr != null){
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }

        temp = head;
        head = tail;
        tail = temp;
    }

    // Palindrome DLL
    public boolean isPalindrome() {
        
        if (length < 2){            
            return true;
        }

        Node fp = head;
        Node lp = tail;
        for (int i =0; i < length/2; i++){
            if (fp.value != lp.value){
                return false;
            }
            fp = fp.next;
            lp = lp.prev;
        }
        return true;
    }

    // Swap Nodes in Pairs
    public void swapPairs() {
        Node dummyNode = new Node(0);
        dummyNode.next = head;
        Node previousNode = dummyNode;
    
        while (head != null && head.next != null) {
            Node firstNode = head;
            Node secondNode = head.next;
    
            previousNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
    
            secondNode.prev = previousNode;
            firstNode.prev = secondNode;
            
            if (firstNode.next != null) {
                firstNode.next.prev = firstNode;
            }
    
            head = firstNode.next;
            previousNode = firstNode;
        }
    
        head = dummyNode.next;
        if (head != null) head.prev = null;
    }
}

