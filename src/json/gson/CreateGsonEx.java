package json.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CreateGsonEx {

  public static void main(String[] args) {
    Gson gson = new Gson();
    Gson gson2 = new GsonBuilder().create();
    Gson gson3 = new GsonBuilder().setPrettyPrinting().create();
    //GsonBuilder - Gson 객체생성, 설정을 통해 커스터마이징하는 기능 + 여러상황(직렬화, 역직렬화 등)에 대응하며 효율적인 데이터 처리 지원
  }

}
