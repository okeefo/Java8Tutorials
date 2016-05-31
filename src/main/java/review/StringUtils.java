package review;

/**
 * Created by keefntats on 23/05/2016.
 */
public class StringUtils {

    public static int eChecker(String str1, String str2) {

        if (str1.contains("e") && !str2.contains("e")) {
            return -1;
        }
        if (!str1.contains("e") && str2.contains("e")) {
            return 1;
        }

        return 0;
    }
}
