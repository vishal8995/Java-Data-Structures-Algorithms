public class Main {

    public static void main(String[] args) {

        // // Constructor
        // DoublyLinkedList myDLL = new DoublyLinkedList(7);
        
        // myDLL.printAll();
        

        // /*
        //     EXPECTED OUTPUT:
        //     ----------------
        //     Head: 7
        //     Tail: 7
        //     Length: 1
            
        //     Linked List:
        //     7

        // */


        // // Append
        // DoublyLinkedList myDLL = new DoublyLinkedList(1);
        // myDLL.append(2);

        // myDLL.printAll();
        
        
        // /*
       	// 	EXPECTED OUTPUT:
        // 	----------------
        // 	Head: 1
        // 	Tail: 2
        // 	Length: 2
        
        // 	Doubly Linked List:
        // 	1
        // 	2
        
     	// */


        // // Remove Last
        // DoublyLinkedList myDLL = new DoublyLinkedList(1);
        // myDLL.append(2);

        // // (2) Items - Returns 2 Node
        // System.out.println(myDLL.removeLast().value);
        // // (1) Item - Returns 1 Node
        // System.out.println(myDLL.removeLast().value);
        // // (0) Items - Returns null
        // System.out.println(myDLL.removeLast());
        
        
    	// /*
        // 	EXPECTED OUTPUT:
        // 	----------------
        // 	2
        // 	1
        // 	null

     	// */

        // //Prepend
        // DoublyLinkedList myDLL = new DoublyLinkedList(2);
        // myDLL.append(3);

        // System.out.println("Before prepend():");
        // System.out.println("-----------------");
        // myDLL.printAll();

        // myDLL.prepend(1);

        // System.out.println("\n\nAfter prepend():");
        // System.out.println("----------------");
        // myDLL.printAll();
        
        
        // /*
        //     EXPECTED OUTPUT:
    
        //     Before prepend():
        //     -----------------
        //     Head: 2
        //     Tail: 3
        //     Length: 2
    
        //     Doubly Linked List:
        //     2
        //     3
    
    
        //     After prepend():
        //     ----------------
        //     Head: 1
        //     Tail: 3
        //     Length: 3
    
        //     Doubly Linked List:
        //     1
        //     2
        //     3

        // */

        // //Remove First
        // DoublyLinkedList myDLL = new DoublyLinkedList(2);
        // myDLL.append(1);
       
        // // (2) Items - Returns 2 Node
        // System.out.println(myDLL.removeFirst().value);
        // // (1) Item - Returns 1 Node
        // System.out.println(myDLL.removeFirst().value);
        // // (0) Items - Returns null
        // System.out.println(myDLL.removeFirst());


        // /*
        //     EXPECTED OUTPUT:
        //     ----------------
        //     2
        //     1
        //     null

        // */

        // //Get by Index
        // DoublyLinkedList myDLL = new DoublyLinkedList(0);
        // myDLL.append(1);
        // myDLL.append(2);
        // myDLL.append(3);


        // System.out.println(myDLL.get(3).value);


        // /*
        //     EXPECTED OUTPUT:
        //     ----------------
        //     3

        // */

        // // Set
        // DoublyLinkedList myDLL = new DoublyLinkedList(0);
        // myDLL.append(1);
        // myDLL.append(2);
        // myDLL.append(3);

        // System.out.println("DLL before set():");
        // myDLL.printList();

        // myDLL.set(2, 99);

        // System.out.println("\nDLL after set():");
        // myDLL.printList();

        
        // /*
        //     EXPECTED OUTPUT:
        //     ----------------
        //     DLL before set():
        //     0
        //     1
        //     2
        //     3
            
        //     DLL after set():
        //     0
        //     1
        //     99
        //     3

        // */

        //Insert
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(3);

        System.out.println("DLL before insert():");
        myDLL.printList();

        myDLL.insert(1, 2);

        System.out.println("\nDLL after insert(2) in middle:");
        myDLL.printList();

        myDLL.insert(0, 0);

        System.out.println("\nDLL after insert(0) at beginning:");
        myDLL.printList();

        myDLL.insert(4, 4);

        System.out.println("\nDLL after insert(4) at end:");
        myDLL.printList();


        /*
            EXPECTED OUTPUT:
            ----------------
            DLL before insert():
            1
            3

            DLL after insert(2) in middle:
            1
            2
            3

            DLL after insert(0) at beginning:
            0
            1
            2
            3

            DLL after insert(4) at end:
            0
            1
            2
            3
            4

        */
    }

}