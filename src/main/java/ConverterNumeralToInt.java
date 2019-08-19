public class ConverterNumeralToInt {

    public int convert(String numeralInput)
    {
        String[] splitTheNumeral = numeralInput.split("");

        if (splitTheNumeral[0].equals("i"))
            return convertOneToFour(splitTheNumeral);
        else if (splitTheNumeral[0].equals("v"))
            return convertFiveToNine(splitTheNumeral);
        else if (splitTheNumeral[0].equals("x"))
            return 10;
        else
            return 0;
    }

    public int convertOneToFour(String[] splitNumeral) {
        int result = countHowManyIs(splitNumeral);

        for (int i = 0; i < splitNumeral.length; i++)
        {
            if (splitNumeral[i].equals("v"))
                return 4;
            if (splitNumeral[i].equals("x"))
                return 9;
        }
        return result;
    }

    public int convertFiveToNine(String [] splitNumeral)
    {
        int result = 5 + countHowManyIs(splitNumeral);
        for (int i = 0; i < splitNumeral.length; i++)
        {
            if (splitNumeral[i].equals("x"))
                return 9;
        }
        return result;
    }

    public int countHowManyIs(String[] splitNumeral) {
        int result = 0;
        for (int i = 0; i < splitNumeral.length; i++) {
            if (splitNumeral[i].equals("i"))
                result++;
        }
        return result;
    }
}
