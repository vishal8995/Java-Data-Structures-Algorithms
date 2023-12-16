public class Main {

    public static void main(String[] args) {

        //=================================== Find Middle Node ======================================== //

        // LinkedList myLinkedList = new LinkedList(1);
        // myLinkedList.append(2);
        // myLinkedList.append(3);
        // myLinkedList.append(4);
        // myLinkedList.append(5);
        

        // System.out.println("1 -> 2 -> 3 -> 4 -> 5");
        // System.out.println( "Middle Node: "+ myLinkedList.findMiddleNode().value);
        
        
        // myLinkedList.append(6);
        
        
        // System.out.println("===========================");
        // System.out.println("1 -> 2 -> 3 -> 4 -> 5 -> 6");
        // System.out.println( "Middle Node: "+ myLinkedList.findMiddleNode().value);


        // /*
        //     EXPECTED OUTPUT:
        //     ----------------
        //     1 -> 2 -> 3 -> 4 -> 5
        //     Middle Node: 3
        //     ===========================
        //     1 -> 2 -> 3 -> 4 -> 5 -> 6
        //     Middle Node: 4

        // */

        //=================================== Detect Loop ============================================= //

        // LinkedList myLinkedList = new LinkedList(1);
        // myLinkedList.append(2);
        // myLinkedList.append(3);
        // myLinkedList.append(4);
        // myLinkedList.append(5);
        
        // // create a loop by connecting the tail to the second node
        // myLinkedList.getTail().next = myLinkedList.getHead().next;
        

        // System.out.println("Has Loop:");
        // System.out.println( myLinkedList.hasLoop());


        //=================================== Kth Node from End ======================================= //

        // LinkedList myLinkedList = new LinkedList(1);
        // myLinkedList.append(2);
        // myLinkedList.append(3);
        // myLinkedList.append(4);
        // myLinkedList.append(5);

        // int k = 2;
        // int result = myLinkedList.findKthFromEnd(k).value;

        // System.out.println(result); // Output: 4

        // /*
        //     EXPECTED OUTPUT:
        //     ----------------
        //     4
            
        // */


        //=================================== Partition List ========================================= //

        // // Create a new LinkedList and append values to it
        // LinkedList ll = new LinkedList(3);
        // ll.append(5);
        // ll.append(8);
        // ll.append(10);
        // ll.append(2);
        // ll.append(1);

        // // Print the list before partitioning
        // System.out.println("LL before partitionList:");
        // ll.printList(); // Output: 3 5 8 10 2 1

        // // Call the partitionList method with x = 5
        // ll.partitionList(5);

        // // Print the list after partitioning
        // System.out.println("LL after partitionList:");
        // ll.printList(); // Output: 3 2 1 5 8 10

        // /*
        //     EXPECTED OUTPUT:
        //     ----------------
        //     LL before partition_list:
        //     3
        //     5
        //     8
        //     10
        //     2
        //     1
        //     LL after partition_list:
        //     3
        //     2
        //     1
        //     5
        //     8
        //     10

        // */

        
        //=================================== Remove Duplicates ========================================= //

        // LinkedList myLinkedList = new LinkedList(1);

        // myLinkedList.append(1);
        // myLinkedList.append(2);
        // myLinkedList.append(2);
        // myLinkedList.append(3);
        // myLinkedList.append(3);
        // myLinkedList.append(3);
        // myLinkedList.append(4);

        // myLinkedList.removeDuplicates();

        // myLinkedList.printList();

        // /*
        //     EXPECTED OUTPUT:
        //     ----------------
        //     1
        //     2
        //     3
        //     4
            
        // */


        //=================================== Binary to Decimal ========================================= //

        // // ---------------
        // // Convert 1011 to 11
        // // ---------------
        // LinkedList list1 = new LinkedList(1);
        // list1.append(0);
        // list1.append(1);
        // list1.append(1);
        // System.out.println("Convert 1011 to 11:");
        // System.out.println("Input: 1 -> 0 -> 1 -> 1");
        // System.out.println("Output: " + list1.binaryToDecimal());
        // System.out.println("---------------");

        // // ---------------
        // // Convert 1100 to 12
        // // ---------------
        // LinkedList list2 = new LinkedList(1);
        // list2.append(1);
        // list2.append(0);
        // list2.append(0);
        // System.out.println("Convert 1100 to 12:");
        // System.out.println("Input: 1 -> 1 -> 0 -> 0");
        // System.out.println("Output: " + list2.binaryToDecimal());
        // System.out.println("---------------");

        // // ---------------
        // // Convert 1 to 1
        // // ---------------
        // LinkedList list3 = new LinkedList(1);
        // System.out.println("Convert 1 to 1:");
        // System.out.println("Input: 1");
        // System.out.println("Output: " + list3.binaryToDecimal());
        // System.out.println("---------------");

        // // ---------------
        // // Convert empty list to 0
        // // ---------------
        // LinkedList list4 = new LinkedList(0);
        // list4.makeEmpty();
        // System.out.println("Convert empty list to 0:");
        // System.out.println("Input: empty");
        // System.out.println("Output: " + list4.binaryToDecimal());
        // System.out.println("---------------");



        //=================================== Reverse Between ========================================= //

        // Create a linked list with values 1, 2, 3, 4, and 5
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        System.out.println("Original linked list: ");
        myLinkedList.printList();

        // Reverse a sublist within the linked list
        myLinkedList.reverseBetween(1, 3);
        System.out.println("\nReversed sublist (1, 3): ");
        myLinkedList.printList();

        // Reverse another sublist within the linked list
        myLinkedList.reverseBetween(0, 4);
        System.out.println("\nReversed entire linked list: ");
        myLinkedList.printList();

        // Reverse a sublist of length 1 within the linked list
        myLinkedList.reverseBetween(2, 2);
        System.out.println("\nReversed sublist of length 1 (2, 2): ");
        myLinkedList.printList();

        // Reverse an empty linked list
        LinkedList emptyList = new LinkedList(0);
        emptyList.makeEmpty();
        emptyList.reverseBetween(0, 0);
        System.out.println("\nReversed empty linked list: ");
        emptyList.printList();
        
        /*
            EXPECTED OUTPUT:
            ----------------
            Original linked list: 
            1
            2
            3
            4
            5
            
            Reversed sublist (1, 3): 
            1
            4
            3
            2
            5
            
            Reversed entire linked list: 
            5
            2
            3
            4
            1
            
            Reversed sublist of length 1 (2, 2): 
            5
            2
            3
            4
            1
            
            Reversed empty linked list: 
        
        */
    }

}