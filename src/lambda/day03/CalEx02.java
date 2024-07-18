package lambda.day03;

public class CalEx02 {

  public static void main(String[] args) {
    Person user1 = new Person();
    Person.action(Computer::adder); // :: 참조

    Computer computer = new Computer();
    user1.action(computer::multiply);

  }

}
