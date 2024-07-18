package lambda.day02.innerclass1;

//중첩클래스
public class A {

  // 인스턴스 멤버 클래스
  class B {
    int field = 10;
    static int field2 = 20;

    B() {
      System.out.println("B 초기화");
    }

    void method() {
      System.out.println("B 객체 메서드실행");
    }
  }

  B field = new B();

  A() {
    B b = new B();
  }

  // 인스턴스 메서드
  void method() {
    B b = new B();
  }

  void useB() {
    B b = new B();
    System.out.println(b.field);
    System.out.println(B.field2);
    b.method();
  }
}
