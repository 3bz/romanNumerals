import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class testNumeralToInt {
    //arrange
    @Parameterized.Parameters(name = "{index}: {0}={1}")
    public static Collection<Object[]> numeralData()
    {
        return Arrays.asList(new Object [][]
                {
                        {"",0}, {"i", 1}, {"ii", 2}, {"iii", 3}, {"iv", 4}, {"v", 5},
                        {"vi", 6}, {"vii", 7}, {"viii", 8}, {"ix", 9}, {"x", 10}
                });
    }

    @Parameterized.Parameter
    public String input;

    @Parameterized.Parameter(1)
    public int expected;

    @Test
    public void testNumerals()
    {
        //arrange
        ConverterNumeralToInt numeralConverter = new ConverterNumeralToInt();
        String numeral = input;
        //act
        int result = numeralConverter.convert(numeral);
        //assert
        Assert.assertEquals(expected, result);
    }

}
