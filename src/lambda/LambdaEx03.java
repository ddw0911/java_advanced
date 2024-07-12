package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaEx03 {

  @FunctionalInterface
  interface FindMax {

    int getMax(List<Integer> list);
  }
  public static void main(String[] args) {

    FindMax maxList = list -> {
      int max = Integer.MIN_VALUE;
      for (Integer i : list) {
        max = Math.max(max, i);
      }
      return max;
    };

    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }

    int result = maxList.getMax(list);
    System.out.println(result);
  }
}


