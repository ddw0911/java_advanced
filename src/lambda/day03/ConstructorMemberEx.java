package lambda.day03;

public class ConstructorMemberEx {

  public static void main(String[] args) {
    Person2 user = new Person2();

    Member m1 = user.getMember1(Member::new); // 생성자 참조
    System.out.println(m1);
    Member m2 = user.getMember2(Member::new);
    System.out.println(m2);
  }

}
