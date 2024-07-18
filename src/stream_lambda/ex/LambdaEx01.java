package stream_lambda.ex;
//함수형 인터페이스란? 함수를 변수처럼 선언해 사용하는 개념 - 간결한 코드

@FunctionalInterface
interface Func{

  int max(int x, int y);
}

public class LambdaEx01 {

  public static void main(String[] args) {
    // 익명함수
//    System.out.println(new Fun1(){
//      public int max(int n1, int n2) {
//        return n1 >n2 ? n1:n2;
//      }
//    }.max(5,7));
    Func func = (int a, int b) -> a > b ? a : b; // 순수함수 : 람다식으로 생성된 함수, 함수형 인터페이스로만 선언 가능
    System.out.println(func.max(3,5));

  }
}
