package dataio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ByteInputStreamEx01 {

  public static void main(String[] args) {
    try {
      InputStream inputStream1 = new FileInputStream("C:/Temp/test.txt");
      InputStream inputStream2 = new FileInputStream("C:/Temp/test2.txt");

      byte[] dataBytes = new byte[1024];

      while (true) {
        int data = inputStream2.read();
        if (data == -1) { // 끝에 도달하면
          break;
        }
        for (byte dataByte : dataBytes) {
          System.out.println(dataByte);
        }
      }
      inputStream2.close();
    } catch (FileNotFoundException e) {
      System.err.println(e.getMessage());
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }

  }

}
