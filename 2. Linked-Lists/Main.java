public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(11);
        myLinkedList.append(13);
        myLinkedList.append(23);
        myLinkedList.append(7);

        myLinkedList.reverse();

        System.out.println("\nLinked List:");
        myLinkedList.printList();
    }

}