import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ConvertIntToNumeral myConverter = new ConvertIntToNumeral();

        System.out.print("Please enter a valid integer: ");
        myConverter.setNumeralToConvert(scn.nextInt());

        System.out.println("Converted int to numeral is:\n" + myConverter.convert(myConverter.getNumeralToConvert()) );
    }
}
