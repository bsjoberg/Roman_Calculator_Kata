package fun;

import java.util.Hashtable;
import java.util.TreeMap;

public class RomanCalculator {
    private final static TreeMap<Integer, String> intToRomanMap = new TreeMap<>();

    static {
        intToRomanMap.put(9, "IX");
        intToRomanMap.put(5, "V");
        intToRomanMap.put(4, "IV");
        intToRomanMap.put(1, "I");
    }

    private final static Hashtable<Character, Integer> romanToIntTable = new Hashtable<>();

    static {
        romanToIntTable.put('I', 1);
        romanToIntTable.put('V', 5);
        romanToIntTable.put('X', 10);
    }

    public static String add(String firstString, String secondString) {
        // Convert to int's
        int firstInt = toInt(firstString);
        int secondInt = toInt(secondString);

        return toRoman(firstInt + secondInt);
    }

    public static int toInt(String input) {
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

    public static String toRoman(int input) {
        int floorKeyValue =  intToRomanMap.floorKey(input);
        if ( input == floorKeyValue ) {
            return intToRomanMap.get(input);
        }
        return intToRomanMap.get(floorKeyValue) + toRoman(input-floorKeyValue);
    }
}
