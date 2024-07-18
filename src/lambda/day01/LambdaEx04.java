package lambda.day01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaEx04 {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("존", "샘", "톰", "김");

//    Collections.sort(names, new Comparator<String>() {
//      @Override
//      public int compare(String o1, String o2) {
//        return o1.compareTo(o2);
//      }
//    });
//    for (String name : names) {
//      System.out.println(name);
//    }

    Collections.sort(names, String::compareTo);
//    for (String name : names) {
//      System.out.println(name);
//    }
    names.forEach(System.out::println);

    System.out.println("===========================");

    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int sum = 0;
    for (Integer num : integers) {
      if (num % 2 == 0) {
        int sqr = num * num;
        sum += sqr;
      }
    }
    System.out.println(sum);

    System.out.println("===========================");

    int sum1 = integers.parallelStream().filter(num -> num%2==0).mapToInt(num -> num * num).sum();
    System.out.println(sum1);
  }
}
