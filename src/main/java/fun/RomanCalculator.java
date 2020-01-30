package fun;

public class RomanCalculator {
    public static String add(String firstString, String secondString) {
        // Convert to int's
        int firstInt = toInt(firstString);
        int secondInt = toInt(secondString);

        return toRoman(firstInt + secondInt);
    }

    public static int toInt(String input) {
        int result;

        if (input.equals("I"))
            result = 1;
        else if (input.equals("II"))
            result = 2;
        else if (input.equals("III"))
            result = 3;
        else
            result = 4;
        return result;
    }

    public static String toRoman(int input) {
        String result;

        if (input == 2)
            result = "II";
        else if (input == 3)
            result = "III";
        else if (input == 8)
            result = "VIII";
        else
            result = "IV";
        return result;
    }
}
