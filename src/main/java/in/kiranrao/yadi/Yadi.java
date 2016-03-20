package in.kiranrao.yadi;

/**
 * Created by kiran on 3/20/16.
 */
public class Yadi {

    public static boolean allOf(int subject, int... rhss) {
        for(int r: rhss) {
            if(subject != r)    return false;
        }
        return true;
    }
}
