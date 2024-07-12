package compare;

import java.util.Comparator;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {

  private String name;
  private int age;

  // Comparable 구현 시 compareTo() 메서드
//  @Override
//  public int compareTo(Person person) {
//    if (this.getAge() > person.getAge()) {
//      return 1;
//    } else if (this.getAge() == person.getAge()) {
//      return 0;
//    }
//    return -1;
//  }
}
