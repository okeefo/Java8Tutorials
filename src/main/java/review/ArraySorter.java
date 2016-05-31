package review;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by keefntats on 23/05/2016.
 */
public class ArraySorter {

    public void byLength(String[] strArray) {

        doSort(strArray, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
    }

    public void byReverseLength(String[] strArray) {

        doSort(strArray, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
    }

    public void byFirstCharacter(String[] strArray) {

        doSort(strArray, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.charAt(0) - o2.charAt(0);
            }
        });
    }

    public void byLetterE(String[] strArray) {

        doSort(strArray, new Comparator<String>() {
            public int compare(String o1, String o2) {
                if (o1.contains("e") && !o2.contains("e")) {
                    return -1;
                }
                if (!o1.contains("e") && o2.contains("e")) {
                    return 1;
                }
                return 0;
            }
        });
    }

    public void byEChecker(String[] strArray) {

        doSort(strArray, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return StringUtils.eChecker(o1, o2);
            }
        });
    }


    private void doSort(String[] strArray, Comparator comparator) {

        Arrays.sort(strArray, comparator);
        System.out.println("result " + Arrays.asList(strArray));
    }
}
