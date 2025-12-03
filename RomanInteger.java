import java.util.*;
import java.util.Map;

public class RomanInteger {
    private static final Map<Character, Integer> VAL = new HashMap<>();
    static {
        VAL.put('I', 1);
        VAL.put('V', 5);
        VAL.put('X', 10);
        VAL.put('L', 50);
        VAL.put('C', 100);
        VAL.put('D', 500);
        VAL.put('M', 1000);
    }

    // Convert Roman numeral to integer. Throws IllegalArgumentException for invalid input.
    public int romanToInt(String s) {
        if (s == null || s.isEmpty()) throw new IllegalArgumentException("Input is null/empty");

        s = s.toUpperCase(Locale.ROOT);
        int total = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            Integer val = VAL.get(ch);
            if (val == null) throw new IllegalArgumentException("Invalid Roman numeral character: " + ch);

            if (val < prev) total -= val;
            else total += val;
            prev = val;
        }
        return total;
    }

    // quick tests
    public static void main(String[] args) {
        RomanInteger r = new RomanInteger();
        String[] tests = {"III", "IV", "IX", "LVIII", "MCMXCIV", "mmxxv", "invalid"};
        for (String t : tests) {
            try {
                System.out.printf("%s -> %d%n", t, r.romanToInt(t));
            } catch (IllegalArgumentException ex) {
                System.out.printf("%s -> ERROR: %s%n", t, ex.getMessage());
            }
        }
    }
}


    

