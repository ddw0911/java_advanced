package lambda.day03.prob;

import java.util.Arrays;
import java.util.List;

public class Q8 {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
    int sum = 0;
    for (Integer i : list) {
      if (i%2 == 1) {
        sum += i*i;
      }
    }
    System.out.println(sum);
  }
}
