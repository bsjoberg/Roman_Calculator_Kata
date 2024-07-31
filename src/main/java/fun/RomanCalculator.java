package fun;

import java.util.HashMap;
import java.util.TreeMap;

public class RomanCalculator {
    private static final TreeMap<Integer, String> intToRomanMap = new TreeMap<>();

    static {
        intToRomanMap.put(9, "IX");
        intToRomanMap.put(5, "V");
        intToRomanMap.put(4, "IV");
        intToRomanMap.put(1, "I");
    }

    private static final HashMap<Character, Integer> romanToIntTable = new HashMap<>();

    static {
        romanToIntTable.put('I', 1);
        romanToIntTable.put('V', 5);
        romanToIntTable.put('X', 10);
    }

    public static String add(String firstString, String secondString) {
        // Convert to int's
        int firstInt = fromRomanToInt(firstString);
        int secondInt = fromRomanToInt(secondString);

        return fromIntToRoman(firstInt + secondInt);
    }

    public static int fromRomanToInt(String input) {
        int result = 0;
        int prev = 0;

        for(int i = input.length() - 1; i >= 0; i--)
        {
            int current = romanToIntTable.get(input.charAt(i));
            if (current < prev)
                result -= current;
            else
                result += current;
            prev = current;
        }
        return result;
    }

    public static String fromIntToRoman(int input) {
        int floorKeyValue =  intToRomanMap.floorKey(input);
        if ( input == floorKeyValue ) {
            return intToRomanMap.get(input);
        }
        return intToRomanMap.get(floorKeyValue) + fromIntToRoman(input-floorKeyValue);
    }
}
