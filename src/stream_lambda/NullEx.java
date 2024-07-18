package stream_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NullEx {

  public static void main(String[] args) {
    List<String> nameList = Arrays.asList("ㅁㅁㅁ", "ㄴㄴㄴ", "ㅇㅇㅇ");

    //Optional 클래스
    // 존재여부에 따른 처리
    String value = "hello optional!";
    String value2 = null;

    // Optional.of(value) - Optional 객체생성
    Optional<String> optionals = Optional.of(value);
//    Optional<String> optionals2 = Optional.of(value2);

    // Optional 객체의 값 유무 검사
    if (optionals.isPresent()) {
      System.out.println(optionals.get());
    }
//    optionals2.ifPresent((System.out::println)); // NPE 발생

    // null 처리방법
    Optional<String> optionals3 = Optional.ofNullable(value2); // ofNullable - NPE 발생 x

    // orElse 이용 = null이면 기본값 반환, 아니면 결과값 반환
    String result = optionals3.orElse("야호. null 처리");
    System.out.println(result);
  }
}