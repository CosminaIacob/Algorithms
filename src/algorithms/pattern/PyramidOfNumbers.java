package algorithms.pattern;

public class PyramidOfNumbers {

    private static void pyramidPattern1(int noOfRows) {

        int rowCount = 1;

        for (int i = noOfRows; i > 0; i--) {

            //Printing i spaces at the beginning of each row
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            //Printing rowCount value rowCount times at the end of each row
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(rowCount + " ");
            }

            System.out.println();

            rowCount++;
        }
    }

    private static void pyramidPAttern2(int noOfRows) {

        int rowCount = 1;

        //Printing i spaces at the beginning of each row
        for (int i = noOfRows; i > 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            //Printing rowCount++ value rowCount times at the end of each row
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
            rowCount++;
        }
    }

    private static void pyramidPattern3(int noOfRows) {

        int rowCount = 1;

        for (int i = noOfRows; i > 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= rowCount; j++) {
                System.out.print("*" + " ");
            }

            System.out.println();
            rowCount++;
        }
    }

    private static void pyramidPattern4(int noOfRows) {

        int rowCount = 1;

        for (int i = noOfRows; i > 0; i--) {

            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }

            for (int j = rowCount - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
            rowCount++;
        }
    }

    private static void pyramidPattern5(int noOfRows) {

        int rowCount = noOfRows;

        for (int i = 0; i < noOfRows; i++) {

            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }

            for (int j = rowCount - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
            rowCount--;
        }
    }

    private static void pyramidPattern6(int noOfRows) {

        int rowCount = 1;

        for (int i = noOfRows; i >= 1; i--) {

            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <= noOfRows; j++) {
                System.out.print(j + " ");
            }

            for (int j = noOfRows - 1; j >= i; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
            rowCount++;
        }
    }

    public static void main(String[] args) {

        pyramidPattern1(9);
        System.out.println();
        pyramidPAttern2(9);
        System.out.println();
        pyramidPattern3(9);
        System.out.println();
        pyramidPattern4(9);
        System.out.println();
        pyramidPattern5(9);
        System.out.println();
        pyramidPattern6(9);
    }
}
