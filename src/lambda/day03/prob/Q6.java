package lambda.day03.prob;

import java.util.Arrays;

public class Q6 {

  public static void main(String[] args) {
    int sum;
    int[] arr = {1,2,3,4,5};
    sum = Arrays.stream(arr).sum();
    System.out.println("합 : " + sum);


  }
}
