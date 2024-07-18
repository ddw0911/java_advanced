package lambda.day03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalEx01 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  static void action(Calculable calculable) throws IOException {
//    int x = Integer.parseInt(br.readLine());
//    int y = Integer.parseInt(br.readLine());
    int x = Integer.parseInt(processData());
    int y = Integer.parseInt(processData());
    calculable.calculate(x,y);
  }

  static String processData() throws IOException{
    return br.readLine();
  }

  public static void main(String[] args) throws IOException {
//    action((x,y) -> System.out.println(x+y + " " + x*y));
  }
}