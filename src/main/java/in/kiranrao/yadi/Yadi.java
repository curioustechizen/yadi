package in.kiranrao.yadi;

/**
 * Created by kiran on 3/20/16.
 */
public class Yadi {

    interface BiPredicate<S,R> {
        boolean test(S subject, R rhs);
    }

    public static boolean allOf(int subject, int... rhss) {
        for(int r: rhss) {
            if(subject != r)    return false;
        }
        return true;
    }

    public static boolean anyOf(String subject, String... rhss) {
        for(String r: rhss) {
            if(subject.equals(r))   return true;
        }
        return false;
    }

    public static <S, R> boolean allOf(S subject, BiPredicate<S, R> predicate, R... rhss) {
        for(R r: rhss) {
            if(!predicate.test(subject, r)) return false;
        }

        return true;
    }

    public static <S, R> boolean anyOf(S subject, BiPredicate<S, R> predicate, R... rhss) {
        for(R r: rhss) {
            if(predicate.test(subject, r))  return true;
        }
        return false;
    }

    public static <S, R> boolean noneOf(S subject, BiPredicate<S, R> predicate, R... rhss) {
        for(R r: rhss) {
            if(predicate.test(subject, r))  return false;
        }
        return true;
    }

    public static boolean anyOfIgnoreCase(String subject, String... rhss) {
        return anyOf(
                subject,
                new BiPredicate<String, String>() {
                    public boolean test(String subject, String rhs) {
                        return subject.equalsIgnoreCase(rhs);
                    }
                },
                rhss);
    }
}
