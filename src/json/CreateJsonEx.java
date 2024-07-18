package json;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonEx {

  public static void main(String[] args) throws IOException {
    // json 객체 생성
    JSONObject root = new JSONObject();

    // String 속성추가
    root.put("id", "ssg001");
    root.put("name", "신세계");
    root.put("dept", "IT");
    root.put("job", "developer");

    // 객체 속성 추가
    JSONObject phone = new JSONObject();
    phone.put("home", "02-424-4187");
    phone.put("phone", "010-424-4187");
    root.put("phone", phone);

    // 배열객체속성 추가
    JSONArray skill = new JSONArray();
    skill.put("Java");
    skill.put("C++");
    skill.put("Python");
    skill.put("Kotlin");

//    skill.put("id", "111");
    root.put("skill", skill);

    // Json 객체확인
    String jsonVal = root.toString();
    System.out.println(jsonVal);

//    Writer jsonWriter = new FileWriter("C:/Temp/employee.json", Charset.forName("UTF-8"));
    Writer jsonWriter = new FileWriter("C:/Temp/employee.json", StandardCharsets.UTF_8);
    jsonWriter.write(jsonVal);
    jsonWriter.close();
  }

}
