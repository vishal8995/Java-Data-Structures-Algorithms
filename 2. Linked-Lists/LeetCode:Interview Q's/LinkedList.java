import java.util.HashSet;

public class LinkedList {

    //////////////////////////////// Linked List Definition for Coding Exercises 12, 13, 14 //////////////////////////////

    // private Node head;
    // private Node tail;

    // class Node {
    //     int value;
    //     Node next;

    //     Node(int value) {
    //         this.value = value;
    //     }
    // }

    // public LinkedList(int value) {
    //     Node newNode = new Node(value);
    //     head = newNode;
    //     tail = newNode;
    // }

    // public Node getHead() {
    //     return head;
    // }

    // public Node getTail() {
    //     return tail;
    // }

    // public void printList() {
    //     Node temp = head;
    //     while (temp != null) {
    //         System.out.println(temp.value);
    //         temp = temp.next;
    //     }
    // }

    // public void printAll() {
    //     if (head == null) {
    //         System.out.println("Head: null");
    //         System.out.println("Tail: null");
    //     } else {
    //         System.out.println("Head: " + head.value);
    //         System.out.println("Tail: " + tail.value);
    //     }
    //     System.out.println("\nLinked List:");
    //     if (head == null) {
    //         System.out.println("empty");
    //     } else {
    //         printList();
    //     }
    // }
    
    // public void makeEmpty() {
    //     head = null;
    //     tail = null;
    // }

    // public void append(int value) {
    //     Node newNode = new Node(value);
    //     if (head == null) {
    //         head = newNode;
    //         tail = newNode;
    //     } else {
    //         tail.next = newNode;
    //         tail = newNode;
    //     }
    // }


    //////////////////////////////// Linked List Definition for Coding Exercises 15, 16, 17, 18 //////////////////////////////

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
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
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        head = null;
        length = 0;
    }
    
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

	// // FIND MIDDLE NODE OF LIST //
    // public Node findMiddleNode(){
    //     if(head == null || tail == null){
    //         return null;
    //     }
    //     if (head == tail){
    //         return head;
    //     }
    //     Node tortoise = head;
    //     Node hare = head;
    //     while (hare.next != null && hare != null){
    //         tortoise = tortoise.next;
    //         if (hare.next.next == null){
    //             break;
    //         }
    //         hare = hare.next.next;
    //     }

    //     return tortoise;
    // }

    // // FIND IF LIST HAS LOOP //
    // public boolean hasLoop(){
    //     if(head == null || tail == null){
    //         return false;
    //     }
    //     if (head == tail){
    //         return false;
    //     }
    //     Node tortoise = head;
    //     Node hare = head;
    //     while (hare.next != null && hare != null){
    //         tortoise = tortoise.next;
    //         hare = hare.next.next;
    //         if (hare == tortoise){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // // FIND KTH FROM END OF LIST //
    // public Node findKthFromEnd(int k){

    //     int len = 0;
        
    //     if (head == null || tail == null) return null;
    //     else len ++;

    //     Node x = head, y = head;
    //     while (y.next != null){
    //         y = y.next;
    //         len ++;
    //         if (len > k) x = x.next;
    //     }

    //     if (k <= len) {
    //         return x;
    //     } else {
    //         return null;
    //     }
    // }

    // PARTITION THE LIST //
    public void partitionList(int x) {
    
        if (head == null) return;

        Node smallValueList = new Node(0);
        Node largeValueList = new Node(0);
        Node smallPointer = smallValueList;
        Node largePointer = largeValueList;
        Node current = head;

        while (current != null) {
            if (current.value < x) {
                smallPointer.next = current;
                smallPointer = current;
            } else {
                largePointer.next = current;
                largePointer = current;
            }
            current = current.next;
        }
        largePointer.next = null;
        smallPointer.next = largeValueList.next; // The 0 at the beginning of the list is removed
        head = smallValueList.next; // The 0 at the beginning of the list is removed and head points to the 'now - correct' first node

    }

    // Remove Duplicates //
    public void removeDuplicates() {

        if (head == null) return;

        Node current = head;
        Node previous = null;
        HashSet<Integer> valueSet = new HashSet<>();

        while (current != null) {
            
            if(valueSet.contains(current.value)){
                previous.next = current.next;
                length -= 1;
            } else {
                valueSet.add(current.value);
                previous = current;
            }

            current = current.next;
        }

    }

    // Binary to Decimal //
    public int binaryToDecimal(){

        if(head == null) return 0;

        Node temp = head;
        int num = 0;
        while (temp != null){
            num += temp.value * Math.pow(2, length-1);
            length--;
            temp = temp.next;
        }

        return num;
    }

    // Reverse Between //
    public void reverseBetween(int startIndex, int endIndex) {
                                        2               5
        if (head == null) return;
    
        1 2 3 4 5 6 7 8
        Node dummyNode = new Node(0);
        dummyNode.next = head;1
        Node previousNode = dummyNode;0

                                2
        for (int i = 0; i < startIndex; i++) {
            previousNode = previousNode.next;2
        }
    
        Node currentNode = previousNode.next;3
    
                                    3
        for (int i = 0; i < endIndex - startIndex; i++) {
            Node nodeToMove = currentNode.next;4
            currentNode.next = nodeToMove.next;
            nodeToMove.next = previousNode.next;
            previousNode.next = nodeToMove;
        }
    
        head = dummyNode.next;
    }

}

