package algorithms.string;

public class ReverseString {

    public static String usingStringBufferReverse(String inputString) {
        return new StringBuffer(inputString).reverse().toString();
    }

    public static String usingIterativeMethod(String inputString) {

        char[] stringArray = inputString.toCharArray();
        StringBuffer result = new StringBuffer();

        for (int i = stringArray.length - 1; i >= 0; i--) {
            result.append(stringArray[i]);
        }

        return result.toString();
    }

    public static String reverseStringRecursive(String inputString) {
        if ((null == inputString) || inputString.length() <= 1) {
            return inputString;
        }
        return reverseStringRecursive(inputString.substring(1)) + inputString.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println("Using StringBuffer reverse: " + usingStringBufferReverse("abcd"));
        System.out.println("Iterative: " + usingIterativeMethod("abcd"));
        System.out.println("Recursive: " + reverseStringRecursive("abcd"));
        System.out.println("Recursive: " + reverseStringRecursive("a"));
        System.out.println("Recursive: " + reverseStringRecursive(null));
    }
}
