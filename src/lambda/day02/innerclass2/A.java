package lambda.day02.innerclass2;

public class A {

  int field1;
  void method1() {
    System.out.println("A의 메서드1");
  }

  String filed3 = "A 인스턴스의 필드";

  static int field2;
  static void method2() {
  }

  private class B {

    String field = "B의 필드";
    void method() {
//      field1 = 1;
//      field2 = 3;
//      method1();
//      method2();
      System.out.println("B 메서드");
    }

    void print() {
      System.out.println(this.field);
      this.method();

      System.out.println(A.this.field1 + " " + A.this.filed3);
      A.this.method1();
    }

    void useB() {
      B b = new B();
      b.print();
    }
  }

  static class C {

    void method() {
      field2 = 5;
      method();
      method2();
    }

  }

}
