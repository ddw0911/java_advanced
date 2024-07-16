package lambda.day02.innerclass;

//로컬 클래스 - 생성자, 메서드 내에서 생성된 클래스
public class C {

  C() {
    class D {
      D d = new D();

    }

  }
  void method(){
    class D {
      D d = new D();

    }
  }

}
