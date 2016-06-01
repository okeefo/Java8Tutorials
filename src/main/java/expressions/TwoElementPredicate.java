package expressions;

/**
 * User: Keith Pyle
 * Date: 01/06/2016
 * Time: 14:17
 */
public interface TwoElementPredicate<T> {

   boolean betterElement(T element1, T element2);
}
