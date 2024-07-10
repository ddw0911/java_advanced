package generics.interfaceex;

public interface Rentable<R> { // 다양한 대상을 렌트하기 위한 rent()메소드의 리턴타입을 타입파라미터 R로 지정

  public R rent();

}
