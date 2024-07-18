package stream_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalAggregateEx {

  public static void main(String[] args) {
    // Optional을 이용한 null처리 - 1. isPresent() 2. orElse() 3. ifPresent()
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

//    double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
//    System.out.println(avg); // NoSuchElementException 발생

    OptionalDouble optional1 = list.stream().mapToInt(Integer::intValue).average();

    // isPresent()
    if (optional1.isPresent()) {
      System.out.println(optional1.getAsDouble());
    } else {
      System.out.println("0.0");
    }

    // orElse() - 일반적으로 사용
    double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    System.out.println(avg);

    // ifPresent()
    optional1.ifPresent(number -> System.out.println(number)); // 출력값 없음 (값이 있을때만 출력)
    optional1.ifPresent(System.out::println);
  }

}
