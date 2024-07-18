package dataio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileWriterEx01 {

  public static void main(String[] args) {
    try {
      FileOutputStream fs = new FileOutputStream("C:/Temp/data.txt");
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fs));
      bw.write("Hello java io ");
      bw.newLine();
      bw.write("good day");
      bw.close();
      fs.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
