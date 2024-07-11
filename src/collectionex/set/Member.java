package collectionex.set;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Member {

  public String name;
  public int age;

  // 동등 객체 처리 코드 /w hashCode, equals 오버라이딩
  @Override
  public int hashCode() {
    return name.hashCode() + age;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Member member) {
      return member.name.equals(name) && member.age == age;
    }
    return false;
  }
}
