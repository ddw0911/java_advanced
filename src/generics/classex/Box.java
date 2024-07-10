package generics.classex;

public class Box <T> { // Generic 타입의 클래스 - 지정된 타입만 담겠다 (타입은 Wrapper 클래스, Interface만 가능)

  //  public Object content; // Object로 선언한 이유 : Box의 내용물을 '아직' 알 수 없으므로 모든 타입의 최상위 클래스로 '일단' 선언 (모든 객체 할당 가능 /w 자동타입변환)
  public T content; // <>는 타입 파라미터(기호) - '타입을 전달받을 수 있다'
}
