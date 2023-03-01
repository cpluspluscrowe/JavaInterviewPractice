public class computeXDividedByY {
  public static long divide(long x, long y) {
    /*
    compute their division using only shifting operators.
     */
    long result = 0;
    int power = 32;
    // get the largest factor of 2 going into y
    long yPower = y << power;
    while (x >= y) {
      while (power >= x) {
        // divide yPower by 2
        yPower >>>= 1;
        --power;
      }
      // 1 << 3; // 1000 = 2^3
      // 1L << 2 = 4
      result += 1L << power;
      x -= yPower;
    }
    return result;
  }
}
