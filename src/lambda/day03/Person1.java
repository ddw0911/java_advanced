package lambda.day03;

import static java.lang.Integer.sum;

import java.io.IOException;

public class Person1 {

  public void ordering(Comparable comparable) {
    String name1 = "ssg";
    String name2 = "lsg";

    int result = comparable.compare(name1, name2);

    if (result < 0) {
      System.out.println("name1은 name2보다 앞");
    } else if (result == 0) {
      System.out.println("같은 이름입니다.");
    } else {
      System.out.println("name1은 name2보다 뒤");
    }
  }
}
