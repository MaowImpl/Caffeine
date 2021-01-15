# Caffeine
Java 8 source preprocessor/subset. (WIP)<br>
Uses: ANTLR4, JavaPoet

## Caffeine Syntax

**Data Classes**

```java
public data class CaffeineTest {
    private final String immutable;
    private String mutable;
}
```

For each field in a data class, a new getter will be generated.
If the field is mutable, a setter will be generated.
If the field is immutable, a constructor parameter will be generated.

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