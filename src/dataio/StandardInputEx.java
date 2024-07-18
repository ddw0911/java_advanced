package dataio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandardInputEx {

  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("이름 입력 ");
      String name = br.readLine();
      System.out.println("name = " + name);
      br.close();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }

  }

}
