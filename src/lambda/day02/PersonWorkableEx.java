package lambda.day02;

public class PersonWorkableEx {

  public static void main(String[] args) {
    Person worker1 = new Person();

    worker1.action(
        () -> {
          System.out.println("9시 출근");
          System.out.println("10시 회의");
          System.out.println("6시 퇴근");
        }
    );
  }

}
