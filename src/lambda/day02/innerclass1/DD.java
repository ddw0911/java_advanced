package lambda.day02.innerclass1;

public class DD {

  public void method3(int n) {
    int var = 1;

    class E {

      void method4() {
        System.out.println("n = " + n);
//        System.out.println("var = " + var);

        // var = 2; // 로컬 클래스에서는 로컬 변수의 값 수정불가 - 로컬변수는 final 특성 (읽기전용)
      }

    }
   // 로컬 객체 생성
    E e = new E();
    e.method4();
    var = 5;
  }
}
