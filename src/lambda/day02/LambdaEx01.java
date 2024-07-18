package lambda.day02;

public class LambdaEx01 {

  public static void main(String[] args) {

    // 처리부 - 람다식(인터페이스 익명구현 객체)을 이용해 내부 데이터 처리
    action((x, y) -> {
          int result = x + y;
          System.out.println(result);
        }
    );
  }

  public static void action(Calculable calculable) {
    // 데이터
    int x = 10;
    int y = 20;

    // 데이터처리
    calculable.calculate(x, y);
  }
}
