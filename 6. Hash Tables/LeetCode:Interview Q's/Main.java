import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    // WRITE THE ITEMINCOMMON METHOD HERE //
    public static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i : array1) {
            map.put(i, true);
        }
        for (int j : array2) {
            if (map.get(j) != null) return true;
        }
        return false;
    }
    

    // public static void main(String[] args) {

    //     int[] array1 = {1, 3, 5};
    //     int[] array2 = {2, 4, 5};

    //     System.out.println(itemInCommon(array1, array2));
        
    //     /*
    //         EXPECTED OUTPUT:
    //         ----------------
    //         true

    //     */


    // WRITE THE FINDDUPLICATES METHOD HERE // 
    public static ArrayList<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> numCountMap = new HashMap<>();
        for ( int num : nums) {
            numCountMap.put(num, numCountMap.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : numCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }

    // public static void main(String[] args) {

    //     int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
    //     List<Integer> duplicates = findDuplicates(nums);
    //     System.out.println(duplicates); 
        
    //     /*
    //         EXPECTED OUTPUT:
    //         ----------------
	// 		[1, 2, 4]

    //     */
        
    // }

    // WRITE FIRSTNONREPEATINGCHAR METHOD HERE //
    public static Character firstNonRepeatingChar (String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }


    // public static void main(String[] args) {
    //     System.out.println(firstNonRepeatingChar("leetcode"));
    //     System.out.println(firstNonRepeatingChar("hello"));
    //     System.out.println(firstNonRepeatingChar("aabbcc"));
        
    //     /*
    //         EXPECTED OUTPUT:
    //         ----------------
    //         l
    //         h
    //         null

    //     */
        
    // }

    // WRITE GROUPANAGRAMS METHOD HERE // 
    private static List<List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> stringFrequencyMap = new HashMap<>();
        for (String s : strings) {
            String stringFrequency = getSortedStringFrequency(s);

            if (stringFrequencyMap.containsKey(stringFrequency)) {
                stringFrequencyMap.get(stringFrequency).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                stringFrequencyMap.put(stringFrequency, list );
            }
        }
        return new ArrayList<>(stringFrequencyMap.values());
    }
    

    private static String getSortedStringFrequency(String s) {
        int [] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder freqString = new StringBuilder();
        for (int i : freq) {
            char c = 'a';
            freqString.append(c).append(i);
            c++;
        }
        return freqString.toString();
    }


    // public static void main(String[] args) {
    //     System.out.println("1st set:");
    //     System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

    //     System.out.println("\n2nd set:");
    //     System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

    //     System.out.println("\n3rd set:");
    //     System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

    //     /*
    //         EXPECTED OUTPUT:
    //         ----------------
    //         1st set:
    //         [[eat, tea, ate], [tan, nat], [bat]]

    //         2nd set:
    //         [[abc, cba, bac], [foo], [bar]]

    //         3rd set:
    //         [[listen, silent], [triangle, integral], [garden, ranged]]

    //     */
    // }

    // WRITE THE TWOSUM MEHTOD HERE //
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                return new int[] {map.get(difference), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
    

    // public static void main(String[] args) {
    //     System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    //     System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    //     System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    //     System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
    //     System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
    //     System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
    //     System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));

    //     /*
    //         EXPECTED OUTPUT:
    //         ----------------
    //         [0, 1]
    //         [1, 2]
    //         [0, 1]
    //         []
    //         [2, 3]
    //         [0, 1]
    //         []

    //     */
    // }

    // WRITE SUBARAYSUM METHOD HERE //
    public static int [] subarraySum(int[] nums, int target) {
        int sum = 0, left = 0;
        for (int right = 0; right < nums.length; right++) {
            sum = sum + nums[right];
            System.out.println("Added Sum = " + sum);
            System.out.println("Left: " + left + " Right: " + right);
            while (sum > target) {
                sum = sum - nums[left];
                System.out.println("Subtracted Sum = " + sum);
                System.out.println("Left: " + left + " Right: " + right);
                left++;
            }
            if (sum == target) {
                System.out.println("Left: " + left + " Right: " + right);
                return new int[] {left, right};
            }
            System.out.println("Left: " + left + " Right: " + right);
        }
        return new int[] {};
    }


    public static void main(String[] args) {
        // int[] nums1 = {1, 2, 3, 4, 5};
        // int target1 = 9;
        // int[] result1 = subarraySum(nums1, target1);
        // System.out.println("[" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {-1, 2, 3, -4, 5}; // Test Case Failing
        int target2 = 0;
        int[] result2 = subarraySum(nums2, target2);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");

        // int[] nums3 = {2, 3, 4, 5, 6};
        // int target3 = 3;
        // int[] result3 = subarraySum(nums3, target3);
        // System.out.println("[" + result3[0] + ", " + result3[1] + "]");

        // int[] nums4 = {};
        // int target4 = 0;
        // int[] result4 = subarraySum(nums4, target4);
        // System.out.println("[]");
        
        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 3]
            [0, 3] // Test Case Failing
            [1, 1]
            []
    
        */
    }

}