import java.io.*;
import java.util.*;

public class HackerRank1 {
    public static void main(String[] args) {
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scanner = new Scanner(System.in);
      for(int i = 0; i < 3; i++){
        int value = scanner.nextInt();
        System.out.println(value);
      }
    }
  public static void main(String[] args) throws IOException {
      // https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(bufferedReader.readLine().trim());
    Boolean odd = N % 2 == 1;
    if(odd){
      System.out.println("Weird");
    }else if(N >= 2 && N <= 5){
      System.out.println("Not Weird");
    }else if(N >= 6 && N <= 20){
      System.out.println("Weird");
    }else{
      System.out.println("Not Weird");
    }
    bufferedReader.close();
  }

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    // https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
    Scanner scanner = new Scanner(System.in);
    Integer number2 = scanner.nextInt();
    Double number = scanner.nextDouble();
    String ignore = scanner.nextLine();
    String input = scanner.nextLine();

    System.out.println("String: " + input);
    System.out.println("Double: " + number.toString());
    System.out.println("Int: " + number2);
    scanner.close();
  }
}
