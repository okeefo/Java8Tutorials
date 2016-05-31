package expressions;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by keefntats on 25/05/2016.
 */
public class BetterStringTest {


    @Test
    public void betterString_1() {

        String expected = "verylongword";
        String shortword = "shortword";

        String actual = StringUtils.betterString(expected, shortword, (s1, s2) -> s1.length() >= s2.length());
        Assert.assertEquals(actual, expected);


        actual = StringUtils.betterString(shortword, expected, (s1, s2) -> s1.length() >= s2.length());
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void betterString_2() {

        String expected = "verylongword";
        String shortword = "shortword";

        String actual = StringUtils.betterString(expected, shortword, (s1, s2) -> true);
        Assert.assertEquals(actual, expected);


        expected = "shortword";
        shortword = "verylongword";
        actual = StringUtils.betterString(expected, shortword, (s1, s2) -> true);
        Assert.assertEquals(actual, expected);

    }
}
