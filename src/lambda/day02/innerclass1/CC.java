package lambda.day02.innerclass;

//로컬 클래스 - 생성자, 메서드 내에서 생성된 클래스
public class CC {

  void useC() {
    class D {

      // 인스턴스 필드
      int field1 = 10;
      static int field2 = 20;

      D() {
        System.out.println("D 객체 초기화");
      }

      void method(int arg) { // final int arg
        System.out.println("D 객체 메서드실행");
      }

      static void method2() { // Java 17부터 지원
        System.out.println("D 객체 static 메서드실행");
      }
    }

    D d = new D(); // 로컬클래스

    System.out.println(d.field1);
    d.method();
    System.out.println(D.field2);
    D.method2();
  }
}
