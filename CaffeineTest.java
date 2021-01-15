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
