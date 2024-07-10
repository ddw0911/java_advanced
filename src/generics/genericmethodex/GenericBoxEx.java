package generics.genericmethodex;

import generics.classex.Doll;

public class GenericBoxEx {

  public static void main(String[] args) {
    Box<Integer> box = boxing(10);
    int value = box.getBox();
    System.out.println("value = " + value);

    Box<String> pokeBox = boxing("포켓몬 포토카드");
    System.out.println(pokeBox.getBox());

    Box<Doll> box1 = boxing(new Doll());
    System.out.println(box1.getBox().name);
  }

  public static <T> Box<T> boxing(T t) {
    Box<T> box = new Box<>();
    box.setBox(t);
    return box;
  }
}
