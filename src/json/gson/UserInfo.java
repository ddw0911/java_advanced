package json.gson;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data@AllArgsConstructor@RequiredArgsConstructor
public class UserInfo {

  private String id;
  private String name;
  private List<String> roles;

}
