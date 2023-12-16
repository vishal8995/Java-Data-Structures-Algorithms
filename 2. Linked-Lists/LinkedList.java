public class LinkedList {

    //Inner Class for Node
	class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int length = 0;

    //Constructor for LinkedList Creation
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length++;
    }
	
    //Print the entire List
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    // Get the head of the list
    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    //Get the tail of the list
    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    //Get the length of the list
    public void getLength() {
        System.out.println("Length: " + length);
    }

    //Append value at the end of the list
    public void append(int value){
        Node newNode = new Node(value);
        if (head == null || length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++; 
    }

    //Remove Last Node
    public Node removeLast() {

        if (length == 0) return null;

        Node temp = head;
        Node pre = head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    //Prepend value at the beginning of the list
    public void prepend(int value){

        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = head;
        }else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    //Remove First Node
    public Node removeFirst() {

        if (length == 0) return null;

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0){
            tail = null;
        }
        return temp;
    }

    // Get Node at a particular index
    public Node get(int index) {
        if(index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Update value at a particular index
    public boolean set (int index, int value) {
        Node temp = get(index);

        if (temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    //Insert a new Node in the List
    public boolean insert(int index, int value) {
        if(index < 0 || index > length) return false; // Index can not be equal to length, just greater than it

        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    //Remove a Node from the list based on the index
    public Node remove(int index) {
        if(index < 0 || index >= length) return null;

        if(index == 0) return removeFirst();

        if(index == length - 1) return removeLast();

        Node prev = get(index - 1); //O(n)
        Node temp = prev.next; //O(1)
        prev.next = temp.next;
        temp.next = null;
        length--;

        return temp;
    }

    //Reverse a given Linked List
    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node suc = temp.next;
        Node pre = null;
        for(int i=0; i<length; i++){
            suc = temp.next;
            temp.next = pre;
            pre = temp;
            temp = suc;
        }
    }
}