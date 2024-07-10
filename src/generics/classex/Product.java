package generics.classex;

//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter
public class Product <K,M>{ // Generic 타입의 클래스 Product

  private K kind; // 타입 파라미터 K를 kind 필드의 타입으로 사용하겠다.

  public M getModel() {
    return model;
  }

  public void setModel(M model) {
    this.model = model;
  }

  public K getKind() {
    return kind;
  }

  public void setKind(K kind) {
    this.kind = kind;
  }

  private M model; // 타입 파라미터 M을 model 필드의 타입으로 사용하겠다.

}
