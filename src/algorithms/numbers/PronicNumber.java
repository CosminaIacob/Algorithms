package algorithms.numbers;

/**
 * Pronic number is a number which is the product of two consecutive integers i.e n(n+1).
 * the property of pronic numbers states that if n is a pronic number then sqrt(n) * (sqrt(n)+1) = n.
 */
public class PronicNumber {

    /**
     * Complexity: O(n)
     *
     * @param inputNumber
     * @return
     */
    private static boolean isPronicIterative(int inputNumber) {

        for (int i = 0; i < inputNumber; i++) {
            if (i * (i + 1) == inputNumber) {
                System.out.println(inputNumber + " is product of " + i + " and " + (i + 1));
                return true;
            }
        }

        return false;
    }

    /**
     * Complexity: O(1)
     */
    private static boolean isPronicSqrt(int input) {

        int squareRoot = (int) Math.sqrt(input);
        if (squareRoot * (squareRoot + 1) == input) {
            System.out.println(input + " is product of " + squareRoot + " and " + (squareRoot + 1));
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

        System.out.println("Iterative method: ");
        System.out.println(isPronicIterative(342));
        System.out.println();
        System.out.println("Using Math.sqrt: ");
        System.out.println(isPronicSqrt(342));
    }
}
