package `in`.kiranrao.yadi

fun <T> T.anyOf(vararg rhss: T, predicate: (T, T) -> Boolean = {a,b -> a!!.equals(b)}): Boolean {
    for(rhs in rhss) if (predicate(this, rhs)) return true
    return false
}

fun <T> T.allOf(vararg rhss: T, predicate: (T, T) -> Boolean = {a,b -> a!!.equals(b)}): Boolean {
    for(rhs in rhss) if (!predicate(this, rhs)) return false
    return true
}

fun <T> T.noneOf(vararg rhss: T, predicate: (T, T) -> Boolean = {a,b -> a!!.equals(b)}): Boolean {
    for(rhs in rhss) if (predicate(this, rhs)) return false
    return true
}