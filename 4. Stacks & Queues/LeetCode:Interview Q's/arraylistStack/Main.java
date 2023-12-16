public class Main {

    // Stack; Not Working for Balanced Parentheses
    public static void main(String[] args) {

        // // Push
        // Stack myStack = new Stack();
        
        // myStack.push(1);
        // myStack.push(2);
        // myStack.push(3);
        
        // myStack.printStack();
        
        // /*
        //     EXPECTED OUTPUT:
		// 	3
		// 	2
		// 	1

        // */

        // // Pop
        // Stack myStack = new Stack();
        // myStack.push(1);
        // myStack.push(2);
        // myStack.push(3);
        
        // System.out.println("Stack before pop():");
        // myStack.printStack();
        
        // System.out.println("\nPopped node:");
        // System.out.println(myStack.pop());
        
        // System.out.println("\nStack after pop():");
        // myStack.printStack();
 
        // /*
        //     EXPECTED OUTPUT:
        //     Stack before pop():
        //     3
        //     2
        //     1
            
        //     Popped node:
        //     3
            
        //     Stack after pop():
        //     2
        //     1

        // // */

        // // Reverse String Main
        // String myString = "hello";
        // String reversedString = reverseString(myString);
        // System.out.println(reversedString);

        // /*
        //     EXPECTED OUTPUT:
        //     ----------------
        //     olleh
        // */

        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(4);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();
 
        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3
            
            After sorting:
            1
            2
            3
            4
            5

        */

    }


    // // Balanced Parentheses Main
    // public static void main(String[] args) {
    //     testAndPrint("()", true);
    //     testAndPrint("()()", true);
    //     testAndPrint("(())", true);
    //     testAndPrint("()()()", true);
    //     testAndPrint("(()())", true);
    //     testAndPrint(")()(", false);
    //     testAndPrint(")(", false);
    //     testAndPrint("(()", false);
    //     testAndPrint("))", false);
    //     testAndPrint("(", false);
    //     testAndPrint(")", false);
    // }
    
    // public static void testAndPrint(String testStr, boolean expected) {
    //     // Run the test and store the result
    //     boolean result = isBalancedParentheses(testStr);
        
    //     // Print the test string, expected result, and actual result
    //     System.out.println("Test String: " + testStr);
    //     System.out.println("EXPECTED: " + expected);
    //     System.out.println("RESULT: " + result);
        
    //     // Check if the test passed or failed
    //     if (result == expected) {
    //         System.out.println("STATUS: PASS");
    //     } else {
    //         System.out.println("STATUS: FAIL");
    //     }
        
    //     // Print a separator for better readability
    //     System.out.println("--------------");
    // }


    // Sort Stack
    public static void sortStack(Stack<Integer> stack) {

        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()){

            int temp = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                
                stack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }

        while (!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }

    }


    // Balanced Parentheses
    public static boolean isBalancedParentheses(String testStr) {

        Stack<Character> stack = new Stack<>();
        for (char c: testStr.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    // Reverse String Function
    public static String reverseString(String str) {

        Stack<Character> stack = new Stack<>(); 
        String reversedString = ""; 

        // // Using String and charAt
        // for (int i = str.length() - 1; i >= 0; i--) {
        //     reversedString += str.charAt(i);
        // }

        // Using Stack
        for (char c: str.toCharArray()) {
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            reversedString += stack.pop();
        }

        return reversedString;
    }

}