package lambda.day02.innerclass;

public class ABExample {

  public static void main(String[] args) {
    A a = new A();

    //B 객체 생성 - 내부적으로 람다 동작
    A.B b = a.new B();
//    b.useB();
    a.useB();
    b.method();


  }

}
