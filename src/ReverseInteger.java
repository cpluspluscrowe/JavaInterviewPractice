public class ReverseInteger {
  public static long reverse(int x){
    // where I store the answer
    int result = 0;
    int remaining = Math.abs(x);
    while(remaining > 0){
      result = result * 10 + remaining % 10;
      remaining /= 10;
    }
    return result < 0 ? -result : result;
  }
}
