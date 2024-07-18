package dataio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReaderEx02 {

  public static void main(String[] args) throws IOException {
//    Path path = Path.of("C:/Temp/자바의 변수(멤버, 클래스, 지역, 매개).txt");
    Path path = Paths.get("C:/Temp/자바의 변수(멤버, 클래스, 지역, 매개).txt");
    Stream<String> stream;

    stream = Files.lines(path, Charset.defaultCharset());
    stream.forEach(System.out::println);
    System.out.println();

    // File 클래스 이용
    File file = path.toFile();
    FileReader fr = new FileReader(file); // 보조 스트림
    BufferedReader br = new BufferedReader(fr);
    stream = br.lines();
    stream.forEach(System.out::println);
    stream.close();
  }

}
