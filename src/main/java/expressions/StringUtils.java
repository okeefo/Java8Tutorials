package expressions;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by keefntats on 24/05/2016.
 */
public class StringUtils {

    public void byLength(String[] strArray) {


        doSort(strArray, (o1, o2) -> {
            return (o1.length() - o2.length());
        });
    }

    public void byReverseLength(String[] strArray) {

        doSort(strArray, (o1, o2) -> {
            return (o2.length() - o1.length());
        });
    }

    public void byFirstCharacter(String[] strArray) {

        doSort(strArray, (o1, o2) -> {
            return o1.charAt(0) - o2.charAt(0);
        });
    }

    public void byLetterE(String[] strArray) {


        doSort(strArray, (o1, o2) -> {
            if (o1.contains("e") && !o2.contains("e")) {
                return -1;
            }
            if (!o1.contains("e") && o2.contains("e")) {
                return 1;
            }
            return 0;

        });

    }


    public void byEChecker(String[] strArray) {

        doSort(strArray, (s1, s2) -> StringUtilsHelper.eChecker(s1, s2));
    }


    private <T> void doSort(T[] strArray, Comparator<? super T> comparator) {

        Arrays.sort(strArray, comparator);
        System.out.println("result " + Arrays.asList(strArray));

    }

    public static String betterString(String s1, String s2, TwoStringPredicate predicate) {

        return predicate.betterString(s1, s2) ? s1 : s2;

    }
}
