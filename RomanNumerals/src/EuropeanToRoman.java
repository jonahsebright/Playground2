public class EuropeanToRoman {

    public static final String ONE = "I";
    public static final String FIVE = "V";
    public static final String TEN = "X";
    public static final String FIFTY = "L";
    public static final String HUNDRED = "C";
    public static final String FIVE_HUNDRED = "D";
    public static final String THOUSAND = "M";

    public String calculate(int european) {
        if (european <= 0) return "Not defined";
        StringBuilder roman = new StringBuilder();
        european = popNumber(1000, THOUSAND, european, roman);
        european = popThreshold(900, HUNDRED, THOUSAND, european, roman);

        european = popNumber(500, FIVE_HUNDRED, european, roman);
        european = popThreshold(400, HUNDRED, FIVE_HUNDRED, european, roman);

        european = popNumber(100, HUNDRED, european, roman);
        european = popThreshold(90, TEN, HUNDRED, european, roman);

        european = popNumber(50, FIFTY, european, roman);
        european = popThreshold(40, TEN, FIFTY, european, roman);

        european = popNumber(10, TEN, european, roman);
        european = popThreshold(9, ONE, TEN, european, roman);

        european = popNumber(5, FIVE, european, roman);
        european = popThreshold(4, ONE, FIVE, european, roman);

        popNumber(1, ONE, european, roman);

        return roman.toString();
    }

    private int popNumber(int number, String asRoman, int european, StringBuilder roman) {
        if (european >= number) {
            int numThatFit = european / number;
            roman.append(asRoman.repeat(numThatFit));
            european -= numThatFit * number;
        }
        return european;
    }

    private int popThreshold(int threshold, String diffAsRoman, String originalAsRoman, int european, StringBuilder roman) {
        if (european >= threshold) {
            roman.append(diffAsRoman).append(originalAsRoman);
            european -= threshold;
        }
        return european;
    }
}
