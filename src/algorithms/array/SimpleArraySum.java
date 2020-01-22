package algorithms.array;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class SimpleArraySum {
    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        return IntStream.of(ar).sum();
    }

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        return LongStream.of(ar).sum();
    }

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        return  0;
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = Arrays.asList(0, 0);

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).compareTo(b.get(i)) > 0) {
                result.set(0, result.get(0) + 1);
            }
            if (a.get(i).compareTo(b.get(i)) < 0) {
                result.set(1, result.get(1) + 1);
            }
        }
        return result;
    }

    static int makeAnagram(String a, String b) {

        StringBuffer testString = new StringBuffer();
        for (Character c : a.toCharArray()) {
            String substr=a.substring(0,a.indexOf(c));
            if (b.contains(c.toString()) && !substr.contains(c.toString())) {
                testString.append(c);
            }
        }
        return (a.length() - testString.length()) + (b.length() - testString.length());
    }




    public static void main(String[] args) throws IOException {

//        int ar[] = {1, 2, 3};
//        System.out.println("SimpleArraySum: ");
//        System.out.println(simpleArraySum(ar));
//
//        long[] bigArray={1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
//        System.out.println("A very big sum:");
//        System.out.println(aVeryBigSum(bigArray));
//
//        List<Integer> a = Arrays.asList(5, 6, 7);
//        List<Integer> b = Arrays.asList(3, 6, 10);
//
//        System.out.println("Compare triplets a and b");
//        System.out.println(compareTriplets(a, b).stream().map(Object::toString).collect(Collectors.joining(" ")));
//
//        List<Integer> c = Arrays.asList(17, 28, 30);
//        List<Integer> d = Arrays.asList(99, 16, 8);
//
//        System.out.println("Compare triplets c and d");
//        System.out.println(compareTriplets(c, d).stream().map(Object::toString).collect(Collectors.joining(" ")));

//        System.out.println(countOccurrenceOfEachCharacterInString("aaabbrrrvttaerere"));

//        System.out.println("anbdsd".substring("anbdsd".indexOf('a')+1));

        System.out.println(makeAnagram("cde", "abc"));
        System.out.println(makeAnagram("cde", "dcf"));
        System.out.println(makeAnagram("cdee", "abec"));
    }

}
