import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    assertEquals("Test 3", true, PrimeCheck.isPrime(3));
    assertEquals("Test 5", true, PrimeCheck.isPrime(5));
    assertEquals("Test 11", true, PrimeCheck.isPrime(11));
    assertEquals("Test 17", true, PrimeCheck.isPrime(17));
    assertEquals("Test 53", true, PrimeCheck.isPrime(53));
    assertEquals("Test 71", true, PrimeCheck.isPrime(71));
  }



  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    assertEquals("Test 4", false, PrimeCheck.isPrime(4));
    assertEquals("Test 10", false, PrimeCheck.isPrime(10));
    assertEquals("Test 15", false, PrimeCheck.isPrime(15));
    assertEquals("Test 21", false, PrimeCheck.isPrime(21));
    assertEquals("Test 27", false, PrimeCheck.isPrime(27));
    assertEquals("Test 55", false, PrimeCheck.isPrime(55));
  }
}
