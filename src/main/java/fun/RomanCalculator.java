package fun;

import java.util.TreeMap;

public class RomanCalculator {
    private final static TreeMap<Integer, String> map = new TreeMap<>();

    static {
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public static String add(String firstString, String secondString) {
        // Convert to int's
        int firstInt = toInt(firstString);
        int secondInt = toInt(secondString);

        return toRoman(firstInt + secondInt);
    }

    public static int toInt(String input) {
        int result;

        switch (input) {
            case "I":
                result = 1;
                break;
            case "II":
                result = 2;
                break;
            case "III":
                result = 3;
                break;
            case "IV":
                result = 4;
                break;
            case "VI":
                result = 6;
                break;
            default:
                result = 9;
                break;
        }
        return result;
    }

    public static String toRoman(int input) {
        int l =  map.floorKey(input);
        if ( input == l ) {
            return map.get(input);
        }
        return map.get(l) + toRoman(input-l);
    }
}
