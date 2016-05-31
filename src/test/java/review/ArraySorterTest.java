package review;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by keefntats on 23/05/2016.
 */
public class ArraySorterTest {


    @Test
    public void shouldSortArrayByLength() {

        String[] actual = {"55555", "1", "333", "22", "4444"};
        String[] expected = {"1", "22", "333", "4444", "55555"};

        ArraySorter sorter = new ArraySorter();

        sorter.byLength(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldSortArrayByReverseLength() {

        String[] actual = {"55555", "1", "333", "22", "4444"};
        String[] expected = {"55555", "4444", "333", "22", "1"};

        ArraySorter sorter = new ArraySorter();

        sorter.byReverseLength(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldSortArrayFirstCharAlphabetically() {

        String[] actual = {"beta", "omega", "alpha", "church", "shoes"};
        String[] expected = {"alpha", "beta", "church", "omega", "shoes"};

        ArraySorter sorter = new ArraySorter();

        sorter.byFirstCharacter(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldSortArrayByLetterE() {

        String[] actual = {"beta", "omega", "alpha", "church", "shoes"};
        String[] expected = {"beta", "omega", "shoes", "alpha", "church"};

        ArraySorter sorter = new ArraySorter();

        sorter.byLetterE(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldSortArrayByEChecker() {

        String[] actual = {"beta", "omega", "alpha", "church", "shoes"};
        String[] expected = {"beta", "omega", "shoes", "alpha", "church"};

        ArraySorter sorter = new ArraySorter();

        sorter.byEChecker(actual);
        Assert.assertEquals(actual, expected);
    }
}
