package dataio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class CopyImageEx {

  public static void main(String[] args) throws IOException {
    String originFile = "C:/Temp/해싱(Hashing).png";
    String targetFile = "C:/Temp/해싱(Hashing)_copy2.png";

    InputStream input = new FileInputStream(originFile);
    OutputStream output = new FileOutputStream(targetFile);

//    byte[] buffer = new byte[1024];
//
//    while (true) {
//      int data = input.read(buffer);
//      if (data == -1) {
//        break;
//      }
//      output.write(buffer, 0, data);
//    }
    input.transferTo(output); // Java 9부터 지원
    output.close();
    input.close();
    System.out.println("완료");
  }

}
