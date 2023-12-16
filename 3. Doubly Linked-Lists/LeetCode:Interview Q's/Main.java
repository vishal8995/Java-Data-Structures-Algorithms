public class Main {

    public static void main(String[] args) {

        // //Swap First and Last
        // DoublyLinkedList myDLL = new DoublyLinkedList(1);
        // myDLL.append(2);
        // myDLL.append(3);
        // myDLL.append(4);
        // myDLL.append(5);
        
        // System.out.println("DLL before swap:");
        // myDLL.printList();
        
        // myDLL.swapFirstLast();
        
        // System.out.println("\nDLL after swap:");
        // myDLL.printList();
        
        
        // /*
       	// 	EXPECTED OUTPUT:
        // 	----------------
        //     DLL before swap:
        //     1
        //     2
        //     3
        //     4
        //     5
            
        //     DLL after swap:
        //     5
        //     2
        //     3
        //     4
        //     1
        
     	// */


        //Reverse
        // DoublyLinkedList myDLL = new DoublyLinkedList(1);
        // myDLL.append(2);
        // myDLL.append(3);
        // myDLL.append(4);
        // myDLL.append(5);
        
        // System.out.println("DLL before reverse:");
        // myDLL.printList();
        
        // myDLL.reverse();
        
        // System.out.println("\nDLL after reverse:");
        // myDLL.printList();
        
        
        // /*
       	// 	EXPECTED OUTPUT:
        // 	----------------
        //     DLL before reverse:
        //     1
        //     2
        //     3
        //     4
        //     5
            
        //     DLL after reverse:
        //     5
        //     4
        //     3
        //     2
        //     1
        
     	// */

        // // Palindrome Checker
        // DoublyLinkedList myDLL1 = new DoublyLinkedList(1);
        // myDLL1.append(2);
        // myDLL1.append(3);
        // myDLL1.append(2);
        // myDLL1.append(1);
         
        // System.out.println("myDLL1 isPalindrome:");
        // System.out.println( myDLL1.isPalindrome() );
         
         
         
        // DoublyLinkedList myDLL2 = new DoublyLinkedList(1);
        // myDLL2.append(2);
        // myDLL2.append(3);
         
        // System.out.println("\nmyDLL2 isPalindrome:");
        // System.out.println( myDLL2.isPalindrome() );
         
         
         
        //  /*
        //         EXPECTED OUTPUT:
        //      ----------------
        //      DLL before swap:
        //      1
        //      2
        //      3
        //      4
        //      5
             
        //      DLL after swap:
        //      5
        //      2
        //      3
        //      4
        //      1
         
        //   */

        // Swap Nodes in Pairs
        DoublyLinkedList myDll = new DoublyLinkedList(1);
        myDll.append(2);
        myDll.append(3);
        myDll.append(4);

        System.out.println("myDll before swapPairs:");
        myDll.printList();

        myDll.swapPairs();

        System.out.println("\nmyDll after swapPairs:");
        myDll.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            myDll before swapPairs:
            1 <-> 2 <-> 3 <-> 4
            
            myDll after swapPairs:
            2 <-> 1 <-> 4 <-> 3

        */
    }
    
}