package algorithms.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersInString {

    public static Map countOccurrenceOfEachCharacterInString(String string) {

        Map<Character, Integer> counter = new HashMap<>();
        for (char c : string.toCharArray()) {
            if (!counter.containsKey(c)) {
                counter.put(c, 1);
            } else {
                counter.put(c, counter.get(c) + 1);
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        Map<Character, Integer> myMap=countOccurrenceOfEachCharacterInString("aadfrfaaadged");
        Set<Character> keysInMap=myMap.keySet();

        for(char c: keysInMap){
            System.out.println(c + ": "+ myMap.get(c));
        }

        System.out.println(countOccurrenceOfEachCharacterInString("aadfrfaaadged"));
    }
}
