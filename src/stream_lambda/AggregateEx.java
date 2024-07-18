package stream_lambda;

import java.util.Arrays;

public class AggregateEx {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};

    System.out.println(Arrays.stream(arr).count());
    System.out.println(Arrays.stream(arr).sum());
    System.out.println(Arrays.stream(arr).average().getAsDouble());
    System.out.println(Arrays.stream(arr).filter(num-> num%2==0).max().getAsInt());
    System.out.println(Arrays.stream(arr).min().getAsInt());
    System.out.println(Arrays.stream(arr).filter(num->num%2==0).findFirst());
  }

}
