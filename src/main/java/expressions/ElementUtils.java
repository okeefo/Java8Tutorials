package expressions;

/**
 * User: Keith Pyle
 * Date: 01/06/2016
 * Time: 14:36
 */
public class ElementUtils {


   public static <T> T betterElement(T s1, T s2, TwoElementPredicate<T> predicate) {

      return predicate.betterElement(s1, s2) ? s1 : s2;

   }

}
