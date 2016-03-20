package in.kiranrao.yadi;

/**
 * Created by kiran on 3/20/16.
 */
public class Yadi {

    private static final BiPredicate<String, String> EQUALS_IGNORE_CASE_PREDICATE = new BiPredicate<String, String>() {
        public boolean test(String subject, String rhs) {
            return subject.equalsIgnoreCase(rhs);
        }
    };

    /**
     * A predicate (boolean-valued function) of 2 arguments
     * @param <S>
     * @param <R>
     */
    interface BiPredicate<S,R> {
        /**
         * Tests the two arguments according to some criterion
         * @param subject
         * @param rhs
         * @return
         */
        boolean test(S subject, R rhs);
    }

    /**
     * Returns {@code true} if the subject equals <strong>any of</strong> the values in the right hand side. This method uses {@code equals} method for evaluation.
     * @param subject the "left hand side" value
     * @param rhss the right hand side values
     * @param <T>
     * @return
     */
    public static <T> boolean anyOf(T subject, T... rhss) {
        for(T r: rhss) {
            if(subject.equals(r))   return true;
        }
        return false;
    }

    /**
     * Returns {@code true} if the subject equals <strong>all of</strong> the values in the right hand side. This method uses {@code equals} method for evaluation.
     * @param subject the "left hand side" value
     * @param rhss the right hand side values
     * @param <T>
     * @return
     */
    public static <T> boolean allOf(T subject, T... rhss) {
        for(T r: rhss) {
            if(!subject.equals(r))   return false;
        }
        return true;
    }

    /**
     * Returns {@code true} if the subject <strong>does not equal</strong> any of the values in the right hand side. This method uses {@code equals} method for evaluation.
     * @param subject the "left hand side" value
     * @param rhss the right hand side values
     * @param <T>
     * @return
     */
    public static <T> boolean noneOf(T subject, T... rhss) {
        for(T r: rhss) {
            if(subject.equals(r))   return false;
        }
        return true;
    }

    /**
     * Returns true if {@code subject} matches <strong>all</strong> of the right hand side values {@code rhss} according to the criterion specified by {@code predicate}
     * @param subject the "left hand side" value
     * @param predicate the criterion according to which the subject will be tested against the RHS
     * @param rhss the right hand side values
     * @param <S> The type of the subject
     * @param <R> The type of the right hand side values.
     * @return
     */
    public static <S, R> boolean allOf(S subject, BiPredicate<S, R> predicate, R... rhss) {
        for(R r: rhss) {
            if(!predicate.test(subject, r)) return false;
        }

        return true;
    }

    /**
     * Returns true if {@code subject} matches <strong>any</strong> of the right hand side values {@code rhss} according to the criterion specified by {@code predicate}
     * @param subject the "left hand side" value
     * @param predicate the criterion according to which the subject will be tested against the RHS
     * @param rhss the right hand side values
     * @param <S> The type of the subject
     * @param <R> The type of the right hand side values.
     * @return
     */
    public static <S, R> boolean anyOf(S subject, BiPredicate<S, R> predicate, R... rhss) {
        for(R r: rhss) {
            if(predicate.test(subject, r))  return true;
        }
        return false;
    }

    /**
     * Returns true if {@code subject} <strong>does not</strong> match any of the right hand side values {@code rhss} according to the criterion specified by {@code predicate}
     * @param subject the "left hand side" value
     * @param predicate the criterion according to which the subject will be tested against the RHS
     * @param rhss the right hand side values
     * @param <S> The type of the subject
     * @param <R> The type of the right hand side values.
     * @return
     */
    public static <S, R> boolean noneOf(S subject, BiPredicate<S, R> predicate, R... rhss) {
        for(R r: rhss) {
            if(predicate.test(subject, r))  return false;
        }
        return true;
    }

    /**
     * Returns {@code true} if the subject equals <strong>any of</strong> the values in the right hand side, ignoring case.
     * @param subject the "left hand side" value
     * @param rhss the right hand side values
     * @return
     */
    public static boolean anyOfIgnoreCase(String subject, String... rhss) {
        return anyOf(subject, EQUALS_IGNORE_CASE_PREDICATE, rhss);
    }

    /**
     * Returns {@code true} if the subject equals <strong>all of</strong> the values in the right hand side, ignoring case.
     * @param subject the "left hand side" value
     * @param rhss the right hand side values
     * @return
     */
    public static boolean allOfIgnoreCase(String subject, String... rhss) {
        return allOf(subject, EQUALS_IGNORE_CASE_PREDICATE, rhss);
    }

    /**
     * Returns {@code true} if the subject <strong>does not equal</strong> any of the values in the right hand side, ignoring case.
     * @param subject the "left hand side" value
     * @param rhss the right hand side values
     * @return
     */
    public static boolean noneOfIgnoreCase(String subject, String... rhss) {
        return noneOf(subject, EQUALS_IGNORE_CASE_PREDICATE, rhss);
    }
}
