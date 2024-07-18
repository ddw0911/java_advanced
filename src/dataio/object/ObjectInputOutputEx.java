package dataio.object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectInputOutputEx {

  public static void main(String[] args) {
    try {
      FileOutputStream fos = new FileOutputStream("C:/Temp/data1.txt");
      ObjectOutputStream oos = new ObjectOutputStream(fos); //  fos에 oos 보조 스트림 연결

      Member member = new Member("ssg01", "신세계");
      Product product = new Product("p01", "선풍기");
      int[] ints = {10, 20, 30};
      String s = "hi hello";

      // 객체 직렬화하여 파일 저장
      oos.writeObject(member);
      oos.writeObject(product);
      oos.writeObject(ints);
      oos.writeObject(s);

      oos.close();
      fos.close();

      // 파일 역직렬화하여 객체 복원
      FileInputStream fis = new FileInputStream("C:/Temp/data1.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);

      Member member1 = (Member) ois.readObject();
      Product product1 = (Product) ois.readObject();
      int[] ints1 = (int[]) ois.readObject();
      String s1 = (String) ois.readObject();

      ois.close();
      fis.close();

      System.out.println("member1 = " + member1);
      System.out.println("product1 = " + product1);
      System.out.println("ints1 = " + Arrays.toString(ints1));
      System.out.println("s1 = " + s1);
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

}
