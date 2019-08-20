public class ConvertIntToNumeral {
    private int numeralToConvert;

    public String convert(int integerToNumeral){
        String result = "";

        if (integerToNumeral >= 10){
            result += divideByTen(integerToNumeral);
            integerToNumeral = integerToNumeral % 10;
        }
        if (integerToNumeral == 9) {
            result += "ix";
            return result;
        }
        if (integerToNumeral >= 5){
            result += divideByFive(integerToNumeral);
            integerToNumeral = integerToNumeral % 5;
        }

        result += remainderLessThanFive(integerToNumeral);

        return result;
    }

    public String divideByTen(int howManyTens)
    {
        String result = "";
        while (howManyTens >= 10)
        {
            result += "x";
            howManyTens -= 10;
        }
        return result;
    }

    public String divideByFive(int howManyFives)
    {
        String result = "";
        while (howManyFives >= 5)
        {
            result += "v";
            howManyFives -= 5;
        }
        return result;
    }

    public String remainderLessThanFive(int lessThanFive)
    {
        String result = "";
        if (lessThanFive == 4)
            return "iv";

        while (lessThanFive > 0) {
            result += "i";
            lessThanFive--;
        }
        return result;
    }

    public void setNumeralToConvert(int numeralToConvert) {
        this.numeralToConvert = numeralToConvert;
    }

    public int getNumeralToConvert() {
        return numeralToConvert;
    }
}
