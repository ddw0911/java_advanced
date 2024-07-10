package generics.genericmethodex;

public class Box <T> {

  private T type;

  public T getBox() {
    return type;
  }

  public void setBox(T t) {
    this.type = t;
  }
}