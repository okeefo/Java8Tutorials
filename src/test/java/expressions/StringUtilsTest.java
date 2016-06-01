package expressions;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by keefntats on 24/05/2016.
 */
public class StringUtilsTest {

   @Test
   public void shouldSortArrayByLength() {

      String[] actual = {"55555", "1", "333", "22", "4444"};
      String[] expected = {"1", "22", "333", "4444", "55555"};

      StringUtils sorter = new StringUtils();

      sorter.byLength(actual);
      Assert.assertEquals(actual, expected);
   }

   @Test
   public void shouldSortArrayByReverseLength() {

      String[] actual = {"55555", "1", "333", "22", "4444"};
      String[] expected = {"55555", "4444", "333", "22", "1"};

      StringUtils sorter = new StringUtils();

      sorter.byReverseLength(actual);
      Assert.assertEquals(actual, expected);
   }

   @Test
   public void shouldSortArrayFirstCharAlphabetically() {

      String[] actual = {"beta", "omega", "alpha", "church", "shoes"};
      String[] expected = {"alpha", "beta", "church", "omega", "shoes"};

      StringUtils sorter = new StringUtils();

      sorter.byFirstCharacter(actual);
      Assert.assertEquals(actual, expected);
   }

   @Test
   public void shouldSortArrayByLetterE() {

      String[] actual = {"beta", "omega", "alpha", "church", "shoes"};
      String[] expected = {"beta", "omega", "shoes", "alpha", "church"};

      StringUtils sorter = new StringUtils();

      sorter.byLetterE(actual);
      Assert.assertEquals(actual, expected);
   }

   @Test
   public void shouldSortArrayByEChecker() {

      String[] actual = {"beta", "omega", "alpha", "church", "shoes"};
      String[] expected = {"beta", "omega", "shoes", "alpha", "church"};

      StringUtils sorter = new StringUtils();

      sorter.byEChecker(actual);
      Assert.assertEquals(actual, expected);
   }


   @Test
   public void betterStringTest_length() {

      String strLong = "looooooong";
      String strShort = "short";

      String actual = StringUtils.betterString(strLong, strShort, (s1, s2) -> s1.length() > s2.length());
      Assert.assertEquals(actual, strLong);

      actual = StringUtils.betterString(strShort, strLong, (s1, s2) -> s1.length() > s2.length());
      Assert.assertEquals(actual, strLong);
   }

   @Test
   public void betterStringTest_true_returns_string1() {

      String strLong = "looooooong";
      String strShort = "short";


      String actual = StringUtils.betterString(strLong, strShort, (s1, s2) -> true);
      Assert.assertEquals(actual, strLong);

      actual = StringUtils.betterString(strShort, strLong, (s1, s2) -> true);
      Assert.assertEquals(actual, strShort);
   }


}
