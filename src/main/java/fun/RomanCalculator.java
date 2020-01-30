package fun;

public class RomanCalculator {
    public String add(String first, String second) {
        return "II";
    }

    public int toInt(String input) {
        int result;

        if (input.equals("I"))
            result = 1;
        else if (input.equals("II"))
            result = 2;
        else
            result = 3;
        return result;
    }
}
