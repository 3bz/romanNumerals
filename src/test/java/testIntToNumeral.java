import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class testIntToNumeral {
    //arrange
    @Parameterized.Parameters(name = "{index}: {0} = {1}")
    public static Collection<Object[]> integerAndStringData()
    {
        return Arrays.asList(new Object [][]
                {
                        {0,""}, {1,"i"}
                });
    }

    @Parameterized.Parameter
    public int testInput;

    @Parameterized.Parameter(1)
    public String expectedOutput;

    @Test
    public void testIntegers()
    {
        //arrange
        ConvertIntToNumeral integerConverter = new ConvertIntToNumeral();
        int integer = testInput;
        //act
        String resultFromConversion = integerConverter.convert(integer);
        //assert
        Assert.assertEquals(expectedOutput, resultFromConversion);
    }
}
