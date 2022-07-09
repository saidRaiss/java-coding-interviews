
import java.util.*;

public class Main {

    public static void main(String[] args) {
        assertResult(true, solution("ABBDCA", 2));
        assertResult(true, solution("BAAABDBB", 3));
        assertResult(false, solution("BAABDB", 3));
        assertResult(true, solution("CABDDACCCA", 2));
        assertResult(true, solution("CABDACCCA", 2));
    }

    /**
     * Proposed solution
     * @param sequence of letters
     * @param n number of repetitions
     * @return boolean
     */
    public static boolean solution(String sequence, int n) {
        if(sequence == null) {
            return false;
        }
        for(char letter : CharHelper.toSet(sequence.toCharArray())) {
            String nLetter = CharHelper.nRepeat(letter, n);
            if(sequence.contains(nLetter)) {
                return true;
            }
        }
        return false;
    }

    /**
     * CharHelper interface is a helper to manipulate the characters
    */
    public interface CharHelper {

        /**
         * To generate a string from repeated characters of N times
         * @param c char
         * @param n number of repeated times
         * @return a string
         * e.g. nRepeat('A', 3) -> "AAA"
         */
        static String nRepeat(char c, int n) {
            char[] arrayChar = new char[n];
            for(int i = 0; i < n; i++) {
                arrayChar[i] = c;
            }
            return new String(arrayChar);
        }
        /**
         * To create a set of Characters from an array of chars.
         * To remove double chars in array.
         * @param chars
         * @return Set of Character
         * e.g. toSet({'A', 'A', 'B', 'B'}) -> Set of Character {'A', 'B'}
         */
        static Set<Character> toSet(char[] chars) {
            Set<Character> setChar = new HashSet<>();
            for(char c : chars) {
                setChar.add(c);
            }
            return setChar;
        }
    }

    /**
     * To test the result of implemented solution
     * @param expected
     * @param actual
     */
    public static void assertResult(boolean expected, boolean actual) {
        if(expected != actual) {
            throw new FunctionalError("Test failed!");
        }
    }

    /**
     * Custome Runtime Exception
     */
    public static class FunctionalError extends RuntimeException {
        public FunctionalError(String message) {
            super(message);
        }
    }
}