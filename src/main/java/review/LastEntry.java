package review;

import java.util.List;

/**
 * Created by keefntats on 23/05/2016.
 */
public class LastEntry {

    public static <T> T lastEntry(List<T> theList) {
        return theList.get(theList.size() - 1);
    }

    public static <T> T lastEntry(T[] theArray) {
        return theArray[theArray.length-1];
    }
}
