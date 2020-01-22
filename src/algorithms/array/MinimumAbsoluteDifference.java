package algorithms.array;

import java.util.Arrays;

public class MinimumAbsoluteDifference {

    /**
     * Complexity: O(nlog(n)), beacuse this is the cmplexity of Arrays.sort() and here we only have a for (meaning O(n))
     *
     * @param arr
     */
    private static void minimumDifferenceWithSort(int[] arr) {

        Arrays.sort(arr);

        int firstElem = arr[0];
        int secondeElem = arr[1];
        int min = Math.abs(secondeElem - firstElem);

        for (int i = 2; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) < min) {
                min = Math.abs(arr[i] - arr[i - 1]);

                firstElem = arr[i - 1];
                secondeElem = arr[i];
            }

        }

        System.out.println("Minimum: " + min);
        System.out.println("Pair: " + firstElem + " " + secondeElem);
    }

    /**
     * Complexity: O(n2).
     * @param arr
     */
    public static void minimumDifferenceWithoutSort(int[] arr) {

        int min = arr[1] - arr[0];
        int firstElem = arr[0];
        int secondElem = arr[1];

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) < min) {
                    min = Math.abs(arr[i] - arr[j]);
                    firstElem = arr[i];
                    secondElem = arr[j];
                }
            }
        }


        System.out.println("Minimum: " + min);
        System.out.println("Pair: " + firstElem + " " + secondElem);
    }

    public static void main(String[] args) {

        int[] arr = {-89, -62, -57, 12, 31, 45};
        int[] anotherArr = {0, 2, 4, 5, 8, 9};

        minimumDifferenceWithSort(arr);
        System.out.println();
        minimumDifferenceWithSort(anotherArr);
        System.out.println();

        minimumDifferenceWithoutSort(arr);
        System.out.println();
        minimumDifferenceWithoutSort(anotherArr);
    }

}
