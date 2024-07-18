package lambda.ex;

public class Ex01 {

  @FunctionalInterface
  interface Function {

    double apply(double x, double y);

  }

  public static double calc(Function function) {
    double x = 30;
    double y = 3;
    return function.apply(x, y);
  }

  public static void main(String[] args) {
    double result = calc((x,y) -> (x/y));
    System.out.println("result = " + result);
  }
}


