package algorithms.string;

public class RemoveWhiteSpacesFromString {

    private static String removeWhiteSpaces(String input){

        return input.replaceAll("\\s+", ""); //sau chiar " "
    }

    public static void main(String[] args) {

        System.out.println(removeWhiteSpaces("ana are mere "));
    }
}
