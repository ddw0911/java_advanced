package json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONObject;

public class ParseEmployeeEx {

  public static void main(String[] args) throws IOException {
    // employee.json 파일 읽기
    BufferedReader br = new BufferedReader(
        new FileReader("C:/Temp/employee.json", StandardCharsets.UTF_8));

    String json = br.readLine(); // json은 한줄로 입력됨
    br.close();

    // Json 파싱 (복원)
    JSONObject root = new JSONObject(json);

    System.out.println(root.getString("id"));

    //객체속성정보 읽기
    JSONObject phone = root.getJSONObject("phone");
    System.out.println(phone.getString("home"));

    // 배열속성정보 읽기
    JSONArray skill = root.getJSONArray("skill");
    for (Object o : skill) {
      System.out.println(o);
    }
  }

}
