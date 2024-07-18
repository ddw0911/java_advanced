package lambda.day03;

public class MethodEx01 {

  public static void main(String[] args) {
    Person1 person1 = new Person1();
    person1.ordering((name1, name2) -> name1.compareToIgnoreCase(name2)); // 사람 사전 순으로 오름차순
    person1.ordering(String::compareToIgnoreCase); // String 클래스의 compareToIgnoreCase 메서드 참조
  }

}
