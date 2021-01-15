# Caffeine - WORK IN PROGRESS
Java 8 source preprocessor/subset, adds new keywords to Java to reduce boilerplate.<br>
*Uses: `ANTLR v4`, `JavaPoet`*

## Caffeine Syntax
At the moment, Caffeine is less of a real project and more of a demo, so there's not much syntax or functionality.<br>
Future plans will include an IntelliJ and Gradle plugin, as well as more keywords like `builder` or `immutable`.

**Data Classes**

```java
public data class CaffeineTest {
    private final String immutable;
    private String mutable;
}
```

On field found:
* **Always** generate a new getter method.
* If **immutable**, generate a constructor parameter.
* If **mutable**, generate a setter method.

Output:

```java
public class CaffeineTest {
   private final String immutable;

   private String mutable;

   public CaffeineTest(final String immutable) {
      this.immutable = immutable;
   }

   public String getImmutable() {
      return immutable;
   }

   public String getMutable() {
      return mutable;
   }

   public void setMutable(final String mutable) {
      this.mutable = mutable;
   }
}
```
