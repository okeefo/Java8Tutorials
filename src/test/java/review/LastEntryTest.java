package review;

import javafx.scene.shape.Circle;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by keefntats on 23/05/2016.
 */
public class LastEntryTest {


    @Test
    public void shouldReturnLastStringInList() {

        String expected = "S4";
        List<String> strList = Arrays.asList("S1", "S2", "S3", expected);
        String actual = LastEntry.lastEntry(strList);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnLastCircleInList() {

        Circle expected = new Circle(4);
        List<Circle> crclList = Arrays.asList(new Circle(1), new Circle(2), new Circle(3), expected);
        Circle actual = LastEntry.lastEntry(crclList);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnLastStringInArray() {

        String expected = "S4";
        String[] strArray = {"S1", "S2", "S3", expected};
        String actual = LastEntry.lastEntry(strArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnLastCircleInArray() {

        Circle expected = new Circle(4);
        List<Circle> crclArray = Arrays.asList(new Circle(1), new Circle(2), new Circle(3), expected);
        Circle actual = LastEntry.lastEntry(crclArray);
        Assert.assertEquals(actual.hashCode(), expected.hashCode());
    }


}
