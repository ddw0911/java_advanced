package json.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONObject;

public class ObjectToJson {

  public static void main(String[] args) {
    mkJson(new Student(1,"ssg"));
    parseJson("{\"id\":1,\"name\":\"SSG\"}");
  }

  private static void mkJson(Student student) {
//    Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().serializeNulls().create();
    JSONObject jsonObject = new JSONObject(student);
//    System.out.println(gson.toJson(jsonObject));
    System.out.println(jsonObject);

  }

  private static void parseJson(String s) {
    JSONObject jsonObject = new JSONObject(s);
//    Student student = new Student();
//    student.setId(jsonObject.getInt("id"));
//    student.setName(jsonObject.getString("name"));
//    System.out.println(student);
    System.out.println(new Student(jsonObject.getInt("id"), jsonObject.getString("name")));
  }
}
