package lambda.day01;

public class LambdaEx02 {

  @FunctionalInterface // 두개의 정수를 받아 정수를 반환하는 단일메서드 operate가 있는 '함수형 인터페이스' MathOpertion 정의
  interface MathOperation {

    int operate(int a, int b);
  }

  @FunctionalInterface
  interface StringOperation {

    int operate(String a);
  }

  @FunctionalInterface
  interface ArrayOperation {

    int operate(int[] arr);

  }

  public static void main(String[] args) {

    MathOperation addition = (a, b) -> a + b; // 함수형 인터페이스를 이용해 람다 표현식 생성

    int result = addition.operate(5, 3);
    System.out.println(result);
    System.out.println("=======================");

    StringOperation lengthReturn = a -> a.length();

    int result2 = lengthReturn.operate("Java");
    System.out.println(result2);
    System.out.println("=======================");

//    ArrayOperation sumOfEvenNums = arr -> Arrays.stream(arr).filter(num -> num%2==0).sum();
//    int result3 = sumOfEvenNums.operate(new int[]{1,2,3,4,5,6,7,8,9,10});

    ArrayOperation sumOfEvenNums = a -> {
      int sum = 0;
      for (int i : a) {
        if (i % 2 == 0) {
          sum += i;
        }
      }
      return sum;
    };

    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int result3 = sumOfEvenNums.operate(arr);
    System.out.println(result3);
  }
}
