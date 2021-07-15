package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  public void testTotal() {
    Calculate calculate = new Calculate();
    int expected = 55;

    assertEquals(expected, calculate.total(1, 10));
  }

  public void testAverage() {
    Calculate calculate = new Calculate();
    double expected = 55.5;

    assertEquals(expected, calculate.average(1, 10), 0.0);
  }

  public void testParityTotal() {
    Calculate calculate = new Calculate();
    int expectedOdd = 25;
    int expectedEven = 30;

    assertEquals(expectedOdd, calculate.parityTotal(1, 10).odd);
    assertEquals(expectedEven, calculate.parityTotal(1, 10).even);

  }

}
