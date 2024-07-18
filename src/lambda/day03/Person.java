package lambda.day03;

import static java.lang.Integer.sum;

import java.io.IOException;

public class Person {
  static void action(Calculable calculable) {
    int x = 10;
    int y = 20;
    int result = calculable.calculate(x, y);
    System.out.println(result);
  }

  public static void main(String[] args) throws IOException {
    Person user = new Person();
    user.action((x,y)->
//      int result = x + y;
      sum(x,y));
  }
}
