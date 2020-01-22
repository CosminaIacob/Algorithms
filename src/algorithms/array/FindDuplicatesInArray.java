package algorithms.array;

import java.util.*;

public class FindDuplicatesInArray {

    // Driver program
    public static void main(String[] args) {
        FindDuplicatesInArray duplicate = new FindDuplicatesInArray();
        int arr[] = {1, 2, 3, 1, 3, 6, 6};
        int arrSum[] = {1, 4, 45, 6, 10, 8};
        int arr_size = arr.length;

        Arrays.sort(arr);

////        duplicate.printRepeating(arr, arr_size);
//        System.out.println("Array: ");
//        findDuplicates(arr);
//
//        System.out.println();
//        System.out.println("String: ");
//        findDuplicates("aaabdccskggh");

//        countOccurrence("aaabdccskggh");
//        countOccurrence(arr);

//        printPairs(arrSum, 16);
        printPairsSimpleList(arrSum, 16);

    }

    public static void findDuplicates(int[] arr) {

        Set<Integer> arraySet = new HashSet<>();

        System.out.println("Duplicates are: ");
        for (int i = 0; i < arr.length; i++) {
            if (arraySet.add(arr[i]) == false) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void findDuplicates(String myString) {

        Set<Character> charSet = new HashSet<>();
        Set<Character> resultSet = new HashSet<>();

        char[] charArray = myString.toCharArray();

        for (char i : myString.toCharArray()) {
            if (charSet.add(i) == false) {
                resultSet.add(i);
            }
        }
        System.out.println(resultSet);
    }

    private static void countOccurrence(String input) {

        HashMap<Character, Integer> counter = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (!counter.containsKey(c)) {
                counter.put(c, 1);
            } else {
                counter.put(c, counter.get(c) + 1);
            }
        }

        System.out.println(counter);
    }

    private static void countOccurrence(int[] input) {

        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i : input) {
            if (!result.containsKey(i)) {
                result.put(i, 1);
            } else {
                result.put(i, result.get(i) + 1);
            }
        }

        System.out.println(result);
    }

    private static void printPairs(int[] arr, int sum) {

        HashSet<Integer> mySet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i];
            if (mySet.contains(temp)) {
                System.out.println(arr[i] + " " + temp);
            }
            mySet.add(arr[i]);
        }
    }

    private static void printPairsSimpleList(int[] arr, int sum) {

        List<Integer> mySet = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i];
            if (mySet.contains(temp)) {
                System.out.println(arr[i] + " " + temp);
            }
            mySet.add(arr[i]);
        }
    }
}
