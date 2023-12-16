import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;


public class Main {

    // WRITE THE REMOVEDUPLICATES METHOD HERE //
    public static List<Integer> removeDuplicates(List<Integer> list) {

        Set<Integer> set = new HashSet<>(list);
        List<Integer> newList = new ArrayList<>(set);
        return newList;
    }


    // public static void main(String[] args) {
    //     List<Integer> myList = List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5);
    //     List<Integer> newList = removeDuplicates(myList);
    //     System.out.println(newList);

    //     /*
    //         EXPECTED OUTPUT:
    //         ----------------
    //         [1, 2, 3, 4, 5, 6, 7, 8, 9]

    //         (Order may be different as sets are unordered)
    //     */
        
    // }

    // WRITE HASUNIQUECHARS METHOD HERE //
    public static boolean hasUniqueChars(String string) {
        Set<Character> set = new HashSet<>();
        for (char c : string.toCharArray()) {
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        
        return true;
    }


    // public static void main(String[] args) {
    //     System.out.println(hasUniqueChars("abcdefg")); // should return true
    //     System.out.println(hasUniqueChars("hello")); // should return false
    //     System.out.println(hasUniqueChars("")); // should return true
    //     System.out.println(hasUniqueChars("0123456789")); // should return true
    //     System.out.println(hasUniqueChars("abacadaeaf")); // should return false

    //     /*
    //         EXPECTED OUTPUT:
    //         ----------------
    //         true
    //         false
    //         true
    //         true
    //         false
            
    //     */
        
    // }

    // WRITE FINDPAIRS METHOD HERE // 
    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        List <int[]> resultList = new ArrayList<>();
        for (int num : arr2) {
            if (set.contains(target - num)) {
                resultList.add(new int[] {target - num, num});
            }
        }
        return resultList;
    }


    // public static void main(String[] args) {
    //     int[] arr1 = {1, 2, 3, 4, 5};
    //     int[] arr2 = {2, 4, 6, 8, 10};
    //     int target = 7;

    //     List<int[]> pairs = findPairs(arr1, arr2, target);
    //     for (int[] pair : pairs) {
    //         System.out.println(Arrays.toString(pair));
    //     }

    //     /*
    //         EXPECTED OUTPUT:
    //         ----------------
    //         [5, 2]
    //         [3, 4]
    //         [1, 6]
            
    //     */
        
    // }

    // WRITE LONGESTCONSECUTIVESEQUENCE METOHOD HERE //
    public static int longestConsecutiveSequence(int[] nums) {
        // TO BE IMPLEMENTED
        HashSet<Integer> checkSet = new HashSet<>();
        for (int num : nums) {
            checkSet.add(num);
        }
        int maxLength = 0;
        for (int num : nums) {
            if (!checkSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;
                while (checkSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentLength += 1;
                }
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        testLongestConsecutiveSequence("Consecutive Integers", new int[] {1, 2, 3, 4, 5}, 5);
        testLongestConsecutiveSequence("No Sequence", new int[] {1, 3, 5, 7, 9}, 1);
        testLongestConsecutiveSequence("Duplicates", new int[] {1, 2, 2, 3, 4}, 4);
        testLongestConsecutiveSequence("Negative Numbers", new int[] {1, 0, -1, -2, -3}, 5);
        testLongestConsecutiveSequence("Empty Array", new int[] {}, 0);
        testLongestConsecutiveSequence("Multiple Sequences", new int[] {1, 2, 3, 10, 11, 12, 13}, 4);
        testLongestConsecutiveSequence("Unordered Elements", new int[] {5, 1, 3, 4, 2}, 5);
        testLongestConsecutiveSequence("Single Element", new int[] {1}, 1);
        testLongestConsecutiveSequence("All Identical Elements", new int[] {2, 2, 2, 2, 2}, 1);
    }
    
    /**
     * Test method for longestConsecutiveSequence.
     * @param title Title of the test
     * @param nums Input array
     * @param expected Expected result
     */
    private static void testLongestConsecutiveSequence(String title, int[] nums, int expected) {
        System.out.println("Test: " + title);
        System.out.print("Testing array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    
        int result = longestConsecutiveSequence(nums);
        System.out.println("Expected longest streak: " + expected);
        System.out.println("Actual longest streak: " + result);
    
        if (result == expected) {
            System.out.println("PASS\n");
        } else {
            System.out.println("FAIL\n");
        }
    }
}
