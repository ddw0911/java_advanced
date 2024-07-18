package json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import org.json.JSONArray;
import org.json.JSONObject;

public class UserJson {

  public static void main(String[] args) throws IOException {
    JSONObject user = new JSONObject();
    user.put("name", "ssg");
    user.put("age", 25);
    user.put("isMarried", false);

    JSONArray hobbies = new JSONArray();
    hobbies.put("자전거");
    hobbies.put("등산");
    hobbies.put("수영");
    user.put("hobbies", hobbies);

    JSONObject address = new JSONObject();
    address.put("집", "가락동");
    address.put("회사", "삼성동");
    user.put("address", address);

    // Json을 File로
    createJsonFile(user,"C:/Temp/user.json");
    parseJson("C:/Temp/user.json");

    // user의 특정 value 확인
    System.out.println(user.getJSONArray("hobbies").get(1));
    System.out.println(user.getJSONObject("address").getString("집"));
  }

  private static void createJsonFile(JSONObject json, String file) throws IOException {
    Writer writer = new FileWriter(file);
    writer.write(json.toString());
    writer.close();
  }

  private static void parseJson(String file) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(file));

    String s = br.readLine();
    br.close();
    System.out.println(new JSONObject(s));
  }

}
