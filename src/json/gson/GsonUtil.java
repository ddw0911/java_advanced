package json.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class GsonUtil {

  private static Gson gson1 = new Gson();
  private static Gson gson2 = new GsonBuilder()
      .disableHtmlEscaping() // html문자를 유니코드로 이스케이프 처리 - 생성된 객체는 html 문자를 그대로 전달
      .setPrettyPrinting() // Json 문자열을 가독성좋게 출력
      .serializeNulls() // Gson은 null 필드 skip - null로 인한 필드 누락(예외상황) 방지
      .create();

  private static String getJsonData() {
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("data", "Test Data <신세계>");
    return gson2.toJson(jsonObject);
  }

  private static UserInfo getData() {
    UserInfo userInfo = new UserInfo();
    userInfo.setId(null);
//    userInfo.setId("1111");
    userInfo.setName("ssg");

    List<String> roles = new ArrayList<>();
    roles.add("Role1");
    roles.add("Role2");
    roles.add("Role3");

    userInfo.setRoles(roles);
    return userInfo;
  }

  public static void main(String[] args) {
    System.out.println(getJsonData());
    System.out.println(gson2.toJson(getData()));
  }
}
