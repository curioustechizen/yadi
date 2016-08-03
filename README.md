[![Travis](https://img.shields.io/travis/curioustechizen/yadi.svg)](https://travis-ci.org/curioustechizen/yadi) [![Code Coverage](https://img.shields.io/codecov/c/github/curioustechizen/yadi.svg)](https://codecov.io/github/curioustechizen/yadi)  [![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Yadi-green.svg?style=true)](https://android-arsenal.com/details/1/4043)

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

**Yadi** is a dead simple, tiny library to allow you to be more expressive while composing such conditions. With **Yadi**, you can write the same as:

```java
if(Yadi.anyOfIgnoreCase(name, "awesome", "amazing", "brilliant")){
    doSomethingAwesome();
};
```

It doesn't stop there, though. Using the `BiPredicate` interface, you can create your own definition of what constitutes an inclusion or exclusion. In fact, that is exactly how `anyOfIgnoreCase` is implemented.

**Yadi** has methods for testing whether a subject matches all(`allOf`), any(`anyOf`) or none(`noneOf`) of a list of values according to a given criterion. Note that the subject and the right hand side values do not even need to be of the same type!

All of this can be achieved with Java 8 or using functional programming libraries in older versions of Java. However, use of such libraries might be overkill if all you are looking for is to make such simple conditional checks. `Yadi` aims to fill this gap.

## Download

`Yadi` is distributed using JitPack. Add the following to your top-level build.gradle

```
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

Then, in your module level build.gradle,

```
dependencies {
    compile 'com.github.curioustechizen:yadi:1.0.0'
}
```

## What's with the name?

**Yadi (यदि)** is the Sanskrit word for "if", hence the name (and the fact that I got lazy trying to come up with a name).

## ToDo

  - [ ] Add methods for primitive types in order to avoid auto boxing
  - [ ] Think of a meaningful example for the subject and RHS values being of different types

##LICENSE

    Copyright 2016 Kiran Rao

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
