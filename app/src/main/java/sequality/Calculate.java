package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int total(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      sum = sum(sum, i);
    }
    return sum;
  }

  public double average(int start, int end) {
    int sum = total(start, end);
    return (double) sum / (double) (end - start + 1);
  }

  /**
   * 偶数の合計と奇数の合計を保持する。
   */
  public class Parity {
    int odd = 0;
    int even = 0;
  }

  public Parity parityTotal(int start, int end) {
    Parity parity = new Parity();
    for (int i = start; i <= end; i++) {
      if (i % 2 == 0) {
        parity.even = sum(parity.even, i);
      } else {
        parity.odd = sum(parity.odd, i);
      }
    }
    return parity;
  }

}
