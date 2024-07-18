package lambda.day03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Member {

  private String id;
  private String name;

  public Member(String id) {
    this.id = id;
  }
}
