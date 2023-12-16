public class DoublyLinkedList {

    // CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //

    Node head;
    Node tail;
    int length;

	class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
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

    // Append
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    // Remove Last
    public Node removeLast() {
        if (length == 0) {
            return null;
        } else if (length == 1) {
            Node temp = head;
            head = null;
            tail = null;
            length--;
            return temp;
        } else {
            Node temp = tail;
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
            length--;
            return temp;
        }

    }

    // Prepend
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    //Remove First
    public Node removeFirst() {
        if (length == 0) {
            return null;
        } else if (length == 1) {
            Node temp = head;
            head = null;
            tail = null;
            length--;
            return temp;
        } else {
            Node temp = head;
            head = head.next;
            head.prev = null;
            temp.next = null;
            length--;
            return temp;
        }
    }

    // Get by Index
    public Node get(int index) {
        if(index <0 || index >= length) return null;

        if (index <= length/2) {
            Node temp = head;
            for(int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            Node temp = tail;
            for(int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
            return temp;
        }
    }

    // Set by Index
    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    // Insert
    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        } else if (index == length) {
            append(value);
            return true;
        } else {
            Node newNode = new Node(value);
            Node temp = get(index);
            temp.prev = newNode;
            newNode.next = temp;
            newNode.prev = temp.prev;
            temp.prev.next = newNode;
            length++;
            return true;
        }
    }

    //Remove
    public Node remove (int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        else if (index == length - 1) return removeLast();
        else {
            Node temp = get(index);
            Node before = temp.prev;
            Node after = temp.next;
            before.next = after;
            after.prev = before;
            temp.next = null;
            temp.prev = null;
            length--;
            return temp;
        }
    }
}

