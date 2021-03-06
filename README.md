# Welcome to highJ #

HighJ tries overcome Java's lack of higher order type polymorphism (a.k.a. "higher kinded types" in Scala), and translates several well known type-classes (including `Applicative`, `Monad` and `Foldable`) and data structures from Haskell to Java.

The code required to simulate higher order polymorphism could be kindly described as "interesting", but to be honest, it is pretty ugly. Its most surprising feature is that it actually works.

This project is just an experiment, it relies heavily on Java 8 features, and is *not* intended for production. A lot of bad things might happen:
  * Recursion is sometimes hard to avoid, which might lead to `StackOverflowError`s
  * The code isn't very efficient, there might be excessive object creation going on
  * Lazy behavior might lead to unexpected results, as beginners often face in Haskell
  * I tried hard to avoid casting / raw typing, but I won't put my hands into fire that I got it right everywhere 
  * The test coverage is not as comprehensive as it should
  
Please consult the wiki for a more detailed description.

