Ever seen code like this?

```java
if(name.equals("awesome") || name.equals("amazing")||name.equals("brilliant")) {
    doSomethingAwesome();
}
```

Ever wanted to get rid of that repetition there? Sure, you say.

```java
if(Arrays.asList("awesome", "amazing", "brilliant").contains(name)) {
    doSomethingAwesome();
}
```

But, what if you wanted to test for something other than just equality? Say, equalsIgnoreCase? You cannot use `Arrays.asList()` in that case.

`Yadi` is a dead simple, tiny library to allow you to be more expressive while composing such conditions. With `Yadi`, you can write the same as:

```java
if(Yadi.anyOfIgnoreCase(name, "awesome", "amazing", "brilliant")){
    doSomethingAwesome();
};
```

It doesn't stop there, though. Using the `BiPredicate` interface, you can create your own definition of what constitutes an inclusion or exclusion. In fact, that is exactly how `anyOfIgnoreCase` is implemented.

`Yadi` has methods for testing whether a subject matches all(`allOf`), any(`anyOf`) or none(`noneOf`) of a list of values according to a given criterion. Note that the subject and the right hand side values do not even need to be of the same type!

## What's with the name?

Yadi (यदि) is the Sanskrit word for "if", hence the name (and the fact that I got lazy trying to come up with a name).