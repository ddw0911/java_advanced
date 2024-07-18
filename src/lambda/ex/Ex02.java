package lambda.ex;

import java.util.Arrays;
import java.util.function.Function;
import javax.swing.JScrollPane;

public class Ex02 {

  @FunctionalInterface
  interface Operator {

    int operation(int x, int y);
  }

  private static int[] scores = {90, 80, 60};

  public static int maxOrmin(Operator operator) {
    int result = scores[0];
    for (int score : scores) {
      result = operator.operation(result, score);
    }
    return result;
  }

  public static void main(String[] args) {

    int max = maxOrmin((x,y) -> Math.max(x,y));
    int min = maxOrmin((x,y) -> Math.min(x,y));

    System.out.println("max = " + max);
    System.out.println("min = " + min);
  }
}


