package stream_lambda;

import com.mysql.cj.exceptions.StreamingNotifiable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx01 {

  public static void main(String[] args) {
    List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    num = num.stream().filter(number -> number % 2 == 0).toList();
    num.forEach(System.out::println);

    // boxed를 사용해 IntStream을 Stream<Integer>
    List<Integer> num1 = IntStream.rangeClosed(1, 10).filter(number -> number % 2 == 0).boxed()
        .toList();
    num1.forEach(System.out::println);

    List<String> fruits = Arrays.asList("apple", "banana", "orange", "gㅡape");
    fruits.stream().map(String::toUpperCase).forEach(System.out::println);
    fruits.forEach(System.out::println);

    List<String> sentence = Arrays.asList("This is a sentence", "Java Stream is awesome",
        "Let's count words");
    sentence.stream().mapToInt(s -> s.split("\\s+").length)
        .forEach(System.out::println);
  }
}
