package lambda.day03;

public class Person2 {

  public Member getMember1(CreateIdMember createIdMember) {
    String id = "ssg01";
    Member member = createIdMember.create(id);
    return member;
  }

  public Member getMember2(CreateIdNameMember createIdNameMember) {
    String id = "ssg01";
    String name = "ssg";
    Member member = createIdNameMember.create(id, name);
    return member;

  }
}
